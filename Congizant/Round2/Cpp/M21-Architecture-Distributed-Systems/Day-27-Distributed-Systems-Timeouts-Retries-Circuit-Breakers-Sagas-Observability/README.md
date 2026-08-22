# Day 27 — Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability

**Module:** M21 — Architecture & Distributed Systems  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Partial failure](01-Partial-failure.md)
2. [Timeouts](02-Timeouts.md)
3. [Deadlines](03-Deadlines.md)
4. [Retries](04-Retries.md)
5. [Exponential backoff](05-Exponential-backoff.md)
6. [Jitter](06-Jitter.md)
7. [Retry budgets](07-Retry-budgets.md)
8. [Circuit breaker](08-Circuit-breaker.md)
9. [Bulkhead](09-Bulkhead.md)
10. [Backpressure](10-Backpressure.md)
11. [Load shedding](11-Load-shedding.md)
12. [Idempotency](12-Idempotency.md)
13. [At-least-once delivery](13-At-least-once-delivery.md)
14. [Exactly-once myth awareness](14-Exactly-once-myth-awareness.md)
15. [Outbox](15-Outbox.md)
16. [Saga](16-Saga.md)
17. [Compensation](17-Compensation.md)
18. [Event ordering](18-Event-ordering.md)
19. [Dead-letter queues](19-Dead-letter-queues.md)
20. [Schema versioning](20-Schema-versioning.md)
21. [Distributed tracing awareness](21-Distributed-tracing-awareness.md)
22. [OpenTelemetry C++ awareness](22-OpenTelemetry-C-awareness.md)
23. [Correlation IDs](23-Correlation-IDs.md)
24. [CAP awareness](24-CAP-awareness.md)
25. [Graceful degradation](25-Graceful-degradation.md)
26. [Cancellation propagation awareness](26-Cancellation-propagation-awareness.md)

---

# 2. Real-Life Analogy

Day 27 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Timeout/Retry → Breaker → Tx/Outbox → Saga/Compensate → Trace
```

---

# 4. Mind Map

```text
Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability
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

Design order-payment-inventory-shipping with retries, idempotency, outbox, saga and observability.

---

# 8. Google Interview Drill

Payment succeeds but response is lost. Prevent duplicate charge and support reconciliation.

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
