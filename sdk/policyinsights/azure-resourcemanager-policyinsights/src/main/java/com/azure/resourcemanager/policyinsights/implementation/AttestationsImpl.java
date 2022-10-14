// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policyinsights.fluent.AttestationsClient;
import com.azure.resourcemanager.policyinsights.fluent.models.AttestationInner;
import com.azure.resourcemanager.policyinsights.models.Attestation;
import com.azure.resourcemanager.policyinsights.models.Attestations;

public final class AttestationsImpl implements Attestations {
    private static final ClientLogger LOGGER = new ClientLogger(AttestationsImpl.class);

    private final AttestationsClient innerClient;

    private final com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager;

    public AttestationsImpl(
        AttestationsClient innerClient, com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Attestation> list() {
        PagedIterable<AttestationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AttestationImpl(inner1, this.manager()));
    }

    public PagedIterable<Attestation> list(Integer top, String filter, Context context) {
        PagedIterable<AttestationInner> inner = this.serviceClient().list(top, filter, context);
        return Utils.mapPage(inner, inner1 -> new AttestationImpl(inner1, this.manager()));
    }

    public Attestation createOrUpdateAtSubscription(String attestationName, AttestationInner parameters) {
        AttestationInner inner = this.serviceClient().createOrUpdateAtSubscription(attestationName, parameters);
        if (inner != null) {
            return new AttestationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Attestation createOrUpdateAtSubscription(
        String attestationName, AttestationInner parameters, Context context) {
        AttestationInner inner =
            this.serviceClient().createOrUpdateAtSubscription(attestationName, parameters, context);
        if (inner != null) {
            return new AttestationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Attestation> getAtSubscriptionWithResponse(String attestationName, Context context) {
        Response<AttestationInner> inner = this.serviceClient().getAtSubscriptionWithResponse(attestationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AttestationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Attestation getAtSubscription(String attestationName) {
        AttestationInner inner = this.serviceClient().getAtSubscription(attestationName);
        if (inner != null) {
            return new AttestationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteAtSubscriptionWithResponse(String attestationName, Context context) {
        return this.serviceClient().deleteAtSubscriptionWithResponse(attestationName, context);
    }

    public void deleteAtSubscription(String attestationName) {
        this.serviceClient().deleteAtSubscription(attestationName);
    }

    public PagedIterable<Attestation> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AttestationInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AttestationImpl(inner1, this.manager()));
    }

    public PagedIterable<Attestation> listByResourceGroup(
        String resourceGroupName, Integer top, String filter, Context context) {
        PagedIterable<AttestationInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, top, filter, context);
        return Utils.mapPage(inner, inner1 -> new AttestationImpl(inner1, this.manager()));
    }

    public Response<Attestation> getByResourceGroupWithResponse(
        String resourceGroupName, String attestationName, Context context) {
        Response<AttestationInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, attestationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AttestationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Attestation getByResourceGroup(String resourceGroupName, String attestationName) {
        AttestationInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, attestationName);
        if (inner != null) {
            return new AttestationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(
        String resourceGroupName, String attestationName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, attestationName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String attestationName) {
        this.serviceClient().delete(resourceGroupName, attestationName);
    }

    public PagedIterable<Attestation> listForResource(String resourceId) {
        PagedIterable<AttestationInner> inner = this.serviceClient().listForResource(resourceId);
        return Utils.mapPage(inner, inner1 -> new AttestationImpl(inner1, this.manager()));
    }

    public PagedIterable<Attestation> listForResource(String resourceId, Integer top, String filter, Context context) {
        PagedIterable<AttestationInner> inner = this.serviceClient().listForResource(resourceId, top, filter, context);
        return Utils.mapPage(inner, inner1 -> new AttestationImpl(inner1, this.manager()));
    }

    public Attestation createOrUpdateAtResource(
        String resourceId, String attestationName, AttestationInner parameters) {
        AttestationInner inner = this.serviceClient().createOrUpdateAtResource(resourceId, attestationName, parameters);
        if (inner != null) {
            return new AttestationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Attestation createOrUpdateAtResource(
        String resourceId, String attestationName, AttestationInner parameters, Context context) {
        AttestationInner inner =
            this.serviceClient().createOrUpdateAtResource(resourceId, attestationName, parameters, context);
        if (inner != null) {
            return new AttestationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Attestation> getAtResourceWithResponse(String resourceId, String attestationName, Context context) {
        Response<AttestationInner> inner =
            this.serviceClient().getAtResourceWithResponse(resourceId, attestationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AttestationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Attestation getAtResource(String resourceId, String attestationName) {
        AttestationInner inner = this.serviceClient().getAtResource(resourceId, attestationName);
        if (inner != null) {
            return new AttestationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteAtResourceWithResponse(String resourceId, String attestationName, Context context) {
        return this.serviceClient().deleteAtResourceWithResponse(resourceId, attestationName, context);
    }

    public void deleteAtResource(String resourceId, String attestationName) {
        this.serviceClient().deleteAtResource(resourceId, attestationName);
    }

    public Attestation getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String attestationName = Utils.getValueFromIdByName(id, "attestations");
        if (attestationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'attestations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, attestationName, Context.NONE).getValue();
    }

    public Response<Attestation> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String attestationName = Utils.getValueFromIdByName(id, "attestations");
        if (attestationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'attestations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, attestationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String attestationName = Utils.getValueFromIdByName(id, "attestations");
        if (attestationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'attestations'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, attestationName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String attestationName = Utils.getValueFromIdByName(id, "attestations");
        if (attestationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'attestations'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, attestationName, context);
    }

    private AttestationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager() {
        return this.serviceManager;
    }

    public AttestationImpl define(String name) {
        return new AttestationImpl(name, this.manager());
    }
}
