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

package com.ebay.communication.generated.feedback.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type describes line item attributes.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderLineItemAttribute implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumerated value indicates an attribute of the line item. The &lt;strong&gt;value&lt;/strong&gt; field indicates if the attribute applies.
     */
    private OrderLineItemAttributesEnum name;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, the line item attribute &lt;strong&gt;name&lt;/strong&gt; applies; if returned as &lt;code&gt;false&lt;/code&gt;, the attribute does not apply.
     */
    private String value;
    /**
     * Instantiates a new {@link OrderLineItemAttribute} and sets the default values.
     */
    public OrderLineItemAttribute() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderLineItemAttribute}
     */
    @jakarta.annotation.Nonnull
    public static OrderLineItemAttribute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderLineItemAttribute();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("name", (n) -> { this.setName(n.getEnumValue(OrderLineItemAttributesEnum::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. This enumerated value indicates an attribute of the line item. The &lt;strong&gt;value&lt;/strong&gt; field indicates if the attribute applies.
     * @return a {@link OrderLineItemAttributesEnum}
     */
    @jakarta.annotation.Nullable
    public OrderLineItemAttributesEnum getName() {
        return this.name;
    }
    /**
     * Gets the value property value. If returned as &lt;code&gt;true&lt;/code&gt;, the line item attribute &lt;strong&gt;name&lt;/strong&gt; applies; if returned as &lt;code&gt;false&lt;/code&gt;, the attribute does not apply.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("name", this.getName());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the name property value. This enumerated value indicates an attribute of the line item. The &lt;strong&gt;value&lt;/strong&gt; field indicates if the attribute applies.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final OrderLineItemAttributesEnum value) {
        this.name = value;
    }
    /**
     * Sets the value property value. If returned as &lt;code&gt;true&lt;/code&gt;, the line item attribute &lt;strong&gt;name&lt;/strong&gt; applies; if returned as &lt;code&gt;false&lt;/code&gt;, the attribute does not apply.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
