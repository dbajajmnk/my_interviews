# Day 20 — Testing: Node Test Runner, Jest/Vitest Awareness, Mocks, Integration, Contract & E2E

**Module:** M17 — Testing & Quality Engineering  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [Test strategy](01-Test-strategy.md)
2. [Unit tests](02-Unit-tests.md)
3. [Node built-in test runner awareness](03-Node-built-in-test-runner-awareness.md)
4. [Jest awareness](04-Jest-awareness.md)
5. [Vitest awareness](05-Vitest-awareness.md)
6. [Assertions](06-Assertions.md)
7. [Parameterized/table tests](07-Parameterized-table-tests.md)
8. [Mocks](08-Mocks.md)
9. [Stubs](09-Stubs.md)
10. [Fakes](10-Fakes.md)
11. [Spies](11-Spies.md)
12. [Integration tests](12-Integration-tests.md)
13. [HTTP/API tests](13-HTTP-API-tests.md)
14. [Contract tests](14-Contract-tests.md)
15. [Browser E2E](15-Browser-E2E.md)
16. [Playwright awareness](16-Playwright-awareness.md)
17. [Test isolation](17-Test-isolation.md)
18. [Fake timers awareness](18-Fake-timers-awareness.md)
19. [Coverage limitations](19-Coverage-limitations.md)
20. [Mutation testing awareness](20-Mutation-testing-awareness.md)
21. [Flaky tests](21-Flaky-tests.md)

---

# 2. Real-Life Analogy

Testing is checking a vehicle at component, subsystem, road, and crash-test levels; one test layer cannot prove everything.

---

# 3. Visualization

```text
Unit → Integration → Contract → E2E → Production Signals
```

---

# 4. Mind Map

```text
Testing: Node Test Runner, Jest/Vitest Awareness, Mocks, Integration, Contract & E2E
├── Language / Runtime Semantics
├── Syntax / APIs
├── Internal Working
├── Browser / Node Boundary
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

For broad days, cover P1 topics at awareness depth first. Do not sacrifice P0 correctness for low-value trivia.

---

# 6. Engineering Integration

For today's topics, connect:

> **Concept → ECMAScript Guarantee → Browser/Node/Engine Boundary → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Build unit tests for a domain function, integration test for database/API boundary, and one browser/API E2E happy path plus critical failure path.

---

# 8. Google Interview Drill

A project has 95% coverage but production regressions. Explain weak assertions, over-mocking, missing integration/error/concurrency tests, and false confidence.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Mixing ECMAScript language semantics with browser/Node host APIs.
- Memorizing output without being able to derive it.
- Hiding async behavior or mutation.
- Adding framework/package complexity before the language/runtime model is clear.
- Ignoring failure, security, or production observability.

---

# 10. Day-Level Best Practices

- Explain semantics before framework behavior.
- Use explicit, readable JavaScript.
- Keep async ownership, cancellation, and errors visible.
- Prefer measured evidence over performance folklore.
- Keep security boundaries deterministic.
- Use Evidence First / No Bluff in project discussion.

---

# 11. Interview Questions

1. Explain the three most important concepts from today in 60 seconds each.
2. Show one runnable example and predict its output before executing.
3. What is one production failure caused by misunderstanding today's topic?
4. What is one code-review smell?
5. What is one AI-generated-code risk?
6. What trade-off would make you choose a different design?

---

# 12. Google-Level Follow-Ups

1. What changes in browser vs Node.js?
2. What changes under 10× traffic or data size?
3. What if the operation becomes asynchronous?
4. What if input is attacker-controlled?
5. What would you measure in production?
6. What would you change if the runtime/framework version differs?

---

# 13. Quick Revision

```text
What is it?
Why?
What does ECMAScript guarantee?
What is host/engine specific?
Show code.
What breaks?
How do I debug it?
What do I review?
How do I evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization without notes.
- [ ] I completed the hands-on exercise.
- [ ] I completed the Google drill.
- [ ] I can answer follow-ups without restarting my solution.
- [ ] I can separate ECMAScript vs host/runtime behavior.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topic files.
