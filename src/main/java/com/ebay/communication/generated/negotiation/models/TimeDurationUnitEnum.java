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
 * An enum value that specifies the time-measurement unit that&apos;s used to express a time span.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TimeDurationUnitEnum implements ValuedEnum {
    YEAR("YEAR"),
    MONTH("MONTH"),
    DAY("DAY"),
    HOUR("HOUR"),
    CALENDAR_DAY("CALENDAR_DAY"),
    BUSINESS_DAY("BUSINESS_DAY"),
    MINUTE("MINUTE"),
    SECOND("SECOND"),
    MILLISECOND("MILLISECOND");
    public final String value;
    TimeDurationUnitEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TimeDurationUnitEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "YEAR": return YEAR;
            case "MONTH": return MONTH;
            case "DAY": return DAY;
            case "HOUR": return HOUR;
            case "CALENDAR_DAY": return CALENDAR_DAY;
            case "BUSINESS_DAY": return BUSINESS_DAY;
            case "MINUTE": return MINUTE;
            case "SECOND": return SECOND;
            case "MILLISECOND": return MILLISECOND;
            default: return null;
        }
    }
}
