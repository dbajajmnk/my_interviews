# Microservices Interview Traps

1. Microservices are not just small REST APIs.
2. Service size is less important than business boundary.
3. Shared DB reduces autonomy.
4. Saga != 2PC.
5. CQRS != Event Sourcing.
6. Event Sourcing is optional.
7. Outbox solves dual-write reliability.
8. Outbox does not remove duplicate delivery.
9. Idempotency is essential with retries.
10. Retry needs backoff + jitter.
11. Timeout is mandatory for remote calls.
12. Circuit breaker != timeout.
13. Kubernetes != microservices architecture.
14. Service mesh != API gateway.
15. API Gateway != BFF.
16. Eventual consistency must be acceptable to business.
17. Exactly-once is usually boundary-specific.
18. Contract testing supports independent deployment.
19. Distributed tracing is critical for latency diagnosis.
20. Shared libraries can create hidden coupling.
21. Choreography can become event spaghetti.
22. Orchestration can become god-process logic.
23. Too many sync hops create cascading failures.
24. Autoscaling cannot fix shared bottlenecks.
25. Modular monolith can be the better architecture.
