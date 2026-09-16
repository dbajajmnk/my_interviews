# Reactive Decision Tree

```text
High I/O concurrency or streaming? → WebFlux/Reactor candidate
Mostly blocking JDBC/JPA/SDKs? → MVC + virtual threads may be simpler
0..1 result? → Mono
0..N stream? → Flux
Async mapping? → flatMap
Strict ordering? → concatMap
Concurrent work + ordered output? → flatMapSequential
Legacy blocking call? → fromCallable + boundedElastic + bulkhead
Reactive DB transaction? → R2DBC + reactive transaction manager
```
