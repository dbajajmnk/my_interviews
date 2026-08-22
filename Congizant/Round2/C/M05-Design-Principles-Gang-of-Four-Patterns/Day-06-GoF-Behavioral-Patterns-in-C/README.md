# Day 06 — GoF Behavioral Patterns in C

**Module:** M05 — Design Principles & Gang of Four Patterns  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Chain of Responsibility](01-Chain-of-Responsibility.md)
2. [Command](02-Command.md)
3. [Interpreter](03-Interpreter.md)
4. [Iterator](04-Iterator.md)
5. [Mediator](05-Mediator.md)
6. [Memento](06-Memento.md)
7. [Observer](07-Observer.md)
8. [State](08-State.md)
9. [Strategy](09-Strategy.md)
10. [Template Method](10-Template-Method.md)
11. [Visitor](11-Visitor.md)
12. [Function pointers as Strategy](12-Function-pointers-as-Strategy.md)
13. [Callback tables as Observer](13-Callback-tables-as-Observer.md)
14. [State machine vs State pattern](14-State-machine-vs-State-pattern.md)
15. [Tagged unions vs Visitor awareness](15-Tagged-unions-vs-Visitor-awareness.md)
16. [Pattern combinations](16-Pattern-combinations.md)

# 2. Real-Life Analogy

Day 06 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
Event → Strategy/State/Command/Observer → Function-Pointer Dispatch
```

# 4. Mind Map

```text
GoF Behavioral Patterns in C
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

Implement Strategy, State, Command and Observer using structs, enums and function pointers.

# 8. Google Interview Drill

Translate all 23 GoF intents into C-native mechanisms.

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
