# Performance Cheat Sheet

## Golden Rule
**Measure first.**

```text
Client → Network → Server Threads/Event Loop → App Code → HTTP Clients
→ DB Pool → Queries/Locks/Indexes → JVM/GC/CPU/Memory
```

## Metrics
Throughput, p50/p95/p99 latency, errors, CPU, heap, GC, threads, pool active/pending, downstream latency.

## Common Causes
N+1, missing indexes, excessive serialization, slow downstreams, lock contention, huge payloads, wrong cache, unbounded concurrency, pool starvation.

## Trap
Adding threads/cache/memory before finding the bottleneck can reduce stability.
