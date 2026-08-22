# Day 18 — Code Review, Refactoring & Idiomatic Kotlin

**Module:** M15 — Code Review & Refactoring Mastery  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [Risk-first code review](01-Risk-first-code-review.md)
2. [Correctness](02-Correctness.md)
3. [Null-safety review](03-Null-safety-review.md)
4. [Coroutine correctness](04-Coroutine-correctness.md)
5. [Shared-state review](05-Shared-state-review.md)
6. [Mutation review](06-Mutation-review.md)
7. [API contracts](07-API-contracts.md)
8. [Code smells](08-Code-smells.md)
9. [God objects](09-God-objects.md)
10. [Overuse of scope functions](10-Overuse-of-scope-functions.md)
11. [Extension abuse](11-Extension-abuse.md)
12. [Inheritance abuse](12-Inheritance-abuse.md)
13. [runCatching abuse](13-runCatching-abuse.md)
14. [Refactoring](14-Refactoring.md)
15. [Characterization tests](15-Characterization-tests.md)
16. [Naming](16-Naming.md)
17. [Module boundaries](17-Module-boundaries.md)
18. [Dependency direction](18-Dependency-direction.md)
19. [Backward compatibility](19-Backward-compatibility.md)
20. [Technical debt prioritization](20-Technical-debt-prioritization.md)
21. [Java-like Kotlin smell](21-Java-like-Kotlin-smell.md)

---

# 2. Real-Life Analogy

Day 18 keeps the GOJ structure familiar while translating it into Kotlin-native language, JVM, coroutine, and backend engineering decisions.

---

# 3. Visualization

```text
Requirement → correctness → null/coroutine/data/security → tests → maintainability
```

---

# 4. Mind Map

```text
Code Review, Refactoring & Idiomatic Kotlin
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

Review a flawed Kotlin service containing !!, GlobalScope, blocking calls and inheritance-heavy design.

---

# 8. Google Interview Drill

Rank blockers vs suggestions in a timed PR review.

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
