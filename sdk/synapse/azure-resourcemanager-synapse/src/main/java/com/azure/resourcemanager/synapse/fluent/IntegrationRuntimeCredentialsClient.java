// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** An instance of this class provides access to all the operations defined in IntegrationRuntimeCredentialsClient. */
public interface IntegrationRuntimeCredentialsClient {
    /**
     * Force the integration runtime to synchronize credentials across integration runtime nodes, and this will override
     * the credentials across all worker nodes with those available on the dispatcher node. If you already have the
     * latest credential backup file, you should manually import it (preferred) on any self-hosted integration runtime
     * node than using this API directly.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void sync(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Force the integration runtime to synchronize credentials across integration runtime nodes, and this will override
     * the credentials across all worker nodes with those available on the dispatcher node. If you already have the
     * latest credential backup file, you should manually import it (preferred) on any self-hosted integration runtime
     * node than using this API directly.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> syncWithResponse(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);
}
