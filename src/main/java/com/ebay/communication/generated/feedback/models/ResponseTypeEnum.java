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
 * Set this enumerated value to describe the type of response being submitted (for example, a &lt;code&gt;REPLY&lt;/code&gt; or a &lt;code&gt;FOLLOW_UP&lt;/code&gt;).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResponseTypeEnum implements ValuedEnum {
    REPLY("REPLY"),
    FOLLOW_UP("FOLLOW_UP");
    public final String value;
    ResponseTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResponseTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "REPLY": return REPLY;
            case "FOLLOW_UP": return FOLLOW_UP;
            default: return null;
        }
    }
}
