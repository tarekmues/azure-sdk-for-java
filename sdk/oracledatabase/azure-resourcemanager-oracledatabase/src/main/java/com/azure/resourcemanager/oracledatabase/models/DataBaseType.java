// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Database type enum.
 */
public final class DataBaseType extends ExpandableStringEnum<DataBaseType> {
    /**
     * Static value Regular for DataBaseType.
     */
    public static final DataBaseType REGULAR = fromString("Regular");

    /**
     * Static value Clone for DataBaseType.
     */
    public static final DataBaseType CLONE = fromString("Clone");

    /**
     * Creates a new instance of DataBaseType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataBaseType() {
    }

    /**
     * Creates or finds a DataBaseType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataBaseType.
     */
    public static DataBaseType fromString(String name) {
        return fromString(name, DataBaseType.class);
    }

    /**
     * Gets known DataBaseType values.
     * 
     * @return known DataBaseType values.
     */
    public static Collection<DataBaseType> values() {
        return values(DataBaseType.class);
    }
}
