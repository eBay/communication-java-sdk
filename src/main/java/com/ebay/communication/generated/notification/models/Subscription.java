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

package com.ebay.communication.generated.notification.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that describes the subscription.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Subscription implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The creation date for this subscription.
     */
    private String creationDate;
    /**
     * The unique identifier for the destination associated with this subscription.
     */
    private String destinationId;
    /**
     * The unique identifier for the filter associated with this subscription.
     */
    private String filterId;
    /**
     * A type that describes the details of the subscription payload.
     */
    private SubscriptionPayloadDetail payload;
    /**
     * The status of this subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:SubscriptionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String status;
    /**
     * The unique identifier for the subscription.
     */
    private String subscriptionId;
    /**
     * The unique identifier for the topic associated with this subscription.
     */
    private String topicId;
    /**
     * Instantiates a new {@link Subscription} and sets the default values.
     */
    public Subscription() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Subscription}
     */
    @jakarta.annotation.Nonnull
    public static Subscription createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Subscription();
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
     * Gets the creationDate property value. The creation date for this subscription.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Gets the destinationId property value. The unique identifier for the destination associated with this subscription.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationId() {
        return this.destinationId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("destinationId", (n) -> { this.setDestinationId(n.getStringValue()); });
        deserializerMap.put("filterId", (n) -> { this.setFilterId(n.getStringValue()); });
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getObjectValue(SubscriptionPayloadDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("topicId", (n) -> { this.setTopicId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filterId property value. The unique identifier for the filter associated with this subscription.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilterId() {
        return this.filterId;
    }
    /**
     * Gets the payload property value. A type that describes the details of the subscription payload.
     * @return a {@link SubscriptionPayloadDetail}
     */
    @jakarta.annotation.Nullable
    public SubscriptionPayloadDetail getPayload() {
        return this.payload;
    }
    /**
     * Gets the status property value. The status of this subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:SubscriptionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the subscriptionId property value. The unique identifier for the subscription.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Gets the topicId property value. The unique identifier for the topic associated with this subscription.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTopicId() {
        return this.topicId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("creationDate", this.getCreationDate());
        writer.writeStringValue("destinationId", this.getDestinationId());
        writer.writeStringValue("filterId", this.getFilterId());
        writer.writeObjectValue("payload", this.getPayload());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("topicId", this.getTopicId());
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
     * Sets the creationDate property value. The creation date for this subscription.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the destinationId property value. The unique identifier for the destination associated with this subscription.
     * @param value Value to set for the destinationId property.
     */
    public void setDestinationId(@jakarta.annotation.Nullable final String value) {
        this.destinationId = value;
    }
    /**
     * Sets the filterId property value. The unique identifier for the filter associated with this subscription.
     * @param value Value to set for the filterId property.
     */
    public void setFilterId(@jakarta.annotation.Nullable final String value) {
        this.filterId = value;
    }
    /**
     * Sets the payload property value. A type that describes the details of the subscription payload.
     * @param value Value to set for the payload property.
     */
    public void setPayload(@jakarta.annotation.Nullable final SubscriptionPayloadDetail value) {
        this.payload = value;
    }
    /**
     * Sets the status property value. The status of this subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:SubscriptionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the subscriptionId property value. The unique identifier for the subscription.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.subscriptionId = value;
    }
    /**
     * Sets the topicId property value. The unique identifier for the topic associated with this subscription.
     * @param value Value to set for the topicId property.
     */
    public void setTopicId(@jakarta.annotation.Nullable final String value) {
        this.topicId = value;
    }
}
