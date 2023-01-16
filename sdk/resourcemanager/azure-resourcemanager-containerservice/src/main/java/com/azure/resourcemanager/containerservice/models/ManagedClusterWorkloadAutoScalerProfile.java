// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Workload Auto-scaler profile for the managed cluster. */
@Fluent
public final class ManagedClusterWorkloadAutoScalerProfile {
    /*
     * KEDA (Kubernetes Event-driven Autoscaling) settings for the workload auto-scaler profile.
     */
    @JsonProperty(value = "keda")
    private ManagedClusterWorkloadAutoScalerProfileKeda keda;

    /** Creates an instance of ManagedClusterWorkloadAutoScalerProfile class. */
    public ManagedClusterWorkloadAutoScalerProfile() {
    }

    /**
     * Get the keda property: KEDA (Kubernetes Event-driven Autoscaling) settings for the workload auto-scaler profile.
     *
     * @return the keda value.
     */
    public ManagedClusterWorkloadAutoScalerProfileKeda keda() {
        return this.keda;
    }

    /**
     * Set the keda property: KEDA (Kubernetes Event-driven Autoscaling) settings for the workload auto-scaler profile.
     *
     * @param keda the keda value to set.
     * @return the ManagedClusterWorkloadAutoScalerProfile object itself.
     */
    public ManagedClusterWorkloadAutoScalerProfile withKeda(ManagedClusterWorkloadAutoScalerProfileKeda keda) {
        this.keda = keda;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keda() != null) {
            keda().validate();
        }
    }
}