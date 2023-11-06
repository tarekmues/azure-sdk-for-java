// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.ExpressionRouterRuleLanguage;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A rule providing inline expression rules. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("expression-rule")
@Fluent
public final class ExpressionRouterRuleInternal extends RouterRuleInternal {

    /*
     * The expression language to compile to and execute
     */
    @Generated
    @JsonProperty(value = "language")
    private ExpressionRouterRuleLanguage language;

    /*
     * The string containing the expression to evaluate. Should contain return statement with calculated values.
     */
    @Generated
    @JsonProperty(value = "expression")
    private String expression;

    /**
     * Creates an instance of ExpressionRouterRule class.
     *
     * @param expression the expression value to set.
     */
    @Generated
    @JsonCreator
    public ExpressionRouterRuleInternal(@JsonProperty(value = "expression") String expression) {
        this.expression = expression;
    }

    /**
     * Get the language property: The expression language to compile to and execute.
     *
     * @return the language value.
     */
    @Generated
    public ExpressionRouterRuleLanguage getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The expression language to compile to and execute.
     *
     * @param language the language value to set.
     * @return the ExpressionRouterRule object itself.
     */
    @Generated
    public ExpressionRouterRuleInternal setLanguage(ExpressionRouterRuleLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Get the expression property: The string containing the expression to evaluate. Should contain return statement
     * with calculated values.
     *
     * @return the expression value.
     */
    @Generated
    public String getExpression() {
        return this.expression;
    }
}
