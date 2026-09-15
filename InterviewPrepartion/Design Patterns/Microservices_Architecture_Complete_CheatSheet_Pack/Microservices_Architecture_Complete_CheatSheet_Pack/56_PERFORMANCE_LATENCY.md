# Performance & Latency Budget

## Latency Composition

```text
Gateway 10ms
Service A 20ms
Service B 40ms
DB 30ms
----------------
≈ 100ms + network/queue overhead
```

## Improve

- reduce hops
- parallelize independent calls
- cache carefully
- optimize slow dependencies
- batch
- async where appropriate

## Trap

Microservices increase network overhead by design.
