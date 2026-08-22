# Day 12 — Threads, ThreadPool, Locks, Concurrent Collections & Channels

**Module:** M10 — Concurrency / Async  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Thread awareness](01-Thread-awareness.md)
2. [ThreadPool](02-ThreadPool.md)
3. [TaskScheduler awareness](03-TaskScheduler-awareness.md)
4. [Lock statement](04-Lock-statement.md)
5. [Monitor awareness](05-Monitor-awareness.md)
6. [Mutex awareness](06-Mutex-awareness.md)
7. [SemaphoreSlim](07-SemaphoreSlim.md)
8. [ReaderWriterLockSlim awareness](08-ReaderWriterLockSlim-awareness.md)
9. [Interlocked](09-Interlocked.md)
10. [Volatile awareness](10-Volatile-awareness.md)
11. [Memory model awareness](11-Memory-model-awareness.md)
12. [Race conditions](12-Race-conditions.md)
13. [Deadlocks](13-Deadlocks.md)
14. [Lock ordering](14-Lock-ordering.md)
15. [ConcurrentDictionary](15-ConcurrentDictionary.md)
16. [ConcurrentQueue](16-ConcurrentQueue.md)
17. [ConcurrentBag awareness](17-ConcurrentBag-awareness.md)
18. [BlockingCollection awareness](18-BlockingCollection-awareness.md)
19. [System.Threading.Channels awareness](19-System-Threading-Channels-awareness.md)
20. [Producer-consumer](20-Producer-consumer.md)
21. [Backpressure](21-Backpressure.md)
22. [Bounded channels](22-Bounded-channels.md)
23. [Parallel.ForEachAsync awareness](23-Parallel-ForEachAsync-awareness.md)
24. [ThreadPool starvation](24-ThreadPool-starvation.md)
25. [Async lock patterns awareness](25-Async-lock-patterns-awareness.md)

---

# 2. Real-Life Analogy

Day 12 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Shared State → lock/Interlocked/Concurrent/Channel → bounded concurrency
```

---

# 4. Mind Map

```text
Threads, ThreadPool, Locks, Concurrent Collections & Channels
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

Reproduce a race, fix it with lock/Interlocked/ConcurrentDictionary/Channel based on the invariant, and add bounded concurrency.

---

# 8. Google Interview Drill

A service creates thousands of Task.Run calls around blocking I/O. Explain ThreadPool starvation and redesign.

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
