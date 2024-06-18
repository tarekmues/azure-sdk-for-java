// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * MaintenanceWindow resource properties.
 */
@Fluent
public final class MaintenanceWindow implements JsonSerializable<MaintenanceWindow> {
    /*
     * The maintenance window scheduling preference.
     */
    private Preference preference;

    /*
     * Months during the year when maintenance should be performed.
     */
    private List<Month> months;

    /*
     * Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of
     * the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week. For
     * example, to allow maintenance during the 2nd week of the month (from the 8th day to the 14th day of the month),
     * use the value 2. Maintenance cannot be scheduled for the fifth week of months that contain more than 28 days.
     * Note that this parameter works in conjunction with the daysOfWeek and hoursOfDay parameters to allow you to
     * specify specific days of the week and hours that maintenance will be performed.
     */
    private List<Integer> weeksOfMonth;

    /*
     * Days during the week when maintenance should be performed.
     */
    private List<DayOfWeek> daysOfWeek;

    /*
     * The window of hours during the day when maintenance should be performed. The window is a 4 hour slot. Valid
     * values are - 0 - represents time slot 0:00 - 3:59 UTC - 4 - represents time slot 4:00 - 7:59 UTC - 8 - represents
     * time slot 8:00 - 11:59 UTC - 12 - represents time slot 12:00 - 15:59 UTC - 16 - represents time slot 16:00 -
     * 19:59 UTC - 20 - represents time slot 20:00 - 23:59 UTC
     */
    private List<Integer> hoursOfDay;

    /*
     * Lead time window allows user to set a lead time to prepare for a down time. The lead time is in weeks and valid
     * value is between 1 to 4.
     */
    private Integer leadTimeInWeeks;

    /*
     * Cloud Exadata infrastructure node patching method.
     */
    private PatchingMode patchingMode;

    /*
     * Determines the amount of time the system will wait before the start of each database server patching operation.
     * Custom action timeout is in minutes and valid value is between 15 to 120 (inclusive).
     */
    private Integer customActionTimeoutInMins;

    /*
     * If true, enables the configuration of a custom action timeout (waiting period) between database server patching
     * operations.
     */
    private Boolean isCustomActionTimeoutEnabled;

    /*
     * is Monthly Patching Enabled
     */
    private Boolean isMonthlyPatchingEnabled;

    /**
     * Creates an instance of MaintenanceWindow class.
     */
    public MaintenanceWindow() {
    }

    /**
     * Get the preference property: The maintenance window scheduling preference.
     * 
     * @return the preference value.
     */
    public Preference preference() {
        return this.preference;
    }

    /**
     * Set the preference property: The maintenance window scheduling preference.
     * 
     * @param preference the preference value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withPreference(Preference preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Get the months property: Months during the year when maintenance should be performed.
     * 
     * @return the months value.
     */
    public List<Month> months() {
        return this.months;
    }

    /**
     * Set the months property: Months during the year when maintenance should be performed.
     * 
     * @param months the months value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withMonths(List<Month> months) {
        this.months = months;
        return this;
    }

    /**
     * Get the weeksOfMonth property: Weeks during the month when maintenance should be performed. Weeks start on the
     * 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar
     * dates, not days of the week. For example, to allow maintenance during the 2nd week of the month (from the 8th day
     * to the 14th day of the month), use the value 2. Maintenance cannot be scheduled for the fifth week of months that
     * contain more than 28 days. Note that this parameter works in conjunction with the daysOfWeek and hoursOfDay
     * parameters to allow you to specify specific days of the week and hours that maintenance will be performed.
     * 
     * @return the weeksOfMonth value.
     */
    public List<Integer> weeksOfMonth() {
        return this.weeksOfMonth;
    }

    /**
     * Set the weeksOfMonth property: Weeks during the month when maintenance should be performed. Weeks start on the
     * 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar
     * dates, not days of the week. For example, to allow maintenance during the 2nd week of the month (from the 8th day
     * to the 14th day of the month), use the value 2. Maintenance cannot be scheduled for the fifth week of months that
     * contain more than 28 days. Note that this parameter works in conjunction with the daysOfWeek and hoursOfDay
     * parameters to allow you to specify specific days of the week and hours that maintenance will be performed.
     * 
     * @param weeksOfMonth the weeksOfMonth value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withWeeksOfMonth(List<Integer> weeksOfMonth) {
        this.weeksOfMonth = weeksOfMonth;
        return this;
    }

    /**
     * Get the daysOfWeek property: Days during the week when maintenance should be performed.
     * 
     * @return the daysOfWeek value.
     */
    public List<DayOfWeek> daysOfWeek() {
        return this.daysOfWeek;
    }

    /**
     * Set the daysOfWeek property: Days during the week when maintenance should be performed.
     * 
     * @param daysOfWeek the daysOfWeek value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withDaysOfWeek(List<DayOfWeek> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    /**
     * Get the hoursOfDay property: The window of hours during the day when maintenance should be performed. The window
     * is a 4 hour slot. Valid values are - 0 - represents time slot 0:00 - 3:59 UTC - 4 - represents time slot 4:00 -
     * 7:59 UTC - 8 - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot 12:00 - 15:59 UTC - 16 -
     * represents time slot 16:00 - 19:59 UTC - 20 - represents time slot 20:00 - 23:59 UTC.
     * 
     * @return the hoursOfDay value.
     */
    public List<Integer> hoursOfDay() {
        return this.hoursOfDay;
    }

    /**
     * Set the hoursOfDay property: The window of hours during the day when maintenance should be performed. The window
     * is a 4 hour slot. Valid values are - 0 - represents time slot 0:00 - 3:59 UTC - 4 - represents time slot 4:00 -
     * 7:59 UTC - 8 - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot 12:00 - 15:59 UTC - 16 -
     * represents time slot 16:00 - 19:59 UTC - 20 - represents time slot 20:00 - 23:59 UTC.
     * 
     * @param hoursOfDay the hoursOfDay value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withHoursOfDay(List<Integer> hoursOfDay) {
        this.hoursOfDay = hoursOfDay;
        return this;
    }

    /**
     * Get the leadTimeInWeeks property: Lead time window allows user to set a lead time to prepare for a down time. The
     * lead time is in weeks and valid value is between 1 to 4.
     * 
     * @return the leadTimeInWeeks value.
     */
    public Integer leadTimeInWeeks() {
        return this.leadTimeInWeeks;
    }

    /**
     * Set the leadTimeInWeeks property: Lead time window allows user to set a lead time to prepare for a down time. The
     * lead time is in weeks and valid value is between 1 to 4.
     * 
     * @param leadTimeInWeeks the leadTimeInWeeks value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withLeadTimeInWeeks(Integer leadTimeInWeeks) {
        this.leadTimeInWeeks = leadTimeInWeeks;
        return this;
    }

    /**
     * Get the patchingMode property: Cloud Exadata infrastructure node patching method.
     * 
     * @return the patchingMode value.
     */
    public PatchingMode patchingMode() {
        return this.patchingMode;
    }

    /**
     * Set the patchingMode property: Cloud Exadata infrastructure node patching method.
     * 
     * @param patchingMode the patchingMode value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withPatchingMode(PatchingMode patchingMode) {
        this.patchingMode = patchingMode;
        return this;
    }

    /**
     * Get the customActionTimeoutInMins property: Determines the amount of time the system will wait before the start
     * of each database server patching operation. Custom action timeout is in minutes and valid value is between 15 to
     * 120 (inclusive).
     * 
     * @return the customActionTimeoutInMins value.
     */
    public Integer customActionTimeoutInMins() {
        return this.customActionTimeoutInMins;
    }

    /**
     * Set the customActionTimeoutInMins property: Determines the amount of time the system will wait before the start
     * of each database server patching operation. Custom action timeout is in minutes and valid value is between 15 to
     * 120 (inclusive).
     * 
     * @param customActionTimeoutInMins the customActionTimeoutInMins value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withCustomActionTimeoutInMins(Integer customActionTimeoutInMins) {
        this.customActionTimeoutInMins = customActionTimeoutInMins;
        return this;
    }

    /**
     * Get the isCustomActionTimeoutEnabled property: If true, enables the configuration of a custom action timeout
     * (waiting period) between database server patching operations.
     * 
     * @return the isCustomActionTimeoutEnabled value.
     */
    public Boolean isCustomActionTimeoutEnabled() {
        return this.isCustomActionTimeoutEnabled;
    }

    /**
     * Set the isCustomActionTimeoutEnabled property: If true, enables the configuration of a custom action timeout
     * (waiting period) between database server patching operations.
     * 
     * @param isCustomActionTimeoutEnabled the isCustomActionTimeoutEnabled value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withIsCustomActionTimeoutEnabled(Boolean isCustomActionTimeoutEnabled) {
        this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
        return this;
    }

    /**
     * Get the isMonthlyPatchingEnabled property: is Monthly Patching Enabled.
     * 
     * @return the isMonthlyPatchingEnabled value.
     */
    public Boolean isMonthlyPatchingEnabled() {
        return this.isMonthlyPatchingEnabled;
    }

    /**
     * Set the isMonthlyPatchingEnabled property: is Monthly Patching Enabled.
     * 
     * @param isMonthlyPatchingEnabled the isMonthlyPatchingEnabled value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withIsMonthlyPatchingEnabled(Boolean isMonthlyPatchingEnabled) {
        this.isMonthlyPatchingEnabled = isMonthlyPatchingEnabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (months() != null) {
            months().forEach(e -> e.validate());
        }
        if (daysOfWeek() != null) {
            daysOfWeek().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("preference", this.preference == null ? null : this.preference.toString());
        jsonWriter.writeArrayField("months", this.months, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("weeksOfMonth", this.weeksOfMonth, (writer, element) -> writer.writeInt(element));
        jsonWriter.writeArrayField("daysOfWeek", this.daysOfWeek, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("hoursOfDay", this.hoursOfDay, (writer, element) -> writer.writeInt(element));
        jsonWriter.writeNumberField("leadTimeInWeeks", this.leadTimeInWeeks);
        jsonWriter.writeStringField("patchingMode", this.patchingMode == null ? null : this.patchingMode.toString());
        jsonWriter.writeNumberField("customActionTimeoutInMins", this.customActionTimeoutInMins);
        jsonWriter.writeBooleanField("isCustomActionTimeoutEnabled", this.isCustomActionTimeoutEnabled);
        jsonWriter.writeBooleanField("isMonthlyPatchingEnabled", this.isMonthlyPatchingEnabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MaintenanceWindow from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MaintenanceWindow if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MaintenanceWindow.
     */
    public static MaintenanceWindow fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MaintenanceWindow deserializedMaintenanceWindow = new MaintenanceWindow();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("preference".equals(fieldName)) {
                    deserializedMaintenanceWindow.preference = Preference.fromString(reader.getString());
                } else if ("months".equals(fieldName)) {
                    List<Month> months = reader.readArray(reader1 -> Month.fromJson(reader1));
                    deserializedMaintenanceWindow.months = months;
                } else if ("weeksOfMonth".equals(fieldName)) {
                    List<Integer> weeksOfMonth = reader.readArray(reader1 -> reader1.getInt());
                    deserializedMaintenanceWindow.weeksOfMonth = weeksOfMonth;
                } else if ("daysOfWeek".equals(fieldName)) {
                    List<DayOfWeek> daysOfWeek = reader.readArray(reader1 -> DayOfWeek.fromJson(reader1));
                    deserializedMaintenanceWindow.daysOfWeek = daysOfWeek;
                } else if ("hoursOfDay".equals(fieldName)) {
                    List<Integer> hoursOfDay = reader.readArray(reader1 -> reader1.getInt());
                    deserializedMaintenanceWindow.hoursOfDay = hoursOfDay;
                } else if ("leadTimeInWeeks".equals(fieldName)) {
                    deserializedMaintenanceWindow.leadTimeInWeeks = reader.getNullable(JsonReader::getInt);
                } else if ("patchingMode".equals(fieldName)) {
                    deserializedMaintenanceWindow.patchingMode = PatchingMode.fromString(reader.getString());
                } else if ("customActionTimeoutInMins".equals(fieldName)) {
                    deserializedMaintenanceWindow.customActionTimeoutInMins = reader.getNullable(JsonReader::getInt);
                } else if ("isCustomActionTimeoutEnabled".equals(fieldName)) {
                    deserializedMaintenanceWindow.isCustomActionTimeoutEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("isMonthlyPatchingEnabled".equals(fieldName)) {
                    deserializedMaintenanceWindow.isMonthlyPatchingEnabled = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMaintenanceWindow;
        });
    }
}
