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

package com.ebay.communication.generated.notification.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The business context associated with this topic.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContextEnum implements ValuedEnum {
    BUY("BUY"),
    SELL("SELL"),
    COMMERCE("COMMERCE"),
    DEVELOPER("DEVELOPER");
    public final String value;
    ContextEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContextEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "BUY": return BUY;
            case "SELL": return SELL;
            case "COMMERCE": return COMMERCE;
            case "DEVELOPER": return DEVELOPER;
            default: return null;
        }
    }
}
