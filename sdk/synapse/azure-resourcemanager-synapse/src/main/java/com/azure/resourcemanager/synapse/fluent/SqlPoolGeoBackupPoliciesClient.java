// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.GeoBackupPolicyInner;
import com.azure.resourcemanager.synapse.models.GeoBackupPolicyName;

/** An instance of this class provides access to all the operations defined in SqlPoolGeoBackupPoliciesClient. */
public interface SqlPoolGeoBackupPoliciesClient {
    /**
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool geo backup policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GeoBackupPolicyInner> list(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool geo backup policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GeoBackupPolicyInner> list(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GeoBackupPolicyInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters);

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database geo backup policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GeoBackupPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters,
        Context context);

    /**
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified SQL pool geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GeoBackupPolicyInner get(
        String resourceGroupName, String workspaceName, String sqlPoolName, GeoBackupPolicyName geoBackupPolicyName);

    /**
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified SQL pool geo backup policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GeoBackupPolicyInner> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
        Context context);
}
