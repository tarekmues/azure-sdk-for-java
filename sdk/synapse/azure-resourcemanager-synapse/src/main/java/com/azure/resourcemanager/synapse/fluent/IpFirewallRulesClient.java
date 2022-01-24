// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.IpFirewallRuleInfoInner;
import com.azure.resourcemanager.synapse.fluent.models.ReplaceAllFirewallRulesOperationResponseInner;
import com.azure.resourcemanager.synapse.models.ReplaceAllIpFirewallRulesRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in IpFirewallRulesClient. */
public interface IpFirewallRulesClient {
    /**
     * Returns a list of firewall rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IP firewall rules.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpFirewallRuleInfoInner> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Returns a list of firewall rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IP firewall rules.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpFirewallRuleInfoInner> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Creates or updates a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleName The IP firewall rule name.
     * @param ipFirewallRuleInfo IP firewall rule properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return iP firewall rule along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpFirewallRuleInfoInner>, IpFirewallRuleInfoInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, String ruleName, IpFirewallRuleInfoInner ipFirewallRuleInfo);

    /**
     * Creates or updates a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleName The IP firewall rule name.
     * @param ipFirewallRuleInfo IP firewall rule properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return iP firewall rule along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpFirewallRuleInfoInner>, IpFirewallRuleInfoInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String ruleName,
        IpFirewallRuleInfoInner ipFirewallRuleInfo,
        Context context);

    /**
     * Creates or updates a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleName The IP firewall rule name.
     * @param ipFirewallRuleInfo IP firewall rule properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return iP firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpFirewallRuleInfoInner createOrUpdate(
        String resourceGroupName, String workspaceName, String ruleName, IpFirewallRuleInfoInner ipFirewallRuleInfo);

    /**
     * Creates or updates a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleName The IP firewall rule name.
     * @param ipFirewallRuleInfo IP firewall rule properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return iP firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpFirewallRuleInfoInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String ruleName,
        IpFirewallRuleInfoInner ipFirewallRuleInfo,
        Context context);

    /**
     * Deletes a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleName The IP firewall rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Object>, Object> beginDelete(String resourceGroupName, String workspaceName, String ruleName);

    /**
     * Deletes a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleName The IP firewall rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Object>, Object> beginDelete(
        String resourceGroupName, String workspaceName, String ruleName, Context context);

    /**
     * Deletes a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleName The IP firewall rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object delete(String resourceGroupName, String workspaceName, String ruleName);

    /**
     * Deletes a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleName The IP firewall rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object delete(String resourceGroupName, String workspaceName, String ruleName, Context context);

    /**
     * Get a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleName The IP firewall rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpFirewallRuleInfoInner get(String resourceGroupName, String workspaceName, String ruleName);

    /**
     * Get a firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleName The IP firewall rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a firewall rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IpFirewallRuleInfoInner> getWithResponse(
        String resourceGroupName, String workspaceName, String ruleName, Context context);

    /**
     * Replaces firewall rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param request Replace all IP firewall rules request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing operation for replacing the firewall rules along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ReplaceAllFirewallRulesOperationResponseInner>, ReplaceAllFirewallRulesOperationResponseInner>
        beginReplaceAll(String resourceGroupName, String workspaceName, ReplaceAllIpFirewallRulesRequest request);

    /**
     * Replaces firewall rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param request Replace all IP firewall rules request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing operation for replacing the firewall rules along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ReplaceAllFirewallRulesOperationResponseInner>, ReplaceAllFirewallRulesOperationResponseInner>
        beginReplaceAll(
            String resourceGroupName, String workspaceName, ReplaceAllIpFirewallRulesRequest request, Context context);

    /**
     * Replaces firewall rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param request Replace all IP firewall rules request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing operation for replacing the firewall rules.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReplaceAllFirewallRulesOperationResponseInner replaceAll(
        String resourceGroupName, String workspaceName, ReplaceAllIpFirewallRulesRequest request);

    /**
     * Replaces firewall rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param request Replace all IP firewall rules request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing operation for replacing the firewall rules.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReplaceAllFirewallRulesOperationResponseInner replaceAll(
        String resourceGroupName, String workspaceName, ReplaceAllIpFirewallRulesRequest request, Context context);
}
