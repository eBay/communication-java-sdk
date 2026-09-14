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
 * The status for this destination.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;code&gt;MARKED_DOWN&lt;/code&gt; value is set by eBay systems and cannot be used in a create or update call by applications.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ENABLED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;DISABLED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;MARKED_DOWN&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DestinationStatusEnum implements ValuedEnum {
    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    MARKED_DOWN("MARKED_DOWN");
    public final String value;
    DestinationStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DestinationStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ENABLED": return ENABLED;
            case "DISABLED": return DISABLED;
            case "MARKED_DOWN": return MARKED_DOWN;
            default: return null;
        }
    }
}
