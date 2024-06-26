// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Mobility Service update details.
 */
@Fluent
public final class MobilityServiceUpdate {
    /*
     * The version of the latest update.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The reboot status of the update - whether it is required or not.
     */
    @JsonProperty(value = "rebootStatus")
    private String rebootStatus;

    /*
     * The OS type.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * Creates an instance of MobilityServiceUpdate class.
     */
    public MobilityServiceUpdate() {
    }

    /**
     * Get the version property: The version of the latest update.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of the latest update.
     * 
     * @param version the version value to set.
     * @return the MobilityServiceUpdate object itself.
     */
    public MobilityServiceUpdate withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the rebootStatus property: The reboot status of the update - whether it is required or not.
     * 
     * @return the rebootStatus value.
     */
    public String rebootStatus() {
        return this.rebootStatus;
    }

    /**
     * Set the rebootStatus property: The reboot status of the update - whether it is required or not.
     * 
     * @param rebootStatus the rebootStatus value to set.
     * @return the MobilityServiceUpdate object itself.
     */
    public MobilityServiceUpdate withRebootStatus(String rebootStatus) {
        this.rebootStatus = rebootStatus;
        return this;
    }

    /**
     * Get the osType property: The OS type.
     * 
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The OS type.
     * 
     * @param osType the osType value to set.
     * @return the MobilityServiceUpdate object itself.
     */
    public MobilityServiceUpdate withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
