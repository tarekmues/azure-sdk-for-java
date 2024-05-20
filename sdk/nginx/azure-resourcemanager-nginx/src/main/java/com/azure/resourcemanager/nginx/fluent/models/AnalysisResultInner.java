// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.nginx.models.AnalysisResultData;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response body for an analysis request. Contains the status of the analysis and any errors.
 */
@Fluent
public final class AnalysisResultInner {
    /*
     * The status of the analysis.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /*
     * The data property.
     */
    @JsonProperty(value = "data")
    private AnalysisResultData data;

    /**
     * Creates an instance of AnalysisResultInner class.
     */
    public AnalysisResultInner() {
    }

    /**
     * Get the status property: The status of the analysis.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the analysis.
     * 
     * @param status the status value to set.
     * @return the AnalysisResultInner object itself.
     */
    public AnalysisResultInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    public AnalysisResultData data() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     * 
     * @param data the data value to set.
     * @return the AnalysisResultInner object itself.
     */
    public AnalysisResultInner withData(AnalysisResultData data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property status in model AnalysisResultInner"));
        }
        if (data() != null) {
            data().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AnalysisResultInner.class);
}
