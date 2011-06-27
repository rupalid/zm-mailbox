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

package com.zimbra.soap.admin.type;

import com.google.common.base.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import com.zimbra.common.soap.BackupConstants;

@XmlAccessorType(XmlAccessType.FIELD)
public class BackupAccountQueryBackupInfo {

    @XmlAttribute(name=BackupConstants.A_LABEL /* label */, required=false)
    private String label;

    @XmlAttribute(name=BackupConstants.A_TYPE /* type */, required=false)
    private String type;

    @XmlAttribute(name=BackupConstants.A_START /* start */, required=false)
    private Long start;

    @XmlAttribute(name=BackupConstants.A_END /* end */, required=false)
    private Long end;

    @XmlAttribute(name=BackupConstants.A_ACCOUNT_ID /* accountId */,
                    required=false)
    private String accountId;

    public BackupAccountQueryBackupInfo() {
    }

    public void setLabel(String label) { this.label = label; }
    public void setType(String type) { this.type = type; }
    public void setStart(Long start) { this.start = start; }
    public void setEnd(Long end) { this.end = end; }
    public void setAccountId(String accountId) { this.accountId = accountId; }
    public String getLabel() { return label; }
    public String getType() { return type; }
    public Long getStart() { return start; }
    public Long getEnd() { return end; }
    public String getAccountId() { return accountId; }

    public Objects.ToStringHelper addToStringInfo(
                Objects.ToStringHelper helper) {
        return helper
            .add("label", label)
            .add("type", type)
            .add("start", start)
            .add("end", end)
            .add("accountId", accountId);
    }

    @Override
    public String toString() {
        return addToStringInfo(Objects.toStringHelper(this))
                .toString();
    }
}
