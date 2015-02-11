/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014 Zimbra, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation,
 * version 2 of the License.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.service.admin;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.base.Splitter;
import com.zimbra.common.account.Key;
import com.zimbra.common.account.Key.AccountBy;
import com.zimbra.common.service.ServiceException;
import com.zimbra.common.soap.AdminConstants;
import com.zimbra.common.soap.Element;
import com.zimbra.common.soap.MailConstants;
import com.zimbra.cs.account.Account;
import com.zimbra.cs.account.AccountServiceException;
import com.zimbra.cs.account.CalendarResource;
import com.zimbra.cs.account.Provisioning;
import com.zimbra.cs.account.accesscontrol.AdminRight;
import com.zimbra.cs.account.accesscontrol.Rights.Admin;
import com.zimbra.cs.mailbox.MailItem;
import com.zimbra.cs.mailbox.MailServiceException;
import com.zimbra.cs.mailbox.Mailbox;
import com.zimbra.cs.mailbox.MailboxManager;
import com.zimbra.cs.mailbox.ReIndexStatus;
import com.zimbra.soap.ZimbraSoapContext;

/**
 * Admin operation handler for {@code reIndexMailbox(rim)}.
 *
 * @author tim
 * @author ysasaki
 */
public final class ReIndex extends AdminDocumentHandler {

    private static final String ACTION_START = "start";
    private static final String ACTION_STATUS = "status";
    private static final String ACTION_CANCEL = "cancel";

    private static final String STATUS_STARTED = "started";
    private static final String STATUS_RUNNING = "running";
    private static final String STATUS_IDLE = "idle";
    private static final String STATUS_CANCELLED = "cancelled";

    private static final String[] TARGET_ACCOUNT_PATH = new String[] {
        AdminConstants.E_MAILBOX, AdminConstants.A_ACCOUNTID
    };

    @Override
    protected String[] getProxiedAccountPath() {
        return TARGET_ACCOUNT_PATH;
    }

    /**
     * must be careful and only allow access to domain if domain admin.
     */
    @Override
    public boolean domainAuthSufficient(Map<String, Object> context) {
        return true;
    }

    @Override
    public Element handle(Element request, Map<String, Object> context) throws ServiceException {

        ZimbraSoapContext zsc = getZimbraSoapContext(context);

        String action = request.getAttribute(MailConstants.E_ACTION);

        Element mreq = request.getElement(AdminConstants.E_MAILBOX);
        String accountId = mreq.getAttribute(AdminConstants.A_ACCOUNTID);

        Provisioning prov = Provisioning.getInstance();
        Account account = prov.get(AccountBy.id, accountId, zsc.getAuthToken());
        if (account == null) {
            throw AccountServiceException.NO_SUCH_ACCOUNT(accountId);
        }

        if (account.isCalendarResource()) {
            // need a CalendarResource instance for RightChecker
            CalendarResource resource = prov.get(Key.CalendarResourceBy.id, account.getId());
            checkCalendarResourceRight(zsc, resource, Admin.R_reindexCalendarResourceMailbox);
        } else {
            checkAccountRight(zsc, account, Admin.R_reindexMailbox);
        }

        Mailbox mbox = MailboxManager.getInstance().getMailboxByAccount(account, false);
        if (mbox == null) {
            throw ServiceException.FAILURE("mailbox not found for account " + accountId, null);
        }

        Element response = zsc.createElement(AdminConstants.REINDEX_RESPONSE);

        if (ACTION_START.equalsIgnoreCase(action)) {
            if (mbox.index.isReIndexInProgress()) {
                response.addAttribute(AdminConstants.A_STATUS, STATUS_RUNNING);
            } else {
                String typesStr = mreq.getAttribute(MailConstants.A_SEARCH_TYPES, null);
                String idsStr = mreq.getAttribute(MailConstants.A_IDS, null);

                if (typesStr != null && idsStr != null) {
                    ServiceException.INVALID_REQUEST("Can't specify both 'types' and 'ids'", null);
                }

                if (typesStr != null) {
                    Set<MailItem.Type> types;
                    try {
                        types = MailItem.Type.setOf(typesStr);
                    } catch (IllegalArgumentException e) {
                        throw MailServiceException.INVALID_TYPE(e.getMessage());
                    }
                    mbox.index.startReIndexByType(types);
                } else if (idsStr != null) {
                    Set<Integer> ids = new HashSet<Integer>();
                    for (String id : Splitter.on(',').trimResults().split(idsStr)) {
                        try {
                            ids.add(Integer.parseInt(id));
                        } catch (NumberFormatException e) {
                            ServiceException.INVALID_REQUEST("invalid item ID: " + id, e);
                        }
                    }
                    mbox.index.startReIndexById(ids);
                } else {
                    mbox.index.startReIndex();
                }

                response.addAttribute(AdminConstants.A_STATUS, STATUS_STARTED);
            }
        } else if (ACTION_STATUS.equalsIgnoreCase(action)) {
            addProgressInfo(response, mbox.index.getReIndexStatus());
        } else if (ACTION_CANCEL.equalsIgnoreCase(action)) {
            ReIndexStatus status = mbox.index.cancelReIndex();
            addProgressInfo(response, status);
        } else {
            throw ServiceException.INVALID_REQUEST("Unknown action: " + action, null);
        }

        return response;
    }

    private void addProgressInfo(Element response, ReIndexStatus status) {
        Element prog = response.addUniqueElement(AdminConstants.E_PROGRESS);
        prog.addAttribute(AdminConstants.A_NUM_SUCCEEDED, status.getSucceeded());
        prog.addAttribute(AdminConstants.A_NUM_FAILED, status.getFailed());
        prog.addAttribute(AdminConstants.A_NUM_REMAINING, status.getTotal() > 0 ? (status.getTotal() - status.getSucceeded() - status.getFailed()) : 0);
        response.addAttribute(AdminConstants.A_STATUS, status.isCancelled() ? STATUS_CANCELLED : 
            (status.isRunning() ? STATUS_RUNNING : STATUS_IDLE));
    }

    @Override
    public void docRights(List<AdminRight> relatedRights, List<String> notes) {
        relatedRights.add(Admin.R_reindexMailbox);
        relatedRights.add(Admin.R_reindexCalendarResourceMailbox);
    }
}
