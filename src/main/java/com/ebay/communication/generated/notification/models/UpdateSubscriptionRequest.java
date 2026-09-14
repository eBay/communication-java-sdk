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
 * A type that describes the details of the update subscription request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateSubscriptionRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the destination endpoint that will receive notifications associated with this subscription. Use &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-destination-getdestinations&quot;&gt;getDestinations&lt;/a&gt; to retrieve destination IDs.
     */
    private String destinationId;
    /**
     * The payload associated with this subscription.
     */
    private SubscriptionPayloadDetail payload;
    /**
     * Set the status of the subscription being updated to &lt;code&gt;ENABLED&lt;/code&gt; or &lt;code&gt;DISABLED&lt;/code&gt;.
     */
    private SubscriptionStatusEnum status;
    /**
     * Instantiates a new {@link UpdateSubscriptionRequest} and sets the default values.
     */
    public UpdateSubscriptionRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateSubscriptionRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateSubscriptionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateSubscriptionRequest();
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
     * Gets the destinationId property value. The unique identifier of the destination endpoint that will receive notifications associated with this subscription. Use &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-destination-getdestinations&quot;&gt;getDestinations&lt;/a&gt; to retrieve destination IDs.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("destinationId", (n) -> { this.setDestinationId(n.getStringValue()); });
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getObjectValue(SubscriptionPayloadDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SubscriptionStatusEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the payload property value. The payload associated with this subscription.
     * @return a {@link SubscriptionPayloadDetail}
     */
    @jakarta.annotation.Nullable
    public SubscriptionPayloadDetail getPayload() {
        return this.payload;
    }
    /**
     * Gets the status property value. Set the status of the subscription being updated to &lt;code&gt;ENABLED&lt;/code&gt; or &lt;code&gt;DISABLED&lt;/code&gt;.
     * @return a {@link SubscriptionStatusEnum}
     */
    @jakarta.annotation.Nullable
    public SubscriptionStatusEnum getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("destinationId", this.getDestinationId());
        writer.writeObjectValue("payload", this.getPayload());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the destinationId property value. The unique identifier of the destination endpoint that will receive notifications associated with this subscription. Use &lt;a href=&quot;/develop/api/sell/notification_api#sell-notification_api-destination-getdestinations&quot;&gt;getDestinations&lt;/a&gt; to retrieve destination IDs.
     * @param value Value to set for the destinationId property.
     */
    public void setDestinationId(@jakarta.annotation.Nullable final String value) {
        this.destinationId = value;
    }
    /**
     * Sets the payload property value. The payload associated with this subscription.
     * @param value Value to set for the payload property.
     */
    public void setPayload(@jakarta.annotation.Nullable final SubscriptionPayloadDetail value) {
        this.payload = value;
    }
    /**
     * Sets the status property value. Set the status of the subscription being updated to &lt;code&gt;ENABLED&lt;/code&gt; or &lt;code&gt;DISABLED&lt;/code&gt;.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SubscriptionStatusEnum value) {
        this.status = value;
    }
}
