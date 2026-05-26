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

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Configuration for the Communication SDK.
 * Provides base URLs for each API and optional fallback access token.
 */
public final class CommunicationConfiguration {
    // Base URLs for each API
    private String feedbackBaseUrl = "https://api.ebay.com/commerce/feedback/v1";
    private String messageBaseUrl = "https://api.ebay.com/commerce/message/v1";
    private String notificationBaseUrl = "https://api.ebay.com/commerce/notification/v1";
    private String negotiationBaseUrl = "https://api.ebay.com/sell/negotiation/v1";
    private String graphQLBaseUrl = "https://api.ebay.com/graphql";

    private String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    // Getters and setters
    public String getFeedbackBaseUrl() { return feedbackBaseUrl; }
    public void setFeedbackBaseUrl(String feedbackBaseUrl) { this.feedbackBaseUrl = feedbackBaseUrl; }

    public String getMessageBaseUrl() { return messageBaseUrl; }
    public void setMessageBaseUrl(String messageBaseUrl) { this.messageBaseUrl = messageBaseUrl; }

    public String getNotificationBaseUrl() { return notificationBaseUrl; }
    public void setNotificationBaseUrl(String notificationBaseUrl) { this.notificationBaseUrl = notificationBaseUrl; }

    public String getNegotiationBaseUrl() { return negotiationBaseUrl; }
    public void setNegotiationBaseUrl(String negotiationBaseUrl) { this.negotiationBaseUrl = negotiationBaseUrl; }

    public String getGraphQLBaseUrl() { return graphQLBaseUrl; }
    public void setGraphQLBaseUrl(String graphQLBaseUrl) { this.graphQLBaseUrl = graphQLBaseUrl; }

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }

    public boolean isDiagnosticLogging() { return diagnosticLogging; }
    public void setDiagnosticLogging(boolean diagnosticLogging) { this.diagnosticLogging = diagnosticLogging; }

    public RequestOptions getDefaultRequestOptions() { return defaultRequestOptions; }
    public void setDefaultRequestOptions(RequestOptions defaultRequestOptions) { this.defaultRequestOptions = defaultRequestOptions; }

    /**
     * All hostnames tokens may be sent to; used by AllowedHostsValidator.
     */
    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add(extractHost(feedbackBaseUrl));
        hosts.add(extractHost(messageBaseUrl));
        hosts.add(extractHost(notificationBaseUrl));
        hosts.add(extractHost(negotiationBaseUrl));
        hosts.add(extractHost(graphQLBaseUrl));
        return hosts;
    }

    private String extractHost(String url) {
        try {
            return URI.create(url).getHost();
        } catch (Exception e) {
            return "api.ebay.com"; // fallback
        }
    }
}
