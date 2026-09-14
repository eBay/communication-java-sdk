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
 * This enumerated value provides the visual star representation of the feedback score (for example, &lt;code&gt;YELLOW_STAR&lt;/code&gt;).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeedbackStarTypeEnum implements ValuedEnum {
    YELLOW_STAR("YELLOW_STAR"),
    BLUE_STAR("BLUE_STAR"),
    TURQUOISE_STAR("TURQUOISE_STAR"),
    PURPLE_STAR("PURPLE_STAR"),
    RED_STAR("RED_STAR"),
    GREEN_STAR("GREEN_STAR"),
    YELLOW_SHOOTING_STAR("YELLOW_SHOOTING_STAR"),
    TURQUOISE_SHOOTING_STAR("TURQUOISE_SHOOTING_STAR"),
    PURPLE_SHOOTING_STAR("PURPLE_SHOOTING_STAR"),
    RED_SHOOTING_STAR("RED_SHOOTING_STAR"),
    GREEN_SHOOTING_STAR("GREEN_SHOOTING_STAR"),
    SILVER_SHOOTING_STAR("SILVER_SHOOTING_STAR");
    public final String value;
    FeedbackStarTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeedbackStarTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "YELLOW_STAR": return YELLOW_STAR;
            case "BLUE_STAR": return BLUE_STAR;
            case "TURQUOISE_STAR": return TURQUOISE_STAR;
            case "PURPLE_STAR": return PURPLE_STAR;
            case "RED_STAR": return RED_STAR;
            case "GREEN_STAR": return GREEN_STAR;
            case "YELLOW_SHOOTING_STAR": return YELLOW_SHOOTING_STAR;
            case "TURQUOISE_SHOOTING_STAR": return TURQUOISE_SHOOTING_STAR;
            case "PURPLE_SHOOTING_STAR": return PURPLE_SHOOTING_STAR;
            case "RED_SHOOTING_STAR": return RED_SHOOTING_STAR;
            case "GREEN_SHOOTING_STAR": return GREEN_SHOOTING_STAR;
            case "SILVER_SHOOTING_STAR": return SILVER_SHOOTING_STAR;
            default: return null;
        }
    }
}
