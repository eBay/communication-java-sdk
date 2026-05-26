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
 * This type provides fields for an array that includes metrics and distributions for each rating type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RatingSummaryByRatingType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of metrics associated with feedback aggregation.
     */
    private java.util.List<FeedbackMetrics> feedbackMetrics;
    /**
     * An array listing the distribution values of the feedback ratings.
     */
    private java.util.List<FeedbackRatingValueDistribution> feedbackRatingValueDistribution;
    /**
     * This type provides fields for the time period on which the feedback summary is calculated.
     */
    private Period period;
    /**
     * This enumerated value indicates the user&apos;s role in the feedback  (&lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:UserRoleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String userRoleType;
    /**
     * Instantiates a new {@link RatingSummaryByRatingType} and sets the default values.
     */
    public RatingSummaryByRatingType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RatingSummaryByRatingType}
     */
    @jakarta.annotation.Nonnull
    public static RatingSummaryByRatingType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RatingSummaryByRatingType();
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
     * Gets the feedbackMetrics property value. An array of metrics associated with feedback aggregation.
     * @return a {@link java.util.List<FeedbackMetrics>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeedbackMetrics> getFeedbackMetrics() {
        return this.feedbackMetrics;
    }
    /**
     * Gets the feedbackRatingValueDistribution property value. An array listing the distribution values of the feedback ratings.
     * @return a {@link java.util.List<FeedbackRatingValueDistribution>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeedbackRatingValueDistribution> getFeedbackRatingValueDistribution() {
        return this.feedbackRatingValueDistribution;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("feedbackMetrics", (n) -> { this.setFeedbackMetrics(n.getCollectionOfObjectValues(FeedbackMetrics::createFromDiscriminatorValue)); });
        deserializerMap.put("feedbackRatingValueDistribution", (n) -> { this.setFeedbackRatingValueDistribution(n.getCollectionOfObjectValues(FeedbackRatingValueDistribution::createFromDiscriminatorValue)); });
        deserializerMap.put("period", (n) -> { this.setPeriod(n.getObjectValue(Period::createFromDiscriminatorValue)); });
        deserializerMap.put("userRoleType", (n) -> { this.setUserRoleType(n.getStringValue()); });
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
     * Gets the userRoleType property value. This enumerated value indicates the user&apos;s role in the feedback  (&lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:UserRoleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserRoleType() {
        return this.userRoleType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("feedbackMetrics", this.getFeedbackMetrics());
        writer.writeCollectionOfObjectValues("feedbackRatingValueDistribution", this.getFeedbackRatingValueDistribution());
        writer.writeObjectValue("period", this.getPeriod());
        writer.writeStringValue("userRoleType", this.getUserRoleType());
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
     * Sets the feedbackMetrics property value. An array of metrics associated with feedback aggregation.
     * @param value Value to set for the feedbackMetrics property.
     */
    public void setFeedbackMetrics(@jakarta.annotation.Nullable final java.util.List<FeedbackMetrics> value) {
        this.feedbackMetrics = value;
    }
    /**
     * Sets the feedbackRatingValueDistribution property value. An array listing the distribution values of the feedback ratings.
     * @param value Value to set for the feedbackRatingValueDistribution property.
     */
    public void setFeedbackRatingValueDistribution(@jakarta.annotation.Nullable final java.util.List<FeedbackRatingValueDistribution> value) {
        this.feedbackRatingValueDistribution = value;
    }
    /**
     * Sets the period property value. This type provides fields for the time period on which the feedback summary is calculated.
     * @param value Value to set for the period property.
     */
    public void setPeriod(@jakarta.annotation.Nullable final Period value) {
        this.period = value;
    }
    /**
     * Sets the userRoleType property value. This enumerated value indicates the user&apos;s role in the feedback  (&lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:UserRoleEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the userRoleType property.
     */
    public void setUserRoleType(@jakarta.annotation.Nullable final String value) {
        this.userRoleType = value;
    }
}
