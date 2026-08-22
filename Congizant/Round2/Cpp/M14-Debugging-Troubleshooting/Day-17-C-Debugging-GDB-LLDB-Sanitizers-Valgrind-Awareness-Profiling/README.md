# Day 17 — C++ Debugging: GDB/LLDB, Sanitizers, Valgrind Awareness & Profiling

**Module:** M14 — Debugging & Troubleshooting  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Debugging workflow](01-Debugging-workflow.md)
2. [GDB awareness](02-GDB-awareness.md)
3. [LLDB awareness](03-LLDB-awareness.md)
4. [Breakpoints](04-Breakpoints.md)
5. [Watchpoints](05-Watchpoints.md)
6. [Backtraces](06-Backtraces.md)
7. [Core dumps awareness](07-Core-dumps-awareness.md)
8. [AddressSanitizer](08-AddressSanitizer.md)
9. [UndefinedBehaviorSanitizer](09-UndefinedBehaviorSanitizer.md)
10. [ThreadSanitizer](10-ThreadSanitizer.md)
11. [MemorySanitizer awareness](11-MemorySanitizer-awareness.md)
12. [LeakSanitizer awareness](12-LeakSanitizer-awareness.md)
13. [Valgrind awareness](13-Valgrind-awareness.md)
14. [Heap profiling awareness](14-Heap-profiling-awareness.md)
15. [perf awareness](15-perf-awareness.md)
16. [Flame graphs awareness](16-Flame-graphs-awareness.md)
17. [CPU profiling](17-CPU-profiling.md)
18. [Memory profiling](18-Memory-profiling.md)
19. [Deadlock diagnosis](19-Deadlock-diagnosis.md)
20. [Data race diagnosis](20-Data-race-diagnosis.md)
21. [Use-after-free diagnosis](21-Use-after-free-diagnosis.md)
22. [One-process anomaly diagnosis](22-One-process-anomaly-diagnosis.md)
23. [Symbol files awareness](23-Symbol-files-awareness.md)
24. [Optimized build debugging](24-Optimized-build-debugging.md)
25. [Root-cause evidence](25-Root-cause-evidence.md)

---

# 2. Real-Life Analogy

C++ debugging is forensic work: sanitizers catch illegal behavior, debugger/core dumps inspect state, profiler tells where time/memory goes.

---

# 3. Visualization

```text
Symptom → Sanitizer/Debugger/Profile → Hypothesis → Fix → Regression
```

---

# 4. Mind Map

```text
C++ Debugging: GDB/LLDB, Sanitizers, Valgrind Awareness & Profiling
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

Diagnose one use-after-free, one race, one memory leak and one CPU issue with the appropriate tool.

---

# 8. Google Interview Drill

A crash disappears under the debugger. Build an evidence strategy using sanitizers/core dumps rather than adding print statements.

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
