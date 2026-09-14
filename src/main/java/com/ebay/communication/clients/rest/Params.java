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

package com.ebay.communication.clients.rest;

/**
 * Path-parameter validation for REST clients (SEC-007).
 * Rejects values that could enable path traversal or CRLF injection in URL segments.
 */
final class Params {
    private Params() {}

    /**
     * Validates that a path parameter contains only safe characters.
     * Allowed: alphanumeric, hyphen, underscore, dot.
     * Rejected: slash, %2F, .., null/empty.
     */
    static String requireValid(String paramName, String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(paramName + " must not be null or empty");
        }
        if (value.contains("/") || value.contains("%2F") || value.contains("%2f") || value.contains("..")) {
            throw new IllegalArgumentException(paramName + " contains illegal path characters: " + value);
        }
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_' && c != '.') {
                throw new IllegalArgumentException(
                    paramName + " contains invalid character '" + c + "': " + value);
            }
        }
        return value;
    }
}
