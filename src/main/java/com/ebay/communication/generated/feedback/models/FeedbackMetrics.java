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
 * This type provides fields for the array of metrics associated with feedback aggregation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackMetrics implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumerated value specifies the type of feedback aggregation. For example, &lt;code&gt;AVG&lt;/code&gt; would indicate the feedback returned represents the average value of the feedback. See &lt;strong&gt;metricValue&lt;/strong&gt; for the value of the returned feedback.
     */
    private FeedbackAggregationTypeEnum metricName;
    /**
     * The decimal value of the specified metric. For example, 55.8 would represent a value associated with the &lt;strong&gt;metricName&lt;/strong&gt; (see &lt;strong&gt;metricName&lt;/strong&gt; for interpretation and units).
     */
    private Double metricValue;
    /**
     * Instantiates a new {@link FeedbackMetrics} and sets the default values.
     */
    public FeedbackMetrics() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedbackMetrics}
     */
    @jakarta.annotation.Nonnull
    public static FeedbackMetrics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedbackMetrics();
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
        deserializerMap.put("metricName", (n) -> { this.setMetricName(n.getEnumValue(FeedbackAggregationTypeEnum::forValue)); });
        deserializerMap.put("metricValue", (n) -> { this.setMetricValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metricName property value. This enumerated value specifies the type of feedback aggregation. For example, &lt;code&gt;AVG&lt;/code&gt; would indicate the feedback returned represents the average value of the feedback. See &lt;strong&gt;metricValue&lt;/strong&gt; for the value of the returned feedback.
     * @return a {@link FeedbackAggregationTypeEnum}
     */
    @jakarta.annotation.Nullable
    public FeedbackAggregationTypeEnum getMetricName() {
        return this.metricName;
    }
    /**
     * Gets the metricValue property value. The decimal value of the specified metric. For example, 55.8 would represent a value associated with the &lt;strong&gt;metricName&lt;/strong&gt; (see &lt;strong&gt;metricName&lt;/strong&gt; for interpretation and units).
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMetricValue() {
        return this.metricValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("metricName", this.getMetricName());
        writer.writeDoubleValue("metricValue", this.getMetricValue());
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
     * Sets the metricName property value. This enumerated value specifies the type of feedback aggregation. For example, &lt;code&gt;AVG&lt;/code&gt; would indicate the feedback returned represents the average value of the feedback. See &lt;strong&gt;metricValue&lt;/strong&gt; for the value of the returned feedback.
     * @param value Value to set for the metricName property.
     */
    public void setMetricName(@jakarta.annotation.Nullable final FeedbackAggregationTypeEnum value) {
        this.metricName = value;
    }
    /**
     * Sets the metricValue property value. The decimal value of the specified metric. For example, 55.8 would represent a value associated with the &lt;strong&gt;metricName&lt;/strong&gt; (see &lt;strong&gt;metricName&lt;/strong&gt; for interpretation and units).
     * @param value Value to set for the metricValue property.
     */
    public void setMetricValue(@jakarta.annotation.Nullable final Double value) {
        this.metricValue = value;
    }
}
