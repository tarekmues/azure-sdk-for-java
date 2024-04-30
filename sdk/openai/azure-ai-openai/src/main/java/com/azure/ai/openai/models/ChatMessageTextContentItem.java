// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A structured chat content item containing plain text.
 */
@Immutable
public final class ChatMessageTextContentItem extends ChatMessageContentItem {

    /*
     * The content of the message.
     */
    @Generated
    private final String text;

    /**
     * Creates an instance of ChatMessageTextContentItem class.
     *
     * @param text the text value to set.
     */
    @Generated
    public ChatMessageTextContentItem(String text) {
        this.text = text;
    }

    /**
     * Get the text property: The content of the message.
     *
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /*
     * The discriminated object type.
     */
    @Generated
    private String type = "text";

    /**
     * Get the type property: The discriminated object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatMessageTextContentItem from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatMessageTextContentItem if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatMessageTextContentItem.
     */
    @Generated
    public static ChatMessageTextContentItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String text = null;
            String type = "text";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("text".equals(fieldName)) {
                    text = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ChatMessageTextContentItem deserializedChatMessageTextContentItem = new ChatMessageTextContentItem(text);
            deserializedChatMessageTextContentItem.type = type;
            return deserializedChatMessageTextContentItem;
        });
    }
}
