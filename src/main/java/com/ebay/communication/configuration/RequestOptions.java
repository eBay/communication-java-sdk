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

import java.util.HashMap;
import java.util.Map;

/**
 * Per-call request options for custom headers and other request configuration.
 * Headers set here override DefaultRequestOptions headers from the configuration.
 */
public final class RequestOptions {
    private final Map<String, String> headers = new HashMap<>();

    /**
     * Gets the custom HTTP headers to include with the request.
     * Headers set here override DefaultRequestOptions headers from the configuration.
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Adds a header to the request.
     * @param name Header name (e.g., "X-EBAY-C-MARKETPLACE-ID")
     * @param value Header value (e.g., "EBAY_US")
     * @throws IllegalArgumentException if name or value contains CR, LF, or null bytes,
     *         or if name attempts to override the Authorization header
     */
    public void addHeader(String name, String value) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Header name must not be null or empty");
        }
        if (containsLineSeparator(name) || containsLineSeparator(value)) {
            throw new IllegalArgumentException(
                "Header name and value must not contain CR, LF, or null bytes");
        }
        if (name.equalsIgnoreCase("Authorization")) {
            throw new IllegalArgumentException(
                "Authorization header cannot be overridden via RequestOptions");
        }
        headers.put(name, value);
    }

    private static boolean containsLineSeparator(String s) {
        if (s == null) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '\r' || c == '\n' || c == '\0') return true;
        }
        return false;
    }

    /**
     * Removes a header from the request.
     * @param name Header name to remove
     */
    public void removeHeader(String name) {
        headers.remove(name);
    }

    /**
     * Clears all headers.
     */
    public void clearHeaders() {
        headers.clear();
    }
}
