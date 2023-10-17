// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** externalAudienceScope. */
public final class MicrosoftGraphExternalAudienceScope
    extends ExpandableStringEnum<MicrosoftGraphExternalAudienceScope> {
    /** Static value none for MicrosoftGraphExternalAudienceScope. */
    public static final MicrosoftGraphExternalAudienceScope NONE = fromString("none");

    /** Static value contactsOnly for MicrosoftGraphExternalAudienceScope. */
    public static final MicrosoftGraphExternalAudienceScope CONTACTS_ONLY = fromString("contactsOnly");

    /** Static value all for MicrosoftGraphExternalAudienceScope. */
    public static final MicrosoftGraphExternalAudienceScope ALL = fromString("all");

    /**
     * Creates a new instance of MicrosoftGraphExternalAudienceScope value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MicrosoftGraphExternalAudienceScope() {
    }

    /**
     * Creates or finds a MicrosoftGraphExternalAudienceScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphExternalAudienceScope.
     */
    @JsonCreator
    public static MicrosoftGraphExternalAudienceScope fromString(String name) {
        return fromString(name, MicrosoftGraphExternalAudienceScope.class);
    }

    /**
     * Gets known MicrosoftGraphExternalAudienceScope values.
     *
     * @return known MicrosoftGraphExternalAudienceScope values.
     */
    public static Collection<MicrosoftGraphExternalAudienceScope> values() {
        return values(MicrosoftGraphExternalAudienceScope.class);
    }
}
