/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2011 Zimbra, Inc.
 *
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.3 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */

package com.zimbra.soap.adminext.message;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.zimbra.common.soap.AdminConstants;
import com.zimbra.common.soap.AdminExtConstants;
import com.zimbra.soap.adminext.type.Name;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name=AdminExtConstants.E_BULK_IMAP_DATA_IMPORT_REQUEST)
@XmlType(propOrder = {"sourceType", "attachmentID", "accounts",
    "connectionType", "sourceServerType", "IMAPHost", "IMAPPort",
    "indexBatchSize", "useAdminLogin", "IMAPAdminLogin", "IMAPAdminPassword"})
public class BulkIMAPDataImportRequest {

    @XmlAttribute(name=AdminExtConstants.A_op /* op */, required=false)
    private String op;

    @XmlElement(name=AdminExtConstants.A_sourceType
                /* sourceType */, required=false)
    private String sourceType;

    @XmlElement(name=AdminExtConstants.E_attachmentID /* aid */, required=false)
    private String attachmentID;

    @XmlElement(name=AdminConstants.E_ACCOUNT /* account */, required=false)
    private List<Name> accounts = Lists.newArrayList();

    @XmlElement(name=AdminExtConstants.E_connectionType
                /* ConnectionType */, required=false)
    private String connectionType;

    @XmlElement(name=AdminExtConstants.E_sourceServerType
                /* sourceServerType */, required=false)
    private String sourceServerType;

    @XmlElement(name=AdminExtConstants.E_IMAPHost /* IMAPHost */, required=false)
    private String IMAPHost;

    @XmlElement(name=AdminExtConstants.E_IMAPPort /* IMAPPort */, required=false)
    private String IMAPPort;

    @XmlElement(name=AdminExtConstants.E_indexBatchSize
                /* indexBatchSize */, required=false)
    private String indexBatchSize;

    // 1 means true
    @XmlElement(name=AdminExtConstants.E_useAdminLogin
                /* UseAdminLogin */, required=false)
    private String useAdminLogin;

    @XmlElement(name=AdminExtConstants.E_IMAPAdminLogin
                /* IMAPAdminLogin */, required=false)
    private String IMAPAdminLogin;

    @XmlElement(name=AdminExtConstants.E_IMAPAdminPassword
                /* IMAPAdminPassword */, required=false)
    private String IMAPAdminPassword;

    public BulkIMAPDataImportRequest() {
    }

    public void setOp(String op) { this.op = op; }
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    public void setAttachmentID(String attachmentID) {
        this.attachmentID = attachmentID;
    }
    public void setAccounts(Iterable <Name> accounts) {
        this.accounts.clear();
        if (accounts != null) {
            Iterables.addAll(this.accounts,accounts);
        }
    }

    public void addAccount(Name account) {
        this.accounts.add(account);
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }
    public void setSourceServerType(String sourceServerType) {
        this.sourceServerType = sourceServerType;
    }
    public void setIMAPHost(String IMAPHost) { this.IMAPHost = IMAPHost; }
    public void setIMAPPort(String IMAPPort) { this.IMAPPort = IMAPPort; }
    public void setIndexBatchSize(String indexBatchSize) {
        this.indexBatchSize = indexBatchSize;
    }
    public void setUseAdminLogin(String useAdminLogin) {
        this.useAdminLogin = useAdminLogin;
    }
    public void setIMAPAdminLogin(String IMAPAdminLogin) {
        this.IMAPAdminLogin = IMAPAdminLogin;
    }
    public void setIMAPAdminPassword(String IMAPAdminPassword) {
        this.IMAPAdminPassword = IMAPAdminPassword;
    }
    public String getOp() { return op; }
    public String getSourceType() { return sourceType; }
    public String getAttachmentID() { return attachmentID; }
    public List<Name> getAccounts() {
        return Collections.unmodifiableList(accounts);
    }
    public String getConnectionType() { return connectionType; }
    public String getSourceServerType() { return sourceServerType; }
    public String getIMAPHost() { return IMAPHost; }
    public String getIMAPPort() { return IMAPPort; }
    public String getIndexBatchSize() { return indexBatchSize; }
    public String getUseAdminLogin() { return useAdminLogin; }
    public String getIMAPAdminLogin() { return IMAPAdminLogin; }
    public String getIMAPAdminPassword() { return IMAPAdminPassword; }

    public Objects.ToStringHelper addToStringInfo(
                Objects.ToStringHelper helper) {
        return helper
            .add("op", op)
            .add("sourceType", sourceType)
            .add("attachmentID", attachmentID)
            .add("accounts", accounts)
            .add("connectionType", connectionType)
            .add("sourceServerType", sourceServerType)
            .add("IMAPHost", IMAPHost)
            .add("IMAPPort", IMAPPort)
            .add("indexBatchSize", indexBatchSize)
            .add("useAdminLogin", useAdminLogin)
            .add("IMAPAdminLogin", IMAPAdminLogin)
            .add("IMAPAdminPassword", IMAPAdminPassword);
    }

    @Override
    public String toString() {
        return addToStringInfo(Objects.toStringHelper(this))
                .toString();
    }
}
