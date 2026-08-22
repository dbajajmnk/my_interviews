# Day 02 — Kotlin Type System, Null Safety, Smart Casts & Value Semantics

**Module:** M02 — Language Model & Type System  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [Static typing](01-Static-typing.md)
2. [Type inference](02-Type-inference.md)
3. [Nullable types](03-Nullable-types.md)
4. [Non-null types](04-Non-null-types.md)
5. [Safe-call operator](05-Safe-call-operator.md)
6. [Elvis operator](06-Elvis-operator.md)
7. [Not-null assertion](07-Not-null-assertion.md)
8. [Safe cast](08-Safe-cast.md)
9. [Smart casts](09-Smart-casts.md)
10. [is checks](10-is-checks.md)
11. [Any](11-Any.md)
12. [Any?](12-Any.md)
13. [Nothing](13-Nothing.md)
14. [Unit](14-Unit.md)
15. [Equality == vs ===](15-Equality-vs.md)
16. [Data equality](16-Data-equality.md)
17. [Referential equality](17-Referential-equality.md)
18. [Platform types awareness](18-Platform-types-awareness.md)
19. [Type aliases](19-Type-aliases.md)
20. [Star projections awareness](20-Star-projections-awareness.md)

---

# 2. Real-Life Analogy

Null safety is a fence drawn into the type system; Java/platform boundaries can still open a gate in that fence.

---

# 3. Visualization

```text
Value → Nullable/Non-null Type → Smart Cast/Safe Call → Safe Operation
```

---

# 4. Mind Map

```text
Kotlin Type System, Null Safety, Smart Casts & Value Semantics
├── Kotlin Semantics
├── JVM / Platform Internals
├── Coroutines / Runtime
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → Kotlin Guarantee → JVM/Coroutine/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Refactor unsafe Java-style null handling into idiomatic Kotlin and defend every nullability choice.

---

# 8. Google Interview Drill

A Java API returns a platform type and production gets NPE. Explain why and harden the boundary.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Java-like Kotlin instead of Kotlin-native modeling.
- `!!` used instead of proving nullability.
- Read-only treated as deep immutable.
- Global/unstructured coroutines.
- Blocking I/O on wrong dispatcher.
- Overusing scope functions/extensions.
- Ignoring JVM and Java interoperability.

---

# 10. Day-Level Best Practices

- Null-safe by design.
- Final/composition/delegation first.
- Structured concurrency.
- Explicit blocking boundaries.
- Sealed/data/value types where they simplify domain modeling.
- JVM evidence before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does Kotlin guarantee?
3. What is JVM/framework-specific?
4. What production failure could result from misunderstanding this topic?
5. What would you review in AI-generated code?
6. What alternative would be simpler?

---

# 12. Google-Level Follow-Ups

1. What changes at a Java boundary?
2. What changes under concurrency?
3. What happens when the operation blocks?
4. What changes at 10× traffic/data?
5. What would you profile/trace?
6. What would you choose differently in Android vs backend?

---

# 13. Quick Revision

```text
What is it?
Why?
What does Kotlin guarantee?
What is JVM/coroutine/framework specific?
Show code.
What breaks?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed hands-on work.
- [ ] I completed the Google drill.
- [ ] I can distinguish language vs JVM/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
