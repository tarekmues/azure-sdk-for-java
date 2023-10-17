// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Get5ItemsItem. */
public final class Get5ItemsItem extends ExpandableStringEnum<Get5ItemsItem> {
    /** Static value id for Get5ItemsItem. */
    public static final Get5ItemsItem ID = fromString("id");

    /** Static value id desc for Get5ItemsItem. */
    public static final Get5ItemsItem ID_DESC = fromString("id desc");

    /** Static value authenticationType for Get5ItemsItem. */
    public static final Get5ItemsItem AUTHENTICATION_TYPE = fromString("authenticationType");

    /** Static value authenticationType desc for Get5ItemsItem. */
    public static final Get5ItemsItem AUTHENTICATION_TYPE_DESC = fromString("authenticationType desc");

    /** Static value availabilityStatus for Get5ItemsItem. */
    public static final Get5ItemsItem AVAILABILITY_STATUS = fromString("availabilityStatus");

    /** Static value availabilityStatus desc for Get5ItemsItem. */
    public static final Get5ItemsItem AVAILABILITY_STATUS_DESC = fromString("availabilityStatus desc");

    /** Static value isAdminManaged for Get5ItemsItem. */
    public static final Get5ItemsItem IS_ADMIN_MANAGED = fromString("isAdminManaged");

    /** Static value isAdminManaged desc for Get5ItemsItem. */
    public static final Get5ItemsItem IS_ADMIN_MANAGED_DESC = fromString("isAdminManaged desc");

    /** Static value isDefault for Get5ItemsItem. */
    public static final Get5ItemsItem IS_DEFAULT = fromString("isDefault");

    /** Static value isDefault desc for Get5ItemsItem. */
    public static final Get5ItemsItem IS_DEFAULT_DESC = fromString("isDefault desc");

    /** Static value isInitial for Get5ItemsItem. */
    public static final Get5ItemsItem IS_INITIAL = fromString("isInitial");

    /** Static value isInitial desc for Get5ItemsItem. */
    public static final Get5ItemsItem IS_INITIAL_DESC = fromString("isInitial desc");

    /** Static value isRoot for Get5ItemsItem. */
    public static final Get5ItemsItem IS_ROOT = fromString("isRoot");

    /** Static value isRoot desc for Get5ItemsItem. */
    public static final Get5ItemsItem IS_ROOT_DESC = fromString("isRoot desc");

    /** Static value isVerified for Get5ItemsItem. */
    public static final Get5ItemsItem IS_VERIFIED = fromString("isVerified");

    /** Static value isVerified desc for Get5ItemsItem. */
    public static final Get5ItemsItem IS_VERIFIED_DESC = fromString("isVerified desc");

    /** Static value manufacturer for Get5ItemsItem. */
    public static final Get5ItemsItem MANUFACTURER = fromString("manufacturer");

    /** Static value manufacturer desc for Get5ItemsItem. */
    public static final Get5ItemsItem MANUFACTURER_DESC = fromString("manufacturer desc");

    /** Static value model for Get5ItemsItem. */
    public static final Get5ItemsItem MODEL = fromString("model");

    /** Static value model desc for Get5ItemsItem. */
    public static final Get5ItemsItem MODEL_DESC = fromString("model desc");

    /** Static value passwordNotificationWindowInDays for Get5ItemsItem. */
    public static final Get5ItemsItem PASSWORD_NOTIFICATION_WINDOW_IN_DAYS =
        fromString("passwordNotificationWindowInDays");

    /** Static value passwordNotificationWindowInDays desc for Get5ItemsItem. */
    public static final Get5ItemsItem PASSWORD_NOTIFICATION_WINDOW_IN_DAYS_DESC =
        fromString("passwordNotificationWindowInDays desc");

    /** Static value passwordValidityPeriodInDays for Get5ItemsItem. */
    public static final Get5ItemsItem PASSWORD_VALIDITY_PERIOD_IN_DAYS = fromString("passwordValidityPeriodInDays");

    /** Static value passwordValidityPeriodInDays desc for Get5ItemsItem. */
    public static final Get5ItemsItem PASSWORD_VALIDITY_PERIOD_IN_DAYS_DESC =
        fromString("passwordValidityPeriodInDays desc");

    /** Static value state for Get5ItemsItem. */
    public static final Get5ItemsItem STATE = fromString("state");

    /** Static value state desc for Get5ItemsItem. */
    public static final Get5ItemsItem STATE_DESC = fromString("state desc");

    /** Static value supportedServices for Get5ItemsItem. */
    public static final Get5ItemsItem SUPPORTED_SERVICES = fromString("supportedServices");

    /** Static value supportedServices desc for Get5ItemsItem. */
    public static final Get5ItemsItem SUPPORTED_SERVICES_DESC = fromString("supportedServices desc");

    /**
     * Creates a new instance of Get5ItemsItem value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Get5ItemsItem() {
    }

    /**
     * Creates or finds a Get5ItemsItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Get5ItemsItem.
     */
    @JsonCreator
    public static Get5ItemsItem fromString(String name) {
        return fromString(name, Get5ItemsItem.class);
    }

    /**
     * Gets known Get5ItemsItem values.
     *
     * @return known Get5ItemsItem values.
     */
    public static Collection<Get5ItemsItem> values() {
        return values(Get5ItemsItem.class);
    }
}
