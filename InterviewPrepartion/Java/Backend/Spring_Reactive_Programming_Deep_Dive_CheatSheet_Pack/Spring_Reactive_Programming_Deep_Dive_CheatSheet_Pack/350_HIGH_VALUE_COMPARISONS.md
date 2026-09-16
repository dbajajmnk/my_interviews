# High-Value Comparisons

| A | B | Key difference |
|---|---|---|
| Mono | Flux | 0..1 vs 0..N |
| map | flatMap | sync transform vs async Publisher flatten |
| flatMap | concatMap | concurrent completion-order vs sequential source-order |
| publishOn | subscribeOn | downstream boundary vs source subscription context |
| Cold | Hot | per-subscriber source vs shared/live source |
| WebFlux | MVC | reactive non-blocking vs Servlet imperative |
| WebClient | RestClient | reactive vs synchronous HTTP client |
| R2DBC | JDBC | reactive SPI vs blocking API |
| Reactor Context | ThreadLocal | subscription-scoped vs thread-scoped |
| Reactive | Virtual Threads | async continuation/backpressure vs lightweight blocking model |
