# Microservices — 30-Second Recall

## Formula

**Microservices = Independently deployable services + clear business boundaries + decentralized data + resilient communication + strong automation + observability**

## Core Flow

```text
Client
  ↓
API Gateway
  ↓
Service A ──sync──> Service B
  │
  └──event──> Broker ──> Service C
                    └──> Service D
```

## Must Remember

```text
DDD / Bounded Context
Database per Service
API Gateway
Service Discovery
Saga
CQRS
Outbox
Idempotency
Retry + Timeout + Circuit Breaker
Observability
Distributed Tracing
Contract Testing
Zero Trust
CI/CD
Kubernetes
Eventual Consistency
```

## Interview Traps

- Microservices are not “small services”.
- Database sharing destroys service autonomy.
- Distributed transactions are harder than local transactions.
- Retry without idempotency is dangerous.
- Circuit breaker is not a substitute for timeout.
- Saga is not the same as 2PC.
- Event-driven does not mean eventual consistency is always acceptable.
- Kubernetes does not make bad service boundaries good.
