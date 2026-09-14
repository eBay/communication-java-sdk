# eBay Communication Java SDK

A production-ready Java SDK for eBay Communication APIs, providing unified access to Feedback, Message, Notification, and Negotiation REST APIs plus GraphQL support.

## Features

- **Feedback API**: Seller feedback and rating management (5 operations)
- **Message API**: Member-to-member messaging and conversation management (5 operations)
- **Notification API**: Event notification subscriptions and delivery (22 operations)
- **Negotiation API**: Send offers to interested buyers (2 operations)
- **GraphQL Support**: Dynamic client for arbitrary GraphQL queries against the eBay Graph
- **Strong Typing**: Internal Kiota-generated types with public client wrappers
- **Per-call Overrides**: Pass per-request headers and access tokens alongside SDK-wide defaults

## Architecture

```
src/main/java/com/ebay/communication/
├── generated/                         # Kiota-generated REST clients (internal)
│   ├── feedback/
│   ├── message/
│   ├── notification/
│   └── negotiation/
├── clients/
│   ├── rest/
│   │   ├── FeedbackClient.java        # REST client wrappers (public API)
│   │   ├── MessageClient.java
│   │   ├── NotificationClient.java
│   │   └── NegotiationClient.java
│   └── graphql/
│       └── DynamicGraphQLClient.java  # GraphQL escape hatch
├── configuration/                     # SDK configuration and auth
├── exceptions/                        # SDK exceptions
└── CommunicationClient.java           # Main SDK facade
```

## Requirements

- Java 17+
- Gradle

## Installation

```kotlin
dependencies {
    implementation("com.ebay:communication-sdk:0.2.0")
}
```

## Quick Start

```java
var config = new CommunicationConfiguration();
config.setAccessToken("your-oauth-token");

try (var sdk = new CommunicationClient(config)) {
    var conversations = sdk.message.getConversationsAsync(null, null).join();
    var feedback = sdk.feedback.getFeedbackAsync(null, null).join();
    var subscriptions = sdk.notification.getSubscriptionsAsync(null, null).join();
    var eligibleItems = sdk.negotiation.findEligibleItemsAsync(null, null).join();

    // GraphQL
    String query = "query { sellerListings(input: {}) { listingId title } }";
    JsonNode data = sdk.graphQL.executeRawUnsafe(query, null, null, null);
}
```

Per-request headers and tokens can be passed to any method:

```java
var options = new RequestOptions();
options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

sdk.message.getConversationsAsync("per-call-token", options).join();
```

## API Operations

### Feedback API

| Method | Description |
|---|---|
| `getFeedbackAsync` | Get feedback entries |
| `getFeedbackRatingSummaryAsync` | Get feedback rating summary |
| `getItemsAwaitingFeedbackAsync` | Get items awaiting feedback |
| `leaveFeedbackAsync` | Leave feedback for a transaction |
| `respondToFeedbackAsync` | Respond to feedback |

### Message API

| Method | Description |
|---|---|
| `getConversationAsync` | Get a specific conversation by ID |
| `getConversationsAsync` | Get all conversations |
| `sendMessageAsync` | Send a message in a conversation |
| `updateConversationAsync` | Update a conversation |
| `bulkUpdateConversationAsync` | Bulk update conversations |

### Notification API

| Method | Description |
|---|---|
| `getConfigAsync` | Get notification configuration |
| `updateConfigAsync` | Update notification configuration |
| `createDestinationAsync` | Create a notification destination |
| `getDestinationAsync` | Get a specific destination |
| `getDestinationsAsync` | Get all destinations |
| `updateDestinationAsync` | Update a destination |
| `deleteDestinationAsync` | Delete a destination |
| `createSubscriptionAsync` | Create a subscription |
| `getSubscriptionAsync` | Get a specific subscription |
| `getSubscriptionsAsync` | Get all subscriptions |
| `updateSubscriptionAsync` | Update a subscription |
| `deleteSubscriptionAsync` | Delete a subscription |
| `enableSubscriptionAsync` | Enable a subscription |
| `disableSubscriptionAsync` | Disable a subscription |
| `testSubscriptionAsync` | Send a test event for a subscription |
| `createSubscriptionFilterAsync` | Create a subscription filter |
| `getSubscriptionFilterAsync` | Get a subscription filter |
| `deleteSubscriptionFilterAsync` | Delete a subscription filter |
| `getTopicAsync` | Get a specific topic |
| `getTopicsAsync` | Get all topics |
| `getPublicKeyAsync` | Get a public key |
| `getPublicKeysAsync` | Get all public keys |

### Negotiation API

| Method | Description |
|---|---|
| `findEligibleItemsAsync` | Find items eligible for sending offers to interested buyers |
| `sendOfferToInterestedBuyersAsync` | Send an offer to interested buyers |

### GraphQL API

```java
String query = """
    query {
      sellerListings(input: {}) {
        listingId
        title
        price { value currency }
      }
    }
    """;

JsonNode data = sdk.graphQL.executeRawUnsafe(query, null, null, null);
```

> **Warning:** Never interpolate user input directly into the query string — always pass dynamic values through `variables` to avoid GraphQL injection.

## Rate Limiting and Retry

The SDK does not include built-in retry logic or rate-limit handling. eBay's APIs return HTTP 429 Too Many Requests when rate limits are exceeded. Implement exponential back-off in your application layer when calling bulk endpoints in loops.

Refer to eBay's API call limits documentation for per-endpoint rate limit details.

---

## Error Handling

```java
try {
    var conversations = sdk.message.getConversationsAsync(null, null).join();
} catch (GraphQLException ex) {
    System.err.println("GraphQL errors: " + ex.getErrors());
} catch (CommunicationException ex) {
    System.err.println("SDK error: " + ex.getMessage());
}
```

## Configuration Options

| Property | Default | Description |
|---|---|---|
| `feedbackBaseUrl` | `https://api.ebay.com/commerce/feedback/v1` | Feedback API base URL |
| `messageBaseUrl` | `https://api.ebay.com/commerce/message/v1` | Message API base URL |
| `notificationBaseUrl` | `https://api.ebay.com/commerce/notification/v1` | Notification API base URL |
| `negotiationBaseUrl` | `https://api.ebay.com/sell/negotiation/v1` | Negotiation API base URL |
| `graphQLBaseUrl` | `https://api.ebay.com/graphql` | GraphQL API endpoint |
| `accessToken` | `null` | Static fallback token; per-call token takes precedence |
| `defaultRequestOptions` | `RequestOptions()` | Default headers applied to all SDK calls |
| `diagnosticLogging` | `false` | Enable diagnostic request/response logging |

## Regenerating the SDK

```bash
./generate.sh
./gradlew build
```

## Development

```bash
./gradlew build    # Build
./gradlew test     # Run tests
./gradlew publish  # Publish
```

## Specs

- `commerce_feedback_v1_beta_oas3.yaml` — Feedback V1 Beta
- `commerce_message_v1_oas3.yaml` — Message V1
- `commerce_notification_v1_oas3.yaml` — Notification V1
- `sell_negotiation_v1_oas3.yaml` — Negotiation V1
- `eBay_Graph.graphqls` — eBay Graph schema

## Dependencies

- **microsoft-kiota-bundle**: REST client generation and runtime
- **apollo-runtime**: Apollo Kotlin GraphQL client
- **okhttp3**: Shared HTTP client
- **jackson-databind**: JSON handling for the dynamic GraphQL client
- **kotlinx-coroutines-jdk8**: Kotlin coroutines / `CompletableFuture` integration
- **slf4j-api**: Logging facade

## License

Apache 2.0 © 2026 eBay Inc. See [LICENSE](LICENSE) for details.
