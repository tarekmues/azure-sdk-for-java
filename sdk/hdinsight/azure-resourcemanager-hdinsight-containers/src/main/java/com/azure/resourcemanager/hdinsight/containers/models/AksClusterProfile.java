// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the cluster pool underlying AKS cluster. */
@Fluent
public class AksClusterProfile {
    /*
     * ARM Resource ID of the AKS cluster
     */
    @JsonProperty(value = "aksClusterResourceId")
    private String aksClusterResourceId;

    /*
     * Identity properties of the AKS cluster agentpool MSI
     */
    @JsonProperty(value = "aksClusterAgentPoolIdentityProfile")
    private AksClusterProfileAksClusterAgentPoolIdentityProfile aksClusterAgentPoolIdentityProfile;

    /*
     * AKS control plane and default node pool version of this ClusterPool
     */
    @JsonProperty(value = "aksVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String aksVersion;

    /** Creates an instance of AksClusterProfile class. */
    public AksClusterProfile() {
    }

    /**
     * Get the aksClusterResourceId property: ARM Resource ID of the AKS cluster.
     *
     * @return the aksClusterResourceId value.
     */
    public String aksClusterResourceId() {
        return this.aksClusterResourceId;
    }

    /**
     * Set the aksClusterResourceId property: ARM Resource ID of the AKS cluster.
     *
     * @param aksClusterResourceId the aksClusterResourceId value to set.
     * @return the AksClusterProfile object itself.
     */
    public AksClusterProfile withAksClusterResourceId(String aksClusterResourceId) {
        this.aksClusterResourceId = aksClusterResourceId;
        return this;
    }

    /**
     * Get the aksClusterAgentPoolIdentityProfile property: Identity properties of the AKS cluster agentpool MSI.
     *
     * @return the aksClusterAgentPoolIdentityProfile value.
     */
    public AksClusterProfileAksClusterAgentPoolIdentityProfile aksClusterAgentPoolIdentityProfile() {
        return this.aksClusterAgentPoolIdentityProfile;
    }

    /**
     * Set the aksClusterAgentPoolIdentityProfile property: Identity properties of the AKS cluster agentpool MSI.
     *
     * @param aksClusterAgentPoolIdentityProfile the aksClusterAgentPoolIdentityProfile value to set.
     * @return the AksClusterProfile object itself.
     */
    public AksClusterProfile withAksClusterAgentPoolIdentityProfile(
        AksClusterProfileAksClusterAgentPoolIdentityProfile aksClusterAgentPoolIdentityProfile) {
        this.aksClusterAgentPoolIdentityProfile = aksClusterAgentPoolIdentityProfile;
        return this;
    }

    /**
     * Get the aksVersion property: AKS control plane and default node pool version of this ClusterPool.
     *
     * @return the aksVersion value.
     */
    public String aksVersion() {
        return this.aksVersion;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aksClusterAgentPoolIdentityProfile() != null) {
            aksClusterAgentPoolIdentityProfile().validate();
        }
    }
}
