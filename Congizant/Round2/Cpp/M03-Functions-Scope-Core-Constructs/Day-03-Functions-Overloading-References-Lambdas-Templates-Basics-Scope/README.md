# Day 03 — Functions, Overloading, References, Lambdas, Templates Basics & Scope

**Module:** M03 — Functions, Scope & Core Constructs  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Function declarations](01-Function-declarations.md)
2. [Function definitions](02-Function-definitions.md)
3. [Parameter passing by value](03-Parameter-passing-by-value.md)
4. [Pass by reference](04-Pass-by-reference.md)
5. [Pass by const reference](05-Pass-by-const-reference.md)
6. [Pass by pointer](06-Pass-by-pointer.md)
7. [Return by value](07-Return-by-value.md)
8. [Return by reference risk](08-Return-by-reference-risk.md)
9. [Function overloading](09-Function-overloading.md)
10. [Default arguments](10-Default-arguments.md)
11. [Inline functions](11-Inline-functions.md)
12. [Function pointers](12-Function-pointers.md)
13. [std::function awareness](13-std-function-awareness.md)
14. [Lambdas](14-Lambdas.md)
15. [Lambda capture by value](15-Lambda-capture-by-value.md)
16. [Lambda capture by reference](16-Lambda-capture-by-reference.md)
17. [mutable lambdas awareness](17-mutable-lambdas-awareness.md)
18. [Generic lambdas](18-Generic-lambdas.md)
19. [Scopes](19-Scopes.md)
20. [Storage duration awareness](20-Storage-duration-awareness.md)
21. [Static local variables](21-Static-local-variables.md)
22. [Templates introduction](22-Templates-introduction.md)

---

# 2. Real-Life Analogy

Day 03 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Function → Parameter Passing → Overload/Lambda → Capture/Lifetime → Result
```

---

# 4. Mind Map

```text
Functions, Overloading, References, Lambdas, Templates Basics & Scope
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

Implement a validation pipeline with functions/lambdas, compare parameter-passing styles, and reproduce a dangling-reference bug.

---

# 8. Google Interview Drill

A lambda captures a local by reference and escapes the function. Explain why it becomes undefined behavior.

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
