# ChangeLog

## 0.2.0 (09/14/2026)

### Breaking changes

#### Removed members

- `CommunicationClient.graphQL`.

#### Changed signatures

`FeedbackClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getFeedbackAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String feedbackId, String feedbackType, String filter, String limit, String listingId, String offset, String orderLineItemId, String sort, String transactionId, String userId, String accessToken, RequestOptions requestOptions)` |
| `getFeedbackRatingSummaryAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String filter, String userId, String accessToken, RequestOptions requestOptions)` |
| `getItemsAwaitingFeedbackAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String filter, String limit, String offset, String sort, String accessToken, RequestOptions requestOptions)` |

`MessageClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getConversationAsync` | `(String conversationId, String accessToken, RequestOptions requestOptions)` | `(String conversationId, String conversationType, String limit, String offset, String accessToken, RequestOptions requestOptions)` |
| `getConversationsAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String conversationStatus, String conversationType, String endTime, String limit, String offset, String otherPartyUsername, String referenceId, String referenceType, String startTime, String accessToken, RequestOptions requestOptions)` |

`NegotiationClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `findEligibleItemsAsync` | `(String accessToken, RequestOptions requestOptions)` | `(Integer limit, Integer offset, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `sendOfferToInterestedBuyersAsync` | `(CreateOffersRequest body, String accessToken, RequestOptions requestOptions)` | `(CreateOffersRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |

`NotificationClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getDestinationsAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String continuationToken, String limit, String accessToken, RequestOptions requestOptions)` |
| `getSubscriptionsAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String continuationToken, String limit, String accessToken, RequestOptions requestOptions)` |
| `getTopicsAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String continuationToken, String limit, String accessToken, RequestOptions requestOptions)` |
