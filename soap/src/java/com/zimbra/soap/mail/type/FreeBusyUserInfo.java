/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2011, 2012, 2013, 2014, 2016 Synacor, Inc.
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation,
 * version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 * ***** END LICENSE BLOCK *****
 */

package com.zimbra.soap.mail.type;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import com.zimbra.common.soap.MailConstants;

@XmlAccessorType(XmlAccessType.NONE)
public class FreeBusyUserInfo {

    /**
     * @zm-api-field-tag account-email
     * @zm-api-field-description "id" is always account email; it is not zimbraId as the attribute name may suggest
     */
    @XmlAttribute(name=MailConstants.A_ID /* id */, required=true)
    private final String id;

    /**
     * @zm-api-field-description Free/Busy slots
     */
    @XmlElements({
        @XmlElement(name=MailConstants.E_FREEBUSY_FREE /* f */, type=FreeBusyFREEslot.class),
        @XmlElement(name=MailConstants.E_FREEBUSY_BUSY /* b */, type=FreeBusyBUSYslot.class),
        @XmlElement(name=MailConstants.E_FREEBUSY_BUSY_TENTATIVE /* t */, type=FreeBusyBUSYTENTATIVEslot.class),
        @XmlElement(name=MailConstants.E_FREEBUSY_BUSY_UNAVAILABLE /* u */, type=FreeBusyBUSYUNAVAILABLEslot.class),
        @XmlElement(name=MailConstants.E_FREEBUSY_NODATA /* n */, type=FreeBusyNODATAslot.class)
    })
    private List<FreeBusySlot> elements = Lists.newArrayList();

    /**
     * no-argument constructor wanted by JAXB
     */
    @SuppressWarnings("unused")
    private FreeBusyUserInfo() {
        this((String) null);
    }

    public FreeBusyUserInfo(String id) {
        this.id = id;
    }

    public void setElements(Iterable <FreeBusySlot> elements) {
        this.elements.clear();
        if (elements != null) {
            Iterables.addAll(this.elements,elements);
        }
    }

    public FreeBusyUserInfo addElement(FreeBusySlot element) {
        this.elements.add(element);
        return this;
    }

    public String getId() { return id; }
    public List<FreeBusySlot> getElements() {
        return Collections.unmodifiableList(elements);
    }

    public Objects.ToStringHelper addToStringInfo(Objects.ToStringHelper helper) {
        return helper
            .add("id", id)
            .add("elements", elements);
    }

    @Override
    public String toString() {
        return addToStringInfo(Objects.toStringHelper(this)).toString();
    }
}
