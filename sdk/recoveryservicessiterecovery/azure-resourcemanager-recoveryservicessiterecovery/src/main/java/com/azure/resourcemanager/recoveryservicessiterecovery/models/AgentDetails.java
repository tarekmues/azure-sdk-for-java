// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Agent details. */
@Immutable
public final class AgentDetails {
    /*
     * The Id of the agent running on the server.
     */
    @JsonProperty(value = "agentId", access = JsonProperty.Access.WRITE_ONLY)
    private String agentId;

    /*
     * The Id of the machine to which the agent is registered.
     */
    @JsonProperty(value = "machineId", access = JsonProperty.Access.WRITE_ONLY)
    private String machineId;

    /*
     * The machine BIOS Id.
     */
    @JsonProperty(value = "biosId", access = JsonProperty.Access.WRITE_ONLY)
    private String biosId;

    /*
     * The machine FQDN.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /*
     * The disks.
     */
    @JsonProperty(value = "disks", access = JsonProperty.Access.WRITE_ONLY)
    private List<AgentDiskDetails> disks;

    /** Creates an instance of AgentDetails class. */
    public AgentDetails() {
    }

    /**
     * Get the agentId property: The Id of the agent running on the server.
     *
     * @return the agentId value.
     */
    public String agentId() {
        return this.agentId;
    }

    /**
     * Get the machineId property: The Id of the machine to which the agent is registered.
     *
     * @return the machineId value.
     */
    public String machineId() {
        return this.machineId;
    }

    /**
     * Get the biosId property: The machine BIOS Id.
     *
     * @return the biosId value.
     */
    public String biosId() {
        return this.biosId;
    }

    /**
     * Get the fqdn property: The machine FQDN.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the disks property: The disks.
     *
     * @return the disks value.
     */
    public List<AgentDiskDetails> disks() {
        return this.disks;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (disks() != null) {
            disks().forEach(e -> e.validate());
        }
    }
}