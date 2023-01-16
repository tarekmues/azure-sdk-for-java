// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a query metrics interval. */
@Fluent
public final class QueryMetricInterval {
    /*
     * The start time for the metric interval (ISO-8601 format).
     */
    @JsonProperty(value = "intervalStartTime", access = JsonProperty.Access.WRITE_ONLY)
    private String intervalStartTime;

    /*
     * Interval type (length).
     */
    @JsonProperty(value = "intervalType", access = JsonProperty.Access.WRITE_ONLY)
    private QueryTimeGrainType intervalType;

    /*
     * Execution count of a query in this interval.
     */
    @JsonProperty(value = "executionCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long executionCount;

    /*
     * List of metric objects for this interval
     */
    @JsonProperty(value = "metrics")
    private List<QueryMetricProperties> metrics;

    /** Creates an instance of QueryMetricInterval class. */
    public QueryMetricInterval() {
    }

    /**
     * Get the intervalStartTime property: The start time for the metric interval (ISO-8601 format).
     *
     * @return the intervalStartTime value.
     */
    public String intervalStartTime() {
        return this.intervalStartTime;
    }

    /**
     * Get the intervalType property: Interval type (length).
     *
     * @return the intervalType value.
     */
    public QueryTimeGrainType intervalType() {
        return this.intervalType;
    }

    /**
     * Get the executionCount property: Execution count of a query in this interval.
     *
     * @return the executionCount value.
     */
    public Long executionCount() {
        return this.executionCount;
    }

    /**
     * Get the metrics property: List of metric objects for this interval.
     *
     * @return the metrics value.
     */
    public List<QueryMetricProperties> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: List of metric objects for this interval.
     *
     * @param metrics the metrics value to set.
     * @return the QueryMetricInterval object itself.
     */
    public QueryMetricInterval withMetrics(List<QueryMetricProperties> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metrics() != null) {
            metrics().forEach(e -> e.validate());
        }
    }
}