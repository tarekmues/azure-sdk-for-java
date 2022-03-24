// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.kubernetesconfiguration.models.BucketPatchDefinition;
import com.azure.resourcemanager.kubernetesconfiguration.models.GitRepositoryPatchDefinition;
import com.azure.resourcemanager.kubernetesconfiguration.models.KustomizationPatchDefinition;
import com.azure.resourcemanager.kubernetesconfiguration.models.SourceKindType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Updatable properties of an Flux Configuration Patch Request. */
@Fluent
public final class FluxConfigurationPatchProperties {
    /*
     * Source Kind to pull the configuration data from.
     */
    @JsonProperty(value = "sourceKind")
    private SourceKindType sourceKind;

    /*
     * Whether this configuration should suspend its reconciliation of its
     * kustomizations and sources.
     */
    @JsonProperty(value = "suspend")
    private Boolean suspend;

    /*
     * Parameters to reconcile to the GitRepository source kind type.
     */
    @JsonProperty(value = "gitRepository")
    private GitRepositoryPatchDefinition gitRepository;

    /*
     * Parameters to reconcile to the Bucket source kind type.
     */
    @JsonProperty(value = "bucket")
    private BucketPatchDefinition bucket;

    /*
     * Array of kustomizations used to reconcile the artifact pulled by the
     * source type on the cluster.
     */
    @JsonProperty(value = "kustomizations")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, KustomizationPatchDefinition> kustomizations;

    /*
     * Key-value pairs of protected configuration settings for the
     * configuration
     */
    @JsonProperty(value = "configurationProtectedSettings")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> configurationProtectedSettings;

    /**
     * Get the sourceKind property: Source Kind to pull the configuration data from.
     *
     * @return the sourceKind value.
     */
    public SourceKindType sourceKind() {
        return this.sourceKind;
    }

    /**
     * Set the sourceKind property: Source Kind to pull the configuration data from.
     *
     * @param sourceKind the sourceKind value to set.
     * @return the FluxConfigurationPatchProperties object itself.
     */
    public FluxConfigurationPatchProperties withSourceKind(SourceKindType sourceKind) {
        this.sourceKind = sourceKind;
        return this;
    }

    /**
     * Get the suspend property: Whether this configuration should suspend its reconciliation of its kustomizations and
     * sources.
     *
     * @return the suspend value.
     */
    public Boolean suspend() {
        return this.suspend;
    }

    /**
     * Set the suspend property: Whether this configuration should suspend its reconciliation of its kustomizations and
     * sources.
     *
     * @param suspend the suspend value to set.
     * @return the FluxConfigurationPatchProperties object itself.
     */
    public FluxConfigurationPatchProperties withSuspend(Boolean suspend) {
        this.suspend = suspend;
        return this;
    }

    /**
     * Get the gitRepository property: Parameters to reconcile to the GitRepository source kind type.
     *
     * @return the gitRepository value.
     */
    public GitRepositoryPatchDefinition gitRepository() {
        return this.gitRepository;
    }

    /**
     * Set the gitRepository property: Parameters to reconcile to the GitRepository source kind type.
     *
     * @param gitRepository the gitRepository value to set.
     * @return the FluxConfigurationPatchProperties object itself.
     */
    public FluxConfigurationPatchProperties withGitRepository(GitRepositoryPatchDefinition gitRepository) {
        this.gitRepository = gitRepository;
        return this;
    }

    /**
     * Get the bucket property: Parameters to reconcile to the Bucket source kind type.
     *
     * @return the bucket value.
     */
    public BucketPatchDefinition bucket() {
        return this.bucket;
    }

    /**
     * Set the bucket property: Parameters to reconcile to the Bucket source kind type.
     *
     * @param bucket the bucket value to set.
     * @return the FluxConfigurationPatchProperties object itself.
     */
    public FluxConfigurationPatchProperties withBucket(BucketPatchDefinition bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * Get the kustomizations property: Array of kustomizations used to reconcile the artifact pulled by the source type
     * on the cluster.
     *
     * @return the kustomizations value.
     */
    public Map<String, KustomizationPatchDefinition> kustomizations() {
        return this.kustomizations;
    }

    /**
     * Set the kustomizations property: Array of kustomizations used to reconcile the artifact pulled by the source type
     * on the cluster.
     *
     * @param kustomizations the kustomizations value to set.
     * @return the FluxConfigurationPatchProperties object itself.
     */
    public FluxConfigurationPatchProperties withKustomizations(
        Map<String, KustomizationPatchDefinition> kustomizations) {
        this.kustomizations = kustomizations;
        return this;
    }

    /**
     * Get the configurationProtectedSettings property: Key-value pairs of protected configuration settings for the
     * configuration.
     *
     * @return the configurationProtectedSettings value.
     */
    public Map<String, String> configurationProtectedSettings() {
        return this.configurationProtectedSettings;
    }

    /**
     * Set the configurationProtectedSettings property: Key-value pairs of protected configuration settings for the
     * configuration.
     *
     * @param configurationProtectedSettings the configurationProtectedSettings value to set.
     * @return the FluxConfigurationPatchProperties object itself.
     */
    public FluxConfigurationPatchProperties withConfigurationProtectedSettings(
        Map<String, String> configurationProtectedSettings) {
        this.configurationProtectedSettings = configurationProtectedSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (gitRepository() != null) {
            gitRepository().validate();
        }
        if (bucket() != null) {
            bucket().validate();
        }
        if (kustomizations() != null) {
            kustomizations()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
