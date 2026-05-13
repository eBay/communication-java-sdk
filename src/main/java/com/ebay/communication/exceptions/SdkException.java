package com.ebay.communication.exceptions;

/**
 * Base exception for Communication SDK errors.
 */
public class SdkException extends RuntimeException {
    public SdkException(String message) {
        super(message);
    }

    public SdkException(String message, Throwable cause) {
        super(message, cause);
    }
}
