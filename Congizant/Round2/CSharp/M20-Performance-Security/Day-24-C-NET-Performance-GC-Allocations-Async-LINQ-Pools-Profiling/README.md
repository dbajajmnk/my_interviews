# Day 24 — C#/.NET Performance: GC, Allocations, Async, LINQ, Pools & Profiling

**Module:** M20 — Performance & Security  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Performance methodology](01-Performance-methodology.md)
2. [Latency percentiles](02-Latency-percentiles.md)
3. [Throughput](03-Throughput.md)
4. [Allocation rate](04-Allocation-rate.md)
5. [GC pressure](05-GC-pressure.md)
6. [LOH pressure](06-LOH-pressure.md)
7. [Boxing](07-Boxing.md)
8. [String allocations](08-String-allocations.md)
9. [StringBuilder](09-StringBuilder.md)
10. [Span<T>](10-Span-T.md)
11. [Memory<T>](11-Memory-T.md)
12. [ArrayPool<T> awareness](12-ArrayPool-T-awareness.md)
13. [ObjectPool awareness](13-ObjectPool-awareness.md)
14. [ValueTask trade-offs](14-ValueTask-trade-offs.md)
15. [Async state-machine overhead awareness](15-Async-state-machine-overhead-awareness.md)
16. [ThreadPool starvation](16-ThreadPool-starvation.md)
17. [Lock contention](17-Lock-contention.md)
18. [LINQ allocation awareness](18-LINQ-allocation-awareness.md)
19. [Multiple enumeration](19-Multiple-enumeration.md)
20. [EF Core query cost](20-EF-Core-query-cost.md)
21. [Database pool waits](21-Database-pool-waits.md)
22. [HttpClient connection reuse](22-HttpClient-connection-reuse.md)
23. [Caching](23-Caching.md)
24. [IMemoryCache awareness](24-IMemoryCache-awareness.md)
25. [Distributed cache awareness](25-Distributed-cache-awareness.md)
26. [BenchmarkDotNet](26-BenchmarkDotNet.md)
27. [Profiling before optimization](27-Profiling-before-optimization.md)

---

# 2. Real-Life Analogy

Day 24 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
SLO Breach → counters/trace/profile → GC/ThreadPool/DB/HTTP bottleneck → Fix
```

---

# 4. Mind Map

```text
C#/.NET Performance: GC, Allocations, Async, LINQ, Pools & Profiling
├── C# Semantics
├── CLR / IL / Runtime
├── Async / Lifetime
├── Framework / Data
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → C# Guarantee → CLR/Framework Boundary → Lifetime/Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Given profiles, rank fixes for boxing, LOH allocation, ThreadPool starvation, LINQ allocations and DB waits.

---

# 8. Google Interview Drill

A team replaces every Task with ValueTask for performance. Explain why that may make things worse.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Edge Cases → Complexity/Allocation → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Confusing C# with .NET/CLR.
- Sync-over-async.
- Missing cancellation.
- Resource leaks.
- Wrong DI lifetime.
- Overusing inheritance/patterns.
- Trusting LINQ/EF/runtime behavior without evidence.
- Optimizing without diagnostics.

---

# 10. Day-Level Best Practices

- Nullable enabled.
- Async all the way for I/O.
- CancellationToken propagated.
- Deterministic disposal.
- Constructor injection and correct lifetimes.
- Inspect SQL and traces.
- Measure before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does C# guarantee?
3. What is CLR/framework-specific?
4. What can allocate/block/race/leak?
5. What evidence would you collect?
6. What simpler design could replace the abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when CancellationToken fires?
3. What if the DB/API is saturated?
4. What changes under Native AOT/trimming?
5. What would counters/trace/dump/profile show?
6. What would you choose differently for library vs ASP.NET Core service?

---

# 13. Quick Revision

```text
What is it?
Why?
What does C# guarantee?
What does CLR/framework do?
What allocates?
What can block/race/leak?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can distinguish language vs CLR/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
