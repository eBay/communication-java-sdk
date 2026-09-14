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
 * This enumerated value indicates whether a transaction &lt;strong&gt;period&lt;/strong&gt; exceeds, falls short, or matches the threshold. You can use this field to trigger specific logic or actions based on whether a transaction period exceeds, falls short, or matches the threshold.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ThresholdTypeEnum implements ValuedEnum {
    MORE_THAN("MORE_THAN"),
    LESS_THAN("LESS_THAN"),
    EQUAL("EQUAL");
    public final String value;
    ThresholdTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ThresholdTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MORE_THAN": return MORE_THAN;
            case "LESS_THAN": return LESS_THAN;
            case "EQUAL": return EQUAL;
            default: return null;
        }
    }
}
