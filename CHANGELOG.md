# ChangeLog

## 0.2.0 (09/14/2026)

### Breaking changes

#### Removed members

- `CommunicationClient.graphQL`.

#### Changed signatures

`FeedbackClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getFeedbackAsync` | `(String, RequestOptions)` | `(String, String, String, String, String, String, String, String, String, String, String, RequestOptions)` |
| `getFeedbackRatingSummaryAsync` | `(String, RequestOptions)` | `(String, String, String, RequestOptions)` |
| `getItemsAwaitingFeedbackAsync` | `(String, RequestOptions)` | `(String, String, String, String, String, RequestOptions)` |

`MessageClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getConversationAsync` | `(String, String, RequestOptions)` | `(String, String, String, String, String, RequestOptions)` |
| `getConversationsAsync` | `(String, RequestOptions)` | `(String, String, String, String, String, String, String, String, String, String, RequestOptions)` |

`NegotiationClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `findEligibleItemsAsync` | `(String, RequestOptions)` | `(Integer, Integer, String, String, RequestOptions)` |
| `sendOfferToInterestedBuyersAsync` | `(CreateOffersRequest, String, RequestOptions)` | `(CreateOffersRequest, String, String, RequestOptions)` |

`NotificationClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getDestinationsAsync` | `(String, RequestOptions)` | `(String, String, String, RequestOptions)` |
| `getSubscriptionsAsync` | `(String, RequestOptions)` | `(String, String, String, RequestOptions)` |
| `getTopicsAsync` | `(String, RequestOptions)` | `(String, String, String, RequestOptions)` |
