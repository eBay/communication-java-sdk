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
 * The content of a subscription filter as a valid &lt;a href=&quot;https://json-schema.org &quot; target=&quot;_blank&quot;&gt;JSON Schema Core document&lt;/a&gt; (version 2020-12 or later). The &lt;strong&gt;filterSchema&lt;/strong&gt; provided must describe the subscription&apos;s notification payload such that it supplies valid criteria to filter the subscription&apos;s notifications.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Not all topics can have filters applied to them. Use &lt;a href=&quot;/api-docs/commerce/notification/resources/topic/methods/getTopic&quot;&gt;getTopic&lt;/a&gt; and &lt;a href=&quot;/api-docs/commerce/notification/resources/topic/methods/getTopics&quot;&gt;getTopics&lt;/a&gt; requests to determine if a specific topic is filterable. Filterable topics have the boolean &lt;b&gt;filterable&lt;/b&gt; returned as &lt;code&gt;true&lt;/code&gt; in the response.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If the JSON supplied as a subscription filter specifies a field that does not exist in the notifications for a topic, or if the topic is not filterable, the filter will be rejected and become &lt;code&gt;DISABLED&lt;/code&gt;. If it is valid, however, the filter will move from &lt;code&gt;PENDING&lt;/code&gt; status to &lt;code&gt;ENABLED&lt;/code&gt; status.&lt;/span&gt;&lt;br&gt;Initially, when the &lt;b&gt;createSubscriptionFilter&lt;/b&gt; request has been made, if the request has a valid JSON body a &lt;b&gt;201&amp;nbsp;Created&lt;/b&gt; is returned. After that, the validation of the &lt;b&gt;filterSchema&lt;/b&gt; happens.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateSubscriptionFilterRequestFilterSchema implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instantiates a new {@link CreateSubscriptionFilterRequestFilterSchema} and sets the default values.
     */
    public CreateSubscriptionFilterRequestFilterSchema() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateSubscriptionFilterRequestFilterSchema}
     */
    @jakarta.annotation.Nonnull
    public static CreateSubscriptionFilterRequestFilterSchema createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateSubscriptionFilterRequestFilterSchema();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(0);
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
}
