# Day 24 — C++ Performance: Cache Locality, Allocation, Copies, Branching & Profiling

**Module:** M20 — Performance & Security  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Performance methodology](01-Performance-methodology.md)
2. [Latency percentiles](02-Latency-percentiles.md)
3. [Throughput](03-Throughput.md)
4. [CPU profiling](04-CPU-profiling.md)
5. [Cache locality](05-Cache-locality.md)
6. [Cache lines awareness](06-Cache-lines-awareness.md)
7. [False sharing](07-False-sharing.md)
8. [Branch prediction awareness](08-Branch-prediction-awareness.md)
9. [Allocations](09-Allocations.md)
10. [Heap fragmentation awareness](10-Heap-fragmentation-awareness.md)
11. [Object pools awareness](11-Object-pools-awareness.md)
12. [Custom allocators awareness](12-Custom-allocators-awareness.md)
13. [Small object optimization awareness](13-Small-object-optimization-awareness.md)
14. [Copy cost](14-Copy-cost.md)
15. [Move semantics](15-Move-semantics.md)
16. [Copy elision](16-Copy-elision.md)
17. [String allocation](17-String-allocation.md)
18. [string_view](18-string-view.md)
19. [Span awareness](19-Span-awareness.md)
20. [Vector reserve](20-Vector-reserve.md)
21. [Container choice](21-Container-choice.md)
22. [Virtual dispatch cost awareness](22-Virtual-dispatch-cost-awareness.md)
23. [Template/static polymorphism awareness](23-Template-static-polymorphism-awareness.md)
24. [Inlining](24-Inlining.md)
25. [Auto-vectorization awareness](25-Auto-vectorization-awareness.md)
26. [SIMD awareness](26-SIMD-awareness.md)
27. [Compiler optimization levels](27-Compiler-optimization-levels.md)
28. [Link-time optimization awareness](28-Link-time-optimization-awareness.md)
29. [Profile-guided optimization awareness](29-Profile-guided-optimization-awareness.md)
30. [Benchmark pitfalls](30-Benchmark-pitfalls.md)

---

# 2. Real-Life Analogy

Day 24 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
SLO Breach → Profile/Perf Counters → Cache/Alloc/Lock/I/O Bottleneck → Fix
```

---

# 4. Mind Map

```text
C++ Performance: Cache Locality, Allocation, Copies, Branching & Profiling
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

Profile a workload and rank fixes for allocation, cache locality, copying, container choice and lock contention.

---

# 8. Google Interview Drill

A micro-optimization removes virtual dispatch but worsens cache locality. Explain why measurement beats intuition.

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
