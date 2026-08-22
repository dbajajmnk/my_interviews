# Day 27 — Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability

**Module:** M21 — Architecture & Distributed Systems  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Partial failure](01-Partial-failure.md)
2. [Timeouts](02-Timeouts.md)
3. [Context deadlines](03-Context-deadlines.md)
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
21. [Distributed tracing](21-Distributed-tracing.md)
22. [OpenTelemetry awareness](22-OpenTelemetry-awareness.md)
23. [Correlation IDs](23-Correlation-IDs.md)
24. [CAP awareness](24-CAP-awareness.md)
25. [Graceful degradation](25-Graceful-degradation.md)
26. [Context cancellation across service calls](26-Context-cancellation-across-service-calls.md)

---

# 2. Real-Life Analogy

Day 27 keeps the GOJ structure familiar while translating it into Go-native simplicity, explicit errors, ownership, concurrency, runtime, and production reasoning.

---

# 3. Visualization

```text
Context/Timeout → Retry/Breaker → Tx/Outbox → Saga/Compensate → Trace
```

---

# 4. Mind Map

```text
Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability
├── Language Semantics
├── Toolchain / Runtime
├── Ownership / Resources
├── Concurrency
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
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

> **Concept → Go Guarantee → Runtime/OS Boundary → Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Design order-payment-inventory-shipping with retries, outbox, saga and tracing.

---

# 8. Google Interview Drill

Payment succeeds but response is lost. Prevent duplicate payment and support reconciliation.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Race/Profile if Needed → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Ignoring errors.
- Over-abstracting with interfaces/patterns.
- Leaking goroutines/resources.
- Using unbounded concurrency.
- Misunderstanding slice/interface nil semantics.
- Treating race-free as automatically deadlock/leak-free.
- Optimizing without pprof/trace/benchmark evidence.

---

# 10. Day-Level Best Practices

- Standard library first.
- Small consumer-owned interfaces.
- Explicit errors and context.
- Bounded concurrency.
- Clear ownership and cleanup.
- Measure runtime behavior.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the Go spec guarantee?
3. What is runtime/compiler implementation detail?
4. What can leak, block, or race?
5. What evidence would you collect?
6. What simpler design could replace this abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when the client cancels?
3. What if the downstream DB/API is saturated?
4. What if this function receives a typed-nil interface?
5. What would pprof/trace/-race show?
6. What would you change for a library vs a service?

---

# 13. Quick Revision

```text
What is it?
Why?
Who owns the resource?
What can be nil?
What can block/race/leak?
What does the runtime do?
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
- [ ] I can explain ownership/cancellation/resource behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
