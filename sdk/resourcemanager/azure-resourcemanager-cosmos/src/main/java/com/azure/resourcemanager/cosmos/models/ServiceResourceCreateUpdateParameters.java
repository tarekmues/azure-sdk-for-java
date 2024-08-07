// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for Create or Update request for ServiceResource.
 */
@Fluent
public final class ServiceResourceCreateUpdateParameters {
    /*
     * Properties in ServiceResourceCreateUpdateParameters.
     */
    @JsonProperty(value = "properties")
    private ServiceResourceCreateUpdateProperties properties;

    /**
     * Creates an instance of ServiceResourceCreateUpdateParameters class.
     */
    public ServiceResourceCreateUpdateParameters() {
    }

    /**
     * Get the properties property: Properties in ServiceResourceCreateUpdateParameters.
     * 
     * @return the properties value.
     */
    public ServiceResourceCreateUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties in ServiceResourceCreateUpdateParameters.
     * 
     * @param properties the properties value to set.
     * @return the ServiceResourceCreateUpdateParameters object itself.
     */
    public ServiceResourceCreateUpdateParameters withProperties(ServiceResourceCreateUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
