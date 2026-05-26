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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubscriptionFilter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The creation date for this subscription filter.
     */
    private String creationDate;
    /**
     * The unique identifier for this subscription filter.
     */
    private String filterId;
    /**
     * The content of this subscription filter as a valid &lt;a href=&quot;https://json-schema.org &quot; target=&quot;_blank&quot;&gt;JSON Schema Core document&lt;/a&gt; (version 2020-12 or later). The &lt;strong&gt;filterSchema&lt;/strong&gt; provided must describe the subscription&apos;s notification payload such that it supplies valid criteria to filter the subscription&apos;s notifications.
     */
    private SubscriptionFilterFilterSchema filterSchema;
    /**
     * The status of this subscription filter. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:SubscriptionFilterStatus&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String filterStatus;
    /**
     * The unique identifier for the subscription.
     */
    private String subscriptionId;
    /**
     * Instantiates a new {@link SubscriptionFilter} and sets the default values.
     */
    public SubscriptionFilter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SubscriptionFilter}
     */
    @jakarta.annotation.Nonnull
    public static SubscriptionFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubscriptionFilter();
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
     * Gets the creationDate property value. The creation date for this subscription filter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("filterId", (n) -> { this.setFilterId(n.getStringValue()); });
        deserializerMap.put("filterSchema", (n) -> { this.setFilterSchema(n.getObjectValue(SubscriptionFilterFilterSchema::createFromDiscriminatorValue)); });
        deserializerMap.put("filterStatus", (n) -> { this.setFilterStatus(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filterId property value. The unique identifier for this subscription filter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilterId() {
        return this.filterId;
    }
    /**
     * Gets the filterSchema property value. The content of this subscription filter as a valid &lt;a href=&quot;https://json-schema.org &quot; target=&quot;_blank&quot;&gt;JSON Schema Core document&lt;/a&gt; (version 2020-12 or later). The &lt;strong&gt;filterSchema&lt;/strong&gt; provided must describe the subscription&apos;s notification payload such that it supplies valid criteria to filter the subscription&apos;s notifications.
     * @return a {@link SubscriptionFilterFilterSchema}
     */
    @jakarta.annotation.Nullable
    public SubscriptionFilterFilterSchema getFilterSchema() {
        return this.filterSchema;
    }
    /**
     * Gets the filterStatus property value. The status of this subscription filter. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:SubscriptionFilterStatus&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilterStatus() {
        return this.filterStatus;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("creationDate", this.getCreationDate());
        writer.writeStringValue("filterId", this.getFilterId());
        writer.writeObjectValue("filterSchema", this.getFilterSchema());
        writer.writeStringValue("filterStatus", this.getFilterStatus());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
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
     * Sets the creationDate property value. The creation date for this subscription filter.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the filterId property value. The unique identifier for this subscription filter.
     * @param value Value to set for the filterId property.
     */
    public void setFilterId(@jakarta.annotation.Nullable final String value) {
        this.filterId = value;
    }
    /**
     * Sets the filterSchema property value. The content of this subscription filter as a valid &lt;a href=&quot;https://json-schema.org &quot; target=&quot;_blank&quot;&gt;JSON Schema Core document&lt;/a&gt; (version 2020-12 or later). The &lt;strong&gt;filterSchema&lt;/strong&gt; provided must describe the subscription&apos;s notification payload such that it supplies valid criteria to filter the subscription&apos;s notifications.
     * @param value Value to set for the filterSchema property.
     */
    public void setFilterSchema(@jakarta.annotation.Nullable final SubscriptionFilterFilterSchema value) {
        this.filterSchema = value;
    }
    /**
     * Sets the filterStatus property value. The status of this subscription filter. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/notification/types/api:SubscriptionFilterStatus&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the filterStatus property.
     */
    public void setFilterStatus(@jakarta.annotation.Nullable final String value) {
        this.filterStatus = value;
    }
    /**
     * Sets the subscriptionId property value. The unique identifier for the subscription.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.subscriptionId = value;
    }
}
