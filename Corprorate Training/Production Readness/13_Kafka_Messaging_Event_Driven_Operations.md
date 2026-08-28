# iRun Corporate Training Interview Preparation
## Module 13 — Kafka, Messaging & Event-Driven Operations

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P1 — Strong Working Readiness  
**Primary Goal:** Demonstrate production-level understanding of Kafka and messaging systems, including producers, consumers, partitions, offsets, consumer groups, lag, retries, duplicate processing, poison messages, DLQ patterns, ordering, delivery semantics, and evidence-driven troubleshooting.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain event-driven architecture in simple and engineering terms.
- Explain Kafka topics, partitions, producers, consumers, offsets, and consumer groups.
- Distinguish queue-style messaging from event streaming.
- Troubleshoot consumer lag and stalled consumers.
- Explain ordering and partition-key implications.
- Explain at-most-once, at-least-once, and exactly-once concepts responsibly.
- Diagnose duplicate and missing-message scenarios.
- Explain retries, poison messages, DLQ/DLT patterns, and replay.
- Explain idempotent consumers.
- Correlate messaging incidents with logs, metrics, traces, and business impact.
- Design practical messaging labs for corporate learners.
- Survive scenario-based follow-up questions.

The panel should think:

> **“He understands messaging as a production reliability problem, not merely producer/consumer API usage.”**

---

# 2. Event-Driven Mental Model

```text
PRODUCER
   |
   v
 EVENT / MESSAGE
   |
   v
+------------------------+
| TOPIC / BROKER         |
| P0 | P1 | P2 | ...     |
+------------------------+
   |          |
   v          v
CONSUMER   CONSUMER
 GROUP A    GROUP B
   |
   v
PROCESSING
   |
 DB / API / CACHE
   |
ACK / OFFSET / CHECKPOINT
```

For incidents, ask:

**Was it produced? → Was it stored? → Was it assigned? → Was it consumed? → Was it processed? → Was progress committed?**

---

# 3. Queue vs Event Streaming

## Queue-Oriented Messaging

Often used for work distribution.

A message is typically processed by one consumer from a competing-consumer group.

## Event Streaming

Events are retained as an ordered log for a configured period and multiple independent consumer groups may process the same event stream.

### Interview-safe answer

> “Queues and event streams overlap in use cases, but Kafka is fundamentally a distributed event log. Consumers track their position through offsets, which makes replay and multiple independent consumption patterns possible.”

---

# 4. Kafka Topic

A **topic** is a named stream/category of records.

Example:

```text
orders
payments
customer-events
```

A topic can have multiple partitions.

---

# 5. Partition

A partition is an ordered sequence of records.

Why partitions matter:

- Scalability
- Parallelism
- Ordering
- Consumer assignment

Important:

> Ordering is guaranteed within a partition, not automatically across an entire multi-partition topic.

---

# 6. Producer

A producer publishes records to Kafka.

Important operational concerns:

- Broker connectivity
- Serialization
- acknowledgements
- retries
- partition selection
- delivery errors
- throughput

---

# 7. Consumer

A consumer reads records from partitions.

Operational concerns:

- Assignment
- processing time
- offset progress
- errors
- dependency latency
- consumer health
- lag

---

# 8. Consumer Group

Consumers sharing the same group ID cooperate to process partitions.

Conceptually:

```text
Topic: 4 Partitions

Consumer Group A
 C1 -> P0, P1
 C2 -> P2, P3
```

A partition is normally assigned to only one consumer within a group at a time.

---

# 9. Consumer Scaling

If a topic has four partitions:

- 1 consumer → handles all four
- 2 consumers → partitions distributed
- 4 consumers → up to one per partition
- 6 consumers → some consumers idle

Therefore:

> Adding consumers beyond partition count does not increase partition-level parallelism for that consumer group.

---

# 10. Offset

An offset represents a consumer's position in a partition.

It helps answer:

> “How far has this consumer group progressed?”

Offsets enable:

- Restart/resume
- Lag calculation
- Replay/reset patterns

---

# 11. Consumer Lag

Conceptually:

```text
Latest Broker Offset - Consumer Progress = Lag
```

Lag means the consumer is behind the produced stream.

Lag is a **symptom**, not automatically the root cause.

---

# 12. Strong Answer — “Consumer Lag Is Increasing. What Do You Check?”

> “I compare producer rate with consumer processing rate and identify whether the issue affects all partitions or only some. Then I inspect consumer health, rebalances, processing latency, downstream dependencies, error/retry behavior, partition distribution, CPU and memory. If processing capacity is genuinely insufficient, I consider scaling, but only within the available partition parallelism.”

---

# 13. Causes of Consumer Lag

Possible causes:

- Increased producer rate
- Slow consumer logic
- Slow DB/API
- Consumer crash
- Repeated retries
- Poison message
- insufficient partitions
- CPU/memory pressure
- frequent rebalances
- network/broker issue

Do not solve every lag problem by adding consumers.

---

# 14. Partition Key

A producer can use a key to influence partition selection.

Example:

```text
key = customerId
```

Records with the same key generally go to the same partition under a stable partitioning strategy.

Useful when ordering by entity matters.

---

# 15. Ordering

Kafka preserves record order **within a partition**.

If business logic requires all events for one order/customer to stay ordered, partitioning strategy must reflect that requirement.

---

# 16. Hot Partition

A hot partition receives disproportionately high traffic.

Symptoms:

- One consumer overloaded
- lag concentrated on one partition
- uneven throughput

Possible cause:

- poor key distribution
- one high-volume key

Scaling consumers alone may not solve it.

---

# 17. Rebalancing

Consumer-group membership or partition changes may trigger reassignment.

Potential causes:

- Consumer joins/leaves
- crash/restart
- subscription/partition changes
- consumer considered unhealthy

Frequent rebalances can hurt throughput and stability.

---

# 18. Delivery Semantics

## At-Most-Once

Possible message loss, but avoids repeated delivery.

## At-Least-Once

Message should not be lost under normal guarantees, but duplicates can occur.

## Exactly-Once

A stronger processing guarantee that depends on precise system boundaries and implementation.

### Senior interview rule

Do **not** casually claim “Kafka guarantees exactly-once everywhere.”

Exactly-once business effects across databases/APIs require end-to-end design.

---

# 19. Duplicate Processing

Duplicates may occur because:

- Consumer processed but failed before progress commit
- Retry/redelivery
- producer retry
- replay
- application failure

Mitigation:

- Idempotent consumer
- business key
- deduplication
- transaction/outbox patterns where appropriate

---

# 20. Idempotent Consumer

Processing the same logical event more than once should not create duplicate business effects.

Example:

```text
eventId = ORD-123-PAYMENT-CAPTURED
```

Before applying the side effect, verify whether this event has already been handled.

---

# 21. Poison Message

A message consistently fails processing because of:

- Invalid schema
- corrupt data
- unsupported value
- application bug
- incompatible version

Without controls, it can create repeated failure and block useful progress.

---

# 22. Retry Pattern

A good retry policy considers:

- Which errors are transient?
- How many attempts?
- Delay/backoff?
- Does ordering matter?
- Can duplicate effects occur?
- What happens after exhaustion?

Avoid infinite retry loops.

---

# 23. Dead-Letter Topic / Queue

After controlled retry exhaustion, problematic messages may be moved to a DLT/DLQ pattern.

Purpose:

- Isolate failures
- Preserve evidence
- Allow main processing to continue when business rules permit
- Enable investigation/replay

A DLT is not a garbage bin.

---

# 24. Replay

Kafka retention allows consumers to reprocess historical events by changing/resetting their consumption position where operationally supported.

Before replay:

- Define range
- Verify idempotency
- Understand side effects
- Protect downstream capacity
- Track replay separately
- Reconcile results

---

# 25. Missing Message Investigation

Do not immediately say “Kafka lost it.”

Trace:

1. Did producer create the event?
2. Did send succeed?
3. Correct topic?
4. Correct environment?
5. Serialization failure?
6. Broker acknowledged?
7. Correct consumer group?
8. Offset already advanced?
9. Consumer filtered/skipped it?
10. Processing failed after consumption?
11. Retention expired?

---

# 26. Producer Failure

Possible causes:

- Broker unavailable
- DNS/network
- authentication/authorization
- serialization
- timeout
- topic missing
- quota
- configuration

Evidence:

- Producer logs
- error metrics
- broker/client telemetry

---

# 27. Consumer Failure

Possible causes:

- Crash
- auth
- deserialization
- dependency failure
- poison record
- memory
- thread/event-loop blocking
- configuration

Inspect both messaging and application evidence.

---

# 28. Serialization / Schema Failure

Producer and consumer must agree on record format.

Possible issues:

- Schema incompatibility
- missing field
- incompatible type
- version mismatch
- deserializer configuration

Operational maturity includes backward/forward compatibility strategy.

---

# 29. Schema Evolution

Changes should avoid unexpectedly breaking existing consumers.

Trainer-level concepts:

- Compatibility
- Versioning
- Optional fields
- Controlled rollout

Do not require deep Schema Registry internals unless the role demands it.

---

# 30. Retention

Kafka records are retained according to configured policies rather than being removed simply because one consumer read them.

This enables:

- Replay
- Independent consumer groups
- Event-history processing

---

# 31. Kafka Is Not the Database

Kafka can retain events durably, but system-of-record design depends on architecture.

Do not casually position Kafka as a universal replacement for operational databases.

---

# 32. Broker / Cluster Awareness

At interview depth, know:

- Kafka runs as a cluster of brokers.
- Partitions are distributed.
- Replication improves resilience.
- Leaders handle partition operations, with replicas supporting fault tolerance.

Avoid unnecessary internals unless asked.

---

# 33. Messaging Observability

Monitor:

- Producer rate
- Producer errors
- Consumer rate
- Consumer lag
- Lag by partition
- Processing duration
- Consumer errors
- Retry count
- DLT volume
- Rebalance frequency
- Broker/client health
- Business processing totals

---

# 34. Business Metrics

Technical lag may be less useful than:

- Orders waiting
- Payments pending
- Oldest unprocessed event
- Settlement deadline risk

Connect messaging telemetry to business impact.

---

# 35. Strong Answer — “How Do You Troubleshoot Kafka?”

> “I follow the event lifecycle: producer, broker/topic/partition, consumer assignment, processing and offset progress. I correlate producer errors, consumer lag, partition distribution, consumer logs, retries and downstream dependency latency. I also check business completion because healthy broker metrics do not prove that the event produced the intended business result.”

---

# 36. Scenario 1 — Lag Increasing on All Partitions

Check:

- Producer rate increased?
- consumer throughput reduced?
- dependency slow?
- CPU/memory?
- retries?
- consumer count?
- partition capacity?

---

# 37. Scenario 2 — Lag on One Partition Only

Likely areas:

- Hot partition
- problematic key
- poison event
- assigned consumer issue

Do not immediately scale whole group.

---

# 38. Scenario 3 — Consumer Keeps Reprocessing Same Event

Possible:

- Processing fails before progress commit
- retry policy
- poison message

Need:

- Root error
- controlled retry
- DLT
- idempotency

---

# 39. Scenario 4 — Duplicate Payment

Possible event delivered/processed more than once.

Critical question:

> Was the payment operation itself idempotent?

Messaging guarantee alone is not enough.

---

# 40. Scenario 5 — Consumer Group Suddenly Rebalances Repeatedly

Check:

- consumer restarts
- health/timeouts
- processing taking too long
- deployment instability
- network

Correlate rebalance timing with application health.

---

# 41. Scenario 6 — New Consumer Cannot Read Old Events

Check:

- retention
- starting offset policy
- group state
- requested replay range
- permissions

---

# 42. Scenario 7 — DLT Growing Rapidly

Check:

- common error
- deployment/schema change
- dependency
- malformed producer payload
- consumer version

DLT growth is an incident signal.

---

# 43. Scenario 8 — Kafka Healthy but Orders Not Completing

Trace beyond broker:

```text
Producer -> Kafka -> Consumer -> DB/API -> Business State
```

The messaging platform can be healthy while application processing is broken.

---

# 44. Kafka vs Azure Service Bus — Interview Positioning

You can truthfully bridge concepts:

| Concept | Kafka | Queue/Service Bus Concept |
|---|---|---|
| Producer | Producer | Sender |
| Consumer | Consumer | Receiver |
| Topic | Topic | Topic/Queue |
| Consumer Group | Consumer group | Subscription/competing consumers |
| Offset | Consumer position | Delivery/settlement state differs |
| Replay | Natural log-based pattern | Platform-dependent |
| DLT | Dead-letter topic pattern | Dead-letter queue |

Important:

These are conceptual mappings, **not exact equivalences**.

---

# 45. Corporate Training Angle

Do not teach Kafka only through CLI commands.

Teach:

**Event lifecycle → Evidence → Failure → Recovery → Business validation**

Learners should answer:

- Where is the event?
- Who owns it now?
- Is consumer progressing?
- Can it be replayed?
- Will replay duplicate business effects?

---

# 46. Lab 1 — Consumer Lag

Inject:

- Slow downstream API

Learners:

- observe lag
- compare producer/consumer rate
- inspect trace/dependency
- fix bottleneck
- confirm lag recovery

---

# 47. Lab 2 — Poison Message

Inject:

- Invalid payload

Learners:

- observe repeated failure
- classify retryability
- route to DLT
- fix payload/consumer
- replay safely

---

# 48. Lab 3 — Duplicate Processing

Inject:

- Consumer fails after side effect but before progress commit

Learners:

- observe redelivery
- identify duplicate business effect
- implement idempotency
- validate

---

# 49. Lab 4 — Hot Partition

Inject:

- Skewed partition key

Learners:

- inspect per-partition lag
- identify skew
- explain partition strategy
- propose safe redesign

---

# 50. Lab 5 — Replay

Learners:

- define offset/range
- assess idempotency
- replay controlled subset
- monitor downstream capacity
- reconcile

---

# 51. Lab 6 — Consumer Rebalance

Inject:

- Slow/crashing consumer

Learners:

- observe group instability
- correlate logs/metrics
- fix processing/health issue
- verify stable assignment

---

# 52. Whiteboard — Messaging Troubleshooting

```text
               PRODUCER
                  |
             Send Success?
              /       \
            NO         YES
            |           |
       Producer       BROKER
       Evidence         |
                    Topic/Partition
                         |
                    CONSUMER GROUP
                         |
                  Assignment Healthy?
                         |
                    Processing
                    /        \
                 Success     Failure
                   |            |
                Offset       Retry/DLT
                   |            |
                   +-----+------+
                         |
                  BUSINESS STATE
                         |
                   RECONCILIATION
```

---

# 53. 30-Second Explain-on-Demand

> “For Kafka incidents I follow the record end-to-end: producer send, broker/topic/partition, consumer-group assignment, processing, offset progress and final business side effect. Consumer lag tells me that processing is behind, but I still need evidence to determine whether the cause is traffic, consumer code, partition skew, retries, resources or a downstream dependency.”

---

# 54. 5-Minute Trainer Demo

### Topic: Consumer Lag

1. Explain producer and consumer.
2. Draw latest offset vs consumer progress.
3. Define lag.
4. Show producer rate > consumer rate.
5. Introduce slow downstream DB/API.
6. Explain partition-level analysis.
7. Explain scaling limitations.
8. Fix bottleneck.
9. Observe catch-up.
10. Key takeaway.

---

# 55. High-Probability Interview Questions

1. What is event-driven architecture?
2. What is Kafka?
3. What is a topic?
4. What is a partition?
5. Why partitions?
6. What is a consumer group?
7. What is an offset?
8. What is consumer lag?
9. How do you troubleshoot increasing lag?
10. How does consumer scaling work?
11. What is a partition key?
12. What is a hot partition?
13. What is rebalancing?
14. At-most-once vs at-least-once?
15. What does exactly-once mean?
16. Why do duplicates occur?
17. What is an idempotent consumer?
18. What is a poison message?
19. What is DLT/DLQ?
20. How do you replay messages safely?
21. How do you investigate a missing event?
22. How do schema changes affect consumers?
23. What Kafka metrics would you monitor?
24. Kafka vs traditional queue?
25. How would you teach Kafka operations?
26. Design a Kafka troubleshooting lab.

---

# 56. Cross-Question Drill

## Q1. Consumer lag is high. Add more consumers?

Not automatically. Identify the bottleneck first and remember that parallelism is bounded by partition count.

## Q2. Does Kafka guarantee ordering?

Within a partition. Not globally across multiple partitions.

## Q3. Does at-least-once mean duplicates definitely happen?

No. It means duplicates are possible and applications must be prepared.

## Q4. Does Kafka exactly-once guarantee exactly one payment?

Not by itself. External side effects require end-to-end idempotent/transactional design.

## Q5. Can two consumers in the same group read the same partition simultaneously?

Normally a partition is assigned to one consumer in the group at a time.

## Q6. Is a DLT the permanent home of failed events?

No. It is an isolation and investigation mechanism; failures need ownership and recovery policy.

## Q7. Can Kafka be healthy while application processing is broken?

Yes. Broker health does not prove consumer or downstream business success.

## Q8. Why can adding partitions be a design decision rather than quick fix?

It affects ordering, key distribution, consumer parallelism, and operational behavior.

## Q9. If message appears missing, is broker loss the first assumption?

No. Trace producer, topic, consumer position, filters, processing, and retention.

## Q10. Why is idempotency essential for replay?

Because replay intentionally processes events again and must not duplicate business effects.

---

# 57. Real Experience Mapping

Prepare truthful examples around:

- Azure Service Bus / queues
- Node.js/TypeScript services
- asynchronous processing
- retries
- API integrations
- duplicate prevention
- production monitoring
- Kubernetes
- CI/CD
- incident troubleshooting

For Kafka-specific areas outside direct experience, use:

> “My direct production experience is stronger with queue/service-bus patterns. Kafka differs in its partitioned log and offset model, but the operational concerns I already work with—consumer health, retries, idempotency, backlog, dependencies, observability and safe replay—transfer directly. I would use Kafka-specific telemetry to validate those hypotheses.”

Do not invent Kafka production ownership.

---

# 58. Red Flags

Do not:

- Claim Kafka is simply a queue.
- Claim global ordering.
- Scale consumers without checking partitions.
- Treat lag as root cause.
- Retry poison messages forever.
- Ignore idempotency.
- Treat DLT as garbage.
- Replay blindly.
- Claim exactly-once business effects casually.
- Blame Kafka before tracing producer-to-business lifecycle.
- Invent direct Kafka experience.

---

# 59. Quick Revision

**Kafka:** Topic → Partition → Offset

**Consumption:** Consumer Group → Assignment → Processing → Commit

**Lag:** Latest offset − consumer progress

**Ordering:** Within partition

**Duplicates:** Assume possible → design idempotently

**Poison:** Retry responsibly → isolate → fix → replay

**Golden Rule:** Broker success is not business success.

---

# 60. Module 13 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| Event-driven architecture | 4+ | |
| Topic/partition | 5 | |
| Producer/consumer | 5 | |
| Consumer groups | 5 | |
| Offsets | 5 | |
| Consumer lag | 5 | |
| Partition key/ordering | 5 | |
| Hot partition | 4+ | |
| Rebalancing | 4+ | |
| Delivery semantics | 4+ | |
| Idempotency | 5 | |
| Retry/DLT | 5 | |
| Replay safety | 5 | |
| Missing-message diagnosis | 5 | |
| Messaging observability | 5 | |
| Kafka/Service Bus mapping | 4+ | |
| Scenario handling | 5 | |
| Trainer lab design | 5 | |
| Honest gap handling | 5 | |
| Cross-question survival | 4+ | |

---

# 61. Module 13 Readiness Gate

## PASS only when you can:

- Draw producer → topic → partition → consumer-group flow.
- Explain topics, partitions, offsets, and consumer groups.
- Explain consumer lag and at least five causes.
- Explain why consumer count is limited by partition parallelism.
- Explain ordering correctly.
- Explain delivery semantics without overclaiming.
- Explain idempotent consumption.
- Handle poison messages and DLT.
- Explain safe replay.
- Investigate a “missing” event systematically.
- Compare Kafka concepts with queue/service-bus experience responsibly.
- Handle at least five production scenarios.
- Design at least three trainer labs.
- Survive at least 10 follow-up questions.

### Minimum Score

**P1 target average ≥ 3.5/5, with no critical dimension below 3.**

If answers become definition-only, overclaim exactly-once guarantees, or invent Kafka experience, Module 13 remains **BLOCKED**.

---

# 62. Final Module Outcome

After this module, the panel should think:

> **“He understands Kafka and messaging operationally, can reason through lag, duplicates, ordering, retries and replay, and knows how to transfer his real asynchronous-system experience without bluffing.”**

That is the selection goal for Module 13.
