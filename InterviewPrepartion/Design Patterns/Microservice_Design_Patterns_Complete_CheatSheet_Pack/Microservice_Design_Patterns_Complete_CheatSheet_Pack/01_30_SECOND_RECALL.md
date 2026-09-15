# Microservice Design Patterns — 30-Second Recall

## Core Formula

```text
Boundaries
+ Communication
+ Data Consistency
+ Resilience
+ Observability
+ Delivery
= Sustainable Microservices
```

## Most Important Patterns

```text
DDD / Bounded Context
Database per Service
API Gateway
BFF
Saga
CQRS
Outbox
Idempotent Consumer
Circuit Breaker
Retry
Timeout
Bulkhead
Service Discovery
Health Check
Distributed Tracing
Strangler Fig
Blue-Green / Canary
```

## Quick Visual

```text
Client
  ↓
API Gateway
  ↓
Service A ──sync──> Service B
  │
  └──event──> Broker
                 ↓
              Service C
```

## Distributed Data

```text
Local ACID
+ Saga
+ Outbox
+ Idempotency
+ Eventual Consistency
```

## Reliability

```text
Timeout
→ Retry
→ Circuit Breaker
→ Bulkhead
→ Fallback
```

## Interview Traps

- Saga is not 2PC.
- CQRS does not require Event Sourcing.
- Outbox does not guarantee exactly-once business processing.
- Retry without idempotency is dangerous.
- Circuit breaker does not replace timeout.
- API Gateway and Service Mesh solve different traffic directions.
