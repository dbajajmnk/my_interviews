# Spring Boot Interview Traps & Senior Questions

## 20 Fast Traps
1. Boot is built on Spring; it does not replace Spring.
2. `@SpringBootApplication` carries configuration, component scanning and auto-config semantics.
3. Constructor injection is usually preferred.
4. Auto-configuration is conditional.
5. Boot can back off when user configuration exists.
6. `DispatcherServlet` is MVC's front controller.
7. JPA != Hibernate.
8. `@Transactional` is generally proxy/AOP based.
9. Self-invocation may bypass transactional/async advice.
10. Lazy loading can create N+1.
11. `@Async` is not durable messaging.
12. `@Scheduled` may execute on every replica.
13. WebFlux is not automatically faster.
14. Virtual threads do not speed CPU-bound work.
15. Bigger DB pools can hurt the DB.
16. Liveness != readiness.
17. Retries can create retry storms.
18. DTOs decouple API and persistence contracts.
19. Observability = logs + metrics + traces.
20. Performance tuning begins with measurement.

## Senior Questions
- Explain startup from `main()` to readiness.
- How does auto-configuration choose beans?
- Explain MVC request flow.
- Where should transaction boundaries live?
- Diagnose N+1.
- When choose WebFlux?
- Secure a stateless REST API.
- Design readiness/liveness.
- Test persistence realistically.
- Troubleshoot rising p99 latency.
- Make scheduled jobs safe with five replicas.
- Plan a Boot 3 → 4 upgrade.
