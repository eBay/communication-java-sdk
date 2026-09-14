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
 * This enumerated value indicates the state of the feedback (for example, &lt;code&gt;ENTERED&lt;/code&gt;). This can be the state of the feedback comment, the follow-up comment, or the reply comment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeedbackCommentStateEnum implements ValuedEnum {
    ENTERED("ENTERED"),
    WITHDRAWN("WITHDRAWN"),
    HIDDEN("HIDDEN"),
    REVISED("REVISED");
    public final String value;
    FeedbackCommentStateEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeedbackCommentStateEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ENTERED": return ENTERED;
            case "WITHDRAWN": return WITHDRAWN;
            case "HIDDEN": return HIDDEN;
            case "REVISED": return REVISED;
            default: return null;
        }
    }
}
