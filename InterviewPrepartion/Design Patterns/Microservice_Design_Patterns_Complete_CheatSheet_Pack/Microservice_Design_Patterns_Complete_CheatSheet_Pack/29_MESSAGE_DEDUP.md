# Message Deduplication

## Pattern
Track a stable message/business key.

```text
Message ID
 ↓
Seen before?
 ├── Yes → ignore
 └── No  → process
```

## Related
Idempotent Consumer, Inbox.

## Trap
Transport-level deduplication may not cover business-level duplicates.
