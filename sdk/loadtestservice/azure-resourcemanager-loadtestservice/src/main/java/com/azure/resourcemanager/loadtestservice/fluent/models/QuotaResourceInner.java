// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtestservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.loadtestservice.models.ResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Quota bucket details object. */
@Fluent
public final class QuotaResourceInner extends ProxyResource {
    /*
     * Quota bucket resource properties.
     */
    @JsonProperty(value = "properties")
    private QuotaResourceProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of QuotaResourceInner class. */
    public QuotaResourceInner() {
    }

    /**
     * Get the innerProperties property: Quota bucket resource properties.
     *
     * @return the innerProperties value.
     */
    private QuotaResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the limit property: Current quota limit of the quota bucket.
     *
     * @return the limit value.
     */
    public Integer limit() {
        return this.innerProperties() == null ? null : this.innerProperties().limit();
    }

    /**
     * Set the limit property: Current quota limit of the quota bucket.
     *
     * @param limit the limit value to set.
     * @return the QuotaResourceInner object itself.
     */
    public QuotaResourceInner withLimit(Integer limit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaResourceProperties();
        }
        this.innerProperties().withLimit(limit);
        return this;
    }

    /**
     * Get the usage property: Current quota usage of the quota bucket.
     *
     * @return the usage value.
     */
    public Integer usage() {
        return this.innerProperties() == null ? null : this.innerProperties().usage();
    }

    /**
     * Set the usage property: Current quota usage of the quota bucket.
     *
     * @param usage the usage value to set.
     * @return the QuotaResourceInner object itself.
     */
    public QuotaResourceInner withUsage(Integer usage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaResourceProperties();
        }
        this.innerProperties().withUsage(usage);
        return this;
    }

    /**
     * Get the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public ResourceState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
