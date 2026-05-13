package com.ebay.communication.configuration;

import com.microsoft.kiota.authentication.AccessTokenProvider;
import com.microsoft.kiota.authentication.AllowedHostsValidator;
import java.net.URI;
import java.util.Map;

/**
 * Bridges TokenContext and config.getAccessToken() into Kiota's auth interface.
 * Per-call token (from TokenContext.CURRENT) wins; static config.accessToken is fallback.
 */
public final class KiotaAuthProvider implements AccessTokenProvider {
    private final CommunicationConfiguration config;
    private final AllowedHostsValidator allowedHostsValidator;

    public KiotaAuthProvider(CommunicationConfiguration config) {
        this.config = config;
        this.allowedHostsValidator = new AllowedHostsValidator(
            config.getAllowedHosts().toArray(new String[0])
        );
    }

    @Override
    public String getAuthorizationToken(URI uri, Map<String, Object> ctx) {
        String token = TokenContext.CURRENT.get() != null
            ? TokenContext.CURRENT.get()
            : config.getAccessToken();
        if (token == null) {
            throw new IllegalStateException(
                "No access token. Pass accessToken per-call or set CommunicationConfiguration.accessToken.");
        }
        return token;
    }

    @Override
    public AllowedHostsValidator getAllowedHostsValidator() {
        return allowedHostsValidator;
    }
}
