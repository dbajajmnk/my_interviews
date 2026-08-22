# Day 11 — Threads, mutex, locks, condition_variable & the C++ Memory Model

**Module:** M10 — Concurrency / Async  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [std::thread](01-std-thread.md)
2. [jthread awareness](02-jthread-awareness.md)
3. [Thread lifetime](03-Thread-lifetime.md)
4. [join](04-join.md)
5. [detach caution](05-detach-caution.md)
6. [std::mutex](06-std-mutex.md)
7. [std::recursive_mutex awareness](07-std-recursive-mutex-awareness.md)
8. [std::timed_mutex awareness](08-std-timed-mutex-awareness.md)
9. [std::lock_guard](09-std-lock-guard.md)
10. [std::unique_lock](10-std-unique-lock.md)
11. [std::scoped_lock](11-std-scoped-lock.md)
12. [Deadlock](12-Deadlock.md)
13. [Lock ordering](13-Lock-ordering.md)
14. [std::condition_variable](14-std-condition-variable.md)
15. [Spurious wakeups](15-Spurious-wakeups.md)
16. [Predicate waits](16-Predicate-waits.md)
17. [Data races](17-Data-races.md)
18. [C++ memory model](18-C-memory-model.md)
19. [Happens-before awareness](19-Happens-before-awareness.md)
20. [Sequenced-before awareness](20-Sequenced-before-awareness.md)
21. [Thread-safe initialization](21-Thread-safe-initialization.md)
22. [call_once](22-call-once.md)
23. [once_flag](23-once-flag.md)
24. [False sharing awareness](24-False-sharing-awareness.md)
25. [Thread-local storage awareness](25-Thread-local-storage-awareness.md)

---

# 2. Real-Life Analogy

A mutex is a single key, a condition variable is a doorbell, and the memory model defines when one thread can trust what another wrote.

---

# 3. Visualization

```text
Threads → Mutex/Condition → Happens-Before → Shared State → Correctness
```

---

# 4. Mind Map

```text
Threads, mutex, locks, condition_variable & the C++ Memory Model
├── Language Semantics
├── Lifetime / Ownership
├── Compiler / Linker / Runtime
├── Concurrency / Memory Model
├── Failure / Undefined Behavior
├── Debugging / Sanitizers
├── Code Review
├── AI Evaluation
├── Performance / Production
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

> **Concept → C++ Guarantee → Lifetime/Ownership → Compiler/Runtime Boundary → Failure/UB → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Reproduce a race and a deadlock, then fix them using correct locking and condition-variable predicates.

---

# 8. Google Interview Drill

Two threads update different fields on the same cache line and performance collapses. Explain false sharing awareness and how to measure.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Sanitize/Profile if Needed → Edge Cases → Complexity/Cost → Failure/UB → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Raw ownership without RAII.
- Dangling pointers/references/views.
- Iterator invalidation.
- Incorrect copy/move semantics.
- Missing virtual destructor.
- Data races/atomic misuse.
- Overusing templates/patterns.
- Optimizing before profiling.

---

# 10. Day-Level Best Practices

- Rule of Zero first.
- RAII everywhere practical.
- Smart/value ownership explicit.
- Strong warnings + sanitizers.
- Const-correctness.
- Defined behavior only.
- Measure before optimization.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the C++ standard guarantee?
3. What is compiler/ABI/runtime-specific?
4. What can dangle, race, leak or invoke UB?
5. What tool would you use to prove the problem?
6. What simpler/safer design could replace this?

---

# 12. Google-Level Follow-Ups

1. What changes under optimization?
2. What changes under concurrency?
3. What changes if ownership becomes shared?
4. What changes across a shared-library ABI boundary?
5. What would ASan/TSan/profiler show?
6. What trade-off would make you choose another language/runtime?

---

# 13. Quick Revision

```text
What is it?
Who owns it?
When does lifetime end?
Can anything dangle?
What can be UB?
What allocates/copies/moves?
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
- [ ] I can explain ownership/lifetime/UB risks.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
