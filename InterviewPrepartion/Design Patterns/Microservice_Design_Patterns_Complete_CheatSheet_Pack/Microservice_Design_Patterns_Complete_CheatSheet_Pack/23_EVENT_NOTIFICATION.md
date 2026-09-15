# Event Notification

## Intent
Publish that something happened, with minimal payload.

Example:
```json
{ "type": "OrderCreated", "orderId": "O123" }
```

Consumer fetches details if needed.

## Benefit
Small events.

## Trade-off
Additional network calls and temporal coupling to source.
