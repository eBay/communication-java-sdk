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

/**
 * Configuration for the Communication SDK.
 * Provides base URLs for each API and optional fallback access token.
 */
public final class CommunicationConfiguration {
    // Base URLs for each API (private final — immutable after construction)
    private final String feedbackBaseUrl;
    private final String messageBaseUrl;
    private final String notificationBaseUrl;
    private final String negotiationBaseUrl;
    private final String graphQLBaseUrl;

    private String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    /**
     * Default constructor using production eBay API endpoints.
     */
    public CommunicationConfiguration() {
        this.feedbackBaseUrl = "https://api.ebay.com/commerce/feedback/v1";
        this.messageBaseUrl = "https://api.ebay.com/commerce/message/v1";
        this.notificationBaseUrl = "https://api.ebay.com/commerce/notification/v1";
        this.negotiationBaseUrl = "https://api.ebay.com/sell/negotiation/v1";
        this.graphQLBaseUrl = "https://api.ebay.com/graphql";
    }

    /**
     * Constructor with custom base URLs. All URLs are validated against the allowed host list.
     * @param feedbackBaseUrl Base URL for the Feedback API.
     * @param messageBaseUrl Base URL for the Message API.
     * @param notificationBaseUrl Base URL for the Notification API.
     * @param negotiationBaseUrl Base URL for the Negotiation API.
     * @param graphQLBaseUrl Base URL for the GraphQL endpoint.
     */
    public CommunicationConfiguration(
            String feedbackBaseUrl,
            String messageBaseUrl,
            String notificationBaseUrl,
            String negotiationBaseUrl,
            String graphQLBaseUrl) {
        this.feedbackBaseUrl = validateHost(feedbackBaseUrl);
        this.messageBaseUrl = validateHost(messageBaseUrl);
        this.notificationBaseUrl = validateHost(notificationBaseUrl);
        this.negotiationBaseUrl = validateHost(negotiationBaseUrl);
        this.graphQLBaseUrl = validateHost(graphQLBaseUrl);
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

    // Getters
    public String getFeedbackBaseUrl() { return feedbackBaseUrl; }

    public String getMessageBaseUrl() { return messageBaseUrl; }

    public String getNotificationBaseUrl() { return notificationBaseUrl; }

    public String getNegotiationBaseUrl() { return negotiationBaseUrl; }

    public String getGraphQLBaseUrl() { return graphQLBaseUrl; }

    /**
     * Returns the static fallback access token.
     * <p>
     * <b>Security note:</b> Access tokens stored in heap memory (including this field) may be
     * captured in heap dumps or exposed via reflection. Prefer per-call token passing via
     * {@code TokenContext.runWith()} for sensitive multi-tenant scenarios.
     */
    public String getAccessToken() { return accessToken; }

    /**
     * Sets the static fallback access token.
     * <p>
     * <b>Security note:</b> Access tokens stored in heap memory may be captured in heap dumps
     * or exposed via reflection. Prefer per-call token passing where possible.
     */
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
        hosts.add("api.ebay.com");
        hosts.add("apiz.ebay.com");
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
