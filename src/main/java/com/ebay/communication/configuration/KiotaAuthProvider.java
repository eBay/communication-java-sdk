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
