# Day 20 — Testing: JUnit, Mockito, Integration, Contract, Testcontainers & Quality Strategy

**Module:** M17 — Testing & Quality Engineering  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [test pyramid](01-test-pyramid.md)
2. [JUnit 5](02-JUnit-5.md)
3. [assertions](03-assertions.md)
4. [parameterized tests](04-parameterized-tests.md)
5. [Mockito](05-Mockito.md)
6. [fakes vs mocks](06-fakes-vs-mocks.md)
7. [integration tests](07-integration-tests.md)
8. [Testcontainers awareness](08-Testcontainers-awareness.md)
9. [contract tests](09-contract-tests.md)
10. [E2E](10-E2E.md)
11. [coverage limits](11-coverage-limits.md)
12. [mutation testing awareness](12-mutation-testing-awareness.md)

---

# 2. Real-Life Analogy

Testing is like inspecting a car at component, subsystem, road, and crash-test levels; one kind of test cannot prove everything.

---

# 3. Visualization

```text
Unit (many) → Integration → Contract → E2E (few) → Production Signals
```

---

# 4. Mind Map

```text
Testing: JUnit, Mockito, Integration, Contract, Testcontainers & Quality Strategy
├── Topic Units
├── Java Semantics
├── Runtime / Internal Working
├── Implementation
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

Use the 2-hour boundary strictly:

```text
00–15 min  Rapid topic recall / skim
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, P1 subtopics receive awareness depth first. Do not sacrifice P0 correctness to memorize low-value trivia.

---

# 6. Engineering Integration

For the whole day, be able to connect:

> **Concept → Java Guarantee → JVM/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Create unit tests for domain service, repository integration test, REST contract test, and one critical E2E flow. Explain what not to mock.

---

# 8. Google Interview Drill

A suite has 95% coverage but production regressions continue. Diagnose weak assertions, missing boundary/concurrency/error tests, over-mocking, and lack of integration tests.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Mocking value objects
- Testing private methods directly
- 100% coverage target as quality
- Flaky sleeps
- E2E for everything

---

# 10. Day-Level Best Practices

- Test behavior
- Use realistic boundaries
- Keep tests deterministic
- Add regression for defects
- Use Testcontainers/real dependencies where semantics matter

---

# 11. Interview Questions

1. JUnit lifecycle?
2. Mockito use?
3. Mock vs fake?
4. Unit vs integration?
5. Contract test?
6. Coverage limitations?
7. Testcontainers?

---

# 12. Google-Level Follow-Ups

1. How test concurrency?
2. How test time?
3. Mutation testing?
4. How test retries/idempotency?
5. How speed up CI?

---

# 13. Quick Revision

```text
What is it?
Why use it?
What does Java guarantee?
How does it work internally?
Show code.
What breaks?
How do you debug it?
What do you review?
How would you evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can draw/explain today's visualization without notes.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can answer the interview questions with concise senior-level reasoning.
- [ ] I can survive at least two follow-up changes.
- [ ] I did not invent project experience or metrics.

**DAY READY:** 80%+ and no P0 topic failure.  
**DAY REPAIR:** Reopen only failed topic files.
