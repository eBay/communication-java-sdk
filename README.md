# Communication Java SDK

A production-ready Java SDK for eBay Communication APIs, providing unified access to Feedback, Message (M2M), Notification, and Negotiation REST APIs plus GraphQL support.

## Features

- **Feedback API**: Seller feedback and rating management (5 operations)
- **Message API (M2M)**: Member-to-member messaging and conversation management (5 operations)
- **Notification API**: Event notification subscriptions and delivery (22 operations)
- **Negotiation API**: Send offers to interested buyers (2 operations)
- **GraphQL Support**: Dynamic client for arbitrary GraphQL queries
- **Per-Call Authentication**: Token can be passed per-call or set globally
- **Strong Typing**: Kiota-generated types with public abstraction layer
- **Java 17+**: Modern Java with CompletableFuture async APIs

## Architecture

```
src/main/java/com/ebay/communication/
├── generated/                    # Kiota-generated REST clients (package-private)
│   ├── feedback/
│   ├── message/
│   ├── notification/
│   └── negotiation/
├── clients/
│   ├── rest/
│   │   ├── FeedbackClient.java    # REST client wrappers (public API)
│   │   ├── MessageClient.java
│   │   ├── NotificationClient.java
│   │   └── NegotiationClient.java
│   └── graphql/
│       └── DynamicGraphQLClient.java  # GraphQL escape hatch
├── configuration/                # SDK configuration and auth
├── exceptions/                   # SDK exceptions
└── CommunicationClient.java      # Main SDK facade
```

## Installation

```bash
# Build from source
./gradlew build

# Publish to local Maven repository
./gradlew publishToMavenLocal
```

Then add the dependency to your project:

```gradle
dependencies {
    implementation 'com.ebay:communication-sdk:1.0.0'
}
```

## Quick Start

### 1. Basic Usage

```java
import com.ebay.communication.CommunicationClient;
import com.ebay.communication.configuration.CommunicationConfiguration;

var config = new CommunicationConfiguration();
config.setAccessToken("your-ebay-oauth-token");

try (var sdk = new CommunicationClient(config)) {
    // Get conversations
    var conversations = sdk.message.getConversationsAsync(null, null).join();
    System.out.println("Conversations: " + conversations);

    // Get feedback
    var feedback = sdk.feedback.getFeedbackAsync(null, null).join();
    System.out.println("Feedback: " + feedback);
}
```

### 2. Per-Call Token (Multi-Tenant)

```java
var config = new CommunicationConfiguration();
// No global token set

try (var sdk = new CommunicationClient(config)) {
    // Pass token per-call for multi-tenant scenarios
    String userToken = getUserTokenFromRequest();
    var conversations = sdk.message.getConversationsAsync(userToken, null).join();
}
```

### 3. Custom Headers (RequestOptions)

```java
import com.ebay.communication.configuration.RequestOptions;

var config = new CommunicationConfiguration();
config.setAccessToken("token");

// Set default headers for ALL calls
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");
config.getDefaultRequestOptions().addHeader("X-Custom-Header", "value");

try (var sdk = new CommunicationClient(config)) {
    // Per-call headers override defaults
    var options = new RequestOptions();
    options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_UK");  // Override marketplace
    options.addHeader("X-Request-ID", "correlation-123");     // Add correlation ID
    
    var conversations = sdk.message.getConversationsAsync(null, options).join();
}
```

### 4. Message API (M2M)

```java
// Get a specific conversation
var conversation = sdk.message.getConversationAsync("conv-123", token).join();

// Send a message
var sendRequest = new SendMessageRequest();
sendRequest.setText("Hello!");
sdk.message.sendMessageAsync("conv-123", sendRequest, token).join();
```

### 5. Notification API

```java
// Create a destination
var destRequest = new DestinationRequest();
destRequest.setName("my-webhook");
destRequest.setDeliveryConfig(/* ... */);
var destination = sdk.notification.createDestinationAsync(destRequest, token).join();

// Create a subscription
var subRequest = new CreateSubscriptionRequest();
subRequest.setTopicId("topic-123");
subRequest.setDestinationId(destination.getDestinationId());
var subscription = sdk.notification.createSubscriptionAsync(subRequest, token).join();

// Get all topics
var topics = sdk.notification.getTopicsAsync(token).join();
```

### 6. Negotiation API

```java
// Find eligible items
var eligibleItems = sdk.negotiation.findEligibleItemsAsync(token).join();

// Send offer to interested buyers
var offerRequest = new CreateOffersRequest();
offerRequest.setOfferedInventoryItemId("item-123");
offerRequest.setAllowCounterOffer(true);
var response = sdk.negotiation.sendOfferToInterestedBuyersAsync(offerRequest, token).join();
```

### 7. GraphQL Dynamic Client

```java
// Execute arbitrary GraphQL query
String query = """
    query {
      sellerListings(input: { sellerId: "seller123" }) {
        listingId
        title
        price { value currency }
      }
    }
    """;

var result = sdk.graphQL.execute(query, null, token);
System.out.println(result.get("data"));
```

## Configuration

### CommunicationConfiguration Options

```java
var config = new CommunicationConfiguration();

// Base URLs (defaults to api.ebay.com)
config.setFeedbackBaseUrl("https://api.ebay.com");
config.setMessageBaseUrl("https://api.ebay.com");
config.setNotificationBaseUrl("https://api.ebay.com");
config.setNegotiationBaseUrl("https://api.ebay.com");
config.setGraphQLBaseUrl("https://api.ebay.com/buy/marketplace-insights/v1_beta/graphql");

// Authentication
config.setAccessToken("your-token");  // Optional fallback token

// Diagnostics
config.setDiagnosticLogging(true);    // Enable request/response logging

// Default headers (applied to all requests)
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");
config.getDefaultRequestOptions().addHeader("Accept-Language", "en-US");
```

## API Coverage

### Feedback API (5 operations)
- `getFeedbackAsync()` - Get feedback entries
- `getFeedbackRatingSummaryAsync()` - Get rating summary
- `getItemsAwaitingFeedbackAsync()` - Get items awaiting feedback
- `leaveFeedbackAsync()` - Leave feedback for a transaction
- `respondToFeedbackAsync()` - Respond to feedback

### Message API (5 operations)
- `getConversationAsync()` - Get specific conversation
- `getConversationsAsync()` - Get all conversations
- `sendMessageAsync()` - Send a message
- `updateConversationAsync()` - Update conversation (mark read, etc.)
- `bulkUpdateConversationAsync()` - Bulk update conversations

### Notification API (22 operations)
- Config: `getConfigAsync()`, `updateConfigAsync()`
- Destinations: `create/get/getAll/update/delete`
- Subscriptions: `create/get/getAll/update/delete/enable/disable/test`
- Filters: `create/get/delete`
- Topics: `get/getAll`
- Public Key: `get`

### Negotiation API (2 operations)
- `findEligibleItemsAsync()` - Find items eligible for offers
- `sendOfferToInterestedBuyersAsync()` - Send promotional offers

## Regenerating REST Clients

If the OpenAPI specs are updated:

```bash
./generate.sh
./gradlew build
```

This will regenerate all Kiota clients from the specs in the `specs/` directory.

## Requirements

- Java 17 or higher
- Kiota CLI (for regeneration only)

## Dependencies

- `microsoft.kiota:microsoft-kiota-bundle:1.4.+` - REST client runtime
- `com.squareup.okhttp3:okhttp:4.12.0` - HTTP client
- `com.fasterxml.jackson.core:jackson-databind:2.18.+` - JSON processing

## Project Structure

```
communication-java-sdk/
├── specs/                       # OpenAPI specs and GraphQL schema
├── src/main/java/
│   └── com/ebay/communication/
│       ├── CommunicationClient.java
│       ├── configuration/
│       ├── clients/
│       ├── generated/           # Kiota-generated (committed)
│       └── exceptions/
├── build.gradle.kts
├── settings.gradle.kts
├── generate.sh
└── README.md
```

## Consistency with .NET and PHP SDKs

This Java SDK mirrors the architecture of the .NET and PHP Communication SDKs:

- **Same API Coverage**: All four REST APIs (Feedback, Message, Notification, Negotiation) + GraphQL
- **Same Auth Pattern**: Per-call token with optional fallback
- **Same Naming**: `CommunicationClient`, `CommunicationConfiguration`
- **Same Structure**: Generated layer + thin abstraction wrappers
- **Same Tooling**: Kiota for REST code generation

The main difference is the async model: Java uses `CompletableFuture`, .NET uses `Task`, and PHP is synchronous.

## License

Internal eBay use only.
