# Pattern Decision Tree

## Cross-service transaction?
```text
Yes → Saga
Need visible workflow? → Orchestration
Simple event flow? → Choreography
```

## DB + event atomicity?
```text
Outbox
+ CDC publisher if useful
```

## Duplicate messages?
```text
Idempotent Consumer / Inbox
```

## Complex reads across services?
```text
API Composition
or
CQRS + Materialized View
```

## Dependency unstable?
```text
Timeout → Retry → Circuit Breaker → Fallback
```

## Too much load?
```text
Rate Limit / Backpressure / Bulkhead / Load Shedding
```

## Legacy migration?
```text
Strangler Fig + Anti-Corruption Layer
```
