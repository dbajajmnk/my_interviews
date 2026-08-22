# Day 06 — GoF Behavioral Patterns & C++-Native Pattern Design

**Module:** M05 — Design Principles & Gang of Four Patterns  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

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
12. [Lambdas as Strategy](12-Lambdas-as-Strategy.md)
13. [std::variant as State modeling awareness](13-std-variant-as-State-modeling-awareness.md)
14. [std::visit as Visitor awareness](14-std-visit-as-Visitor-awareness.md)
15. [Ranges/pipelines vs Chain awareness](15-Ranges-pipelines-vs-Chain-awareness.md)
16. [Pattern combinations](16-Pattern-combinations.md)

---

# 2. Real-Life Analogy

Day 06 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Request/Event → Strategy/State/Command/Visitor → Modern C++ Implementation
```

---

# 4. Mind Map

```text
GoF Behavioral Patterns & C++-Native Pattern Design
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

Implement Strategy, State, Command and Visitor using both OO and modern C++ techniques where appropriate.

---

# 8. Google Interview Drill

Name all 23 GoF patterns and explain where modern C++ language/library features reduce classical ceremony.

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
