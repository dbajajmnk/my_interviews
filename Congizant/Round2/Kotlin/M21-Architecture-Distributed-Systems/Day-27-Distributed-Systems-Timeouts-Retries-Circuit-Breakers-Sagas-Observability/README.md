# Day 27 — Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability

**Module:** M21 — Architecture & Distributed Systems  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

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
12. [At-least-once delivery](12-At-least-once-delivery.md)
13. [Exactly-once myth awareness](13-Exactly-once-myth-awareness.md)
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
24. [Coroutine cancellation across calls](24-Coroutine-cancellation-across-calls.md)

---

# 2. Real-Life Analogy

Day 27 keeps the GOJ structure familiar while translating it into Kotlin-native language, JVM, coroutine, and backend engineering decisions.

---

# 3. Visualization

```text
Remote call → timeout/retry/breaker → tx/outbox → saga/compensation → trace
```

---

# 4. Mind Map

```text
Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability
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

Design order-payment-inventory-shipping workflow with retries, outbox, saga and observability.

---

# 8. Google Interview Drill

Prevent duplicate payment when response is lost and client retries.

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
