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
 * The enumerated value of the category being rated, such as delivery timeliness (&lt;code&gt;ON_TIME_DELIVERY&lt;/code&gt;).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum KeyEnum implements ValuedEnum {
    ON_TIME_DELIVERY("ON_TIME_DELIVERY"),
    ITEM_AS_DESCRIBED("ITEM_AS_DESCRIBED"),
    COMMUNICATION("COMMUNICATION"),
    SHIPPING_CHARGES("SHIPPING_CHARGES"),
    SHIPPING_TIME("SHIPPING_TIME");
    public final String value;
    KeyEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static KeyEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ON_TIME_DELIVERY": return ON_TIME_DELIVERY;
            case "ITEM_AS_DESCRIBED": return ITEM_AS_DESCRIBED;
            case "COMMUNICATION": return COMMUNICATION;
            case "SHIPPING_CHARGES": return SHIPPING_CHARGES;
            case "SHIPPING_TIME": return SHIPPING_TIME;
            default: return null;
        }
    }
}
