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
