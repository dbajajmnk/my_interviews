# ARCH-01 / File 04 — APIs, Messaging, Events & Asynchronous Workflows

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** M19 + M21

---

# 1. Objective

Master:

- synchronous vs asynchronous communication;
- REST/gRPC awareness;
- queues;
- events;
- pub/sub;
- delivery semantics;
- idempotency;
- ordering;
- retry;
- dead-letter queues;
- outbox;
- saga/compensation awareness.

---

# 2. 5W+H

## What?

Distributed components communicate synchronously through request/response or asynchronously through messages/events.

## Why?

Communication style affects latency, coupling, resilience, consistency, and scalability.

## Where?

Microservices, modular systems, background processing, event-driven architecture.

## When?

Choose based on business workflow.

## How?

Use synchronous calls for immediate response dependencies; async messaging for decoupled/long-running/retryable work.

---

# 3. Real-Life Analogy

Phone call:

> synchronous — both parties wait.

Email:

> asynchronous — sender continues; receiver handles later.

Both are useful.

---

# 4. Visualization

## Sync

```text
Service A
   ↓ request
Service B
   ↓ response
Service A continues
```

## Async

```text
Service A
  ↓
Queue / Broker
  ↓
Service B
```

---

# 5. Mind Map

```text
Integration
│
├── REST
├── RPC
├── Queue
├── Event
├── Pub/Sub
├── Idempotency
├── Retry
├── DLQ
├── Outbox
└── Saga
```

---

# 6. Core Concepts

## 6.1 Synchronous Call

Best when caller needs immediate result.

Costs:

- caller waits;
- dependency failure affects request;
- cascading latency possible.

---

## 6.2 Queue

One or more workers consume jobs.

Good for:

- long work;
- burst smoothing;
- retries;
- background processing.

---

## 6.3 Event

Represents fact:

```text
OrderCreated
PaymentCompleted
DocumentIndexed
```

Consumers react independently.

Producer should not need to know every consumer.

---

## 6.4 Command vs Event

Command:

> Please do X.

Event:

> X happened.

Keep semantics clear.

---

## 6.5 Delivery Semantics

Common concepts:

- at-most-once;
- at-least-once;
- exactly-once claims.

In practice:

> design consumers idempotently because duplicates can happen in many real systems.

---

## 6.6 Idempotent Consumer

Message ID/business key allows duplicate detection.

Example:

```text
PaymentCompleted(payment_id=123)
```

Consumer records processed event/uses unique constraint.

---

## 6.7 Ordering

Global ordering is expensive.

Ask:

> Do we need ordering for all messages or only per entity/key?

Partition by order/account ID can preserve local ordering in some systems.

---

## 6.8 Retry

Use bounded retry with backoff.

Poison message should not block queue forever.

---

## 6.9 Dead-Letter Queue

Messages that repeatedly fail can move to DLQ for investigation/replay.

DLQ is not a graveyard.

Need alerting/ownership.

---

## 6.10 Outbox Pattern

Problem:

```text
DB commit succeeds
event publish fails
```

Outbox:

```text
same DB transaction:
business row + outbox row
```

Separate publisher sends outbox reliably.

---

## 6.11 Saga / Compensation

For distributed multi-step business process:

```text
reserve inventory
charge payment
create shipment
```

No single DB transaction across services.

Use orchestrated/choreographed compensation where required.

Do not use saga for trivial local transaction.

---

# 7. Engineering Depth

## 7.1 Async Does Not Mean Faster User Result

It improves decoupling/capacity, but introduces:

- eventual completion;
- status tracking;
- duplicate handling;
- operational complexity.

---

## 7.2 Event Schema Versioning

Events are contracts.

Need compatibility strategy:

- additive fields;
- version;
- schema registry/governance depending platform.

---

# 8. Implementation / Design

Order flow:

```text
POST /orders
   ↓
Order DB transaction
   ├── order row
   └── outbox row
        ↓
Publisher
        ↓
OrderCreated
        ├── email
        ├── analytics
        └── fulfillment
```

---

# 9. Hands-On Practice

Choose sync/async for:

1. login credential validation → sync.
2. send welcome email → async.
3. generate 5-minute report → async job.
4. check payment authorization needed before checkout confirmation → often sync or controlled workflow.
5. analytics update → async.

---

# 10. Google Interview Drill

## Problem — Order Created but Email Sometimes Missing

Current:

```text
DB save order
then call email service
```

If email call fails after commit, order exists without email.

### Clarify

- email critical?
- retry?
- duplicate email acceptable?
- user response dependent?

### Improve

```text
Order transaction
→ outbox event
→ message broker
→ email consumer
```

Email consumer idempotent.

### Failure

- broker down;
- email provider down;
- duplicate message;
- poison message.

### Controls

- outbox retry;
- consumer retry;
- DLQ;
- monitoring.

---

# 11. Common Mistakes

1. Async everywhere.
2. Event/command confused.
3. Exactly-once assumed magically.
4. Consumer not idempotent.
5. Global ordering demanded unnecessarily.
6. DLQ ignored.
7. DB + publish dual-write problem ignored.
8. Saga used for local transaction.

---

# 12. Best Practices

- sync for immediate dependency;
- async for decoupling/long work;
- idempotent consumers;
- bounded retry;
- monitor DLQ;
- use outbox for DB/event consistency;
- define ordering scope;
- version contracts.

---

# 13. Interview Questions

1. Sync vs async?
2. Queue vs pub/sub?
3. Command vs event?
4. At-least-once?
5. Idempotency?
6. Ordering?
7. DLQ?
8. Outbox?
9. Saga?
10. Why not async everything?

---

# 14. Google-Level Follow-Ups

1. broker unavailable?
2. duplicate email?
3. replay DLQ?
4. event version change?
5. 1M backlog?
6. consumer slow?
7. exactly-once business effect?
8. cross-region event ordering?

---

# 15. Quick Revision

```text
Sync = caller waits
Async = decouple/background
Command asks
Event states fact
Duplicates happen → idempotency
Retry bounded
DLQ needs ownership
Outbox solves DB + publish gap
Saga handles distributed compensation
```

---

# 16. Readiness Gate

- [ ] Sync/async.
- [ ] Queue/event.
- [ ] Delivery/idempotency.
- [ ] Ordering.
- [ ] Retry/DLQ.
- [ ] Outbox.
- [ ] Saga.
- [ ] Missing-email drill.

**Gate:** READY / REPAIR

---

# 17. References

- Messaging/event-driven architecture references
