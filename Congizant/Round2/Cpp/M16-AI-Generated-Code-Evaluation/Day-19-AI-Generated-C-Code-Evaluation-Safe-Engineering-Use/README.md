# Day 19 — AI-Generated C++ Code Evaluation & Safe Engineering Use

**Module:** M16 — AI-Generated Code Evaluation  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [AI code as untrusted proposal](01-AI-code-as-untrusted-proposal.md)
2. [Hallucinated standard-library APIs](02-Hallucinated-standard-library-APIs.md)
3. [Wrong C++ standard assumptions](03-Wrong-C-standard-assumptions.md)
4. [Ownership bugs](04-Ownership-bugs.md)
5. [Use-after-free](05-Use-after-free.md)
6. [Double free](06-Double-free.md)
7. [Dangling references](07-Dangling-references.md)
8. [Dangling string_view](08-Dangling-string-view.md)
9. [Shared_ptr cycles](09-Shared-ptr-cycles.md)
10. [Missing virtual destructor](10-Missing-virtual-destructor.md)
11. [Incorrect move semantics](11-Incorrect-move-semantics.md)
12. [Undefined behavior](12-Undefined-behavior.md)
13. [Data races](13-Data-races.md)
14. [Deadlocks](14-Deadlocks.md)
15. [Incorrect atomics](15-Incorrect-atomics.md)
16. [Exception-safety bugs](16-Exception-safety-bugs.md)
17. [Buffer overflow risk](17-Buffer-overflow-risk.md)
18. [Unsafe casts](18-Unsafe-casts.md)
19. [Generated templates](19-Generated-templates.md)
20. [Generated CMake](20-Generated-CMake.md)
21. [Generated tests](21-Generated-tests.md)
22. [Generated benchmarks](22-Generated-benchmarks.md)
23. [Security review](23-Security-review.md)
24. [Performance claims](24-Performance-claims.md)
25. [Human approval](25-Human-approval.md)
26. [Accept repair reject rubric](26-Accept-repair-reject-rubric.md)

---

# 2. Real-Life Analogy

Day 19 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
AI Proposal → Build/Sanitize/Test → Ownership/UB/Atomic Review → Verdict
```

---

# 4. Mind Map

```text
AI-Generated C++ Code Evaluation & Safe Engineering Use
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

Evaluate AI-generated snippets for RAII, smart pointers, threading, atomics, templates and CMake.

---

# 8. Google Interview Drill

AI generates a lock-free queue using relaxed atomics without a proof. Review it as unsafe until correctness is demonstrated.

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
