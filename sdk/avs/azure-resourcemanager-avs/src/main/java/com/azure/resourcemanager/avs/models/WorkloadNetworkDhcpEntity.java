// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Base class for WorkloadNetworkDhcpServer and WorkloadNetworkDhcpRelay to
 * inherit from.
 */
@Fluent
public class WorkloadNetworkDhcpEntity implements JsonSerializable<WorkloadNetworkDhcpEntity> {
    /*
     * Type of DHCP: SERVER or RELAY.
     */
    private DhcpTypeEnum dhcpType = DhcpTypeEnum.fromString("WorkloadNetworkDhcpEntity");

    /*
     * Display name of the DHCP entity.
     */
    private String displayName;

    /*
     * NSX Segments consuming DHCP.
     */
    private List<String> segments;

    /*
     * The provisioning state
     */
    private WorkloadNetworkDhcpProvisioningState provisioningState;

    /*
     * NSX revision number.
     */
    private Long revision;

    /**
     * Creates an instance of WorkloadNetworkDhcpEntity class.
     */
    public WorkloadNetworkDhcpEntity() {
    }

    /**
     * Get the dhcpType property: Type of DHCP: SERVER or RELAY.
     * 
     * @return the dhcpType value.
     */
    public DhcpTypeEnum dhcpType() {
        return this.dhcpType;
    }

    /**
     * Get the displayName property: Display name of the DHCP entity.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the DHCP entity.
     * 
     * @param displayName the displayName value to set.
     * @return the WorkloadNetworkDhcpEntity object itself.
     */
    public WorkloadNetworkDhcpEntity withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the segments property: NSX Segments consuming DHCP.
     * 
     * @return the segments value.
     */
    public List<String> segments() {
        return this.segments;
    }

    /**
     * Set the segments property: NSX Segments consuming DHCP.
     * 
     * @param segments the segments value to set.
     * @return the WorkloadNetworkDhcpEntity object itself.
     */
    WorkloadNetworkDhcpEntity withSegments(List<String> segments) {
        this.segments = segments;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     * 
     * @return the provisioningState value.
     */
    public WorkloadNetworkDhcpProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the WorkloadNetworkDhcpEntity object itself.
     */
    WorkloadNetworkDhcpEntity withProvisioningState(WorkloadNetworkDhcpProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the revision property: NSX revision number.
     * 
     * @return the revision value.
     */
    public Long revision() {
        return this.revision;
    }

    /**
     * Set the revision property: NSX revision number.
     * 
     * @param revision the revision value to set.
     * @return the WorkloadNetworkDhcpEntity object itself.
     */
    public WorkloadNetworkDhcpEntity withRevision(Long revision) {
        this.revision = revision;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dhcpType", this.dhcpType == null ? null : this.dhcpType.toString());
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeNumberField("revision", this.revision);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkloadNetworkDhcpEntity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkloadNetworkDhcpEntity if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkloadNetworkDhcpEntity.
     */
    public static WorkloadNetworkDhcpEntity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("dhcpType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("RELAY".equals(discriminatorValue)) {
                    return WorkloadNetworkDhcpRelay.fromJson(readerToUse.reset());
                } else if ("SERVER".equals(discriminatorValue)) {
                    return WorkloadNetworkDhcpServer.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static WorkloadNetworkDhcpEntity fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkloadNetworkDhcpEntity deserializedWorkloadNetworkDhcpEntity = new WorkloadNetworkDhcpEntity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dhcpType".equals(fieldName)) {
                    deserializedWorkloadNetworkDhcpEntity.dhcpType = DhcpTypeEnum.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedWorkloadNetworkDhcpEntity.displayName = reader.getString();
                } else if ("segments".equals(fieldName)) {
                    List<String> segments = reader.readArray(reader1 -> reader1.getString());
                    deserializedWorkloadNetworkDhcpEntity.segments = segments;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedWorkloadNetworkDhcpEntity.provisioningState
                        = WorkloadNetworkDhcpProvisioningState.fromString(reader.getString());
                } else if ("revision".equals(fieldName)) {
                    deserializedWorkloadNetworkDhcpEntity.revision = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkloadNetworkDhcpEntity;
        });
    }
}
