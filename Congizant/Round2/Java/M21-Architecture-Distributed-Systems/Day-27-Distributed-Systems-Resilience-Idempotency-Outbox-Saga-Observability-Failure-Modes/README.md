# Day 27 — Distributed Systems: Resilience, Idempotency, Outbox/Saga, Observability & Failure Modes

**Module:** M21 — Architecture & Distributed Systems  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [timeouts](01-timeouts.md)
2. [retries](02-retries.md)
3. [circuit breaker](03-circuit-breaker.md)
4. [bulkhead](04-bulkhead.md)
5. [backpressure](05-backpressure.md)
6. [idempotency](06-idempotency.md)
7. [outbox](07-outbox.md)
8. [saga](08-saga.md)
9. [CAP awareness](09-CAP-awareness.md)
10. [replication](10-replication.md)
11. [partition](11-partition.md)
12. [tracing](12-tracing.md)
13. [failure scenarios](13-failure-scenarios.md)

---

# 2. Real-Life Analogy

A distributed transaction is like coordinating several independent shops: if one step fails, you may need a planned refund/undo rather than pretending there was one shared cash register.

---

# 3. Visualization

```text
Request → Local Tx → Event/Outbox → Consumer Tx → Failure? → Retry/Compensate/Reconcile
```

---

# 4. Mind Map

```text
Distributed Systems: Resilience, Idempotency, Outbox/Saga, Observability & Failure Modes
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

Design order → payment → inventory → shipping flow. Mark transactional boundaries, events, idempotency keys, compensation, retry owner, and observability.

---

# 8. Google Interview Drill

Payment succeeds but response is lost. The client retries. Prevent duplicate charge using idempotency + persisted operation state, and explain reconciliation.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Retry all failures
- Exactly-once claimed casually
- Global transaction across services
- Unbounded queues
- No correlation IDs

---

# 10. Day-Level Best Practices

- Bound remote calls
- Design duplicate-safe effects
- Use local transactions + events
- Trace critical paths
- Plan compensation/failure recovery

---

# 11. Interview Questions

1. Circuit breaker?
2. Bulkhead?
3. Backpressure?
4. Outbox?
5. Saga?
6. CAP?
7. Idempotency?
8. Exactly-once meaning?

---

# 12. Google-Level Follow-Ups

1. Network partition?
2. Event ordering?
3. Poison message?
4. Multi-region consistency?
5. How would you test resilience?

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
