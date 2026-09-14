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

import jakarta.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;

public final class CommunicationConfiguration {
    private @Nullable String accessToken;
    private RequestOptions defaultRequestOptions = new RequestOptions();

    private final String feedbackBaseUrl;
    private final String messageBaseUrl;
    private final String negotiationBaseUrl;
    private final String notificationBaseUrl;

    public CommunicationConfiguration() {
        this.feedbackBaseUrl = "https://api.ebay.com/commerce/feedback/v1";
        this.messageBaseUrl = "https://api.ebay.com/commerce/message/v1";
        this.negotiationBaseUrl = "https://api.ebay.com/sell/negotiation/v1";
        this.notificationBaseUrl = "https://api.ebay.com/commerce/notification/v1";
    }

    public CommunicationConfiguration(
            String feedbackBaseUrl,
            String messageBaseUrl,
            String negotiationBaseUrl,
            String notificationBaseUrl) {
        this.feedbackBaseUrl = validateHost(feedbackBaseUrl);
        this.messageBaseUrl = validateHost(messageBaseUrl);
        this.negotiationBaseUrl = validateHost(negotiationBaseUrl);
        this.notificationBaseUrl = validateHost(notificationBaseUrl);
    }

    private String validateHost(String url) {
        try {
            String host = new java.net.URI(url).getHost();
            if (host == null || !getAllowedHosts().contains(host)) {
                throw new IllegalArgumentException("URL host not in allowed list: " + url);
            }
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        return url;
    }

    /**
     * Sets the OAuth Bearer token used for API calls when no per-call token is provided.
     *
     * <p><b>Security note:</b> The token is stored as a Java {@code String} and will remain
     * in heap memory until garbage collected. To minimize exposure: do not log this
     * configuration object, null out the token reference when it is no longer needed,
     * and avoid storing the configuration longer than the client lifecycle.
     */
    public void setAccessToken(@Nullable String token) {
        this.accessToken = token;
    }

    public @Nullable String getAccessToken() {
        return accessToken;
    }

    public RequestOptions getDefaultRequestOptions() {
        return defaultRequestOptions;
    }

    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add("api.ebay.com");
        return hosts;
    }

    public String getFeedbackBaseUrl() {
        return feedbackBaseUrl;
    }

    public String getMessageBaseUrl() {
        return messageBaseUrl;
    }

    public String getNegotiationBaseUrl() {
        return negotiationBaseUrl;
    }

    public String getNotificationBaseUrl() {
        return notificationBaseUrl;
    }
}
