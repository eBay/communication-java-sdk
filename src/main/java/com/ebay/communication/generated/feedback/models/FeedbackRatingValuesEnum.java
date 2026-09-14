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
 * This enumerated value indicates the type of feedback: &lt;code&gt;POSITIVE&lt;/code&gt;, &lt;code&gt;NEUTRAL&lt;/code&gt;, &lt;code&gt;NEGATIVE&lt;/code&gt;. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Sellers can only leave positive feedback for buyers.&lt;/span&gt;&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeedbackRatingValuesEnum implements ValuedEnum {
    POSITIVE("POSITIVE"),
    NEUTRAL("NEUTRAL"),
    NEGATIVE("NEGATIVE");
    public final String value;
    FeedbackRatingValuesEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeedbackRatingValuesEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "POSITIVE": return POSITIVE;
            case "NEUTRAL": return NEUTRAL;
            case "NEGATIVE": return NEGATIVE;
            default: return null;
        }
    }
}
