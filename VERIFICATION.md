# Verification Guide - Java Communication SDK

## Quick Status Check

Run this checklist to verify the SDK is ready for production:

### ✅ Build Verification
```bash
cd communication-java-sdk
./gradlew clean build
```

**Expected:** Build succeeds with no errors.

---

### ✅ File Structure Verification

```bash
# Check all required files exist
ls src/main/java/com/ebay/communication/CommunicationClient.java
ls src/main/java/com/ebay/communication/configuration/RequestOptions.java
ls src/main/java/com/ebay/communication/configuration/CommunicationConfiguration.java
ls src/main/java/com/ebay/communication/clients/rest/FeedbackClient.java
ls src/main/java/com/ebay/communication/clients/rest/MessageClient.java
ls src/main/java/com/ebay/communication/clients/rest/NotificationClient.java
ls src/main/java/com/ebay/communication/clients/rest/NegotiationClient.java
ls src/main/java/com/ebay/communication/clients/graphql/DynamicGraphQLClient.java
```

**Expected:** All files exist.

---

### ✅ Code Verification

#### 1. Check RequestOptions exists and has correct methods
```bash
grep -A 5 "class RequestOptions" src/main/java/com/ebay/communication/configuration/RequestOptions.java
```

**Expected:**
```java
public final class RequestOptions {
    private final Map<String, String> headers = new HashMap<>();
    
    public Map<String, String> getHeaders() { return headers; }
    public void addHeader(String name, String value) { ... }
```

---

#### 2. Check CommunicationConfiguration has defaultRequestOptions
```bash
grep "defaultRequestOptions" src/main/java/com/ebay/communication/configuration/CommunicationConfiguration.java
```

**Expected:**
```java
private RequestOptions defaultRequestOptions = new RequestOptions();
public RequestOptions getDefaultRequestOptions() { return defaultRequestOptions; }
```

---

#### 3. Check FeedbackClient methods accept RequestOptions
```bash
grep "RequestOptions requestOptions" src/main/java/com/ebay/communication/clients/rest/FeedbackClient.java
```

**Expected:** Should find 5 method signatures with RequestOptions parameter.

---

#### 4. Check all clients have mergedHeaders helper
```bash
grep -r "mergedHeaders" src/main/java/com/ebay/communication/clients/rest/
```

**Expected:** Should find mergedHeaders method in all 4 REST clients.

---

### ✅ Method Count Verification

```bash
# Count methods in each client
echo "FeedbackClient methods:"
grep "public CompletableFuture" src/main/java/com/ebay/communication/clients/rest/FeedbackClient.java | wc -l

echo "MessageClient methods:"
grep "public CompletableFuture" src/main/java/com/ebay/communication/clients/rest/MessageClient.java | wc -l

echo "NotificationClient methods:"
grep "public CompletableFuture" src/main/java/com/ebay/communication/clients/rest/NotificationClient.java | wc -l

echo "NegotiationClient methods:"
grep "public CompletableFuture" src/main/java/com/ebay/communication/clients/rest/NegotiationClient.java | wc -l
```

**Expected:**
- FeedbackClient: 5 methods
- MessageClient: 5 methods
- NotificationClient: 22 methods
- NegotiationClient: 2 methods
- **Total: 34 methods**

---

## Manual Testing (with real API)

### Test 1: Default Headers Applied

```java
import com.ebay.communication.CommunicationClient;
import com.ebay.communication.configuration.CommunicationConfiguration;

var config = new CommunicationConfiguration();
config.setAccessToken("your-ebay-token");

// Set default marketplace
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

try (var sdk = new CommunicationClient(config)) {
    // Should use EBAY_US marketplace
    var conversations = sdk.message.getConversationsAsync(null, null).join();
    System.out.println("Success: " + conversations);
}
```

**Expected:** Request includes `X-EBAY-C-MARKETPLACE-ID: EBAY_US` header.

---

### Test 2: Per-Call Headers Override

```java
import com.ebay.communication.configuration.RequestOptions;

var config = new CommunicationConfiguration();
config.setAccessToken("your-token");
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

try (var sdk = new CommunicationClient(config)) {
    // Override with UK marketplace
    var options = new RequestOptions();
    options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_UK");
    options.addHeader("X-Request-ID", "test-123");
    
    var conversations = sdk.message.getConversationsAsync(null, options).join();
    System.out.println("Success: " + conversations);
}
```

**Expected:** 
- Request includes `X-EBAY-C-MARKETPLACE-ID: EBAY_UK` (overridden)
- Request includes `X-Request-ID: test-123` (added)

---

### Test 3: Per-Call Token

```java
var config = new CommunicationConfiguration();
// No global token

try (var sdk = new CommunicationClient(config)) {
    String userToken = "user-specific-token";
    
    var conversations = sdk.message.getConversationsAsync(userToken, null).join();
    System.out.println("Success: " + conversations);
}
```

**Expected:** Request uses `userToken` in Authorization header.

---

### Test 4: All 34 Operations Smoke Test

```java
try (var sdk = new CommunicationClient(config)) {
    // Feedback API (5 operations)
    sdk.feedback.getFeedbackAsync(token, null).join();
    sdk.feedback.getFeedbackRatingSummaryAsync(token, null).join();
    sdk.feedback.getItemsAwaitingFeedbackAsync(token, null).join();
    // sdk.feedback.leaveFeedbackAsync(body, token, null).join();
    // sdk.feedback.respondToFeedbackAsync(body, token, null).join();
    
    // Message API (5 operations)
    sdk.message.getConversationsAsync(token, null).join();
    sdk.message.getConversationAsync("conv-id", token, null).join();
    // sdk.message.sendMessageAsync("conv-id", body, token, null).join();
    // sdk.message.updateConversationAsync("conv-id", body, token, null).join();
    // sdk.message.bulkUpdateConversationAsync(body, token, null).join();
    
    // Notification API (22 operations)
    sdk.notification.getConfigAsync(token, null).join();
    sdk.notification.getDestinationsAsync(token, null).join();
    sdk.notification.getSubscriptionsAsync(token, null).join();
    sdk.notification.getTopicsAsync(token, null).join();
    // ... etc
    
    // Negotiation API (2 operations)
    sdk.negotiation.findEligibleItemsAsync(token, null).join();
    // sdk.negotiation.sendOfferToInterestedBuyersAsync(body, token, null).join();
    
    System.out.println("✅ All operations work!");
}
```

**Expected:** All GET operations succeed (POSTs require valid body).

---

### Test 5: GraphQL Dynamic Client

```java
String query = """
    query {
      __typename
    }
    """;

var result = sdk.graphQL.execute(query, null, token);
System.out.println("GraphQL result: " + result);
```

**Expected:** Returns valid JSON response.

---

## Comparison with .NET SDK

To verify consistency, compare the HTTP requests:

### Setup HTTP Logging

#### Java (OkHttp):
```java
import okhttp3.logging.HttpLoggingInterceptor;

var logging = new HttpLoggingInterceptor(System.out::println);
logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);

var httpClient = new OkHttpClient.Builder()
    .addInterceptor(logging)
    .build();

// Pass to CommunicationClient constructor
```

#### .NET:
```csharp
// In .NET SDK, enable logging to see requests
```

### Compare Requests

**Test:** Make the same API call from both SDKs and compare:
1. Request URL
2. Authorization header
3. Custom headers (X-EBAY-C-MARKETPLACE-ID)
4. Request body format

**Expected:** Both SDKs should send identical HTTP requests.

---

## Performance Verification

### Test: Concurrent Requests

```java
import java.util.concurrent.CompletableFuture;
import java.util.List;

try (var sdk = new CommunicationClient(config)) {
    // Fire 10 requests concurrently
    List<CompletableFuture<Void>> futures = new ArrayList<>();
    
    for (int i = 0; i < 10; i++) {
        var future = sdk.message.getConversationsAsync(token, null)
            .thenAccept(result -> System.out.println("Request " + i + " done"));
        futures.add(future);
    }
    
    CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
    System.out.println("✅ All concurrent requests completed");
}
```

**Expected:** All requests succeed without race conditions.

---

## Documentation Verification

### Check README Examples Work

Copy-paste examples from README.md and verify they compile and run:

```bash
# Extract code blocks from README
grep -A 10 "```java" README.md

# Verify each example compiles
```

**Expected:** All README examples are valid, compilable Java code.

---

## Final Checklist

- [ ] Build succeeds (`./gradlew build`)
- [ ] All 13 hand-written files exist
- [ ] RequestOptions class has add/remove/clear methods
- [ ] CommunicationConfiguration has defaultRequestOptions
- [ ] All 4 REST clients have mergedHeaders() method
- [ ] All 34 methods accept RequestOptions parameter
- [ ] Default headers are applied to all requests
- [ ] Per-call headers override defaults
- [ ] Per-call tokens work correctly
- [ ] All 34 operations can be called
- [ ] GraphQL client works
- [ ] README examples are valid
- [ ] COMPARISON.md shows all features ✅
- [ ] HTTP requests match .NET SDK format

---

## If All Checks Pass ✅

**The SDK is production-ready!**

Next steps:
1. Tag release: `git tag v1.0.0`
2. Publish to Maven repository
3. Update internal documentation
4. Notify users

---

## If Checks Fail ❌

**Common issues:**

1. **Build fails:** Check Kiota dependencies in `build.gradle.kts`
2. **Missing RequestOptions:** Re-run the update process
3. **Headers not sent:** Check mergedHeaders() implementation
4. **401 errors:** Verify token is valid for the marketplace
5. **Different HTTP format than .NET:** Check Kiota versions match

See COMPARISON.md for troubleshooting guidance.
