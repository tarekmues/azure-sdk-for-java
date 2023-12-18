// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Immutability Settings at vault level.
 */
@Fluent
public final class ImmutabilitySettings {
    /*
     * Immutability state
     */
    @JsonProperty(value = "state")
    private ImmutabilityState state;

    /**
     * Creates an instance of ImmutabilitySettings class.
     */
    public ImmutabilitySettings() {
    }

    /**
     * Get the state property: Immutability state.
     * 
     * @return the state value.
     */
    public ImmutabilityState state() {
        return this.state;
    }

    /**
     * Set the state property: Immutability state.
     * 
     * @param state the state value to set.
     * @return the ImmutabilitySettings object itself.
     */
    public ImmutabilitySettings withState(ImmutabilityState state) {
        this.state = state;
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
