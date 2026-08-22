# Day 27 — Distributed Systems: Timeouts, Retries, Sagas & Observability

**Module:** M21 — Architecture & Distributed Systems  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Partial failure](01-Partial-failure.md)
2. [Timeouts](02-Timeouts.md)
3. [Deadlines](03-Deadlines.md)
4. [Retries](04-Retries.md)
5. [Exponential backoff](05-Exponential-backoff.md)
6. [Jitter](06-Jitter.md)
7. [Retry budgets](07-Retry-budgets.md)
8. [Circuit breaker awareness](08-Circuit-breaker-awareness.md)
9. [Bulkhead awareness](09-Bulkhead-awareness.md)
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
22. [OpenTelemetry C awareness](22-OpenTelemetry-C-awareness.md)
23. [Correlation IDs](23-Correlation-IDs.md)
24. [CAP awareness](24-CAP-awareness.md)
25. [Graceful degradation](25-Graceful-degradation.md)
26. [Cancellation propagation awareness](26-Cancellation-propagation-awareness.md)

# 2. Real-Life Analogy

Day 27 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
Timeout/Retry → Idempotency → Outbox/Saga → Observe
```

# 4. Mind Map

```text
Distributed Systems: Timeouts, Retries, Sagas & Observability
├── C Semantics
├── Bounds / Integers / Pointers
├── Ownership / Storage Duration
├── Toolchain / OS
├── Concurrency
├── Failure / UB
├── Debugging / Security
└── Interview Defense
```

# 5. Two-Hour Execution Plan

```text
00–15  Rapid recall
15–55  P0 topics
55–85  Hands-on/debugging
85–105 Google drill
105–115 Follow-ups
115–120 Readiness gate
```

# 6. Engineering Integration

> **Concept → C Guarantee → Bounds/Ownership → Compiler/OS Boundary → Failure/UB → Evidence → Review Rule → Trade-Off**

# 7. Hands-On Integration

Design order/payment/inventory/shipping with retries, outbox and saga.

# 8. Google Interview Drill

Prevent duplicate payment after lost response.

# 9. Day-Level Common Mistakes

- Pointer/array confusion.
- Missing bounds and cleanup.
- Signed/unsigned mistakes.
- UB and volatile misuse.
- Unsafe string handling.
- Optimizing without evidence.

# 10. Day-Level Best Practices

Explicit sizes, ownership, strong warnings, structured cleanup, sanitizers/fuzzing, correct synchronization, portable representations, Evidence First / No Bluff.

# 11. Interview Questions

Explain three key topics, one failure, one debugging artifact, one production use, and one safer alternative.

# 12. Google-Level Follow-Ups

What changes on another compiler/architecture, under concurrency, for untrusted input, under optimization, or if a safer language is allowed?

# 13. Quick Revision

```text
What is it?
What is the type/size?
Who owns it?
What is the lifetime/capacity?
What can be NULL/overflow/out-of-bounds?
How is cleanup guaranteed?
What tool proves failure?
```

# 14. Day Readiness Gate

- [ ] Every P0 topic READY.
- [ ] Hands-on complete.
- [ ] Drill complete.
- [ ] Bounds/ownership/lifetime explainable.
- [ ] Two follow-up changes survivable.
- [ ] No invented evidence.

**DAY READY:** 80%+ and no P0 failure.
