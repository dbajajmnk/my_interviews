# Microservice Design Patterns — Complete Cheat Sheet

> Fast technical revision companion for microservices design patterns, interviews, and distributed systems.



---

<!-- 00_MASTER_INDEX.md -->

# Microservice Design Patterns — Complete Cheat Sheet Pack

**Purpose:** Fast revision for system design, microservices architecture, interviews, distributed systems, production engineering, and training.

## Standard Pattern Format

Each pattern is organized as:

**Problem → Intent → Visual → How → When to Use → Avoid When → Trade-offs → Example → Interview Trap → Related Patterns**

---

## Part A — Decomposition & Service Boundary Patterns

1. Decompose by Business Capability
2. Decompose by Subdomain / Bounded Context
3. Self-Contained Service
4. Database per Service
5. Shared Database Anti-Pattern
6. Strangler Fig
7. Anti-Corruption Layer

## Part B — API / Composition Patterns

8. API Gateway
9. Backend for Frontend
10. Aggregator
11. API Composition
12. Gateway Aggregation
13. Gateway Routing
14. Gateway Offloading
15. Adapter
16. Ambassador
17. Sidecar

## Part C — Communication & Messaging Patterns

18. Request-Response
19. Asynchronous Messaging
20. Publish-Subscribe
21. Competing Consumers
22. Event Notification
23. Event-Carried State Transfer
24. Claim Check
25. Content-Based Router
26. Dead Letter Queue
27. Retry Queue
28. Message Deduplication
29. Idempotent Consumer
30. Inbox Pattern
31. Outbox Pattern
32. Transaction Log Tailing / CDC

## Part D — Data & Consistency Patterns

33. Saga
34. Saga Choreography
35. Saga Orchestration
36. CQRS
37. Event Sourcing
38. Materialized View
39. Read Model / Projection
40. Transactional Outbox
41. Eventual Consistency
42. Compensating Transaction
43. Semantic Lock
44. Versioned Event
45. Dual-Write Anti-Pattern

## Part E — Resilience Patterns

46. Timeout
47. Retry
48. Circuit Breaker
49. Bulkhead
50. Rate Limiting
51. Backpressure
52. Load Shedding
53. Fail Fast
54. Fallback
55. Cache-Aside
56. Request Collapsing
57. Hedged Requests
58. Graceful Degradation

## Part F — Discovery / Configuration / Runtime Patterns

59. Service Registry
60. Client-Side Discovery
61. Server-Side Discovery
62. Externalized Configuration
63. Configuration Server
64. Service Mesh
65. Health Check API
66. Leader Election
67. Distributed Lock
68. Lease / Fencing Token

## Part G — Observability Patterns

69. Log Aggregation
70. Distributed Tracing
71. Correlation ID
72. Audit Logging
73. Application Metrics
74. Health / Readiness / Liveness
75. Exception Tracking

## Part H — Deployment / Migration Patterns

76. Blue-Green Deployment
77. Canary Deployment
78. Rolling Deployment
79. Parallel Run
80. Dark Launch
81. Feature Toggle
82. Expand-and-Contract
83. Branch by Abstraction
84. Shadow Traffic

## Part I — Security Patterns

85. Access Token
86. Token Relay
87. Service-to-Service Identity
88. Zero Trust
89. Externalized Secrets
90. Policy Enforcement Point

## Part J — Pattern Selection / Interview

91. Saga vs 2PC
92. CQRS vs CRUD
93. Outbox vs CDC
94. Choreography vs Orchestration
95. Retry vs Circuit Breaker
96. API Gateway vs Service Mesh
97. BFF vs API Gateway
98. Cache-Aside vs Materialized View
99. Pattern Decision Tree
100. Pattern Interaction Map
101. Anti-Patterns
102. Interview Traps
103. One-Page Pattern Recall
104. Practice Questions
105. Sources & Accuracy Notes


---

<!-- 01_30_SECOND_RECALL.md -->

# Microservice Design Patterns — 30-Second Recall

## Core Formula

```text
Boundaries
+ Communication
+ Data Consistency
+ Resilience
+ Observability
+ Delivery
= Sustainable Microservices
```

## Most Important Patterns

```text
DDD / Bounded Context
Database per Service
API Gateway
BFF
Saga
CQRS
Outbox
Idempotent Consumer
Circuit Breaker
Retry
Timeout
Bulkhead
Service Discovery
Health Check
Distributed Tracing
Strangler Fig
Blue-Green / Canary
```

## Quick Visual

```text
Client
  ↓
API Gateway
  ↓
Service A ──sync──> Service B
  │
  └──event──> Broker
                 ↓
              Service C
```

## Distributed Data

```text
Local ACID
+ Saga
+ Outbox
+ Idempotency
+ Eventual Consistency
```

## Reliability

```text
Timeout
→ Retry
→ Circuit Breaker
→ Bulkhead
→ Fallback
```

## Interview Traps

- Saga is not 2PC.
- CQRS does not require Event Sourcing.
- Outbox does not guarantee exactly-once business processing.
- Retry without idempotency is dangerous.
- Circuit breaker does not replace timeout.
- API Gateway and Service Mesh solve different traffic directions.


---

<!-- 02_DECOMPOSE_BY_BUSINESS_CAPABILITY.md -->

# Decompose by Business Capability

## Problem
Large systems become difficult to evolve when services are split by technical layers.

## Intent
Organize services around business capabilities.

## Visual
```text
Business
 ├── Orders
 ├── Payments
 ├── Inventory
 └── Shipping
```

## Use When
- domain has clear capabilities
- teams own business outcomes
- independent delivery is required

## Avoid
Splitting as:
```text
Controller Service
Validation Service
Database Service
```

## Trade-off
Business boundaries are harder to discover than technical layers, but far more stable.

## Interview Trap
A business capability is not the same thing as one entity/table.


---

<!-- 03_DECOMPOSE_BY_SUBDOMAIN.md -->

# Decompose by Subdomain / Bounded Context

## Intent
Align services with DDD bounded contexts.

## Visual
```text
Domain
  ↓
Subdomains
  ↓
Bounded Contexts
  ↓
Service candidates
```

## Why
The same term can mean different things in different contexts.

Example:
```text
Customer in Sales != Customer in Billing
```

## Use When
Domain complexity is high and language/model boundaries matter.

## Trap
Bounded context is a modeling boundary; it does not always need to be a separate deployment unit.


---

<!-- 04_SELF_CONTAINED_SERVICE.md -->

# Self-Contained Service

## Intent
A service should own enough UI/API/business/data responsibilities to evolve independently.

## Visual
```text
Service
 ├── API
 ├── business logic
 ├── persistence
 └── optional UI slice
```

## Benefit
Reduces cross-service dependency.

## Trap
Do not interpret self-contained as “duplicate everything.”


---

<!-- 05_DATABASE_PER_SERVICE.md -->

# Database per Service

## Problem
Shared databases create coupling.

## Pattern
```text
Order Service → Order DB
Payment Service → Payment DB
Inventory Service → Inventory DB
```

## Benefits
- schema autonomy
- deployment independence
- fault isolation
- technology choice

## Trade-offs
- no cross-service joins
- distributed consistency
- duplicated read models

## Related
Saga, CQRS, API Composition, Outbox.


---

<!-- 06_SHARED_DATABASE_ANTIPATTERN.md -->

# Shared Database — Anti-Pattern

## Problem
Multiple services directly modify the same database/schema.

## Consequences
```text
tight coupling
hidden dependencies
coordinated schema releases
weak ownership
cross-service transactions
```

## Transitional Use
Sometimes tolerated during migration.

## Rule
If used temporarily, assign table/schema ownership and an exit plan.


---

<!-- 07_STRANGLER_FIG.md -->

# Strangler Fig Pattern

## Intent
Incrementally replace a monolith.

## Visual
```text
Client
 ↓
Router/Gateway
 ├── old capability → Monolith
 └── migrated capability → New Service
```

## Use When
Large rewrite is too risky.

## Benefit
Gradual migration and rollback.

## Trap
Do not maintain duplicated business logic indefinitely.


---

<!-- 08_ANTI_CORRUPTION_LAYER.md -->

# Anti-Corruption Layer

## Intent
Protect a new domain model from legacy/external semantics.

## Visual
```text
New Service
 ↓
ACL / Translator
 ↓
Legacy System
```

## Use
- legacy migration
- third-party integration
- mismatched domain models

## Trap
ACL is translation/isolation—not a new centralized business layer.


---

<!-- 09_API_GATEWAY.md -->

# API Gateway Pattern

## Intent
Provide one entry point for clients.

## Visual
```text
Client
 ↓
Gateway
 ├── routing
 ├── auth
 ├── rate limit
 └── aggregation
      ↓
Services
```

## Good Responsibilities
Cross-cutting edge concerns.

## Avoid
Domain business logic.

## Trap
A fat gateway becomes a new monolith.


---

<!-- 100_PATTERN_DECISION_TREE.md -->

# Pattern Decision Tree

## Cross-service transaction?
```text
Yes → Saga
Need visible workflow? → Orchestration
Simple event flow? → Choreography
```

## DB + event atomicity?
```text
Outbox
+ CDC publisher if useful
```

## Duplicate messages?
```text
Idempotent Consumer / Inbox
```

## Complex reads across services?
```text
API Composition
or
CQRS + Materialized View
```

## Dependency unstable?
```text
Timeout → Retry → Circuit Breaker → Fallback
```

## Too much load?
```text
Rate Limit / Backpressure / Bulkhead / Load Shedding
```

## Legacy migration?
```text
Strangler Fig + Anti-Corruption Layer
```


---

<!-- 101_PATTERN_INTERACTION_MAP.md -->

# Pattern Interaction Map

```text
DDD / Bounded Context
        ↓
Database per Service
        ↓
Distributed Data
 ├── Saga
 ├── Outbox
 ├── CQRS
 └── Eventual Consistency

Service Communication
 ├── Sync
 │    ├── Timeout
 │    ├── Retry
 │    ├── Circuit Breaker
 │    └── Bulkhead
 └── Async
      ├── Pub/Sub
      ├── Idempotent Consumer
      ├── Inbox
      └── DLQ

Operations
 ├── Discovery
 ├── Config
 ├── Health
 ├── Logs
 ├── Metrics
 └── Tracing

Delivery
 ├── Canary
 ├── Blue-Green
 ├── Expand/Contract
 └── Feature Toggle
```


---

<!-- 102_ANTI_PATTERNS.md -->

# Microservice Design Anti-Patterns

## Distributed Monolith
Independent processes, coordinated everything.

## Shared Database
Multiple services directly own same data.

## Chatty Services
Too many tiny synchronous calls.

## Nano-Services
Boundaries too small.

## Retry Storm
Every layer retries.

## God Gateway
Gateway contains business logic.

## Event Soup
Unowned, undocumented events.

## Shared Common Library
Business coupling hidden in package dependency.

## Dual Write
DB + broker written independently.

## One Giant Global Transaction
Trying to preserve monolith ACID across services.


---

<!-- 103_INTERVIEW_TRAPS.md -->

# Interview Traps

1. Saga != 2PC.
2. Compensation != rollback.
3. CQRS != Event Sourcing.
4. Outbox != exactly once.
5. CDC != domain event automatically.
6. Retry requires idempotency.
7. Circuit breaker != timeout.
8. API Gateway != Service Mesh.
9. BFF != API Gateway.
10. Shared DB breaks service autonomy.
11. Eventual consistency must be business-acceptable.
12. Async reduces temporal coupling, not semantic coupling.
13. DLQ needs operational ownership.
14. Fallback can hide correctness failures.
15. Distributed locks need fencing.
16. Health != readiness != liveness.
17. Blue-Green != Canary.
18. Feature flag != long-term architecture.
19. Materialized View != cache.
20. Service Discovery != resilience.


---

<!-- 104_ONE_PAGE_RECALL.md -->

# Microservice Design Patterns — One-Page Recall

## Boundaries
```text
Business Capability
Bounded Context
Database per Service
Strangler
ACL
```

## Data
```text
Saga
CQRS
Event Sourcing
Outbox
Inbox
Idempotency
Materialized View
```

## Communication
```text
Request-Response
Async Messaging
Pub/Sub
Competing Consumers
Claim Check
DLQ
```

## Resilience
```text
Timeout
Retry
Circuit Breaker
Bulkhead
Rate Limit
Backpressure
Fallback
```

## Platform
```text
Gateway
BFF
Discovery
Config
Service Mesh
Health
```

## Observability
```text
Logs
Metrics
Tracing
Correlation ID
Audit
```

## Delivery
```text
Blue-Green
Canary
Rolling
Expand/Contract
Feature Toggle
Shadow Traffic
```


---

<!-- 105_PRACTICE_QUESTIONS.md -->

# Practice Questions

1. Decompose by business capability vs subdomain?
2. Why database per service?
3. What is Strangler Fig?
4. What is an Anti-Corruption Layer?
5. API Gateway vs BFF?
6. Adapter vs Ambassador vs Sidecar?
7. Request-response vs async messaging?
8. Pub/Sub vs competing consumers?
9. Event Notification vs Event-Carried State Transfer?
10. What is Claim Check?
11. Why DLQ?
12. What is Idempotent Consumer?
13. Inbox vs Outbox?
14. What is CDC?
15. What is Saga?
16. Choreography vs orchestration?
17. Saga vs 2PC?
18. CQRS vs CRUD?
19. CQRS vs Event Sourcing?
20. Materialized View vs Cache?
21. What is semantic lock?
22. Retry best practices?
23. Circuit breaker states?
24. Timeout vs circuit breaker?
25. Bulkhead?
26. Backpressure?
27. Load shedding?
28. Fallback?
29. Service registry?
30. Client vs server-side discovery?
31. Service Mesh vs API Gateway?
32. What is fencing?
33. Correlation ID vs tracing?
34. Blue-Green vs Canary?
35. Expand-and-Contract?
36. Branch by Abstraction?
37. Shadow Traffic?
38. Zero Trust?
39. What is a Policy Enforcement Point?
40. Which patterns help remove dual-write risk?


---

<!-- 106_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

This pack is vendor-neutral and pattern-first.

Pattern families align with established microservices and enterprise integration literature, including:

- Domain-Driven Design
- Microservices patterns
- Enterprise Integration Patterns
- Cloud-native resilience patterns
- distributed systems consistency patterns
- progressive delivery patterns

## Core Principle

Patterns are not mandatory building blocks.

Use a pattern only when the problem it solves actually exists.

## Important Distinctions

```text
Architecture pattern
!=
framework feature
!=
product/service
```

For example:

```text
Saga = architecture pattern
Step Functions / Temporal / Camunda = possible implementations
```

```text
Outbox = consistency pattern
Debezium / DMS / CDC tools = possible implementation mechanisms
```

## Rule

Prefer:
```text
simple local transaction
simple synchronous call
simple modular monolith
```
until distributed complexity is justified.


---

<!-- 10_BFF.md -->

# Backend for Frontend

## Intent
Create a backend tailored to each client experience.

```text
Web → Web BFF
Mobile → Mobile BFF
Partner → Partner BFF
```

## Why
Different clients have different payload/latency needs.

## Trap
Do not duplicate core business rules across BFFs.


---

<!-- 11_AGGREGATOR.md -->

# Aggregator Pattern

## Intent
Combine responses from multiple services.

```text
Client
 ↓
Aggregator
 ├── Service A
 ├── Service B
 └── Service C
 ↓
Combined Response
```

## Use
Dashboards, composite pages, summary APIs.

## Trap
Deep synchronous aggregation increases latency and failure probability.


---

<!-- 12_API_COMPOSITION.md -->

# API Composition

## Intent
Join data at application/API level when databases are service-owned.

```text
Composer
 ├── Customer Service
 ├── Order Service
 └── Payment Service
```

## Benefit
Avoids shared database.

## Trade-off
Network latency and partial failure.

## Related
CQRS, Materialized View.


---

<!-- 13_GATEWAY_AGGREGATION.md -->

# Gateway Aggregation

## Intent
Gateway calls multiple backend services and returns one client response.

## Good Use
Small edge-level aggregation.

## Avoid
Complex domain workflow.

## Trap
Aggregation and orchestration are not the same.


---

<!-- 14_GATEWAY_ROUTING.md -->

# Gateway Routing

## Intent
Route requests based on host/path/header/etc.

```text
/orders/* → Order Service
/payments/* → Payment Service
```

## Benefits
Stable external API surface.

## Trap
Do not encode domain decisions in route rules.


---

<!-- 15_GATEWAY_OFFLOADING.md -->

# Gateway Offloading

## Intent
Move common edge work out of services.

Examples:
```text
TLS
authentication checks
rate limiting
compression
CORS
request logging
```

## Benefit
Reduces duplication.

## Trap
Security-sensitive decisions still need backend enforcement where appropriate.


---

<!-- 16_ADAPTER.md -->

# Adapter Pattern

## Intent
Convert one interface/protocol into another.

```text
Service
 ↓
Adapter
 ↓
Legacy / Vendor API
```

## Use
Protocol/schema mismatch.

## Trap
Adapter should not absorb unrelated business logic.


---

<!-- 17_AMBASSADOR.md -->

# Ambassador Pattern

## Intent
A helper proxy handles outbound connectivity for a service.

```text
Service
 ↓
Ambassador Proxy
 ↓
External Service
```

## Responsibilities
```text
TLS
retry
routing
telemetry
```

## Related
Sidecar, Service Mesh.


---

<!-- 18_SIDECAR.md -->

# Sidecar Pattern

## Intent
Deploy helper functionality alongside the application.

```text
Pod / Host
 ├── App
 └── Sidecar
```

## Uses
```text
proxy
logging
telemetry
config
security
```

## Trap
Sidecars increase resource and operational overhead.


---

<!-- 19_REQUEST_RESPONSE.md -->

# Request-Response

## Pattern
```text
Caller → Request → Service
Caller ← Response ← Service
```

## Good
Immediate result required.

## Risk
Runtime coupling and cascading latency.

## Trap
Long synchronous chains are brittle.


---

<!-- 20_ASYNC_MESSAGING.md -->

# Asynchronous Messaging

## Pattern
```text
Producer → Broker → Consumer
```

## Benefits
```text
temporal decoupling
buffering
resilience
scaling
```

## Costs
```text
eventual consistency
debugging
duplicate handling
ordering
```


---

<!-- 21_PUBLISH_SUBSCRIBE.md -->

# Publish-Subscribe

## Pattern
```text
Publisher
 ↓
Topic/Event Bus
 ├── Consumer A
 ├── Consumer B
 └── Consumer C
```

## Use
One event needed by multiple independent consumers.

## Trap
Fan-out is not the same as queue-based competing consumption.


---

<!-- 22_COMPETING_CONSUMERS.md -->

# Competing Consumers

## Pattern
```text
Queue
 ├── Consumer 1
 ├── Consumer 2
 └── Consumer 3
```

Only one consumer handles a given work item.

## Benefit
Horizontal scaling.

## Trap
Ordering becomes harder when multiple consumers process concurrently.


---

<!-- 23_EVENT_NOTIFICATION.md -->

# Event Notification

## Intent
Publish that something happened, with minimal payload.

Example:
```json
{ "type": "OrderCreated", "orderId": "O123" }
```

Consumer fetches details if needed.

## Benefit
Small events.

## Trade-off
Additional network calls and temporal coupling to source.


---

<!-- 24_EVENT_CARRIED_STATE_TRANSFER.md -->

# Event-Carried State Transfer

## Intent
Include useful state in events so consumers need not call producer.

Example:
```json
{
  "type":"CustomerUpdated",
  "customerId":"C1",
  "name":"Deepak",
  "tier":"Gold"
}
```

## Benefit
Consumer autonomy.

## Cost
Larger events and schema evolution complexity.


---

<!-- 25_CLAIM_CHECK.md -->

# Claim Check

## Problem
Message payload is too large.

## Pattern
```text
Producer
 ↓ store payload
Object Store
 ↓ returns reference
Small Message with reference
 ↓
Consumer fetches payload
```

## Good
Large files/documents.

## Trap
Manage lifecycle/security of the stored payload.


---

<!-- 26_CONTENT_BASED_ROUTER.md -->

# Content-Based Router

## Intent
Route messages based on content.

```text
Event
 ↓
Router
 ├── high-value → Queue A
 └── normal → Queue B
```

## Trap
Do not let routing rules become an invisible business-rule engine.


---

<!-- 27_DEAD_LETTER_QUEUE.md -->

# Dead Letter Queue

## Intent
Move repeatedly failing messages aside.

```text
Main Queue
 ↓ retry exhausted
DLQ
```

## Use
Investigation, repair, replay.

## Rule
DLQ needs operational ownership.

## Trap
A DLQ nobody monitors is only hidden failure.


---

<!-- 28_RETRY_QUEUE.md -->

# Retry Queue

## Intent
Delay reprocessing instead of immediate retry.

```text
Main Queue
 ↓ fail
Retry Queue / Delay
 ↓
Main Consumer
```

## Benefit
Avoid hot retry loops.

## Trap
Retry only transient failures.


---

<!-- 29_MESSAGE_DEDUP.md -->

# Message Deduplication

## Pattern
Track a stable message/business key.

```text
Message ID
 ↓
Seen before?
 ├── Yes → ignore
 └── No  → process
```

## Related
Idempotent Consumer, Inbox.

## Trap
Transport-level deduplication may not cover business-level duplicates.


---

<!-- 30_IDEMPOTENT_CONSUMER.md -->

# Idempotent Consumer

## Intent
Repeated delivery produces the same business result.

## Example
Payment command uses:
```text
paymentRequestId
```

Repeated command:
```text
same result
no second charge
```

## Essential With
At-least-once delivery and retry.

## Trap
Idempotency must cover side effects, not only database insert logic.


---

<!-- 31_INBOX.md -->

# Inbox Pattern

## Intent
Persist incoming message IDs/state before or with business processing.

```text
Message
 ↓
Inbox Table
 ↓
Already processed?
 ↓
Business logic
```

## Use
Reliable duplicate suppression.

## Related
Outbox, Idempotent Consumer.


---

<!-- 32_OUTBOX.md -->

# Outbox Pattern

## Problem
Database update + message publish is a dual write.

## Pattern
Same local transaction:

```text
Business Row
+
Outbox Row
```

Later:
```text
Outbox → Broker
```

## Benefit
Reliable event publication.

## Trap
Consumer idempotency is still required.


---

<!-- 33_CDC.md -->

# Transaction Log Tailing / CDC

## Intent
Capture DB changes from transaction log.

```text
DB Log
 ↓
CDC
 ↓
Broker
 ↓
Consumers
```

## Use
Outbox publishing, analytics, legacy integration.

## Trap
Raw row changes are not automatically good domain events.


---

<!-- 34_SAGA.md -->

# Saga Pattern

## Problem
Business transaction spans services.

## Pattern
Sequence of local transactions:

```text
T1 → T2 → T3
```

Failure:
```text
C2 ← C1
```

`C` = compensating transaction.

## Benefit
Avoid distributed 2PC.

## Trap
Compensation is domain-specific and may not perfectly reverse reality.


---

<!-- 35_SAGA_CHOREOGRAPHY.md -->

# Saga Choreography

## Pattern
```text
OrderCreated
 ↓
InventoryReserved
 ↓
PaymentCharged
 ↓
ShippingScheduled
```

Each service reacts to events.

## Benefits
Decentralized.

## Risks
Event spaghetti and poor workflow visibility.

## Use
Simpler workflows.


---

<!-- 36_SAGA_ORCHESTRATION.md -->

# Saga Orchestration

## Pattern
```text
Orchestrator
 ├── Reserve Inventory
 ├── Charge Payment
 └── Ship
```

## Benefits
Explicit workflow.

## Risks
Orchestrator complexity.

## Trap
Keep domain logic in domain services; orchestrator coordinates.


---

<!-- 37_CQRS.md -->

# CQRS

## Intent
Separate write and read models.

```text
Commands → Write Model → Write DB
                         ↓ events
Queries  → Read Model  → Read DB
```

## Good
Complex domains / read-heavy systems.

## Cost
More infrastructure and eventual consistency.

## Trap
CQRS does not require Event Sourcing.


---

<!-- 38_EVENT_SOURCING.md -->

# Event Sourcing

## Intent
Store state transitions as events.

```text
OrderCreated
ItemAdded
PaymentAuthorized
OrderShipped
```

## Benefits
Audit, replay, temporal model.

## Costs
Versioning, replay, operational complexity.

## Trap
Not every event-driven system should use Event Sourcing.


---

<!-- 39_MATERIALIZED_VIEW.md -->

# Materialized View

## Intent
Precompute read-optimized data.

```text
Events/Data
 ↓
Projection
 ↓
Materialized View
 ↓
Fast Query
```

## Good
Dashboards, reporting, joins across services.

## Trap
View freshness and rebuild strategy matter.


---

<!-- 40_READ_MODEL.md -->

# Read Model / Projection

## Intent
Transform source events/state into query-specific representation.

## Example
```text
Order + Payment + Shipping events
 ↓
OrderSummary projection
```

## Related
CQRS, Event Sourcing, Materialized View.


---

<!-- 41_TRANSACTIONAL_OUTBOX.md -->

# Outbox Pattern

## Problem
Database update + message publish is a dual write.

## Pattern
Same local transaction:

```text
Business Row
+
Outbox Row
```

Later:
```text
Outbox → Broker
```

## Benefit
Reliable event publication.

## Trap
Consumer idempotency is still required.


---

<!-- 42_EVENTUAL_CONSISTENCY.md -->

# Eventual Consistency

## Intent
Accept temporary divergence between distributed components.

```text
Payment succeeds at t1
Order read model updates at t2
```

## Design
Define acceptable inconsistency window.

## Trap
Eventual consistency is a business UX decision as much as a technical one.


---

<!-- 43_COMPENSATING_TRANSACTION.md -->

# Compensating Transaction

## Intent
Undo/neutralize effects of a previously completed local transaction.

Example:
```text
Charge card
 ↓ later failure
Refund card
```

## Important
Compensation may not restore identical original state.

## Related
Saga.


---

<!-- 44_SEMANTIC_LOCK.md -->

# Semantic Lock

## Intent
Mark an entity as being in an intermediate business state so conflicting operations are prevented.

Example:
```text
Order status = PENDING_PAYMENT
```

## Use
Long-running sagas.

## Trap
This is a business lock/state, not necessarily a DB lock.


---

<!-- 45_VERSIONED_EVENT.md -->

# Versioned Event

## Intent
Evolve event schema without breaking consumers.

## Strategies
```text
additive fields
schema version
new event type/version
upcasters
consumer compatibility
```

## Trap
Events are public contracts once multiple services depend on them.


---

<!-- 46_DUAL_WRITE_ANTIPATTERN.md -->

# Dual-Write Anti-Pattern

## Problem
Service independently writes:

```text
Database
and
Broker
```

without atomic coordination.

## Failure
```text
DB ✓
Broker ✗
```

or reverse.

## Fix
Outbox / CDC / idempotent reconciliation.


---

<!-- 47_TIMEOUT.md -->

# Timeout

## Intent
Stop waiting forever for remote work.

```text
Call → wait up to budget → fail
```

## Rule
Every network call should have a timeout.

## Trap
Timeout values must fit an end-to-end latency budget.


---

<!-- 48_RETRY.md -->

# Retry

## Intent
Re-attempt transient failures.

Use:
```text
bounded attempts
exponential backoff
jitter
idempotency
```

## Trap
Retrying permanent failure creates storms.


---

<!-- 49_CIRCUIT_BREAKER.md -->

# Circuit Breaker

## States
```text
CLOSED → OPEN → HALF-OPEN → CLOSED
```

## Intent
Stop hammering unhealthy dependencies.

## Trap
Still configure timeout.


---

<!-- 50_BULKHEAD.md -->

# Bulkhead

## Intent
Isolate resources.

```text
Payment Pool
Search Pool
Reporting Pool
```

One failure should not exhaust everything.


---

<!-- 51_RATE_LIMITING.md -->

# Rate Limiting

## Intent
Protect capacity/business quota.

Algorithms:
```text
token bucket
leaky bucket
fixed/sliding window
```


---

<!-- 52_BACKPRESSURE.md -->

# Backpressure

## Intent
Slow/reject producers when consumers cannot keep up.

```text
Producer >>> Consumer
```

Fix:
```text
bounded queue
throttle
scale
drop/reject
```


---

<!-- 53_LOAD_SHEDDING.md -->

# Load Shedding

## Intent
Reject lower-priority work to keep core service healthy.

## Use
Overload conditions.

## Trap
Define what may be safely dropped.


---

<!-- 54_FAIL_FAST.md -->

# Fail Fast

## Intent
Reject impossible/unavailable work immediately instead of wasting resources.

## Example
Dependency known unavailable → fast error/fallback.


---

<!-- 55_FALLBACK.md -->

# Fallback

## Intent
Provide alternate behavior when dependency fails.

Examples:
```text
cached data
default recommendation
reduced feature
```

## Trap
Fallback must not silently violate correctness.


---

<!-- 56_CACHE_ASIDE.md -->

# Cache-Aside

## Pattern
```text
Read cache
 ├── hit → return
 └── miss → DB → cache → return
```

## Trap
Invalidation and stale data are the hard parts.


---

<!-- 57_REQUEST_COLLAPSING.md -->

# Request Collapsing

## Intent
Combine duplicate concurrent requests into one downstream call.

## Good
Hot keys / expensive shared lookup.


---

<!-- 58_HEDGED_REQUESTS.md -->

# Hedged Requests

## Intent
Send a duplicate request after a delay to reduce tail latency.

## Risk
Additional load.

## Use
Only for idempotent/safe operations with careful thresholds.


---

<!-- 59_GRACEFUL_DEGRADATION.md -->

# Graceful Degradation

## Intent
Preserve core functionality when optional dependencies fail.

```text
Checkout works
Recommendations unavailable
```


---

<!-- 60_SERVICE_REGISTRY.md -->

# Service Registry

Stores service instance locations/health.

```text
Service instances → Registry
Clients/routers → Registry
```


---

<!-- 61_CLIENT_SIDE_DISCOVERY.md -->

# Client-Side Discovery

Client queries registry and chooses instance.

## Trade-off
Discovery/load-balancing logic in client.


---

<!-- 62_SERVER_SIDE_DISCOVERY.md -->

# Server-Side Discovery

Client calls router/load balancer.

```text
Client → LB/Router → Service Instance
```


---

<!-- 63_EXTERNALIZED_CONFIG.md -->

# Externalized Configuration

Keep environment-specific settings outside code/artifact.

Examples:
```text
URLs
timeouts
feature flags
```


---

<!-- 64_CONFIG_SERVER.md -->

# Configuration Server

Central service distributes configuration.

## Risk
Bootstrap dependency and central availability.


---

<!-- 65_SERVICE_MESH.md -->

# Service Mesh

Infrastructure layer for service-to-service traffic.

Capabilities:
```text
mTLS
routing
telemetry
policy
```

## Trap
Not a replacement for API Gateway.


---

<!-- 66_HEALTH_CHECK_API.md -->

# Health Check API

Expose health status.

```text
liveness
readiness
startup
```

## Trap
Do not make liveness depend on every downstream service.


---

<!-- 67_LEADER_ELECTION.md -->

# Leader Election

Choose one active coordinator among replicas.

Use:
```text
single scheduler
partition coordinator
maintenance task
```


---

<!-- 68_DISTRIBUTED_LOCK.md -->

# Distributed Lock

Coordinate exclusive work across nodes.

## Risks
expiry, split brain, stale owner.


---

<!-- 69_LEASE_FENCING.md -->

# Lease / Fencing Token

Lease expires; fencing token prevents stale owner from writing.

```text
token 41 < token 42 → reject stale writer
```


---

<!-- 70_LOG_AGGREGATION.md -->

# Log Aggregation

Centralize service logs for search/analysis.

Include:
```text
service
version
traceId
requestId
business key
```


---

<!-- 71_DISTRIBUTED_TRACING.md -->

# Distributed Tracing

Track one request across services.

```text
Trace
 ├── Gateway span
 ├── Order span
 ├── Payment span
 └── DB span
```


---

<!-- 72_CORRELATION_ID.md -->

# Correlation ID

Propagate stable request/business correlation identifier across calls/messages.

## Trap
Correlation ID is not a substitute for full tracing.


---

<!-- 73_AUDIT_LOGGING.md -->

# Audit Logging

Record security/business-significant actions.

```text
who
what
when
target
result
```


---

<!-- 74_APPLICATION_METRICS.md -->

# Application Metrics

Track:
```text
latency
traffic
errors
saturation
business KPIs
```


---

<!-- 75_HEALTH_READINESS_LIVENESS.md -->

# Health / Readiness / Liveness

```text
Liveness → restart?
Readiness → receive traffic?
Startup → initialized?
```


---

<!-- 76_EXCEPTION_TRACKING.md -->

# Exception Tracking

Aggregate exceptions by service/version/release/context.

Use to identify regressions and recurring failures.


---

<!-- 77_BLUE_GREEN.md -->

# Blue-Green Deployment

Two environments:

```text
Blue = current
Green = new
```

Switch traffic when validated.


---

<!-- 78_CANARY.md -->

# Canary Deployment

Release progressively:

```text
1% → 5% → 25% → 50% → 100%
```

Gate on health/business metrics.


---

<!-- 79_ROLLING.md -->

# Rolling Deployment

Replace instances gradually.

## Requirement
Backward compatibility during mixed-version period.


---

<!-- 80_PARALLEL_RUN.md -->

# Parallel Run

Old and new systems run together and outputs are compared.

Useful for migration validation.


---

<!-- 81_DARK_LAUNCH.md -->

# Dark Launch

Deploy code/functionality without exposing it to normal users.

Use to validate infrastructure/load behavior.


---

<!-- 82_FEATURE_TOGGLE.md -->

# Feature Toggle

Separate deploy from release.

## Trap
Flags need owner and removal date.


---

<!-- 83_EXPAND_CONTRACT.md -->

# Expand-and-Contract

Safe schema/API migration:

```text
Expand
→ support old + new
→ migrate
→ Contract
```


---

<!-- 84_BRANCH_BY_ABSTRACTION.md -->

# Branch by Abstraction

Introduce abstraction, implement new path behind it, migrate gradually, remove old path.


---

<!-- 85_SHADOW_TRAFFIC.md -->

# Shadow Traffic

Copy production requests to new system without affecting user response.

## Use
Performance/compatibility validation.

## Security
Protect production data carefully.


---

<!-- 86_ACCESS_TOKEN.md -->

# Access Token

Use token to represent authenticated authorization context.

## Rule
Backend validates token/claims/issuer/audience/expiry.


---

<!-- 87_TOKEN_RELAY.md -->

# Token Relay

Gateway/service forwards delegated identity token/context to downstream service when appropriate.


---

<!-- 88_SERVICE_IDENTITY.md -->

# Service-to-Service Identity

Every workload has verifiable identity.

Use:
```text
mTLS
workload identity
short-lived credentials
```


---

<!-- 89_ZERO_TRUST.md -->

# Zero Trust

Do not trust network location.

Authenticate and authorize each access path.


---

<!-- 90_EXTERNALIZED_SECRETS.md -->

# Externalized Secrets

Keep secrets outside source/artifact.

Use managed secret storage + rotation + least privilege.


---

<!-- 91_POLICY_ENFORCEMENT.md -->

# Policy Enforcement Point

Central/consistent policy check at gateway, service mesh, service, or dedicated authorization layer.

## Trap
Do not rely only on frontend policy checks.


---

<!-- 92_SAGA_VS_2PC.md -->

# Saga vs 2PC

| Saga | 2PC |
|---|---|
| local transactions | distributed atomic transaction |
| compensation | rollback |
| eventual consistency | strong atomic outcome |
| scalable/decentralized | coordinator-heavy |
| business-level recovery | infrastructure-level coordination |

## Rule
Saga is usually preferred in loosely coupled microservices.


---

<!-- 93_CQRS_VS_CRUD.md -->

# CQRS vs CRUD

| CRUD | CQRS |
|---|---|
| one model | separate read/write models |
| simpler | more complex |
| strong immediate model | can be eventual |
| good default | use when complexity justifies |


---

<!-- 94_OUTBOX_VS_CDC.md -->

# Outbox vs CDC

| Outbox | CDC |
|---|---|
| app writes explicit event row | capture DB log changes |
| domain-event friendly | row-change oriented |
| app schema change | infra connector/log reading |
| can use CDC to publish outbox | often complementary |

## Common Pattern
```text
Transactional Outbox + CDC
```


---

<!-- 95_CHOREOGRAPHY_VS_ORCHESTRATION.md -->

# Choreography vs Orchestration

| Choreography | Orchestration |
|---|---|
| event reactions | central coordinator |
| decentralized | explicit workflow |
| loose coupling | clearer process |
| event spaghetti risk | god-orchestrator risk |


---

<!-- 96_RETRY_VS_CIRCUIT.md -->

# Retry vs Circuit Breaker

| Retry | Circuit Breaker |
|---|---|
| try again | stop calling temporarily |
| transient failure | repeated dependency failure |
| backoff/jitter | state machine |
| can increase load | protects dependency |

## Best Together
```text
Timeout
→ limited Retry
→ Circuit Breaker
```


---

<!-- 97_GATEWAY_VS_MESH.md -->

# API Gateway vs Service Mesh

| API Gateway | Service Mesh |
|---|---|
| north-south | east-west |
| client entry | service-to-service |
| API policies | network/service policies |
| external auth/routing | mTLS/traffic telemetry |


---

<!-- 98_BFF_VS_GATEWAY.md -->

# BFF vs API Gateway

| BFF | API Gateway |
|---|---|
| client-specific backend | generic edge entry |
| UI aggregation | routing/security |
| web/mobile tailored | cross-client concerns |


---

<!-- 99_CACHE_VS_MATERIALIZED.md -->

# Cache-Aside vs Materialized View

| Cache-Aside | Materialized View |
|---|---|
| copies source result | derived read model |
| transient acceleration | query-specific projection |
| invalidation | rebuild/update |
| usually key-based | richer read model |
