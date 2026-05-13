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
