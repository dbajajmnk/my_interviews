# Day 18 — Code Review, Refactoring & Modern C++ Safety

**Module:** M15 — Code Review & Refactoring Mastery  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Risk-first code review](01-Risk-first-code-review.md)
2. [Correctness](02-Correctness.md)
3. [Lifetime review](03-Lifetime-review.md)
4. [Ownership review](04-Ownership-review.md)
5. [RAII review](05-RAII-review.md)
6. [Raw pointer review](06-Raw-pointer-review.md)
7. [Smart pointer review](07-Smart-pointer-review.md)
8. [Move semantics review](08-Move-semantics-review.md)
9. [Iterator invalidation](09-Iterator-invalidation.md)
10. [Exception safety](10-Exception-safety.md)
11. [noexcept review](11-noexcept-review.md)
12. [Thread safety](12-Thread-safety.md)
13. [Data race review](13-Data-race-review.md)
14. [Undefined behavior review](14-Undefined-behavior-review.md)
15. [Const-correctness](15-Const-correctness.md)
16. [API contracts](16-API-contracts.md)
17. [Inheritance abuse](17-Inheritance-abuse.md)
18. [Template overengineering](18-Template-overengineering.md)
19. [Macro abuse](19-Macro-abuse.md)
20. [Global state](20-Global-state.md)
21. [Premature optimization](21-Premature-optimization.md)
22. [Refactoring](22-Refactoring.md)
23. [Characterization tests](23-Characterization-tests.md)
24. [Naming](24-Naming.md)
25. [Header hygiene](25-Header-hygiene.md)
26. [ABI/public API compatibility](26-ABI-public-API-compatibility.md)
27. [Technical debt](27-Technical-debt.md)
28. [C++ Core Guidelines awareness](28-C-Core-Guidelines-awareness.md)

---

# 2. Real-Life Analogy

Day 18 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Requirement → Lifetime/Ownership/UB/Concurrency → API → Tests → Maintainability
```

---

# 4. Mind Map

```text
Code Review, Refactoring & Modern C++ Safety
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

Review a flawed C++ service with raw owning pointers, dangling string_view, unsafe thread detach and iterator invalidation.

---

# 8. Google Interview Drill

Rank blockers vs suggestions in a 20-minute C++ PR review.

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
