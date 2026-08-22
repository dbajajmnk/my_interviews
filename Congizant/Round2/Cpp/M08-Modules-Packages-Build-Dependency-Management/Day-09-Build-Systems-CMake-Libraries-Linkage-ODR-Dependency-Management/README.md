# Day 09 — Build Systems, CMake, Libraries, Linkage, ODR & Dependency Management

**Module:** M08 — Modules, Packages, Build & Dependency Management  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Header/source organization](01-Header-source-organization.md)
2. [Include guards](02-Include-guards.md)
3. [pragma once awareness](03-pragma-once-awareness.md)
4. [Forward declarations](04-Forward-declarations.md)
5. [Internal linkage](05-Internal-linkage.md)
6. [External linkage](06-External-linkage.md)
7. [static at namespace scope awareness](07-static-at-namespace-scope-awareness.md)
8. [inline variables awareness](08-inline-variables-awareness.md)
9. [One Definition Rule](09-One-Definition-Rule.md)
10. [Name mangling awareness](10-Name-mangling-awareness.md)
11. [Static libraries](11-Static-libraries.md)
12. [Shared libraries](12-Shared-libraries.md)
13. [Dynamic linking awareness](13-Dynamic-linking-awareness.md)
14. [ABI awareness](14-ABI-awareness.md)
15. [CMake](15-CMake.md)
16. [Targets](16-Targets.md)
17. [target_include_directories](17-target-include-directories.md)
18. [target_link_libraries](18-target-link-libraries.md)
19. [Compile features](19-Compile-features.md)
20. [Generator awareness](20-Generator-awareness.md)
21. [Build types](21-Build-types.md)
22. [Presets awareness](22-Presets-awareness.md)
23. [Package managers vcpkg awareness](23-Package-managers-vcpkg-awareness.md)
24. [Conan awareness](24-Conan-awareness.md)
25. [Dependency versioning](25-Dependency-versioning.md)
26. [Transitive dependencies](26-Transitive-dependencies.md)
27. [Modules awareness](27-Modules-awareness.md)
28. [Header units awareness](28-Header-units-awareness.md)
29. [Supply-chain risk](29-Supply-chain-risk.md)

---

# 2. Real-Life Analogy

Day 09 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Headers/TU → Compile → ODR/Linkage → Library/ABI → Executable
```

---

# 4. Mind Map

```text
Build Systems, CMake, Libraries, Linkage, ODR & Dependency Management
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

Create a multi-target CMake project with static/shared library awareness and reproduce an ODR/linker error.

---

# 8. Google Interview Drill

A library upgrade compiles but crashes due to ABI mismatch. Explain why source compatibility is not enough.

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
