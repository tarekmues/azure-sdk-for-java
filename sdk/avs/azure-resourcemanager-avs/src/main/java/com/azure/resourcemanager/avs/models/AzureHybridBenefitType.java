// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Azure Hybrid Benefit type.
 */
public final class AzureHybridBenefitType extends ExpandableStringEnum<AzureHybridBenefitType> {
    /**
     * Static value SqlHost for AzureHybridBenefitType.
     */
    public static final AzureHybridBenefitType SQL_HOST = fromString("SqlHost");

    /**
     * Static value None for AzureHybridBenefitType.
     */
    public static final AzureHybridBenefitType NONE = fromString("None");

    /**
     * Creates a new instance of AzureHybridBenefitType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureHybridBenefitType() {
    }

    /**
     * Creates or finds a AzureHybridBenefitType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureHybridBenefitType.
     */
    public static AzureHybridBenefitType fromString(String name) {
        return fromString(name, AzureHybridBenefitType.class);
    }

    /**
     * Gets known AzureHybridBenefitType values.
     * 
     * @return known AzureHybridBenefitType values.
     */
    public static Collection<AzureHybridBenefitType> values() {
        return values(AzureHybridBenefitType.class);
    }
}
