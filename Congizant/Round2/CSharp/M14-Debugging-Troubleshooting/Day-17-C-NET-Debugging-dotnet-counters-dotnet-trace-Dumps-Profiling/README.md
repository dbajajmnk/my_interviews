# Day 17 — C#/.NET Debugging: dotnet-counters, dotnet-trace, Dumps & Profiling

**Module:** M14 — Debugging & Troubleshooting  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Debugging workflow](01-Debugging-workflow.md)
2. [Visual Studio debugger awareness](02-Visual-Studio-debugger-awareness.md)
3. [Breakpoints](03-Breakpoints.md)
4. [Conditional breakpoints](04-Conditional-breakpoints.md)
5. [Exception settings awareness](05-Exception-settings-awareness.md)
6. [Stack traces](06-Stack-traces.md)
7. [Async stack traces](07-Async-stack-traces.md)
8. [dotnet-counters](08-dotnet-counters.md)
9. [dotnet-trace](09-dotnet-trace.md)
10. [dotnet-dump](10-dotnet-dump.md)
11. [GC dump awareness](11-GC-dump-awareness.md)
12. [CPU profiling](12-CPU-profiling.md)
13. [Allocation profiling](13-Allocation-profiling.md)
14. [Memory leak diagnosis](14-Memory-leak-diagnosis.md)
15. [ThreadPool starvation diagnosis](15-ThreadPool-starvation-diagnosis.md)
16. [Deadlock diagnosis](16-Deadlock-diagnosis.md)
17. [Lock contention](17-Lock-contention.md)
18. [EventPipe awareness](18-EventPipe-awareness.md)
19. [ETW awareness](19-ETW-awareness.md)
20. [Logging/tracing correlation](20-Logging-tracing-correlation.md)
21. [Database wait diagnosis](21-Database-wait-diagnosis.md)
22. [HTTP dependency diagnosis](22-HTTP-dependency-diagnosis.md)
23. [One-instance anomaly diagnosis](23-One-instance-anomaly-diagnosis.md)
24. [Root-cause evidence](24-Root-cause-evidence.md)

---

# 2. Real-Life Analogy

Diagnostics is evidence matching: counters for live health, trace for event timelines, dumps for postmortem state, profiler for CPU/allocation.

---

# 3. Visualization

```text
Symptom → counters/trace/dump/profile → Hypothesis → Fix → Regression
```

---

# 4. Mind Map

```text
C#/.NET Debugging: dotnet-counters, dotnet-trace, Dumps & Profiling
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

Diagnose one CPU issue, one memory leak, one ThreadPool starvation case and one async latency case with the right tools.

---

# 8. Google Interview Drill

p99 latency is high while CPU is low and ThreadPool queue length grows. Build an evidence plan.

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
