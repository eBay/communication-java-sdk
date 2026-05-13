# Change Log

## v1.0.0 - Initial Release

### Features Added
- ✅ **RequestOptions Support** - Per-call custom headers (matches .NET and PHP SDKs)
  - Added `RequestOptions` class with headers map
  - Added `defaultRequestOptions` to `CommunicationConfiguration`
  - All 34 REST methods now accept `RequestOptions` parameter
  - Header merging: defaults from config + per-call overrides

- ✅ **4 REST API Clients**
  - Feedback API (5 operations)
  - Message API (5 operations)
  - Notification API (22 operations)
  - Negotiation API (2 operations)

- ✅ **GraphQL Dynamic Client** - Execute arbitrary GraphQL queries

- ✅ **Per-Call Token Authentication** - Thread-safe token management via `TokenContext`

- ✅ **Kiota-Generated Types** - Strongly typed models from OpenAPI specs

### Architecture
- Java 17+ with CompletableFuture async APIs
- Kiota for REST code generation
- OkHttp for HTTP transport
- Jackson for JSON in GraphQL client

### Consistency with Other SDKs
- Matches .NET SDK architecture and patterns
- Matches PHP SDK header management
- Same naming conventions: `CommunicationClient`, `CommunicationConfiguration`
- Same auth pattern: per-call + fallback token

### Example Usage
```java
var config = new CommunicationConfiguration();
config.setAccessToken("token");

// Set global headers
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

try (var sdk = new CommunicationClient(config)) {
    // Per-call headers override defaults
    var options = new RequestOptions();
    options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_UK");
    
    var conversations = sdk.message.getConversationsAsync(userToken, options).join();
}
```
