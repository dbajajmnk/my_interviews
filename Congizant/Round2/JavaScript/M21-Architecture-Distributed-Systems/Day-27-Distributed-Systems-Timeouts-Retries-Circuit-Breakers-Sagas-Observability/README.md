# Day 27 — Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability

**Module:** M21 — Architecture & Distributed Systems  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [Partial failure](01-Partial-failure.md)
2. [Timeouts](02-Timeouts.md)
3. [Retry](03-Retry.md)
4. [Exponential backoff](04-Exponential-backoff.md)
5. [Jitter](05-Jitter.md)
6. [Retry budgets](06-Retry-budgets.md)
7. [Circuit breaker](07-Circuit-breaker.md)
8. [Bulkhead](08-Bulkhead.md)
9. [Backpressure](09-Backpressure.md)
10. [Load shedding](10-Load-shedding.md)
11. [Idempotency](11-Idempotency.md)
12. [Exactly-once myth awareness](12-Exactly-once-myth-awareness.md)
13. [At-least-once delivery](13-At-least-once-delivery.md)
14. [Outbox](14-Outbox.md)
15. [Saga](15-Saga.md)
16. [Compensation](16-Compensation.md)
17. [Event ordering](17-Event-ordering.md)
18. [Dead-letter queues](18-Dead-letter-queues.md)
19. [Schema versioning](19-Schema-versioning.md)
20. [Distributed tracing](20-Distributed-tracing.md)
21. [Correlation IDs](21-Correlation-IDs.md)
22. [CAP awareness](22-CAP-awareness.md)
23. [Graceful degradation](23-Graceful-degradation.md)

---

# 2. Real-Life Analogy

Distributed systems are independent shops coordinating a customer journey; failures require bounded waits, duplicate-safe actions, and planned compensation.

---

# 3. Visualization

```text
Remote Call → Timeout/Retry/Breaker → Local Tx/Outbox → Consumer/Saga → Observe
```

---

# 4. Mind Map

```text
Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability
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

Design order → payment → inventory → shipping workflow with local transactions, events, retries, compensation, and observability.

---

# 8. Google Interview Drill

Payment succeeds but response is lost; the client retries. Prevent duplicate payment and explain idempotency, persisted operation state, and reconciliation.

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
