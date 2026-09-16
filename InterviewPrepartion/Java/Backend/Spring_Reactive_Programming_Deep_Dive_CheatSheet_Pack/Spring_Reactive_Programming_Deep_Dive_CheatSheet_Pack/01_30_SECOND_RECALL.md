# Spring Reactive Programming — 30-Second Recall

```text
Source → Mono/Flux → Operators → Scheduler/Context → Subscriber
                ↑                 ↓
             Demand ← Backpressure
```

## WebFlux
```text
HTTP → Reactor Netty → WebFilter → DispatcherHandler → Controller/Router → WebClient/R2DBC → Response
```

## Golden Rules
- Never block event-loop threads.
- Compose; do not nested-subscribe.
- Bound concurrency and buffers.
- Treat cancellation as normal.
- Use Reactor Context instead of thread-affinity assumptions.
