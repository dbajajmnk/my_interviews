# Spring Reactive Reference Architecture

```text
Client
  ↓
Reactor Netty Event Loop
  ↓
WebFilters / SecurityWebFilterChain
  ↓
DispatcherHandler
  ↓
Controller / RouterFunction
  ↓
Reactive Service
 ├─ WebClient → Remote APIs
 ├─ R2DBC → Database
 ├─ RSocket → Reactive Services
 └─ Broker Adapter → Events
  ↓
Mono / Flux Response
```

Cross-cutting: Reactor Context, backpressure, schedulers, timeouts, cancellation, tracing and bounded resource pools.
