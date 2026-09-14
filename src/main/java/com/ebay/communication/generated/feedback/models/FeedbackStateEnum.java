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
 * This enumerated value indicates the current state of the feedback entry (for example, &lt;code&gt;ENTERED&lt;/code&gt;).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeedbackStateEnum implements ValuedEnum {
    ENTERED("ENTERED"),
    WITHDRAWN("WITHDRAWN"),
    HIDDEN("HIDDEN"),
    REVISED("REVISED"),
    REVISION_OPEN("REVISION_OPEN"),
    REVISION_DECLINED_OR_EXPIRED("REVISION_DECLINED_OR_EXPIRED");
    public final String value;
    FeedbackStateEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeedbackStateEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ENTERED": return ENTERED;
            case "WITHDRAWN": return WITHDRAWN;
            case "HIDDEN": return HIDDEN;
            case "REVISED": return REVISED;
            case "REVISION_OPEN": return REVISION_OPEN;
            case "REVISION_DECLINED_OR_EXPIRED": return REVISION_DECLINED_OR_EXPIRED;
            default: return null;
        }
    }
}
