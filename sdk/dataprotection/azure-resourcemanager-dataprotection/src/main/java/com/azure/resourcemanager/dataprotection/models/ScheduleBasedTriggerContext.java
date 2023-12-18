// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * ScheduleBasedTriggerContext
 * 
 * Schedule based trigger context.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("ScheduleBasedTriggerContext")
@Fluent
public final class ScheduleBasedTriggerContext extends TriggerContext {
    /*
     * BackupSchedule
     * 
     * Schedule for this backup
     */
    @JsonProperty(value = "schedule", required = true)
    private BackupSchedule schedule;

    /*
     * List of tags that can be applicable for given schedule.
     */
    @JsonProperty(value = "taggingCriteria", required = true)
    private List<TaggingCriteria> taggingCriteria;

    /**
     * Creates an instance of ScheduleBasedTriggerContext class.
     */
    public ScheduleBasedTriggerContext() {
    }

    /**
     * Get the schedule property: BackupSchedule
     * 
     * Schedule for this backup.
     * 
     * @return the schedule value.
     */
    public BackupSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: BackupSchedule
     * 
     * Schedule for this backup.
     * 
     * @param schedule the schedule value to set.
     * @return the ScheduleBasedTriggerContext object itself.
     */
    public ScheduleBasedTriggerContext withSchedule(BackupSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the taggingCriteria property: List of tags that can be applicable for given schedule.
     * 
     * @return the taggingCriteria value.
     */
    public List<TaggingCriteria> taggingCriteria() {
        return this.taggingCriteria;
    }

    /**
     * Set the taggingCriteria property: List of tags that can be applicable for given schedule.
     * 
     * @param taggingCriteria the taggingCriteria value to set.
     * @return the ScheduleBasedTriggerContext object itself.
     */
    public ScheduleBasedTriggerContext withTaggingCriteria(List<TaggingCriteria> taggingCriteria) {
        this.taggingCriteria = taggingCriteria;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (schedule() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property schedule in model ScheduleBasedTriggerContext"));
        } else {
            schedule().validate();
        }
        if (taggingCriteria() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property taggingCriteria in model ScheduleBasedTriggerContext"));
        } else {
            taggingCriteria().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScheduleBasedTriggerContext.class);
}
