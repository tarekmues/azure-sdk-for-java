// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterInner;
import com.azure.resourcemanager.hdinsight.containers.models.Cluster;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPatch;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterResizeData;
import com.azure.resourcemanager.hdinsight.containers.models.ComputeProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ProvisioningStatus;
import com.azure.resourcemanager.hdinsight.containers.models.UpdatableClusterProfile;
import java.util.Collections;
import java.util.Map;

public final class ClusterImpl implements Cluster, Cluster.Definition, Cluster.Update {
    private ClusterInner innerObject;

    private final com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String clusterType() {
        return this.innerModel().clusterType();
    }

    public String deploymentId() {
        return this.innerModel().deploymentId();
    }

    public ComputeProfile computeProfile() {
        return this.innerModel().computeProfile();
    }

    public ClusterProfile clusterProfile() {
        return this.innerModel().clusterProfile();
    }

    public String status() {
        return this.innerModel().status();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ClusterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterPoolName;

    private String clusterName;

    private ClusterPatch updateClusterPatchRequest;

    public ClusterImpl withExistingClusterpool(String resourceGroupName, String clusterPoolName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterPoolName = clusterPoolName;
        return this;
    }

    public Cluster create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .create(resourceGroupName, clusterPoolName, clusterName, this.innerModel(), Context.NONE);
        return this;
    }

    public Cluster create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .create(resourceGroupName, clusterPoolName, clusterName, this.innerModel(), context);
        return this;
    }

    ClusterImpl(String name, com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager) {
        this.innerObject = new ClusterInner();
        this.serviceManager = serviceManager;
        this.clusterName = name;
    }

    public ClusterImpl update() {
        this.updateClusterPatchRequest = new ClusterPatch();
        return this;
    }

    public Cluster apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .update(resourceGroupName, clusterPoolName, clusterName, updateClusterPatchRequest, Context.NONE);
        return this;
    }

    public Cluster apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .update(resourceGroupName, clusterPoolName, clusterName, updateClusterPatchRequest, context);
        return this;
    }

    ClusterImpl(
        ClusterInner innerObject,
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterPoolName = Utils.getValueFromIdByName(innerObject.id(), "clusterpools");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
    }

    public Cluster refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .getWithResponse(resourceGroupName, clusterPoolName, clusterName, Context.NONE)
                .getValue();
        return this;
    }

    public Cluster refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .getWithResponse(resourceGroupName, clusterPoolName, clusterName, context)
                .getValue();
        return this;
    }

    public Cluster resize(ClusterResizeData clusterResizeRequest) {
        return serviceManager.clusters().resize(resourceGroupName, clusterPoolName, clusterName, clusterResizeRequest);
    }

    public Cluster resize(ClusterResizeData clusterResizeRequest, Context context) {
        return serviceManager
            .clusters()
            .resize(resourceGroupName, clusterPoolName, clusterName, clusterResizeRequest, context);
    }

    public ClusterImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ClusterImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ClusterImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateClusterPatchRequest.withTags(tags);
            return this;
        }
    }

    public ClusterImpl withClusterType(String clusterType) {
        this.innerModel().withClusterType(clusterType);
        return this;
    }

    public ClusterImpl withComputeProfile(ComputeProfile computeProfile) {
        this.innerModel().withComputeProfile(computeProfile);
        return this;
    }

    public ClusterImpl withClusterProfile(ClusterProfile clusterProfile) {
        this.innerModel().withClusterProfile(clusterProfile);
        return this;
    }

    public ClusterImpl withClusterProfile(UpdatableClusterProfile clusterProfile) {
        this.updateClusterPatchRequest.withClusterProfile(clusterProfile);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
