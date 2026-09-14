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
 * This type provides fields for an array containing a summary of feedback ratings. Each element provides detailed metrics and distributions for specific rating types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackRatingSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array that includes metrics and distributions for each rating type.
     */
    private java.util.List<RatingSummaryByRatingType> ratingSummaryByRatingType;
    /**
     * This enumerated value indicates the type of rating being summarized. For example, &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt; indicates the rating applies to the overall transaction experience.
     */
    private FeedbackRatingTypeEnum ratingType;
    /**
     * Instantiates a new {@link FeedbackRatingSummary} and sets the default values.
     */
    public FeedbackRatingSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedbackRatingSummary}
     */
    @jakarta.annotation.Nonnull
    public static FeedbackRatingSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedbackRatingSummary();
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
        deserializerMap.put("ratingSummaryByRatingType", (n) -> { this.setRatingSummaryByRatingType(n.getCollectionOfObjectValues(RatingSummaryByRatingType::createFromDiscriminatorValue)); });
        deserializerMap.put("ratingType", (n) -> { this.setRatingType(n.getEnumValue(FeedbackRatingTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ratingSummaryByRatingType property value. An array that includes metrics and distributions for each rating type.
     * @return a {@link java.util.List<RatingSummaryByRatingType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RatingSummaryByRatingType> getRatingSummaryByRatingType() {
        return this.ratingSummaryByRatingType;
    }
    /**
     * Gets the ratingType property value. This enumerated value indicates the type of rating being summarized. For example, &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt; indicates the rating applies to the overall transaction experience.
     * @return a {@link FeedbackRatingTypeEnum}
     */
    @jakarta.annotation.Nullable
    public FeedbackRatingTypeEnum getRatingType() {
        return this.ratingType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("ratingSummaryByRatingType", this.getRatingSummaryByRatingType());
        writer.writeEnumValue("ratingType", this.getRatingType());
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
     * Sets the ratingSummaryByRatingType property value. An array that includes metrics and distributions for each rating type.
     * @param value Value to set for the ratingSummaryByRatingType property.
     */
    public void setRatingSummaryByRatingType(@jakarta.annotation.Nullable final java.util.List<RatingSummaryByRatingType> value) {
        this.ratingSummaryByRatingType = value;
    }
    /**
     * Sets the ratingType property value. This enumerated value indicates the type of rating being summarized. For example, &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt; indicates the rating applies to the overall transaction experience.
     * @param value Value to set for the ratingType property.
     */
    public void setRatingType(@jakarta.annotation.Nullable final FeedbackRatingTypeEnum value) {
        this.ratingType = value;
    }
}
