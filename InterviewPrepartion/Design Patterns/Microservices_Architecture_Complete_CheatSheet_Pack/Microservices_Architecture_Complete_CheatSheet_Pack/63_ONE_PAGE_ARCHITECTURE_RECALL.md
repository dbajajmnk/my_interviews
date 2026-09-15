# Microservices — One-Page Architecture Recall

```text
                         Clients
                            │
                            ▼
                      API Gateway
                ┌───────────┼───────────┐
                ▼           ▼           ▼
             Order       Payment     Customer
             Service      Service      Service
                │            │            │
             Order DB     Payment DB   Customer DB
                │
                └──── event ───────┐
                                   ▼
                              Message Broker
                          ┌────────┼────────┐
                          ▼        ▼        ▼
                      Inventory Shipping Analytics
```

## Cross-Cutting

```text
Discovery
Configuration
Security
Observability
Tracing
Rate Limiting
Resilience
CI/CD
```

## Distributed Data

```text
Local ACID
+
Saga
+
Outbox
+
Idempotency
+
Eventual Consistency
```

## Reliability

```text
Timeout
→ Retry
→ Circuit Breaker
→ Bulkhead
→ Rate Limit
→ Backpressure
```
