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
 * This enumerated value indicates the type of data used to provide the specific feedback rating.&lt;br&gt;&lt;p&gt;If &lt;code&gt;PREDEFINED&lt;/code&gt; or &lt;code&gt;RANGE&lt;/code&gt; is returned, more information on the supported values will be returned under the &lt;strong&gt;acceptableValues&lt;/strong&gt; array. If &lt;code&gt;FREETEXT&lt;/code&gt; is returned, the maximum number of characters supported can be seen in the &lt;strong&gt;maximumCharactersAllowed&lt;/strong&gt; field.&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeedbackRatingValueTypeEnum implements ValuedEnum {
    RANGE("RANGE"),
    FREETEXT("FREETEXT"),
    PREDEFINED("PREDEFINED");
    public final String value;
    FeedbackRatingValueTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeedbackRatingValueTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "RANGE": return RANGE;
            case "FREETEXT": return FREETEXT;
            case "PREDEFINED": return PREDEFINED;
            default: return null;
        }
    }
}
