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
 * This type provides for fields in ratings attached to feedback.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackRating implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumerated value indicates the type of rating (for example, &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt;, &lt;code&gt;DSR_ITEM_AS_DESCRIBED&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackRatingTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String ratingType;
    /**
     * The value assigned to the rating, specified as a string representing a number from &lt;code&gt;1&lt;/code&gt; to &lt;code&gt;5&lt;/code&gt;, with &lt;code&gt;1&lt;/code&gt; representing the lowest rating and &lt;code&gt;5&lt;/code&gt; representing the highest rating.
     */
    private String value;
    /**
     * Instantiates a new {@link FeedbackRating} and sets the default values.
     */
    public FeedbackRating() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedbackRating}
     */
    @jakarta.annotation.Nonnull
    public static FeedbackRating createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedbackRating();
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
        deserializerMap.put("ratingType", (n) -> { this.setRatingType(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ratingType property value. This enumerated value indicates the type of rating (for example, &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt;, &lt;code&gt;DSR_ITEM_AS_DESCRIBED&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackRatingTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRatingType() {
        return this.ratingType;
    }
    /**
     * Gets the value property value. The value assigned to the rating, specified as a string representing a number from &lt;code&gt;1&lt;/code&gt; to &lt;code&gt;5&lt;/code&gt;, with &lt;code&gt;1&lt;/code&gt; representing the lowest rating and &lt;code&gt;5&lt;/code&gt; representing the highest rating.
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
        writer.writeStringValue("ratingType", this.getRatingType());
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
     * Sets the ratingType property value. This enumerated value indicates the type of rating (for example, &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt;, &lt;code&gt;DSR_ITEM_AS_DESCRIBED&lt;/code&gt;). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/commerce/feedback/types/fdb:FeedbackRatingTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the ratingType property.
     */
    public void setRatingType(@jakarta.annotation.Nullable final String value) {
        this.ratingType = value;
    }
    /**
     * Sets the value property value. The value assigned to the rating, specified as a string representing a number from &lt;code&gt;1&lt;/code&gt; to &lt;code&gt;5&lt;/code&gt;, with &lt;code&gt;1&lt;/code&gt; representing the lowest rating and &lt;code&gt;5&lt;/code&gt; representing the highest rating.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
