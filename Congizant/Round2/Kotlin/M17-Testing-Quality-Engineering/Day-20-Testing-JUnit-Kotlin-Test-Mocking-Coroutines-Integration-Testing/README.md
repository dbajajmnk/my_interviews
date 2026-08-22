# Day 20 — Testing: JUnit, Kotlin Test, Mocking, Coroutines & Integration Testing

**Module:** M17 — Testing & Quality Engineering  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [kotlin.test awareness](01-kotlin-test-awareness.md)
2. [JUnit 5](02-JUnit-5.md)
3. [Assertions](03-Assertions.md)
4. [Parameterized tests](04-Parameterized-tests.md)
5. [Test fixtures](05-Test-fixtures.md)
6. [Mocks](06-Mocks.md)
7. [Fakes](07-Fakes.md)
8. [Stubs](08-Stubs.md)
9. [MockK awareness](09-MockK-awareness.md)
10. [Mockito-Kotlin awareness](10-Mockito-Kotlin-awareness.md)
11. [Coroutine testing](11-Coroutine-testing.md)
12. [runTest awareness](12-runTest-awareness.md)
13. [Virtual time awareness](13-Virtual-time-awareness.md)
14. [Flow testing awareness](14-Flow-testing-awareness.md)
15. [Integration tests](15-Integration-tests.md)
16. [Database tests](16-Database-tests.md)
17. [HTTP/API tests](17-HTTP-API-tests.md)
18. [Contract tests](18-Contract-tests.md)
19. [Testcontainers awareness](19-Testcontainers-awareness.md)
20. [Coverage limitations](20-Coverage-limitations.md)
21. [Mutation testing awareness](21-Mutation-testing-awareness.md)
22. [Flaky tests](22-Flaky-tests.md)

---

# 2. Real-Life Analogy

Day 20 keeps the GOJ structure familiar while translating it into Kotlin-native language, JVM, coroutine, and backend engineering decisions.

---

# 3. Visualization

```text
Unit → coroutine tests → integration → contract → production signals
```

---

# 4. Mind Map

```text
Testing: JUnit, Kotlin Test, Mocking, Coroutines & Integration Testing
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

Build unit, coroutine, integration and contract tests for a small service.

---

# 8. Google Interview Drill

Explain why 95% coverage can still miss coroutine timing and integration failures.

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
