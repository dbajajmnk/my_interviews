# Day 04 — C Design Model: ADTs, Opaque Types & Function Tables

**Module:** M04 — OOP / Design Model  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Procedural design](01-Procedural-design.md)
2. [Abstract data types](02-Abstract-data-types.md)
3. [Opaque structs](03-Opaque-structs.md)
4. [Incomplete types](04-Incomplete-types.md)
5. [Header/API boundaries](05-Header-API-boundaries.md)
6. [Encapsulation through translation units](06-Encapsulation-through-translation-units.md)
7. [Composition with structs](07-Composition-with-structs.md)
8. [Function tables](08-Function-tables.md)
9. [Vtable pattern awareness](09-Vtable-pattern-awareness.md)
10. [Interface by function pointers](10-Interface-by-function-pointers.md)
11. [Dependency injection with function pointers](11-Dependency-injection-with-function-pointers.md)
12. [Context objects](12-Context-objects.md)
13. [Handle pattern](13-Handle-pattern.md)
14. [State machines](14-State-machines.md)
15. [Tagged unions](15-Tagged-unions.md)
16. [Discriminated union pattern](16-Discriminated-union-pattern.md)
17. [Object-like design in C awareness](17-Object-like-design-in-C-awareness.md)
18. [Data-oriented design awareness](18-Data-oriented-design-awareness.md)
19. [API ownership contracts](19-API-ownership-contracts.md)
20. [ABI-aware struct design](20-ABI-aware-struct-design.md)

# 2. Real-Life Analogy

C encapsulation lives in headers, source files, opaque handles and function tables rather than classes.

# 3. Visualization

```text
Header → Opaque Handle/Function Table → Private Struct → Behavior
```

# 4. Mind Map

```text
C Design Model: ADTs, Opaque Types & Function Tables
├── C Semantics
├── Bounds / Integers / Pointers
├── Ownership / Storage Duration
├── Toolchain / OS
├── Concurrency
├── Failure / UB
├── Debugging / Security
└── Interview Defense
```

# 5. Two-Hour Execution Plan

```text
00–15  Rapid recall
15–55  P0 topics
55–85  Hands-on/debugging
85–105 Google drill
105–115 Follow-ups
115–120 Readiness gate
```

# 6. Engineering Integration

> **Concept → C Guarantee → Bounds/Ownership → Compiler/OS Boundary → Failure/UB → Evidence → Review Rule → Trade-Off**

# 7. Hands-On Integration

Design an opaque stack/client API with private implementation.

# 8. Google Interview Drill

Explain how opaque types protect coupling and ABI.

# 9. Day-Level Common Mistakes

- Pointer/array confusion.
- Missing bounds and cleanup.
- Signed/unsigned mistakes.
- UB and volatile misuse.
- Unsafe string handling.
- Optimizing without evidence.

# 10. Day-Level Best Practices

Explicit sizes, ownership, strong warnings, structured cleanup, sanitizers/fuzzing, correct synchronization, portable representations, Evidence First / No Bluff.

# 11. Interview Questions

Explain three key topics, one failure, one debugging artifact, one production use, and one safer alternative.

# 12. Google-Level Follow-Ups

What changes on another compiler/architecture, under concurrency, for untrusted input, under optimization, or if a safer language is allowed?

# 13. Quick Revision

```text
What is it?
What is the type/size?
Who owns it?
What is the lifetime/capacity?
What can be NULL/overflow/out-of-bounds?
How is cleanup guaranteed?
What tool proves failure?
```

# 14. Day Readiness Gate

- [ ] Every P0 topic READY.
- [ ] Hands-on complete.
- [ ] Drill complete.
- [ ] Bounds/ownership/lifetime explainable.
- [ ] Two follow-up changes survivable.
- [ ] No invented evidence.

**DAY READY:** 80%+ and no P0 failure.
