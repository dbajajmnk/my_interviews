# Day 13 — Templates, Concepts, constexpr, Move Semantics & Modern C++

**Module:** M11 — Modern & Advanced Features  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Function templates](01-Function-templates.md)
2. [Class templates](02-Class-templates.md)
3. [Template argument deduction](03-Template-argument-deduction.md)
4. [Specialization awareness](04-Specialization-awareness.md)
5. [Partial specialization awareness](05-Partial-specialization-awareness.md)
6. [Variadic templates](06-Variadic-templates.md)
7. [Parameter packs](07-Parameter-packs.md)
8. [Fold expressions awareness](08-Fold-expressions-awareness.md)
9. [SFINAE awareness](09-SFINAE-awareness.md)
10. [Concepts](10-Concepts.md)
11. [requires clauses](11-requires-clauses.md)
12. [Type traits](12-Type-traits.md)
13. [std::enable_if awareness](13-std-enable-if-awareness.md)
14. [constexpr](14-constexpr.md)
15. [consteval awareness](15-consteval-awareness.md)
16. [constinit awareness](16-constinit-awareness.md)
17. [Move semantics](17-Move-semantics.md)
18. [std::move](18-std-move.md)
19. [Perfect forwarding awareness](19-Perfect-forwarding-awareness.md)
20. [std::forward](20-std-forward.md)
21. [Universal/forwarding references awareness](21-Universal-forwarding-references-awareness.md)
22. [Copy elision](22-Copy-elision.md)
23. [Return value optimization](23-Return-value-optimization.md)
24. [Guaranteed copy elision awareness](24-Guaranteed-copy-elision-awareness.md)
25. [Structured bindings](25-Structured-bindings.md)
26. [std::optional](26-std-optional.md)
27. [std::variant](27-std-variant.md)
28. [std::any awareness](28-std-any-awareness.md)
29. [Smart pointers overview](29-Smart-pointers-overview.md)

---

# 2. Real-Life Analogy

Day 13 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Template/Concept → Instantiation → Move/Forward → Optimized Generic Code
```

---

# 4. Mind Map

```text
Templates, Concepts, constexpr, Move Semantics & Modern C++
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

Build constrained generic functions with concepts, compare copy/move behavior, and inspect where std::move does and does not move.

---

# 8. Google Interview Drill

Explain why `std::move` is only a cast and can still result in a copy.

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
