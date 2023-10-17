// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** inferenceClassificationType. */
public final class MicrosoftGraphInferenceClassificationType
    extends ExpandableStringEnum<MicrosoftGraphInferenceClassificationType> {
    /** Static value focused for MicrosoftGraphInferenceClassificationType. */
    public static final MicrosoftGraphInferenceClassificationType FOCUSED = fromString("focused");

    /** Static value other for MicrosoftGraphInferenceClassificationType. */
    public static final MicrosoftGraphInferenceClassificationType OTHER = fromString("other");

    /**
     * Creates a new instance of MicrosoftGraphInferenceClassificationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MicrosoftGraphInferenceClassificationType() {
    }

    /**
     * Creates or finds a MicrosoftGraphInferenceClassificationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphInferenceClassificationType.
     */
    @JsonCreator
    public static MicrosoftGraphInferenceClassificationType fromString(String name) {
        return fromString(name, MicrosoftGraphInferenceClassificationType.class);
    }

    /**
     * Gets known MicrosoftGraphInferenceClassificationType values.
     *
     * @return known MicrosoftGraphInferenceClassificationType values.
     */
    public static Collection<MicrosoftGraphInferenceClassificationType> values() {
        return values(MicrosoftGraphInferenceClassificationType.class);
    }
}
