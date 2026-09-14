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
 * This enumerated value indicates an attribute of the line item. The &lt;strong&gt;value&lt;/strong&gt; field indicates if the attribute applies.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrderLineItemAttributesEnum implements ValuedEnum {
    PRIVATE_ITEM("PRIVATE_ITEM"),
    MATURE_CATEGORY("MATURE_CATEGORY"),
    SOLD_AS_BEST_OFFER("SOLD_AS_BEST_OFFER");
    public final String value;
    OrderLineItemAttributesEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrderLineItemAttributesEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PRIVATE_ITEM": return PRIVATE_ITEM;
            case "MATURE_CATEGORY": return MATURE_CATEGORY;
            case "SOLD_AS_BEST_OFFER": return SOLD_AS_BEST_OFFER;
            default: return null;
        }
    }
}
