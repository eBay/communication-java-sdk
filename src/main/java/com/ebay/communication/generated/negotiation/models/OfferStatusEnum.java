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

package com.ebay.communication.generated.negotiation.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The status of the offer that was extended to a buyer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OfferStatusEnum implements ValuedEnum {
    PENDING("PENDING"),
    RETRACTED("RETRACTED"),
    EXPIRED("EXPIRED"),
    CANCELLED("CANCELLED"),
    COUNTERED("COUNTERED"),
    DECLINED("DECLINED"),
    AUTO_DECLINED("AUTO_DECLINED"),
    AUTO_ACCEPTED("AUTO_ACCEPTED"),
    ACCEPTED("ACCEPTED");
    public final String value;
    OfferStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OfferStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PENDING": return PENDING;
            case "RETRACTED": return RETRACTED;
            case "EXPIRED": return EXPIRED;
            case "CANCELLED": return CANCELLED;
            case "COUNTERED": return COUNTERED;
            case "DECLINED": return DECLINED;
            case "AUTO_DECLINED": return AUTO_DECLINED;
            case "AUTO_ACCEPTED": return AUTO_ACCEPTED;
            case "ACCEPTED": return ACCEPTED;
            default: return null;
        }
    }
}
