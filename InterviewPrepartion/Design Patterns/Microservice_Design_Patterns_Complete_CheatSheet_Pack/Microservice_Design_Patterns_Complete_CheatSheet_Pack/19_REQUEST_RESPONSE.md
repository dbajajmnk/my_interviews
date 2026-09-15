# Request-Response

## Pattern
```text
Caller → Request → Service
Caller ← Response ← Service
```

## Good
Immediate result required.

## Risk
Runtime coupling and cascading latency.

## Trap
Long synchronous chains are brittle.
