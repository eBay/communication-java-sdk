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

package com.ebay.communication.configuration;

/**
 * Ambient per-call token carrier using ThreadLocal.
 * Works correctly for blocking calls, virtual threads (Java 21+), and same-thread async chains.
 */
public final class TokenContext {
    public static final ThreadLocal<String> CURRENT = new ThreadLocal<>();

    private TokenContext() {}

    /**
     * Sets the token for the duration of the supplier, then restores the previous value.
     */
    public static <T> T runWith(String accessToken, java.util.concurrent.Callable<T> op) throws Exception {
        String prev = CURRENT.get();
        CURRENT.set(accessToken);
        try {
            return op.call();
        } finally {
            CURRENT.set(prev);
        }
    }
}
