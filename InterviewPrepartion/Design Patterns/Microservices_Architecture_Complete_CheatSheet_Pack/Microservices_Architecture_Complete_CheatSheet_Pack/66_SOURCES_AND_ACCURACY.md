# Sources & Accuracy Notes

This pack is intentionally vendor-neutral.

Concepts align with established distributed-systems and microservices architecture practices, including:

- Domain-Driven Design
- independently deployable services
- database-per-service
- Saga
- CQRS
- Event Sourcing
- Transactional Outbox
- Change Data Capture
- API Gateway
- Circuit Breaker
- Bulkhead
- service discovery
- observability
- consumer-driven contracts
- progressive delivery

## Important

Technology products change faster than architecture principles.

For implementation-specific work, verify current documentation for the chosen stack, such as:

```text
Spring Boot / Spring Cloud
Kubernetes
Istio / Linkerd
Kafka
RabbitMQ
AWS
Azure
GCP
Dapr
OpenTelemetry
```

## Core Rule

A microservices architecture should be judged by:

```text
business alignment
independent delivery
resilience
data ownership
operability
security
cost
```

—not by the number of services.
