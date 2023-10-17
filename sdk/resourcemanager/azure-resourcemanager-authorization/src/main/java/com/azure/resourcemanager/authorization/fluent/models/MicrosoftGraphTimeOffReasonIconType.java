// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** timeOffReasonIconType. */
public final class MicrosoftGraphTimeOffReasonIconType
    extends ExpandableStringEnum<MicrosoftGraphTimeOffReasonIconType> {
    /** Static value none for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType NONE = fromString("none");

    /** Static value car for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType CAR = fromString("car");

    /** Static value calendar for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType CALENDAR = fromString("calendar");

    /** Static value running for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType RUNNING = fromString("running");

    /** Static value plane for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType PLANE = fromString("plane");

    /** Static value firstAid for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType FIRST_AID = fromString("firstAid");

    /** Static value doctor for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType DOCTOR = fromString("doctor");

    /** Static value notWorking for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType NOT_WORKING = fromString("notWorking");

    /** Static value clock for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType CLOCK = fromString("clock");

    /** Static value juryDuty for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType JURY_DUTY = fromString("juryDuty");

    /** Static value globe for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType GLOBE = fromString("globe");

    /** Static value cup for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType CUP = fromString("cup");

    /** Static value phone for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType PHONE = fromString("phone");

    /** Static value weather for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType WEATHER = fromString("weather");

    /** Static value umbrella for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType UMBRELLA = fromString("umbrella");

    /** Static value piggyBank for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType PIGGY_BANK = fromString("piggyBank");

    /** Static value dog for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType DOG = fromString("dog");

    /** Static value cake for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType CAKE = fromString("cake");

    /** Static value trafficCone for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType TRAFFIC_CONE = fromString("trafficCone");

    /** Static value pin for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType PIN = fromString("pin");

    /** Static value sunny for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType SUNNY = fromString("sunny");

    /** Static value unknownFutureValue for MicrosoftGraphTimeOffReasonIconType. */
    public static final MicrosoftGraphTimeOffReasonIconType UNKNOWN_FUTURE_VALUE = fromString("unknownFutureValue");

    /**
     * Creates a new instance of MicrosoftGraphTimeOffReasonIconType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MicrosoftGraphTimeOffReasonIconType() {
    }

    /**
     * Creates or finds a MicrosoftGraphTimeOffReasonIconType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphTimeOffReasonIconType.
     */
    @JsonCreator
    public static MicrosoftGraphTimeOffReasonIconType fromString(String name) {
        return fromString(name, MicrosoftGraphTimeOffReasonIconType.class);
    }

    /**
     * Gets known MicrosoftGraphTimeOffReasonIconType values.
     *
     * @return known MicrosoftGraphTimeOffReasonIconType values.
     */
    public static Collection<MicrosoftGraphTimeOffReasonIconType> values() {
        return values(MicrosoftGraphTimeOffReasonIconType.class);
    }
}
