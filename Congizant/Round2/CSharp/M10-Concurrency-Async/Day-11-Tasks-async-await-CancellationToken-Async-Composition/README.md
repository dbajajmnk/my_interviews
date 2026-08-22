# Day 11 — Tasks, async/await, CancellationToken & Async Composition

**Module:** M10 — Concurrency / Async  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Task](01-Task.md)
2. [Task<T>](02-Task-T.md)
3. [async methods](03-async-methods.md)
4. [await](04-await.md)
5. [SynchronizationContext awareness](05-SynchronizationContext-awareness.md)
6. [ConfigureAwait awareness](06-ConfigureAwait-awareness.md)
7. [Task.Run](07-Task-Run.md)
8. [CPU-bound vs I/O-bound](08-CPU-bound-vs-I-O-bound.md)
9. [Async all the way](09-Async-all-the-way.md)
10. [async void](10-async-void.md)
11. [ValueTask awareness](11-ValueTask-awareness.md)
12. [Task.WhenAll](12-Task-WhenAll.md)
13. [Task.WhenAny](13-Task-WhenAny.md)
14. [Sequential vs concurrent awaits](14-Sequential-vs-concurrent-awaits.md)
15. [CancellationToken](15-CancellationToken.md)
16. [CancellationTokenSource](16-CancellationTokenSource.md)
17. [Cooperative cancellation](17-Cooperative-cancellation.md)
18. [Timeout patterns](18-Timeout-patterns.md)
19. [Linked cancellation tokens awareness](19-Linked-cancellation-tokens-awareness.md)
20. [Exception propagation](20-Exception-propagation.md)
21. [Deadlock from sync-over-async awareness](21-Deadlock-from-sync-over-async-awareness.md)
22. [IAsyncEnumerable awareness](22-IAsyncEnumerable-awareness.md)
23. [await foreach](23-await-foreach.md)

---

# 2. Real-Life Analogy

async/await is a continuation machine, not a promise of a new thread; CancellationToken is a cooperative stop signal, not an interrupt.

---

# 3. Visualization

```text
Request → async Task → await I/O → CancellationToken → continuation → result/error
```

---

# 4. Mind Map

```text
Tasks, async/await, CancellationToken & Async Composition
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

Build concurrent I/O calls with cancellation and compare sequential, WhenAll and Task.Run usage.

---

# 8. Google Interview Drill

A web request deadlocks or starves threads because code calls .Result on async work. Explain sync-over-async risks.

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
