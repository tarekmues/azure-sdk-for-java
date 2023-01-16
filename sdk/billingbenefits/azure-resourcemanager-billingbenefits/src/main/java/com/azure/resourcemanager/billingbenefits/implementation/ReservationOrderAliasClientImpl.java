// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.billingbenefits.fluent.ReservationOrderAliasClient;
import com.azure.resourcemanager.billingbenefits.fluent.models.ReservationOrderAliasResponseInner;
import com.azure.resourcemanager.billingbenefits.models.ReservationOrderAliasRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ReservationOrderAliasClient. */
public final class ReservationOrderAliasClientImpl implements ReservationOrderAliasClient {
    /** The proxy service used to perform REST calls. */
    private final ReservationOrderAliasService service;

    /** The service client containing this operation class. */
    private final BillingBenefitsRPImpl client;

    /**
     * Initializes an instance of ReservationOrderAliasClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReservationOrderAliasClientImpl(BillingBenefitsRPImpl client) {
        this.service =
            RestProxy
                .create(ReservationOrderAliasService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingBenefitsRPReservationOrderAlias to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "BillingBenefitsRPRes")
    public interface ReservationOrderAliasService {
        @Headers({"Content-Type: application/json"})
        @Put("/providers/Microsoft.BillingBenefits/reservationOrderAliases/{reservationOrderAliasName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> create(
            @HostParam("$host") String endpoint,
            @PathParam("reservationOrderAliasName") String reservationOrderAliasName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ReservationOrderAliasRequest body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.BillingBenefits/reservationOrderAliases/{reservationOrderAliasName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReservationOrderAliasResponseInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("reservationOrderAliasName") String reservationOrderAliasName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation order alias along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String reservationOrderAliasName, ReservationOrderAliasRequest body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reservationOrderAliasName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter reservationOrderAliasName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getEndpoint(),
                            reservationOrderAliasName,
                            this.client.getApiVersion(),
                            body,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation order alias along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String reservationOrderAliasName, ReservationOrderAliasRequest body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reservationOrderAliasName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter reservationOrderAliasName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .create(
                this.client.getEndpoint(),
                reservationOrderAliasName,
                this.client.getApiVersion(),
                body,
                accept,
                context);
    }

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<ReservationOrderAliasResponseInner>, ReservationOrderAliasResponseInner>
        beginCreateAsync(String reservationOrderAliasName, ReservationOrderAliasRequest body) {
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(reservationOrderAliasName, body);
        return this
            .client
            .<ReservationOrderAliasResponseInner, ReservationOrderAliasResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                ReservationOrderAliasResponseInner.class,
                ReservationOrderAliasResponseInner.class,
                this.client.getContext());
    }

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<ReservationOrderAliasResponseInner>, ReservationOrderAliasResponseInner>
        beginCreateAsync(String reservationOrderAliasName, ReservationOrderAliasRequest body, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(reservationOrderAliasName, body, context);
        return this
            .client
            .<ReservationOrderAliasResponseInner, ReservationOrderAliasResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                ReservationOrderAliasResponseInner.class,
                ReservationOrderAliasResponseInner.class,
                context);
    }

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<ReservationOrderAliasResponseInner>, ReservationOrderAliasResponseInner> beginCreate(
        String reservationOrderAliasName, ReservationOrderAliasRequest body) {
        return this.beginCreateAsync(reservationOrderAliasName, body).getSyncPoller();
    }

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<ReservationOrderAliasResponseInner>, ReservationOrderAliasResponseInner> beginCreate(
        String reservationOrderAliasName, ReservationOrderAliasRequest body, Context context) {
        return this.beginCreateAsync(reservationOrderAliasName, body, context).getSyncPoller();
    }

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation order alias on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReservationOrderAliasResponseInner> createAsync(
        String reservationOrderAliasName, ReservationOrderAliasRequest body) {
        return beginCreateAsync(reservationOrderAliasName, body).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation order alias on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReservationOrderAliasResponseInner> createAsync(
        String reservationOrderAliasName, ReservationOrderAliasRequest body, Context context) {
        return beginCreateAsync(reservationOrderAliasName, body, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReservationOrderAliasResponseInner create(
        String reservationOrderAliasName, ReservationOrderAliasRequest body) {
        return createAsync(reservationOrderAliasName, body).block();
    }

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReservationOrderAliasResponseInner create(
        String reservationOrderAliasName, ReservationOrderAliasRequest body, Context context) {
        return createAsync(reservationOrderAliasName, body, context).block();
    }

    /**
     * Get a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reservation order alias along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReservationOrderAliasResponseInner>> getWithResponseAsync(String reservationOrderAliasName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reservationOrderAliasName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter reservationOrderAliasName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            reservationOrderAliasName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reservation order alias along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReservationOrderAliasResponseInner>> getWithResponseAsync(
        String reservationOrderAliasName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reservationOrderAliasName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter reservationOrderAliasName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), reservationOrderAliasName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Get a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reservation order alias on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReservationOrderAliasResponseInner> getAsync(String reservationOrderAliasName) {
        return getWithResponseAsync(reservationOrderAliasName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reservation order alias along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReservationOrderAliasResponseInner> getWithResponse(
        String reservationOrderAliasName, Context context) {
        return getWithResponseAsync(reservationOrderAliasName, context).block();
    }

    /**
     * Get a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReservationOrderAliasResponseInner get(String reservationOrderAliasName) {
        return getWithResponse(reservationOrderAliasName, Context.NONE).getValue();
    }
}