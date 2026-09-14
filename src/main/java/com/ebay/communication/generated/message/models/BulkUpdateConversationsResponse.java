// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.communication.generated.message.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the response payload of the &lt;strong&gt;bulkUpdateConversation&lt;/strong&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkUpdateConversationsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container returns metadata from the call, such as how many conversations were updated, how many succeeded, and how many failed.
     */
    private ConversationsMetadata conversationsMetadata;
    /**
     * This array returns a list of each conversation specified in the request and if the requested update was successful or failed.
     */
    private java.util.List<ConversationsResponse> conversationsResponse;
    /**
     * Instantiates a new {@link BulkUpdateConversationsResponse} and sets the default values.
     */
    public BulkUpdateConversationsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkUpdateConversationsResponse}
     */
    @jakarta.annotation.Nonnull
    public static BulkUpdateConversationsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkUpdateConversationsResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the conversationsMetadata property value. This container returns metadata from the call, such as how many conversations were updated, how many succeeded, and how many failed.
     * @return a {@link ConversationsMetadata}
     */
    @jakarta.annotation.Nullable
    public ConversationsMetadata getConversationsMetadata() {
        return this.conversationsMetadata;
    }
    /**
     * Gets the conversationsResponse property value. This array returns a list of each conversation specified in the request and if the requested update was successful or failed.
     * @return a {@link java.util.List<ConversationsResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConversationsResponse> getConversationsResponse() {
        return this.conversationsResponse;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("conversationsMetadata", (n) -> { this.setConversationsMetadata(n.getObjectValue(ConversationsMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("conversationsResponse", (n) -> { this.setConversationsResponse(n.getCollectionOfObjectValues(ConversationsResponse::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("conversationsMetadata", this.getConversationsMetadata());
        writer.writeCollectionOfObjectValues("conversationsResponse", this.getConversationsResponse());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the conversationsMetadata property value. This container returns metadata from the call, such as how many conversations were updated, how many succeeded, and how many failed.
     * @param value Value to set for the conversationsMetadata property.
     */
    public void setConversationsMetadata(@jakarta.annotation.Nullable final ConversationsMetadata value) {
        this.conversationsMetadata = value;
    }
    /**
     * Sets the conversationsResponse property value. This array returns a list of each conversation specified in the request and if the requested update was successful or failed.
     * @param value Value to set for the conversationsResponse property.
     */
    public void setConversationsResponse(@jakarta.annotation.Nullable final java.util.List<ConversationsResponse> value) {
        this.conversationsResponse = value;
    }
}
