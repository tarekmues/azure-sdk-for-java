// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** ApplyRecoveryPoint input specific to HyperVReplicaAzure provider. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzure")
@Fluent
public final class HyperVReplicaAzureApplyRecoveryPointInput extends ApplyRecoveryPointProviderSpecificInput {
    /*
     * The primary kek certificate pfx.
     */
    @JsonProperty(value = "primaryKekCertificatePfx")
    private String primaryKekCertificatePfx;

    /*
     * The secondary kek certificate pfx.
     */
    @JsonProperty(value = "secondaryKekCertificatePfx")
    private String secondaryKekCertificatePfx;

    /** Creates an instance of HyperVReplicaAzureApplyRecoveryPointInput class. */
    public HyperVReplicaAzureApplyRecoveryPointInput() {
    }

    /**
     * Get the primaryKekCertificatePfx property: The primary kek certificate pfx.
     *
     * @return the primaryKekCertificatePfx value.
     */
    public String primaryKekCertificatePfx() {
        return this.primaryKekCertificatePfx;
    }

    /**
     * Set the primaryKekCertificatePfx property: The primary kek certificate pfx.
     *
     * @param primaryKekCertificatePfx the primaryKekCertificatePfx value to set.
     * @return the HyperVReplicaAzureApplyRecoveryPointInput object itself.
     */
    public HyperVReplicaAzureApplyRecoveryPointInput withPrimaryKekCertificatePfx(String primaryKekCertificatePfx) {
        this.primaryKekCertificatePfx = primaryKekCertificatePfx;
        return this;
    }

    /**
     * Get the secondaryKekCertificatePfx property: The secondary kek certificate pfx.
     *
     * @return the secondaryKekCertificatePfx value.
     */
    public String secondaryKekCertificatePfx() {
        return this.secondaryKekCertificatePfx;
    }

    /**
     * Set the secondaryKekCertificatePfx property: The secondary kek certificate pfx.
     *
     * @param secondaryKekCertificatePfx the secondaryKekCertificatePfx value to set.
     * @return the HyperVReplicaAzureApplyRecoveryPointInput object itself.
     */
    public HyperVReplicaAzureApplyRecoveryPointInput withSecondaryKekCertificatePfx(String secondaryKekCertificatePfx) {
        this.secondaryKekCertificatePfx = secondaryKekCertificatePfx;
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
    }
}