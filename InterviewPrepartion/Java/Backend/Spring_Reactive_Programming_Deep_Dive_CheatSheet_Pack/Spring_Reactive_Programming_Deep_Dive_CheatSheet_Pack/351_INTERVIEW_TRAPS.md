# Spring Reactive Interview Traps

1. Reactive is not automatically faster.
2. Async does not mean non-blocking.
3. Do not call `subscribe()` inside normal service/controller composition.
4. `flatMap` does not preserve order.
5. `publishOn` affects downstream; `subscribeOn` affects subscription/source execution.
6. `boundedElastic` is a blocking boundary, not a default scheduler.
7. Backpressure is not rate limiting.
8. `collectList()` destroys streaming.
9. Retry resubscribes and can repeat side effects.
10. Cancellation is normal and must clean up resources.
11. Reactor Context is not ThreadLocal.
12. WebClient `.block()` on event-loop threads is dangerous.
13. JDBC/JPA are still blocking even in a WebFlux project.
14. R2DBC transactions bind through Reactor Context.
15. Parallel DB work can violate single-transaction assumptions.
16. WebSocket itself does not provide Reactive Streams demand.
17. RSocket has explicit reactive interaction/flow-control semantics.
18. Virtual threads and WebFlux are different concurrency models.
19. Unbounded `flatMap`, buffers, replay or cache can cause memory/resource collapse.
20. Use WebFlux when the workload benefits from it, not because it is newer.
