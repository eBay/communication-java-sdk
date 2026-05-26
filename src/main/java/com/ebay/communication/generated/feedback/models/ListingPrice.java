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
 * This type provides details about the price of the listing awaiting feedback.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListingPrice implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field provides the three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot;  target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that represents the currency of the amount in the value field. Both the &lt;b&gt;value&lt;/b&gt; and &lt;b&gt;currency&lt;/b&gt; fields are always returned when expressing prices.
     */
    private String currency;
    /**
     * This field contains the numerical value of the listing price in the currency specified in the &lt;b&gt;currency&lt;/b&gt; field. Both the &lt;b&gt;value&lt;/b&gt; and &lt;b&gt;currency&lt;/b&gt; fields are always returned when expressing prices.
     */
    private Double value;
    /**
     * Instantiates a new {@link ListingPrice} and sets the default values.
     */
    public ListingPrice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListingPrice}
     */
    @jakarta.annotation.Nonnull
    public static ListingPrice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListingPrice();
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
     * Gets the currency property value. This field provides the three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot;  target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that represents the currency of the amount in the value field. Both the &lt;b&gt;value&lt;/b&gt; and &lt;b&gt;currency&lt;/b&gt; fields are always returned when expressing prices.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. This field contains the numerical value of the listing price in the currency specified in the &lt;b&gt;currency&lt;/b&gt; field. Both the &lt;b&gt;value&lt;/b&gt; and &lt;b&gt;currency&lt;/b&gt; fields are always returned when expressing prices.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeDoubleValue("value", this.getValue());
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
     * Sets the currency property value. This field provides the three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html&quot;  target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code that represents the currency of the amount in the value field. Both the &lt;b&gt;value&lt;/b&gt; and &lt;b&gt;currency&lt;/b&gt; fields are always returned when expressing prices.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the value property value. This field contains the numerical value of the listing price in the currency specified in the &lt;b&gt;currency&lt;/b&gt; field. Both the &lt;b&gt;value&lt;/b&gt; and &lt;b&gt;currency&lt;/b&gt; fields are always returned when expressing prices.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Double value) {
        this.value = value;
    }
}
