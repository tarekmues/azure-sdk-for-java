// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.accesshelpers.ExceptionPolicyConstructorProxy;
import com.azure.communication.jobrouter.implementation.converters.ExceptionPolicyAdapter;
import com.azure.communication.jobrouter.implementation.models.ExceptionPolicyInternal;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/** A policy that defines actions to execute when exception are triggered. */
@Fluent
public final class ExceptionPolicy {

    /*
     * The Id of the exception policy
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the exception policy.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * A collection of exception rules on the exception policy.
     */
    @Generated
    @JsonProperty(value = "exceptionRules")
    private List<ExceptionRule> exceptionRules;

    /** Creates an instance of ExceptionPolicy class. */
    @Generated
    public ExceptionPolicy() {}

    /**
     * Get the id property: The Id of the exception policy.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The name of the exception policy.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the exception policy.
     *
     * @param name the name value to set.
     * @return the ExceptionPolicy object itself.
     */
    @Generated
    public ExceptionPolicy setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the exceptionRules property: A collection of exception rules on the exception policy.
     *
     * @return the exceptionRules value.
     */
    @Generated
    public List<ExceptionRule> getExceptionRules() {
        return this.exceptionRules;
    }

    /*
     * The entity tag for this resource.
     */
    @Generated
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the etag property: The entity tag for this resource.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the exceptionRules property: A collection of exception rules on the exception policy.
     *
     * @param exceptionRules the exceptionRules value to set.
     * @return the ExceptionPolicy object itself.
     */
    @Generated
    public ExceptionPolicy setExceptionRules(List<ExceptionRule> exceptionRules) {
        this.exceptionRules = exceptionRules;
        return this;
    }

    /**
     * Package-private constructor of the class, used internally.
     *
     * @param internal The internal ExceptionPolicy
     */
    ExceptionPolicy(ExceptionPolicyInternal internal) {
        id = internal.getId();

        setName(internal.getName());
        setExceptionRules(ExceptionPolicyAdapter.convertExceptionRulesToPublic(internal.getExceptionRules()));
    }

    static {
        ExceptionPolicyConstructorProxy.setAccessor(internal -> new ExceptionPolicy(internal));
    }
}
