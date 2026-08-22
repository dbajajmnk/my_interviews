# Day 12 — sync Primitives, Atomics, Race Detector & Concurrent Design

**Module:** M10 — Concurrency / Async  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Data races](01-Data-races.md)
2. [Go memory model awareness](02-Go-memory-model-awareness.md)
3. [Happens-before awareness](03-Happens-before-awareness.md)
4. [sync.Mutex](04-sync-Mutex.md)
5. [sync.RWMutex](05-sync-RWMutex.md)
6. [sync.Once](06-sync-Once.md)
7. [sync.Cond awareness](07-sync-Cond-awareness.md)
8. [sync.Pool awareness](08-sync-Pool-awareness.md)
9. [sync.Map awareness](09-sync-Map-awareness.md)
10. [atomic package awareness](10-atomic-package-awareness.md)
11. [Atomic types awareness](11-Atomic-types-awareness.md)
12. [WaitGroup misuse](12-WaitGroup-misuse.md)
13. [Mutex copy pitfalls](13-Mutex-copy-pitfalls.md)
14. [Lock ordering](14-Lock-ordering.md)
15. [Deadlock](15-Deadlock.md)
16. [Channel vs mutex trade-offs](16-Channel-vs-mutex-trade-offs.md)
17. [Race detector](17-Race-detector.md)
18. [go test -race](18-go-test-race.md)
19. [False assumptions about maps](19-False-assumptions-about-maps.md)
20. [Concurrent map safety](20-Concurrent-map-safety.md)
21. [Backpressure](21-Backpressure.md)
22. [Bounded concurrency](22-Bounded-concurrency.md)
23. [Semaphore pattern](23-Semaphore-pattern.md)

---

# 2. Real-Life Analogy

A mutex is a key to shared state, an atomic is a tiny indivisible update, and a channel coordinates/communicates—choose by the invariant.

---

# 3. Visualization

```text
Shared State → Mutex/Atomic/Channel → -race → bounded concurrency
```

---

# 4. Mind Map

```text
sync Primitives, Atomics, Race Detector & Concurrent Design
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

Reproduce a race, detect it with -race, then fix using mutex/atomic/channel based on the invariant.

---

# 8. Google Interview Drill

Choose channel vs mutex vs atomic for three state-sharing scenarios and defend the choice.

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
