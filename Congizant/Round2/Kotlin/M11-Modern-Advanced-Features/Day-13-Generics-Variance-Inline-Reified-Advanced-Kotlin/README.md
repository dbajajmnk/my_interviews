# Day 13 — Generics, Variance, Inline/Reified & Advanced Kotlin

**Module:** M11 — Modern & Advanced Features  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [Generic classes](01-Generic-classes.md)
2. [Generic functions](02-Generic-functions.md)
3. [Type parameter constraints](03-Type-parameter-constraints.md)
4. [where clauses](04-where-clauses.md)
5. [Declaration-site variance](05-Declaration-site-variance.md)
6. [out](06-out.md)
7. [in](07-in.md)
8. [Use-site projections](08-Use-site-projections.md)
9. [Star projections](09-Star-projections.md)
10. [Type erasure on JVM](10-Type-erasure-on-JVM.md)
11. [Inline functions](11-Inline-functions.md)
12. [noinline](12-noinline.md)
13. [crossinline](13-crossinline.md)
14. [Reified type parameters](14-Reified-type-parameters.md)
15. [Contracts awareness](15-Contracts-awareness.md)
16. [Delegated properties](16-Delegated-properties.md)
17. [lazy](17-lazy.md)
18. [observable awareness](18-observable-awareness.md)
19. [Operator overloading](19-Operator-overloading.md)
20. [Infix functions](20-Infix-functions.md)
21. [DSL design awareness](21-DSL-design-awareness.md)
22. [Value classes](22-Value-classes.md)
23. [Sealed exhaustive when](23-Sealed-exhaustive-when.md)

---

# 2. Real-Life Analogy

Day 13 keeps the GOJ structure familiar while translating it into Kotlin-native language, JVM, coroutine, and backend engineering decisions.

---

# 3. Visualization

```text
Generic API → variance/inline/reified → bytecode/runtime boundary
```

---

# 4. Mind Map

```text
Generics, Variance, Inline/Reified & Advanced Kotlin
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

Build producer/consumer generic APIs, a reified helper, and delegated properties.

---

# 8. Google Interview Drill

Explain Kotlin variance and when star projections are safer than casts.

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
