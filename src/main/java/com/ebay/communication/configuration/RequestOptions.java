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
     */
    public void addHeader(String name, String value) {
        headers.put(name, value);
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
