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
 * This type specifies the amount of time elapsed and the threshold associated with a transaction.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TransactionPeriod implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type provides fields for the time period on which the feedback summary is calculated.
     */
    private Period period;
    /**
     * This enumerated value indicates whether a transaction &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#response.feedbackEntries.orderLineItemSummary.transactionPeriod.period&quot; &gt;period&lt;/a&gt; exceeds, falls short, or matches the threshold. You can use this field to trigger specific logic or actions based on whether a transaction period exceeds, falls short, or matches the threshold. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:ThresholdTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String thresholdType;
    /**
     * Instantiates a new {@link TransactionPeriod} and sets the default values.
     */
    public TransactionPeriod() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TransactionPeriod}
     */
    @jakarta.annotation.Nonnull
    public static TransactionPeriod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TransactionPeriod();
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
        deserializerMap.put("period", (n) -> { this.setPeriod(n.getObjectValue(Period::createFromDiscriminatorValue)); });
        deserializerMap.put("thresholdType", (n) -> { this.setThresholdType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the period property value. This type provides fields for the time period on which the feedback summary is calculated.
     * @return a {@link Period}
     */
    @jakarta.annotation.Nullable
    public Period getPeriod() {
        return this.period;
    }
    /**
     * Gets the thresholdType property value. This enumerated value indicates whether a transaction &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#response.feedbackEntries.orderLineItemSummary.transactionPeriod.period&quot; &gt;period&lt;/a&gt; exceeds, falls short, or matches the threshold. You can use this field to trigger specific logic or actions based on whether a transaction period exceeds, falls short, or matches the threshold. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:ThresholdTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThresholdType() {
        return this.thresholdType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("period", this.getPeriod());
        writer.writeStringValue("thresholdType", this.getThresholdType());
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
     * Sets the period property value. This type provides fields for the time period on which the feedback summary is calculated.
     * @param value Value to set for the period property.
     */
    public void setPeriod(@jakarta.annotation.Nullable final Period value) {
        this.period = value;
    }
    /**
     * Sets the thresholdType property value. This enumerated value indicates whether a transaction &lt;a href=&quot;/api-docs/commerce/feedback/resources/feedback/methods/getFeedback#response.feedbackEntries.orderLineItemSummary.transactionPeriod.period&quot; &gt;period&lt;/a&gt; exceeds, falls short, or matches the threshold. You can use this field to trigger specific logic or actions based on whether a transaction period exceeds, falls short, or matches the threshold. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:ThresholdTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the thresholdType property.
     */
    public void setThresholdType(@jakarta.annotation.Nullable final String value) {
        this.thresholdType = value;
    }
}
