# Day 27 — Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability

**Module:** M21 — Architecture & Distributed Systems  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Partial failure](01-Partial-failure.md)
2. [Timeouts](02-Timeouts.md)
3. [CancellationToken across service calls](03-CancellationToken-across-service-calls.md)
4. [Retries](04-Retries.md)
5. [Exponential backoff](05-Exponential-backoff.md)
6. [Jitter](06-Jitter.md)
7. [Retry budgets](07-Retry-budgets.md)
8. [Polly awareness](08-Polly-awareness.md)
9. [Circuit breaker](09-Circuit-breaker.md)
10. [Bulkhead](10-Bulkhead.md)
11. [Rate limiting](11-Rate-limiting.md)
12. [Backpressure](12-Backpressure.md)
13. [Load shedding](13-Load-shedding.md)
14. [Idempotency](14-Idempotency.md)
15. [At-least-once delivery](15-At-least-once-delivery.md)
16. [Exactly-once myth awareness](16-Exactly-once-myth-awareness.md)
17. [Outbox](17-Outbox.md)
18. [Saga](18-Saga.md)
19. [Compensation](19-Compensation.md)
20. [Event ordering](20-Event-ordering.md)
21. [Dead-letter queues](21-Dead-letter-queues.md)
22. [Schema versioning](22-Schema-versioning.md)
23. [Distributed tracing](23-Distributed-tracing.md)
24. [OpenTelemetry awareness](24-OpenTelemetry-awareness.md)
25. [Activity awareness](25-Activity-awareness.md)
26. [Correlation IDs](26-Correlation-IDs.md)
27. [CAP awareness](27-CAP-awareness.md)
28. [Graceful degradation](28-Graceful-degradation.md)

---

# 2. Real-Life Analogy

Day 27 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Cancellation/Timeout → Retry/Breaker → Tx/Outbox → Saga/Compensate → Trace
```

---

# 4. Mind Map

```text
Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability
├── C# Semantics
├── CLR / IL / Runtime
├── Async / Lifetime
├── Framework / Data
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

> **Concept → C# Guarantee → CLR/Framework Boundary → Lifetime/Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Design order-payment-inventory-shipping with retries, outbox, saga, cancellation and tracing.

---

# 8. Google Interview Drill

Payment succeeds but response is lost. Prevent duplicate charge and support reconciliation.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Edge Cases → Complexity/Allocation → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Confusing C# with .NET/CLR.
- Sync-over-async.
- Missing cancellation.
- Resource leaks.
- Wrong DI lifetime.
- Overusing inheritance/patterns.
- Trusting LINQ/EF/runtime behavior without evidence.
- Optimizing without diagnostics.

---

# 10. Day-Level Best Practices

- Nullable enabled.
- Async all the way for I/O.
- CancellationToken propagated.
- Deterministic disposal.
- Constructor injection and correct lifetimes.
- Inspect SQL and traces.
- Measure before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does C# guarantee?
3. What is CLR/framework-specific?
4. What can allocate/block/race/leak?
5. What evidence would you collect?
6. What simpler design could replace the abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when CancellationToken fires?
3. What if the DB/API is saturated?
4. What changes under Native AOT/trimming?
5. What would counters/trace/dump/profile show?
6. What would you choose differently for library vs ASP.NET Core service?

---

# 13. Quick Revision

```text
What is it?
Why?
What does C# guarantee?
What does CLR/framework do?
What allocates?
What can block/race/leak?
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
- [ ] I can distinguish language vs CLR/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
