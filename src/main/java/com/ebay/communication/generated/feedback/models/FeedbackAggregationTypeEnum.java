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
 * This enumerated value specifies the type of feedback aggregation. For example, &lt;code&gt;AVG&lt;/code&gt; would indicate the feedback returned represents the average value of the feedback. See &lt;strong&gt;metricValue&lt;/strong&gt; for the value of the returned feedback.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeedbackAggregationTypeEnum implements ValuedEnum {
    AVG("AVG"),
    COUNT("COUNT"),
    UNIQUE_PROVIDER_COUNT("UNIQUE_PROVIDER_COUNT"),
    POSITIVE_PERCENT_EXCLUDING_NEUTRAL_FEEDBACK("POSITIVE_PERCENT_EXCLUDING_NEUTRAL_FEEDBACK");
    public final String value;
    FeedbackAggregationTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeedbackAggregationTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AVG": return AVG;
            case "COUNT": return COUNT;
            case "UNIQUE_PROVIDER_COUNT": return UNIQUE_PROVIDER_COUNT;
            case "POSITIVE_PERCENT_EXCLUDING_NEUTRAL_FEEDBACK": return POSITIVE_PERCENT_EXCLUDING_NEUTRAL_FEEDBACK;
            default: return null;
        }
    }
}
