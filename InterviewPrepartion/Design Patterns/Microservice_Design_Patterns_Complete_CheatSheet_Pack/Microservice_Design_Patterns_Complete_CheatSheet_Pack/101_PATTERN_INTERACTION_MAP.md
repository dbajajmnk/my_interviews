# Pattern Interaction Map

```text
DDD / Bounded Context
        ↓
Database per Service
        ↓
Distributed Data
 ├── Saga
 ├── Outbox
 ├── CQRS
 └── Eventual Consistency

Service Communication
 ├── Sync
 │    ├── Timeout
 │    ├── Retry
 │    ├── Circuit Breaker
 │    └── Bulkhead
 └── Async
      ├── Pub/Sub
      ├── Idempotent Consumer
      ├── Inbox
      └── DLQ

Operations
 ├── Discovery
 ├── Config
 ├── Health
 ├── Logs
 ├── Metrics
 └── Tracing

Delivery
 ├── Canary
 ├── Blue-Green
 ├── Expand/Contract
 └── Feature Toggle
```
