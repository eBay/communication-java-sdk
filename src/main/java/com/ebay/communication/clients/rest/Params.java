package com.ebay.communication.clients.rest;

/**
 * Path-parameter validation for REST clients (SEC-007).
 * Rejects values that could enable path traversal or CRLF injection in URL segments.
 */
final class Params {
    private Params() {}

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
