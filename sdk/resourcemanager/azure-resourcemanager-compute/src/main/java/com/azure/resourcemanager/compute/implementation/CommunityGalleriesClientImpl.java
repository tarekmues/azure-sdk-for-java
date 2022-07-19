// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.compute.fluent.CommunityGalleriesClient;
import com.azure.resourcemanager.compute.fluent.models.CommunityGalleryInner;
import com.azure.resourcemanager.compute.models.ApiErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CommunityGalleriesClient. */
public final class CommunityGalleriesClientImpl implements CommunityGalleriesClient {
    /** The proxy service used to perform REST calls. */
    private final CommunityGalleriesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of CommunityGalleriesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CommunityGalleriesClientImpl(ComputeManagementClientImpl client) {
        this.service =
            RestProxy.create(CommunityGalleriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientCommunityGalleries to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface CommunityGalleriesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/communityGalleries"
                + "/{publicGalleryName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<CommunityGalleryInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @PathParam("publicGalleryName") String publicGalleryName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get a community gallery by gallery public name.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery by gallery public name along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunityGalleryInner>> getWithResponseAsync(String location, String publicGalleryName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publicGalleryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter publicGalleryName is required and cannot be null."));
        }
        final String apiVersion = "2022-01-03";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            publicGalleryName,
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a community gallery by gallery public name.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery by gallery public name along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CommunityGalleryInner>> getWithResponseAsync(
        String location, String publicGalleryName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publicGalleryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter publicGalleryName is required and cannot be null."));
        }
        final String apiVersion = "2022-01-03";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                publicGalleryName,
                apiVersion,
                accept,
                context);
    }

    /**
     * Get a community gallery by gallery public name.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery by gallery public name on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunityGalleryInner> getAsync(String location, String publicGalleryName) {
        return getWithResponseAsync(location, publicGalleryName)
            .flatMap(
                (Response<CommunityGalleryInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get a community gallery by gallery public name.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery by gallery public name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunityGalleryInner get(String location, String publicGalleryName) {
        return getAsync(location, publicGalleryName).block();
    }

    /**
     * Get a community gallery by gallery public name.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery by gallery public name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CommunityGalleryInner> getWithResponse(String location, String publicGalleryName, Context context) {
        return getWithResponseAsync(location, publicGalleryName, context).block();
    }
}
