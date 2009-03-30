/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2009 Zimbra, Inc.
 * 
 * The contents of this file are subject to the Yahoo! Public License
 * Version 1.0 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.account.accesscontrol.generated;

import com.zimbra.common.service.ServiceException;
import com.zimbra.cs.account.accesscontrol.Right;
import com.zimbra.cs.account.accesscontrol.AdminRight;
import com.zimbra.cs.account.accesscontrol.RightManager;

//
// DO NOT MODIFY - generated by RightManager
//
// To generate, under ZimbraServer, run: 
//     ant generate-rights
//

public class AdminRights {
    
    ///// BEGIN-AUTO-GEN-REPLACE

    /* build: 5.0 pshao 20090330-1359 */


    public static AdminRight R_accessGAL;
    public static AdminRight R_addAccountAlias;
    public static AdminRight R_addCalendarResourceAlias;
    public static AdminRight R_addDistributionListAlias;
    public static AdminRight R_addDistributionListMember;
    public static AdminRight R_adminLoginAs;
    public static AdminRight R_assignCos;
    public static AdminRight R_checkDirectoryOnFileSystem;
    public static AdminRight R_checkDomainMXRecord;
    public static AdminRight R_checkExchangeAuthConfig;
    public static AdminRight R_checkExternalAuthConfig;
    public static AdminRight R_checkExternalGALConfig;
    public static AdminRight R_checkHealth;
    public static AdminRight R_checkRight;
    public static AdminRight R_configureAdminUI;
    public static AdminRight R_configureCosConstraint;
    public static AdminRight R_configureExternalAuth;
    public static AdminRight R_configureExternalGAL;
    public static AdminRight R_configureGlobalConfigConstraint;
    public static AdminRight R_configurePasswordStrength;
    public static AdminRight R_configureQuota;
    public static AdminRight R_configureWikiAccount;
    public static AdminRight R_countAccount;
    public static AdminRight R_createAccount;
    public static AdminRight R_createAlias;
    public static AdminRight R_createCalendarResource;
    public static AdminRight R_createCos;
    public static AdminRight R_createDistributionList;
    public static AdminRight R_createServer;
    public static AdminRight R_createSubDomain;
    public static AdminRight R_createTopDomain;
    public static AdminRight R_createXMPPComponent;
    public static AdminRight R_createZimlet;
    public static AdminRight R_crossDomainAdmin;
    public static AdminRight R_deleteAccount;
    public static AdminRight R_deleteAlias;
    public static AdminRight R_deleteCalendarResource;
    public static AdminRight R_deleteCos;
    public static AdminRight R_deleteDistributionList;
    public static AdminRight R_deleteDomain;
    public static AdminRight R_deleteServer;
    public static AdminRight R_deleteXMPPComponent;
    public static AdminRight R_deleteZimlet;
    public static AdminRight R_deployZimlet;
    public static AdminRight R_domainAdminAccountRights;
    public static AdminRight R_domainAdminCalendarResourceRights;
    public static AdminRight R_domainAdminCosRights;
    public static AdminRight R_domainAdminDistributionListRights;
    public static AdminRight R_domainAdminDomainRights;
    public static AdminRight R_domainAdminRights;
    public static AdminRight R_domainAdminServerRights;
    public static AdminRight R_domainAdminZimletRights;
    public static AdminRight R_flushCache;
    public static AdminRight R_getAccount;
    public static AdminRight R_getAccountInfo;
    public static AdminRight R_getAccountMembership;
    public static AdminRight R_getAccountShareInfo;
    public static AdminRight R_getCalendarResource;
    public static AdminRight R_getCalendarResourceShareInfo;
    public static AdminRight R_getCos;
    public static AdminRight R_getDistributionList;
    public static AdminRight R_getDistributionListMembership;
    public static AdminRight R_getDistributionListShareInfo;
    public static AdminRight R_getDomain;
    public static AdminRight R_getDomainQuotaUsage;
    public static AdminRight R_getGlobalConfig;
    public static AdminRight R_getMailboxInfo;
    public static AdminRight R_getMailboxStats;
    public static AdminRight R_getServer;
    public static AdminRight R_getSessions;
    public static AdminRight R_getXMPPComponent;
    public static AdminRight R_getZimlet;
    public static AdminRight R_listAccount;
    public static AdminRight R_listCalendarResource;
    public static AdminRight R_listCos;
    public static AdminRight R_listDistributionList;
    public static AdminRight R_listDomain;
    public static AdminRight R_listServer;
    public static AdminRight R_listXMPPComponent;
    public static AdminRight R_listZimlet;
    public static AdminRight R_manageAccountLogger;
    public static AdminRight R_manageMailQueue;
    public static AdminRight R_manageVolume;
    public static AdminRight R_manageWaitSet;
    public static AdminRight R_manageZimlet;
    public static AdminRight R_modifyAccount;
    public static AdminRight R_modifyCalendarResource;
    public static AdminRight R_modifyCos;
    public static AdminRight R_modifyDistributionList;
    public static AdminRight R_modifyDomain;
    public static AdminRight R_modifyGlobalConfig;
    public static AdminRight R_modifyServer;
    public static AdminRight R_modifyXMPPComponent;
    public static AdminRight R_modifyZimlet;
    public static AdminRight R_publishAccountShareInfo;
    public static AdminRight R_publishCalendarResourceShareInfo;
    public static AdminRight R_publishDistributionListShareInfo;
    public static AdminRight R_purgeAccountCalendarCache;
    public static AdminRight R_purgeCalendarResourceCalendarCache;
    public static AdminRight R_purgeMessages;
    public static AdminRight R_reindexMailbox;
    public static AdminRight R_removeAccountAlias;
    public static AdminRight R_removeCalendarResourceAlias;
    public static AdminRight R_removeDistributionListAlias;
    public static AdminRight R_removeDistributionListMember;
    public static AdminRight R_renameAccount;
    public static AdminRight R_renameCalendarResource;
    public static AdminRight R_renameCos;
    public static AdminRight R_renameDistributionList;
    public static AdminRight R_setAccountPassword;
    public static AdminRight R_setAdminSavedSearch;
    public static AdminRight R_setCalendarResourcePassword;
    public static AdminRight R_setDomainAdminAccountAndCalendarResourceAttrs;
    public static AdminRight R_setDomainAdminCalendarResourceAttrs;
    public static AdminRight R_setDomainAdminDistributionListAttrs;
    public static AdminRight R_setDomainAdminDomainAttrs;
    public static AdminRight R_viewAdminSavedSearch;
    public static AdminRight R_viewGrants;
    public static AdminRight R_viewPasswordStrength;


    public static void init(RightManager rm) throws ServiceException {
        R_accessGAL                            = rm.getAdminRight(Right.RT_accessGAL);
        R_addAccountAlias                      = rm.getAdminRight(Right.RT_addAccountAlias);
        R_addCalendarResourceAlias             = rm.getAdminRight(Right.RT_addCalendarResourceAlias);
        R_addDistributionListAlias             = rm.getAdminRight(Right.RT_addDistributionListAlias);
        R_addDistributionListMember            = rm.getAdminRight(Right.RT_addDistributionListMember);
        R_adminLoginAs                         = rm.getAdminRight(Right.RT_adminLoginAs);
        R_assignCos                            = rm.getAdminRight(Right.RT_assignCos);
        R_checkDirectoryOnFileSystem           = rm.getAdminRight(Right.RT_checkDirectoryOnFileSystem);
        R_checkDomainMXRecord                  = rm.getAdminRight(Right.RT_checkDomainMXRecord);
        R_checkExchangeAuthConfig              = rm.getAdminRight(Right.RT_checkExchangeAuthConfig);
        R_checkExternalAuthConfig              = rm.getAdminRight(Right.RT_checkExternalAuthConfig);
        R_checkExternalGALConfig               = rm.getAdminRight(Right.RT_checkExternalGALConfig);
        R_checkHealth                          = rm.getAdminRight(Right.RT_checkHealth);
        R_checkRight                           = rm.getAdminRight(Right.RT_checkRight);
        R_configureAdminUI                     = rm.getAdminRight(Right.RT_configureAdminUI);
        R_configureCosConstraint               = rm.getAdminRight(Right.RT_configureCosConstraint);
        R_configureExternalAuth                = rm.getAdminRight(Right.RT_configureExternalAuth);
        R_configureExternalGAL                 = rm.getAdminRight(Right.RT_configureExternalGAL);
        R_configureGlobalConfigConstraint      = rm.getAdminRight(Right.RT_configureGlobalConfigConstraint);
        R_configurePasswordStrength            = rm.getAdminRight(Right.RT_configurePasswordStrength);
        R_configureQuota                       = rm.getAdminRight(Right.RT_configureQuota);
        R_configureWikiAccount                 = rm.getAdminRight(Right.RT_configureWikiAccount);
        R_countAccount                         = rm.getAdminRight(Right.RT_countAccount);
        R_createAccount                        = rm.getAdminRight(Right.RT_createAccount);
        R_createAlias                          = rm.getAdminRight(Right.RT_createAlias);
        R_createCalendarResource               = rm.getAdminRight(Right.RT_createCalendarResource);
        R_createCos                            = rm.getAdminRight(Right.RT_createCos);
        R_createDistributionList               = rm.getAdminRight(Right.RT_createDistributionList);
        R_createServer                         = rm.getAdminRight(Right.RT_createServer);
        R_createSubDomain                      = rm.getAdminRight(Right.RT_createSubDomain);
        R_createTopDomain                      = rm.getAdminRight(Right.RT_createTopDomain);
        R_createXMPPComponent                  = rm.getAdminRight(Right.RT_createXMPPComponent);
        R_createZimlet                         = rm.getAdminRight(Right.RT_createZimlet);
        R_crossDomainAdmin                     = rm.getAdminRight(Right.RT_crossDomainAdmin);
        R_deleteAccount                        = rm.getAdminRight(Right.RT_deleteAccount);
        R_deleteAlias                          = rm.getAdminRight(Right.RT_deleteAlias);
        R_deleteCalendarResource               = rm.getAdminRight(Right.RT_deleteCalendarResource);
        R_deleteCos                            = rm.getAdminRight(Right.RT_deleteCos);
        R_deleteDistributionList               = rm.getAdminRight(Right.RT_deleteDistributionList);
        R_deleteDomain                         = rm.getAdminRight(Right.RT_deleteDomain);
        R_deleteServer                         = rm.getAdminRight(Right.RT_deleteServer);
        R_deleteXMPPComponent                  = rm.getAdminRight(Right.RT_deleteXMPPComponent);
        R_deleteZimlet                         = rm.getAdminRight(Right.RT_deleteZimlet);
        R_deployZimlet                         = rm.getAdminRight(Right.RT_deployZimlet);
        R_domainAdminAccountRights             = rm.getAdminRight(Right.RT_domainAdminAccountRights);
        R_domainAdminCalendarResourceRights    = rm.getAdminRight(Right.RT_domainAdminCalendarResourceRights);
        R_domainAdminCosRights                 = rm.getAdminRight(Right.RT_domainAdminCosRights);
        R_domainAdminDistributionListRights    = rm.getAdminRight(Right.RT_domainAdminDistributionListRights);
        R_domainAdminDomainRights              = rm.getAdminRight(Right.RT_domainAdminDomainRights);
        R_domainAdminRights                    = rm.getAdminRight(Right.RT_domainAdminRights);
        R_domainAdminServerRights              = rm.getAdminRight(Right.RT_domainAdminServerRights);
        R_domainAdminZimletRights              = rm.getAdminRight(Right.RT_domainAdminZimletRights);
        R_flushCache                           = rm.getAdminRight(Right.RT_flushCache);
        R_getAccount                           = rm.getAdminRight(Right.RT_getAccount);
        R_getAccountInfo                       = rm.getAdminRight(Right.RT_getAccountInfo);
        R_getAccountMembership                 = rm.getAdminRight(Right.RT_getAccountMembership);
        R_getAccountShareInfo                  = rm.getAdminRight(Right.RT_getAccountShareInfo);
        R_getCalendarResource                  = rm.getAdminRight(Right.RT_getCalendarResource);
        R_getCalendarResourceShareInfo         = rm.getAdminRight(Right.RT_getCalendarResourceShareInfo);
        R_getCos                               = rm.getAdminRight(Right.RT_getCos);
        R_getDistributionList                  = rm.getAdminRight(Right.RT_getDistributionList);
        R_getDistributionListMembership        = rm.getAdminRight(Right.RT_getDistributionListMembership);
        R_getDistributionListShareInfo         = rm.getAdminRight(Right.RT_getDistributionListShareInfo);
        R_getDomain                            = rm.getAdminRight(Right.RT_getDomain);
        R_getDomainQuotaUsage                  = rm.getAdminRight(Right.RT_getDomainQuotaUsage);
        R_getGlobalConfig                      = rm.getAdminRight(Right.RT_getGlobalConfig);
        R_getMailboxInfo                       = rm.getAdminRight(Right.RT_getMailboxInfo);
        R_getMailboxStats                      = rm.getAdminRight(Right.RT_getMailboxStats);
        R_getServer                            = rm.getAdminRight(Right.RT_getServer);
        R_getSessions                          = rm.getAdminRight(Right.RT_getSessions);
        R_getXMPPComponent                     = rm.getAdminRight(Right.RT_getXMPPComponent);
        R_getZimlet                            = rm.getAdminRight(Right.RT_getZimlet);
        R_listAccount                          = rm.getAdminRight(Right.RT_listAccount);
        R_listCalendarResource                 = rm.getAdminRight(Right.RT_listCalendarResource);
        R_listCos                              = rm.getAdminRight(Right.RT_listCos);
        R_listDistributionList                 = rm.getAdminRight(Right.RT_listDistributionList);
        R_listDomain                           = rm.getAdminRight(Right.RT_listDomain);
        R_listServer                           = rm.getAdminRight(Right.RT_listServer);
        R_listXMPPComponent                    = rm.getAdminRight(Right.RT_listXMPPComponent);
        R_listZimlet                           = rm.getAdminRight(Right.RT_listZimlet);
        R_manageAccountLogger                  = rm.getAdminRight(Right.RT_manageAccountLogger);
        R_manageMailQueue                      = rm.getAdminRight(Right.RT_manageMailQueue);
        R_manageVolume                         = rm.getAdminRight(Right.RT_manageVolume);
        R_manageWaitSet                        = rm.getAdminRight(Right.RT_manageWaitSet);
        R_manageZimlet                         = rm.getAdminRight(Right.RT_manageZimlet);
        R_modifyAccount                        = rm.getAdminRight(Right.RT_modifyAccount);
        R_modifyCalendarResource               = rm.getAdminRight(Right.RT_modifyCalendarResource);
        R_modifyCos                            = rm.getAdminRight(Right.RT_modifyCos);
        R_modifyDistributionList               = rm.getAdminRight(Right.RT_modifyDistributionList);
        R_modifyDomain                         = rm.getAdminRight(Right.RT_modifyDomain);
        R_modifyGlobalConfig                   = rm.getAdminRight(Right.RT_modifyGlobalConfig);
        R_modifyServer                         = rm.getAdminRight(Right.RT_modifyServer);
        R_modifyXMPPComponent                  = rm.getAdminRight(Right.RT_modifyXMPPComponent);
        R_modifyZimlet                         = rm.getAdminRight(Right.RT_modifyZimlet);
        R_publishAccountShareInfo              = rm.getAdminRight(Right.RT_publishAccountShareInfo);
        R_publishCalendarResourceShareInfo     = rm.getAdminRight(Right.RT_publishCalendarResourceShareInfo);
        R_publishDistributionListShareInfo     = rm.getAdminRight(Right.RT_publishDistributionListShareInfo);
        R_purgeAccountCalendarCache            = rm.getAdminRight(Right.RT_purgeAccountCalendarCache);
        R_purgeCalendarResourceCalendarCache   = rm.getAdminRight(Right.RT_purgeCalendarResourceCalendarCache);
        R_purgeMessages                        = rm.getAdminRight(Right.RT_purgeMessages);
        R_reindexMailbox                       = rm.getAdminRight(Right.RT_reindexMailbox);
        R_removeAccountAlias                   = rm.getAdminRight(Right.RT_removeAccountAlias);
        R_removeCalendarResourceAlias          = rm.getAdminRight(Right.RT_removeCalendarResourceAlias);
        R_removeDistributionListAlias          = rm.getAdminRight(Right.RT_removeDistributionListAlias);
        R_removeDistributionListMember         = rm.getAdminRight(Right.RT_removeDistributionListMember);
        R_renameAccount                        = rm.getAdminRight(Right.RT_renameAccount);
        R_renameCalendarResource               = rm.getAdminRight(Right.RT_renameCalendarResource);
        R_renameCos                            = rm.getAdminRight(Right.RT_renameCos);
        R_renameDistributionList               = rm.getAdminRight(Right.RT_renameDistributionList);
        R_setAccountPassword                   = rm.getAdminRight(Right.RT_setAccountPassword);
        R_setAdminSavedSearch                  = rm.getAdminRight(Right.RT_setAdminSavedSearch);
        R_setCalendarResourcePassword          = rm.getAdminRight(Right.RT_setCalendarResourcePassword);
        R_setDomainAdminAccountAndCalendarResourceAttrs = rm.getAdminRight(Right.RT_setDomainAdminAccountAndCalendarResourceAttrs);
        R_setDomainAdminCalendarResourceAttrs  = rm.getAdminRight(Right.RT_setDomainAdminCalendarResourceAttrs);
        R_setDomainAdminDistributionListAttrs  = rm.getAdminRight(Right.RT_setDomainAdminDistributionListAttrs);
        R_setDomainAdminDomainAttrs            = rm.getAdminRight(Right.RT_setDomainAdminDomainAttrs);
        R_viewAdminSavedSearch                 = rm.getAdminRight(Right.RT_viewAdminSavedSearch);
        R_viewGrants                           = rm.getAdminRight(Right.RT_viewGrants);
        R_viewPasswordStrength                 = rm.getAdminRight(Right.RT_viewPasswordStrength);
    }

    ///// END-AUTO-GEN-REPLACE
}
