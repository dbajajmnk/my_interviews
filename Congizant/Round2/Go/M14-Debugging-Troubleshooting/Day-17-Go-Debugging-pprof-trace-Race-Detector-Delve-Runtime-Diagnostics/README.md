# Day 17 — Go Debugging: pprof, trace, Race Detector, Delve & Runtime Diagnostics

**Module:** M14 — Debugging & Troubleshooting  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Debugging workflow](01-Debugging-workflow.md)
2. [Delve debugger awareness](02-Delve-debugger-awareness.md)
3. [go test failure analysis](03-go-test-failure-analysis.md)
4. [Stack traces](04-Stack-traces.md)
5. [runtime.Stack awareness](05-runtime-Stack-awareness.md)
6. [Goroutine dumps](06-Goroutine-dumps.md)
7. [pprof CPU profile](07-pprof-CPU-profile.md)
8. [pprof heap profile](08-pprof-heap-profile.md)
9. [Allocation profiles](09-Allocation-profiles.md)
10. [Block profile](10-Block-profile.md)
11. [Mutex profile](11-Mutex-profile.md)
12. [go tool trace](12-go-tool-trace.md)
13. [Execution trace awareness](13-Execution-trace-awareness.md)
14. [Race detector](14-Race-detector.md)
15. [Deadlock diagnosis](15-Deadlock-diagnosis.md)
16. [Goroutine leak diagnosis](16-Goroutine-leak-diagnosis.md)
17. [GC metrics awareness](17-GC-metrics-awareness.md)
18. [HTTP trace awareness](18-HTTP-trace-awareness.md)
19. [Database wait diagnosis](19-Database-wait-diagnosis.md)
20. [One-instance anomaly diagnosis](20-One-instance-anomaly-diagnosis.md)
21. [Root-cause evidence](21-Root-cause-evidence.md)

---

# 2. Real-Life Analogy

Go debugging is evidence-led: pprof for CPU/heap, trace for scheduling/blocking, -race for races, goroutine dumps for leaks.

---

# 3. Visualization

```text
Symptom → pprof/trace/-race/dump → Hypothesis → Fix → Regression
```

---

# 4. Mind Map

```text
Go Debugging: pprof, trace, Race Detector, Delve & Runtime Diagnostics
├── Language Semantics
├── Toolchain / Runtime
├── Ownership / Resources
├── Concurrency
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

> **Concept → Go Guarantee → Runtime/OS Boundary → Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Diagnose one CPU issue, one heap-growth issue, one goroutine leak and one race with the correct tools.

---

# 8. Google Interview Drill

CPU is low but latency is high and goroutine count keeps growing. Build an evidence plan.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Race/Profile if Needed → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Ignoring errors.
- Over-abstracting with interfaces/patterns.
- Leaking goroutines/resources.
- Using unbounded concurrency.
- Misunderstanding slice/interface nil semantics.
- Treating race-free as automatically deadlock/leak-free.
- Optimizing without pprof/trace/benchmark evidence.

---

# 10. Day-Level Best Practices

- Standard library first.
- Small consumer-owned interfaces.
- Explicit errors and context.
- Bounded concurrency.
- Clear ownership and cleanup.
- Measure runtime behavior.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the Go spec guarantee?
3. What is runtime/compiler implementation detail?
4. What can leak, block, or race?
5. What evidence would you collect?
6. What simpler design could replace this abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when the client cancels?
3. What if the downstream DB/API is saturated?
4. What if this function receives a typed-nil interface?
5. What would pprof/trace/-race show?
6. What would you change for a library vs a service?

---

# 13. Quick Revision

```text
What is it?
Why?
Who owns the resource?
What can be nil?
What can block/race/leak?
What does the runtime do?
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
- [ ] I can explain ownership/cancellation/resource behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
