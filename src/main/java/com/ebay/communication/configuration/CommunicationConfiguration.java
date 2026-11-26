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
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public final class CommunicationConfiguration {
    private @Nullable String accessToken;
    /** eBay hosts that receive the access token by default. */
    public static final Set<String> DEFAULT_ALLOWED_HOSTS = Collections.unmodifiableSet(new LinkedHashSet<>(java.util.List.of(
        "api.ebay.com",
        "api.sandbox.ebay.com"
    )));

    /** Hosts that may use plain http, for example a local mock server. They must still be allowed hosts. */
    public static final Set<String> LOOPBACK_HOSTS = Set.of("127.0.0.1", "::1", "localhost");

    private RequestOptions defaultRequestOptions = new RequestOptions();
    private final Set<String> allowedHosts;

    private final String feedbackBaseUrl;
    private final String messageBaseUrl;
    private final String notificationBaseUrl;

    public CommunicationConfiguration() {
        this.allowedHosts = Collections.emptySet();
        this.feedbackBaseUrl = "https://api.ebay.com/commerce/feedback/v1";
        this.messageBaseUrl = "https://api.ebay.com/commerce/message/v1";
        this.notificationBaseUrl = "https://api.ebay.com/commerce/notification/v1";
    }

    public CommunicationConfiguration(
            String feedbackBaseUrl,
            String messageBaseUrl,
            String notificationBaseUrl) {
        this(feedbackBaseUrl, messageBaseUrl, notificationBaseUrl, Collections.emptySet());
    }

    /**
     * @param allowedHosts additional hosts trusted with the access token, for example
     *     {@code api.sandbox.ebay.com}, or {@code 127.0.0.1} for a local mock server. Every base URL
     *     must use a host from {@link #DEFAULT_ALLOWED_HOSTS} or this collection, and https unless
     *     the host is in {@link #LOOPBACK_HOSTS}.
     * @throws IllegalArgumentException when a base URL is not trusted
     */
    public CommunicationConfiguration(
            String feedbackBaseUrl,
            String messageBaseUrl,
            String notificationBaseUrl,
            Collection<String> allowedHosts) {
        this.allowedHosts = lowerCased(allowedHosts);
        this.feedbackBaseUrl = validateHost(feedbackBaseUrl);
        this.messageBaseUrl = validateHost(messageBaseUrl);
        this.notificationBaseUrl = validateHost(notificationBaseUrl);
    }

    private String validateHost(String url) {
        String problem = untrustedReason(url);
        if (problem != null) {
            throw new IllegalArgumentException(problem + ": " + url);
        }
        return url;
    }

    /**
     * True when {@code url} uses a host from {@link #getAllowedHosts()} and https, or http on a
     * host from {@link #LOOPBACK_HOSTS}. Hosts compare lowercased, without IPv6 brackets.
     */
    public boolean isTrustedUrl(String url) {
        return untrustedReason(url) == null;
    }

    private @Nullable String untrustedReason(String url) {
        java.net.URI uri;
        try {
            uri = new java.net.URI(url);
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        String host = uri.getHost();
        if (host == null) {
            return "URL has no host";
        }
        String normalizedHost = normalizeHost(host);
        String scheme = uri.getScheme();
        if (!"https".equalsIgnoreCase(scheme)
                && !("http".equalsIgnoreCase(scheme) && LOOPBACK_HOSTS.contains(normalizedHost))) {
            return "URL must use https, or http on a loopback host";
        }
        if (!getAllowedHosts().contains(normalizedHost)) {
            return "Host " + normalizedHost + " is not trusted; add it to allowedHosts to send the access token there";
        }
        return null;
    }

    private static String normalizeHost(String host) {
        String lower = host.toLowerCase(Locale.ROOT);
        return lower.startsWith("[") && lower.endsWith("]") ? lower.substring(1, lower.length() - 1) : lower;
    }

    private static Set<String> lowerCased(Collection<String> hosts) {
        Set<String> result = new HashSet<>();
        for (String host : hosts) {
            result.add(normalizeHost(host));
        }
        return Collections.unmodifiableSet(result);
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

    /** Hosts the access token may be sent to: {@link #DEFAULT_ALLOWED_HOSTS} plus configured extras. */
    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>(DEFAULT_ALLOWED_HOSTS);
        hosts.addAll(allowedHosts);
        return hosts;
    }

    public String getFeedbackBaseUrl() {
        return feedbackBaseUrl;
    }

    public String getMessageBaseUrl() {
        return messageBaseUrl;
    }

    public String getNotificationBaseUrl() {
        return notificationBaseUrl;
    }
}
