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

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enumerated value indicates the type of rating (for example, &lt;code&gt;OVERALL_EXPERIENCE&lt;/code&gt;, &lt;code&gt;DSR_ITEM_AS_DESCRIBED&lt;/code&gt;).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeedbackRatingTypeEnum implements ValuedEnum {
    OVERALL_EXPERIENCE("OVERALL_EXPERIENCE"),
    OVERALL_EXPERIENCE_COMMENT("OVERALL_EXPERIENCE_COMMENT"),
    ON_TIME_DELIVERY("ON_TIME_DELIVERY"),
    DSR_ITEM_AS_DESCRIBED("DSR_ITEM_AS_DESCRIBED"),
    DSR_COMMUNICATION("DSR_COMMUNICATION"),
    DSR_SHIPPING_CHARGES("DSR_SHIPPING_CHARGES"),
    DSR_SHIPPING_TIME("DSR_SHIPPING_TIME"),
    ITEM_RATING("ITEM_RATING");
    public final String value;
    FeedbackRatingTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeedbackRatingTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "OVERALL_EXPERIENCE": return OVERALL_EXPERIENCE;
            case "OVERALL_EXPERIENCE_COMMENT": return OVERALL_EXPERIENCE_COMMENT;
            case "ON_TIME_DELIVERY": return ON_TIME_DELIVERY;
            case "DSR_ITEM_AS_DESCRIBED": return DSR_ITEM_AS_DESCRIBED;
            case "DSR_COMMUNICATION": return DSR_COMMUNICATION;
            case "DSR_SHIPPING_CHARGES": return DSR_SHIPPING_CHARGES;
            case "DSR_SHIPPING_TIME": return DSR_SHIPPING_TIME;
            case "ITEM_RATING": return ITEM_RATING;
            default: return null;
        }
    }
}
