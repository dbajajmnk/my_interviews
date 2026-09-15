# Sync vs Async

| Sync | Async |
|---|---|
| simple request-response | decoupled |
| immediate result | eventual result |
| tight runtime dependency | weaker temporal dependency |
| easier debugging | harder tracing |
| latency composes | queueing/buffering possible |

## Latency Chain

```text
Client → A → B → C → DB
```

Each hop adds latency and failure probability.

## Rule

Keep synchronous call chains shallow.

## Trap

A 10-service synchronous chain is usually a reliability smell.
