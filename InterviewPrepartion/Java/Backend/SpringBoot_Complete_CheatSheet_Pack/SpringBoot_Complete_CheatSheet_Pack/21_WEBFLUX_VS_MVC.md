# WebFlux vs MVC

| MVC | WebFlux |
|---|---|
| Servlet model | Reactive model |
| Common blocking stack | Non-blocking capable |
| Imperative style | Reactive types/operators |
| Great default for many services | Useful for reactive chains/streaming/high concurrency |

## Decision
Choose WebFlux because the workload and dependency chain benefit from reactive non-blocking execution, not because it is newer.

## Trap
Blocking JDBC/HTTP work inside an event-loop path can destroy reactive scalability.
