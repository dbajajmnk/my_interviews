# Day 19 — AI-Generated Kotlin Code Evaluation & Safe Engineering Use

**Module:** M16 — AI-Generated Code Evaluation  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [AI code as untrusted proposal](01-AI-code-as-untrusted-proposal.md)
2. [Hallucinated APIs](02-Hallucinated-APIs.md)
3. [Hallucinated Gradle dependencies](03-Hallucinated-Gradle-dependencies.md)
4. [Wrong coroutine context](04-Wrong-coroutine-context.md)
5. [GlobalScope misuse](05-GlobalScope-misuse.md)
6. [Unsafe !!](06-Unsafe.md)
7. [Platform type misuse](07-Platform-type-misuse.md)
8. [Blocking in coroutines](08-Blocking-in-coroutines.md)
9. [Flow misuse](09-Flow-misuse.md)
10. [Sealed hierarchy mistakes](10-Sealed-hierarchy-mistakes.md)
11. [Java interop mistakes](11-Java-interop-mistakes.md)
12. [Serialization mistakes](12-Serialization-mistakes.md)
13. [Security review](13-Security-review.md)
14. [Generated tests](14-Generated-tests.md)
15. [Generated SQL](15-Generated-SQL.md)
16. [Performance review](16-Performance-review.md)
17. [Human approval](17-Human-approval.md)
18. [Accept repair reject rubric](18-Accept-repair-reject-rubric.md)

---

# 2. Real-Life Analogy

Day 19 keeps the GOJ structure familiar while translating it into Kotlin-native language, JVM, coroutine, and backend engineering decisions.

---

# 3. Visualization

```text
AI proposal → compile/deps → coroutine/runtime review → tests → verdict
```

---

# 4. Mind Map

```text
AI-Generated Kotlin Code Evaluation & Safe Engineering Use
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

Evaluate AI-generated snippets for coroutines, Flow, Ktor/Spring routes, serialization and SQL access.

---

# 8. Google Interview Drill

Reject AI code that compiles but violates structured concurrency or runtime safety.

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
