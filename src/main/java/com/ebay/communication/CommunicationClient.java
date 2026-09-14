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

package com.ebay.communication;

import com.ebay.communication.clients.rest.FeedbackClient;
import com.ebay.communication.clients.rest.MessageClient;
import com.ebay.communication.clients.rest.NegotiationClient;
import com.ebay.communication.clients.rest.NotificationClient;
import com.ebay.communication.configuration.KiotaAuthProvider;
import com.ebay.communication.configuration.CommunicationConfiguration;
import com.ebay.communication.generated.feedback.FeedbackApiClient;
import com.ebay.communication.generated.message.MessageApiClient;
import com.ebay.communication.generated.negotiation.NegotiationApiClient;
import com.ebay.communication.generated.notification.NotificationApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/**
 * Main facade for the Communication SDK.
 */
public final class CommunicationClient implements Closeable {
    private final OkHttpClient sharedHttpClient;

    public final FeedbackClient feedback;
    public final MessageClient message;
    public final NegotiationClient negotiation;
    public final NotificationClient notification;

    public CommunicationClient(CommunicationConfiguration config) {
        this.sharedHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        var feedbackAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        feedbackAdapter.setBaseUrl(config.getFeedbackBaseUrl());
        this.feedback = new FeedbackClient(new FeedbackApiClient(feedbackAdapter), config);

        var messageAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        messageAdapter.setBaseUrl(config.getMessageBaseUrl());
        this.message = new MessageClient(new MessageApiClient(messageAdapter), config);

        var negotiationAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        negotiationAdapter.setBaseUrl(config.getNegotiationBaseUrl());
        this.negotiation = new NegotiationClient(new NegotiationApiClient(negotiationAdapter), config);

        var notificationAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        notificationAdapter.setBaseUrl(config.getNotificationBaseUrl());
        this.notification = new NotificationClient(new NotificationApiClient(notificationAdapter), config);
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
    }
}
