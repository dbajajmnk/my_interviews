# Inbox Pattern

## Intent
Persist incoming message IDs/state before or with business processing.

```text
Message
 ↓
Inbox Table
 ↓
Already processed?
 ↓
Business logic
```

## Use
Reliable duplicate suppression.

## Related
Outbox, Idempotent Consumer.
