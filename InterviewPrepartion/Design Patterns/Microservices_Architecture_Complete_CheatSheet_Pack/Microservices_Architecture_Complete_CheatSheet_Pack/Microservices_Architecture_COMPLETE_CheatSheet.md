# Microservices Architecture — Complete Cheat Sheet

> Fast technical revision companion for architecture, interviews, and production engineering.



---

<!-- 00_MASTER_INDEX.md -->

# Microservices Architecture — Complete Cheat Sheet Pack

**Purpose:** Fast revision for system design, enterprise architecture, backend engineering, interviews, production troubleshooting, and training.

## Revision Modes

### 30 Seconds
Open `01_30_SECOND_RECALL.md`.

### 2 Minutes
Open any topic and scan:
**What → Why → Diagram → Pattern → Trap**

### 10 Minutes
Read:
**What → Why → How → Visual → Trade-offs → Production Use → Interview Recall**

---

## Part A — Foundations

1. Microservices Snapshot
2. Monolith vs Modular Monolith vs Microservices
3. When to Use Microservices
4. Service Boundaries & DDD
5. Bounded Context
6. Database per Service
7. Communication Styles
8. Sync vs Async Communication

## Part B — Core Architecture Patterns

9. API Gateway
10. Backend for Frontend (BFF)
11. Service Discovery
12. Centralized Configuration
13. Saga Pattern
14. Saga Choreography
15. Saga Orchestration
16. CQRS
17. Event Sourcing
18. Transactional Outbox
19. Inbox / Idempotent Consumer
20. CDC
21. Strangler Fig
22. Anti-Corruption Layer

## Part C — Reliability & Distributed Systems

23. CAP / PACELC
24. Eventual Consistency
25. Idempotency
26. Retry
27. Circuit Breaker
28. Timeout
29. Bulkhead
30. Rate Limiting
31. Backpressure
32. Distributed Locking
33. Exactly-Once Myth / Delivery Semantics

## Part D — Platform & Operations

34. Containers & Kubernetes
35. Service Mesh
36. Load Balancing
37. Health Checks
38. Observability
39. Distributed Tracing
40. Logging
41. Metrics / SLI / SLO
42. Security / Zero Trust
43. Secrets & Configuration
44. Deployment Strategies
45. Canary / Blue-Green
46. Autoscaling

## Part E — Testing & Delivery

47. Testing Pyramid
48. Contract Testing
49. Integration Testing
50. End-to-End Testing
51. Consumer-Driven Contracts
52. CI/CD
53. Database Migration
54. Versioning & Compatibility

## Part F — Performance / Governance / Interview

55. Performance & Latency Budget
56. Cost & Operational Complexity
57. Microservices Anti-Patterns
58. Troubleshooting Matrix
59. Production Readiness Checklist
60. Architecture Review Checklist
61. Interview Traps
62. One-Page Architecture Recall
63. Comparison Matrix
64. Practice Questions
65. Sources & Accuracy Notes


---

<!-- 01_30_SECOND_RECALL.md -->

# Microservices — 30-Second Recall

## Formula

**Microservices = Independently deployable services + clear business boundaries + decentralized data + resilient communication + strong automation + observability**

## Core Flow

```text
Client
  ↓
API Gateway
  ↓
Service A ──sync──> Service B
  │
  └──event──> Broker ──> Service C
                    └──> Service D
```

## Must Remember

```text
DDD / Bounded Context
Database per Service
API Gateway
Service Discovery
Saga
CQRS
Outbox
Idempotency
Retry + Timeout + Circuit Breaker
Observability
Distributed Tracing
Contract Testing
Zero Trust
CI/CD
Kubernetes
Eventual Consistency
```

## Interview Traps

- Microservices are not “small services”.
- Database sharing destroys service autonomy.
- Distributed transactions are harder than local transactions.
- Retry without idempotency is dangerous.
- Circuit breaker is not a substitute for timeout.
- Saga is not the same as 2PC.
- Event-driven does not mean eventual consistency is always acceptable.
- Kubernetes does not make bad service boundaries good.


---

<!-- 02_MICROSERVICES_SNAPSHOT.md -->

# Microservices Snapshot

## What

An architectural style where a system is composed of small, independently deployable services aligned to business capabilities.

## Key Properties

```text
Business-aligned boundaries
Independent deployment
Independent scaling
Decentralized data ownership
Fault isolation
Automation
Observability
```

## Why

Useful when teams need:

- independent delivery
- selective scaling
- domain ownership
- technology autonomy
- fault isolation

## Real-Life Analogy

A large restaurant kitchen can be split into specialized stations:

```text
Orders
Grill
Dessert
Drinks
Billing
```

Each station owns its work, but they coordinate to complete one customer order.

## Trap

If all services must be deployed together, share one database, and break together, you probably have a distributed monolith.


---

<!-- 03_MONOLITH_VS_MODULAR_VS_MICROSERVICES.md -->

# Monolith vs Modular Monolith vs Microservices

| Area | Monolith | Modular Monolith | Microservices |
|---|---|---|---|
| Deployment | one unit | one unit | many units |
| Boundaries | often weak | strong modules | network boundaries |
| Data | shared | shared/partitioned | service-owned |
| Ops complexity | low | medium | high |
| Team autonomy | limited | good | high |
| Failure isolation | low | medium | high potential |
| Network overhead | low | low | high |
| Transactions | simple | simple | distributed complexity |

## Recommendation

Start with a **modular monolith** when the domain/team size does not justify distributed complexity.

Move to microservices when there is strong evidence around:

```text
team autonomy
independent scaling
deployment independence
domain complexity
organizational scale
```

## Trap

Microservices should not be the default for every new application.


---

<!-- 04_WHEN_TO_USE.md -->

# When to Use Microservices

## Good Signals

```text
multiple autonomous teams
clear business domains
independent deployment needed
different scaling profiles
frequent releases
large evolving platform
fault isolation matters
```

## Bad Signals

```text
small team
unclear domain
low traffic
simple CRUD app
weak DevOps maturity
no observability
no automated deployment
```

## Rule

Microservices solve **organizational and scaling problems** at the cost of **distributed-systems complexity**.

## Interview Line

> Use microservices when the benefits of autonomy and independent scaling exceed the costs of distribution.


---

<!-- 05_SERVICE_BOUNDARIES_DDD.md -->

# Service Boundaries & DDD

## Goal

A service should align with a **business capability**, not a technical layer.

Bad:

```text
UserControllerService
DatabaseService
ValidationService
```

Better:

```text
Order Service
Payment Service
Inventory Service
Shipping Service
```

## Boundary Test

Ask:

```text
Does this capability change independently?
Does one team own it?
Does it own its data?
Can it be deployed independently?
Can its invariants stay local?
```

## DDD Link

```text
Domain
  ↓
Subdomain
  ↓
Bounded Context
  ↓
Microservice Candidate
```

## Trap

Entity-per-service usually creates too many services and chatty networks.


---

<!-- 06_BOUNDED_CONTEXT.md -->

# Bounded Context

## What

A boundary inside which a domain model has a precise meaning.

Example:

```text
Customer in Sales
!=
Customer in Billing
```

## Why

Prevents one giant shared enterprise model.

## Visual

```text
Sales Context
  Customer
  Lead
  Quote

Billing Context
  Account
  Invoice
  Payment
```

## Rule

Bounded contexts communicate through explicit contracts.

## Trap

Bounded context is a domain boundary, not automatically a deployment boundary.


---

<!-- 07_DATABASE_PER_SERVICE.md -->

# Database per Service

## Principle

Each service owns its persistence.

```text
Order Service → Order DB
Payment Service → Payment DB
Inventory Service → Inventory DB
```

## Why

- autonomy
- independent schema evolution
- failure isolation
- team ownership

## Cross-Service Queries

Prefer:

```text
API composition
CQRS read model
events
data products
```

rather than SQL joins across private databases.

## Trap

“Separate schemas in one DB” can be a transitional compromise, but ownership boundaries still matter.


---

<!-- 08_COMMUNICATION_STYLES.md -->

# Communication Styles

## Synchronous

```text
HTTP/REST
gRPC
request-response
```

## Asynchronous

```text
events
commands
queues
topics
streams
```

## Decision

Use sync when:

```text
caller needs immediate result
latency is acceptable
availability dependency is acceptable
```

Use async when:

```text
decoupling matters
work can continue later
buffering is useful
eventual consistency acceptable
```

## Trap

Async messaging reduces temporal coupling, not logical coupling.


---

<!-- 09_SYNC_VS_ASYNC.md -->

# Sync vs Async

| Sync | Async |
|---|---|
| simple request-response | decoupled |
| immediate result | eventual result |
| tight runtime dependency | weaker temporal dependency |
| easier debugging | harder tracing |
| latency composes | queueing/buffering possible |

## Latency Chain

```text
Client → A → B → C → DB
```

Each hop adds latency and failure probability.

## Rule

Keep synchronous call chains shallow.

## Trap

A 10-service synchronous chain is usually a reliability smell.


---

<!-- 10_API_GATEWAY.md -->

# API Gateway

## Role

Single entry point for external clients.

```text
Client
  ↓
API Gateway
  ├── Auth
  ├── Routing
  ├── Rate Limit
  ├── TLS
  └── Aggregation
       ↓
Services
```

## Good Responsibilities

- routing
- auth enforcement
- throttling
- observability
- protocol adaptation

## Avoid

- business logic
- heavy orchestration
- domain state

## Trap

Gateway should not become a new monolith.


---

<!-- 11_BFF.md -->

# Backend for Frontend (BFF)

## What

A dedicated backend tailored to a client type.

```text
Web App → Web BFF
Mobile  → Mobile BFF
Partner → Partner BFF
```

## Why

Different clients need different:

```text
payloads
aggregation
security
latency behavior
```

## Trap

Do not duplicate core domain logic across BFFs.


---

<!-- 12_SERVICE_DISCOVERY.md -->

# Service Discovery

## Problem

Service instances are dynamic.

```text
service-a-1
service-a-2
service-a-3
```

## Discovery Models

```text
Client-side discovery
Server-side discovery
Platform-native discovery
```

## Kubernetes Example Concept

```text
Service Name
  ↓
Cluster DNS / Service
  ↓
Healthy Pods
```

## Trap

Discovery solves location, not resilience.


---

<!-- 13_CENTRAL_CONFIG.md -->

# Centralized Configuration

## Goal

Externalize environment-specific configuration.

```text
Code
+
Config
+
Secrets
```

## Config Examples

```text
timeouts
feature flags
URLs
pool sizes
environment values
```

## Secrets

Keep separate:

```text
passwords
tokens
certificates
keys
```

## Trap

A central config system becomes a critical dependency; design caching, availability, and bootstrap carefully.


---

<!-- 14_SAGA.md -->

# Saga Pattern

## Problem

One business transaction spans multiple services.

Example:

```text
Create Order
Reserve Inventory
Charge Payment
Arrange Shipping
```

No single ACID transaction covers all services.

## Saga

A sequence of local transactions.

```text
T1 → T2 → T3 → T4
```

If failure occurs:

```text
C3 ← C2 ← C1
```

where `C` = compensating action.

## Why

Maintains business consistency without distributed 2PC.

## Trap

Compensation is business logic, not database rollback.


---

<!-- 15_SAGA_CHOREOGRAPHY.md -->

# Saga Choreography

## Flow

```text
Order Created
   ↓ event
Inventory Reserved
   ↓ event
Payment Charged
   ↓ event
Shipping Scheduled
```

## Benefits

- decentralized
- loose runtime coupling
- good event-driven fit

## Risks

- hard to see end-to-end flow
- event cycles
- debugging complexity
- logic scattered across services

## Best Fit

Simple/medium workflows.

## Trap

If business flow is impossible to understand without searching 10 repositories, choreography may be overused.


---

<!-- 16_SAGA_ORCHESTRATION.md -->

# Saga Orchestration

## Flow

```text
Saga Orchestrator
 ├── Reserve Inventory
 ├── Charge Payment
 └── Arrange Shipping
```

## Benefits

- workflow visible
- easier compensation
- centralized process control

## Risks

- orchestrator can become complex
- must avoid domain god-service

## Good Fit

Complex workflows with clear process ownership.

## Interview Line

> Orchestration centralizes workflow control; choreography decentralizes it through events.


---

<!-- 17_CQRS.md -->

# CQRS

## What

Command Query Responsibility Segregation.

Separate:

```text
Write Model
and
Read Model
```

## Visual

```text
Command → Write Service → Write DB
                      ↓ events
Query   → Read Service  → Read DB / Projection
```

## Why

- read/write scaling differences
- optimized read models
- complex domains
- event-driven integration

## Cost

- eventual consistency
- more infrastructure
- model synchronization

## Trap

CQRS does not require Event Sourcing.


---

<!-- 18_EVENT_SOURCING.md -->

# Event Sourcing

## What

Store state changes as events rather than only current state.

```text
OrderCreated
ItemAdded
PaymentAuthorized
OrderShipped
```

Current state is rebuilt from event history.

## Benefits

- audit history
- temporal analysis
- replay
- event-driven integration

## Costs

- schema evolution
- replay complexity
- event versioning
- storage growth
- operational learning curve

## Trap

Event sourcing is not required for ordinary event-driven microservices.


---

<!-- 19_OUTBOX.md -->

# Transactional Outbox Pattern

## Problem

Need to update DB and publish event reliably.

Bad:

```text
DB commit succeeds
message publish fails
```

## Pattern

Same local transaction:

```text
Business Table
+
Outbox Table
```

Then:

```text
Outbox Publisher
  ↓
Broker
```

## Visual

```text
Service Transaction
 ├── UPDATE orders
 └── INSERT outbox
          ↓
      Publisher / CDC
          ↓
        Broker
```

## Benefit

Avoids dual-write inconsistency.

## Trap

Outbox gives reliable handoff, not automatic exactly-once business processing.


---

<!-- 20_INBOX_IDEMPOTENT.md -->

# Inbox / Idempotent Consumer

## Problem

Messages may be delivered more than once.

## Pattern

Consumer tracks processed message IDs.

```text
Message
 ↓
Already processed?
 ├── yes → ignore safely
 └── no  → process + record
```

## Why

Makes at-least-once delivery safe.

## Trap

Idempotency must include business side effects, not just message acknowledgement.


---

<!-- 21_CDC.md -->

# Change Data Capture (CDC)

## What

Capture database changes and publish them as events.

## Flow

```text
Database Log
   ↓
CDC Connector
   ↓
Broker
   ↓
Consumers
```

## Uses

- outbox publishing
- analytics
- cache/index sync
- legacy integration

## Trap

CDC exposes data changes; it does not automatically create good domain events.


---

<!-- 22_STRANGLER.md -->

# Strangler Fig Pattern

## Goal

Incrementally replace a monolith.

```text
Client
  ↓
Router / Gateway
  ├── old capability → Monolith
  └── migrated capability → New Service
```

Over time:

```text
Monolith shrinks
Services grow
```

## Benefits

- gradual migration
- lower risk
- continuous delivery

## Trap

Do not create permanent duplicated business logic.


---

<!-- 23_ACL.md -->

# Anti-Corruption Layer

## What

Protects a new domain model from legacy/external models.

```text
New Service
  ↓
ACL / Adapter
  ↓
Legacy System
```

## Responsibilities

- translation
- mapping
- protocol adaptation
- semantic isolation

## Trap

An ACL should isolate external semantics, not become a giant integration platform.


---

<!-- 24_CAP_PACELC.md -->

# CAP / PACELC

## CAP

Under a network partition, choose between:

```text
Consistency
or
Availability
```

Partition tolerance is not optional in a real distributed system.

## PACELC

Even without a partition:

```text
Latency
vs
Consistency
```

trade-offs still exist.

## Trap

CAP is not “pick any two” in a simplistic permanent sense.


---

<!-- 25_EVENTUAL_CONSISTENCY.md -->

# Eventual Consistency

## What

Different services may temporarily observe different states.

## Example

```text
Payment succeeds at t1
Order projection updates at t2
```

Between t1 and t2:

```text
views differ
```

## Design Questions

- how long can inconsistency last?
- can users tolerate it?
- how is status communicated?
- what is the reconciliation path?

## Trap

Eventual consistency is a business decision, not only a technical one.


---

<!-- 26_IDEMPOTENCY.md -->

# Idempotency

## Definition

Repeating the same operation does not create additional unintended effects.

## Example

```text
POST payment with Idempotency-Key
```

Same key:

```text
same business result
```

## Needed For

- retries
- message redelivery
- network uncertainty
- payment/order APIs

## Trap

HTTP method semantics alone do not guarantee your implementation is idempotent.


---

<!-- 27_RETRY.md -->

# Retry

## Use For

Transient failures:

```text
timeout
temporary network failure
brief service overload
```

## Pattern

```text
attempt
 ↓ fail
backoff
 ↓
retry
```

## Good Retry

```text
bounded attempts
exponential backoff
jitter
idempotent operation
```

## Trap

Retrying permanent failures creates retry storms.


---

<!-- 28_CIRCUIT_BREAKER.md -->

# Circuit Breaker

## States

```text
CLOSED
  ↓ failures
OPEN
  ↓ cooldown
HALF-OPEN
  ↓ success/failure
CLOSED / OPEN
```

## Why

Stops repeatedly calling a failing dependency.

## Benefits

- fail fast
- protect threads/resources
- allow dependency recovery

## Trap

Circuit breaker does not replace timeout.


---

<!-- 29_TIMEOUT.md -->

# Timeout

## Rule

Every remote call should have a timeout budget.

```text
Client Timeout
   >
Service A timeout
   >
Service B timeout
```

Budget should decrease downstream.

## Why

Without timeouts:

```text
threads wait
queues grow
memory grows
system collapses
```

## Trap

Huge timeout values hide failure rather than handle it.


---

<!-- 30_BULKHEAD.md -->

# Bulkhead

## Analogy

A ship uses compartments so one leak does not sink everything.

## Software

Separate resource pools:

```text
Payment calls → Pool A
Search calls  → Pool B
```

## Goal

Failure isolation.

## Trap

Too many bulkheads increase complexity and waste capacity.


---

<!-- 31_RATE_LIMITING.md -->

# Rate Limiting

## Why

Protect:

```text
CPU
DB
downstream APIs
business quotas
```

## Algorithms

```text
Token Bucket
Leaky Bucket
Fixed Window
Sliding Window
```

## Placement

```text
Gateway
Service
Shared infrastructure
```

## Trap

Rate limiting and throttling policies should align with business identity, not only IP address.


---

<!-- 32_BACKPRESSURE.md -->

# Backpressure

## Problem

Producer is faster than consumer.

```text
Producer >>> Consumer
```

Queue grows until failure.

## Solutions

```text
slow producer
bounded queue
reject
drop
batch
scale consumers
```

## Trap

Infinite queues postpone failure and increase latency.


---

<!-- 33_DISTRIBUTED_LOCKING.md -->

# Distributed Locking

## Use Carefully

Needed when multiple nodes must coordinate exclusive work.

## Risks

- clock issues
- split brain
- lock expiry
- fencing
- network partitions

## Prefer

When possible:

```text
idempotency
database constraints
single-writer design
partition ownership
```

## Trap

A distributed lock without fencing can still allow stale owners to write.


---

<!-- 34_DELIVERY_SEMANTICS.md -->

# Delivery Semantics

## At-Most-Once

```text
may lose
no duplicates
```

## At-Least-Once

```text
no intentional loss
duplicates possible
```

## Exactly-Once

Usually applies within specific infrastructure/transaction boundaries.

## Business Reality

End-to-end exactly-once effects are difficult.

Prefer:

```text
at-least-once
+
idempotent processing
+
deduplication
```

## Trap

Exactly-once messaging does not automatically mean exactly-once business outcome.


---

<!-- 35_CONTAINERS_K8S.md -->

# Containers & Kubernetes

## Container

Packages service + runtime dependencies.

## Kubernetes Adds

```text
scheduling
service discovery
self-healing
rolling deployment
scaling
configuration
secrets
```

## Visual

```text
Deployment
  ↓
Pods
  ↓
Service
  ↓
Ingress / Gateway
```

## Trap

Kubernetes solves platform orchestration, not domain architecture.


---

<!-- 36_SERVICE_MESH.md -->

# Service Mesh

## What

Infrastructure layer for service-to-service communication.

## Capabilities

```text
mTLS
traffic policy
retries
telemetry
routing
```

## Architecture

```text
Service A ↔ Proxy ↔ Proxy ↔ Service B
          \____ control plane ____/
```

## Benefits

Cross-cutting network policy outside app code.

## Costs

- complexity
- latency
- debugging layers
- operational burden

## Trap

Do not adopt a mesh unless the operational value exceeds its complexity.


---

<!-- 37_LOAD_BALANCING.md -->

# Load Balancing

## Levels

```text
DNS
L4
L7
client-side
platform service
```

## Algorithms

```text
round robin
least connections
weighted
consistent hashing
```

## Trap

Load balancing distributes traffic; it does not guarantee healthy business behavior.


---

<!-- 38_HEALTH_CHECKS.md -->

# Health Checks

## Liveness

```text
Should process be restarted?
```

## Readiness

```text
Can this instance serve traffic?
```

## Startup

```text
Has initialization completed?
```

## Trap

Do not make liveness depend on every remote service; one dependency failure can trigger restart storms.


---

<!-- 39_OBSERVABILITY.md -->

# Observability

## Three Pillars

```text
Logs
Metrics
Traces
```

## Plus

```text
events
profiles
business telemetry
```

## Goal

Answer unknown questions about system behavior.

## Trap

Monitoring tells you known conditions; observability helps investigate unknown conditions.


---

<!-- 40_DISTRIBUTED_TRACING.md -->

# Distributed Tracing

## Trace

One end-to-end request.

```text
Trace
 ├── Span Gateway
 ├── Span Order
 ├── Span Payment
 └── Span DB
```

## Key Data

```text
traceId
spanId
parentSpan
duration
status
attributes
```

## Uses

- latency diagnosis
- dependency map
- failure localization

## Trap

Tracing every detail at 100% sampling can be expensive.


---

<!-- 41_LOGGING.md -->

# Logging

## Structured Log

```json
{
  "service":"order",
  "traceId":"abc",
  "orderId":"123",
  "event":"order_created"
}
```

## Include

- service
- environment
- trace/correlation ID
- event
- safe business ID

## Avoid

```text
passwords
tokens
PII
raw secrets
```

## Trap

Logs without correlation IDs are difficult to use in distributed systems.


---

<!-- 42_METRICS_SLO.md -->

# Metrics / SLI / SLO

## Golden Signals

```text
Latency
Traffic
Errors
Saturation
```

## SLI

Measured indicator.

Example:

```text
successful request %
```

## SLO

Target.

Example:

```text
99.9% success over 30 days
```

## Error Budget

Allowed unreliability.

## Trap

SLO should reflect user/business outcomes, not only infrastructure uptime.


---

<!-- 43_SECURITY_ZERO_TRUST.md -->

# Security / Zero Trust

## Principle

Never trust network location alone.

## Service-to-Service

```text
mTLS
workload identity
least privilege
authorization
```

## External

```text
OAuth2 / OIDC
JWT / opaque token
API Gateway
rate limiting
```

## Data

```text
encryption at rest
encryption in transit
secret management
audit
```

## Trap

Authentication does not equal authorization.


---

<!-- 44_SECRETS_CONFIG.md -->

# Secrets & Configuration

## Config

```text
timeouts
feature flags
URLs
non-sensitive settings
```

## Secrets

```text
passwords
private keys
API tokens
certificates
```

## Rule

Separate lifecycle and access control.

## Trap

Base64 encoding is not secret protection.


---

<!-- 45_DEPLOYMENT_STRATEGIES.md -->

# Deployment Strategies

## Rolling

Replace instances gradually.

## Blue-Green

```text
Blue = current
Green = new
switch traffic
```

## Canary

Send small traffic percentage to new version.

## Feature Flag

Deploy code separately from feature release.

## Trap

Database changes must be backward-compatible during mixed-version deployments.


---

<!-- 46_CANARY_BLUE_GREEN.md -->

# Canary vs Blue-Green

| Canary | Blue-Green |
|---|---|
| partial traffic | environment switch |
| gradual risk | fast cutover |
| needs observability | needs duplicate capacity |
| progressive rollout | simple rollback |

## Canary Flow

```text
1% → 5% → 25% → 50% → 100%
```

## Gate On

```text
error rate
latency
business KPIs
resource saturation
```


---

<!-- 47_AUTOSCALING.md -->

# Autoscaling

## Signals

```text
CPU
memory
requests/sec
queue depth
custom metrics
```

## Rule

Scale on the resource that actually represents pressure.

Example:

Queue consumers:

```text
queue depth
```

may be better than CPU.

## Trap

Autoscaling cannot fix a database bottleneck automatically.


---

<!-- 48_TESTING_PYRAMID.md -->

# Testing Pyramid

## Structure

```text
        E2E
      Contract
   Integration
      Unit
```

## Microservices Emphasis

Strong:

```text
unit
component
contract
integration
```

Keep E2E smaller.

## Trap

Too many E2E tests create slow, flaky pipelines.


---

<!-- 49_CONTRACT_TESTING.md -->

# Contract Testing

## Goal

Verify service interfaces without requiring full end-to-end environment.

## Example

```text
Consumer expectation
        ↓
Contract
        ↓
Provider verification
```

## Benefits

- faster feedback
- safer independent deployment
- less E2E coupling

## Trap

Contract tests do not verify all business workflows.


---

<!-- 50_INTEGRATION_TESTING.md -->

# Integration Testing

## Test Real Boundaries

Examples:

```text
database
broker
cache
HTTP client
schema
serialization
```

## Prefer

Ephemeral realistic dependencies where practical.

## Trap

Mocking every dependency can hide real integration failures.


---

<!-- 51_E2E_TESTING.md -->

# End-to-End Testing

## Goal

Verify critical user journeys across services.

## Use For

```text
checkout
login
payment
order completion
```

## Keep

Small and high value.

## Trap

Do not rely on E2E tests as the primary quality strategy.


---

<!-- 52_CONSUMER_DRIVEN_CONTRACTS.md -->

# Consumer-Driven Contracts

## Flow

```text
Consumer
  ↓ expectations
Contract
  ↓
Provider verifies
```

## Why

Provider can evolve safely while protecting actual consumer needs.

## Trap

Version and retire contracts deliberately; stale contracts can block useful change.


---

<!-- 53_CICD.md -->

# CI/CD for Microservices

## Pipeline

```text
Commit
 ↓
Build
 ↓
Unit
 ↓
Security Scan
 ↓
Contract Tests
 ↓
Integration
 ↓
Package
 ↓
Deploy
 ↓
Canary
 ↓
Observe
```

## Goal

Independent deployability requires independent pipelines.

## Trap

If every service release requires a synchronized mega-release, autonomy is lost.


---

<!-- 54_DB_MIGRATION.md -->

# Database Migration

## Rule

Use backward-compatible schema evolution.

## Expand / Contract

```text
1. Add new field/table
2. Deploy code supporting old + new
3. Migrate data
4. Switch reads/writes
5. Remove old structure
```

## Trap

Dropping/renaming columns in one step breaks mixed-version deployments.


---

<!-- 55_VERSIONING_COMPATIBILITY.md -->

# API / Event Versioning

## Prefer

Backward-compatible evolution.

Examples:

```text
add optional field
add new endpoint
introduce new event version
```

## Avoid

Breaking every consumer with coordinated upgrades.

## Events

Treat event schemas as long-lived public contracts.

## Trap

Internal services still need compatibility discipline.


---

<!-- 56_PERFORMANCE_LATENCY.md -->

# Performance & Latency Budget

## Latency Composition

```text
Gateway 10ms
Service A 20ms
Service B 40ms
DB 30ms
----------------
≈ 100ms + network/queue overhead
```

## Improve

- reduce hops
- parallelize independent calls
- cache carefully
- optimize slow dependencies
- batch
- async where appropriate

## Trap

Microservices increase network overhead by design.


---

<!-- 57_COST_COMPLEXITY.md -->

# Cost & Operational Complexity

## Hidden Costs

```text
more deployments
more logs
more traces
more databases
more brokers
more network calls
more incidents
more on-call complexity
```

## Rule

Microservices must generate enough organizational/business value to justify this cost.

## Trap

Infrastructure cost is only part of microservices cost; engineering cognitive load is often larger.


---

<!-- 58_ANTI_PATTERNS.md -->

# Microservices Anti-Patterns

## Distributed Monolith

Services deploy independently in theory, but must release together.

## Shared Database

Multiple services modify the same tables.

## Nano-Services

Services too small to own meaningful business capability.

## Chatty Services

Excessive sync calls.

## God Gateway

Gateway contains domain logic.

## Event Soup

Hundreds of undocumented events with unclear ownership.

## Retry Storm

Every layer retries the same failing dependency.

## Shared Library Coupling

Massive common library forces synchronized upgrades.

## Trap

The biggest microservice failure is usually poor boundaries, not technology choice.


---

<!-- 59_TROUBLESHOOTING_MATRIX.md -->

# Troubleshooting Matrix

| Symptom | First Checks | Likely Cause |
|---|---|---|
| High latency | trace waterfall | slow downstream / DB |
| Timeouts | dependency latency | capacity / network |
| Retry storm | retry metrics | excessive retry layers |
| Duplicate orders | idempotency | redelivery / retry |
| Missing event | outbox / broker | dual write / publisher |
| DB overload | query + pool | N+1 / pool / hot service |
| Cascading failure | dependency graph | no isolation |
| CPU high | profiler | compute / serialization |
| Queue lag | consumer rate | under-capacity |
| 5xx spike | deploy timeline | bad release / dependency |
| Partial transaction | saga state | compensation failure |
| Auth failures | identity / clock | token / trust / config |

## Debug Flow

```text
Metric
 ↓
Trace
 ↓
Logs
 ↓
Dependency health
 ↓
Profile / Query Plan
 ↓
Fix
 ↓
Re-measure
```


---

<!-- 60_PRODUCTION_READINESS.md -->

# Production Readiness Checklist

## Service

- [ ] clear business owner
- [ ] clear data ownership
- [ ] health endpoints
- [ ] graceful shutdown
- [ ] timeouts
- [ ] retry policy
- [ ] circuit breaker where needed
- [ ] idempotency

## Data

- [ ] migrations
- [ ] backup/recovery
- [ ] event schema
- [ ] reconciliation process

## Security

- [ ] authentication
- [ ] authorization
- [ ] mTLS/workload identity
- [ ] secret management

## Observability

- [ ] logs
- [ ] metrics
- [ ] tracing
- [ ] SLO
- [ ] alerts

## Delivery

- [ ] CI/CD
- [ ] rollback
- [ ] canary/blue-green
- [ ] contract tests


---

<!-- 61_ARCH_REVIEW.md -->

# Architecture Review Checklist

Ask:

```text
Why is this a separate service?
What business capability does it own?
Who owns it?
What data does it own?
What are its invariants?
What happens if it is unavailable?
How are transactions coordinated?
What are sync dependencies?
What are async dependencies?
How is idempotency handled?
What is the SLO?
How is it observed?
How is it secured?
How is it deployed?
How is it rolled back?
```

## Rule

If these questions cannot be answered, the service boundary is probably premature.


---

<!-- 62_INTERVIEW_TRAPS.md -->

# Microservices Interview Traps

1. Microservices are not just small REST APIs.
2. Service size is less important than business boundary.
3. Shared DB reduces autonomy.
4. Saga != 2PC.
5. CQRS != Event Sourcing.
6. Event Sourcing is optional.
7. Outbox solves dual-write reliability.
8. Outbox does not remove duplicate delivery.
9. Idempotency is essential with retries.
10. Retry needs backoff + jitter.
11. Timeout is mandatory for remote calls.
12. Circuit breaker != timeout.
13. Kubernetes != microservices architecture.
14. Service mesh != API gateway.
15. API Gateway != BFF.
16. Eventual consistency must be acceptable to business.
17. Exactly-once is usually boundary-specific.
18. Contract testing supports independent deployment.
19. Distributed tracing is critical for latency diagnosis.
20. Shared libraries can create hidden coupling.
21. Choreography can become event spaghetti.
22. Orchestration can become god-process logic.
23. Too many sync hops create cascading failures.
24. Autoscaling cannot fix shared bottlenecks.
25. Modular monolith can be the better architecture.


---

<!-- 63_ONE_PAGE_ARCHITECTURE_RECALL.md -->

# Microservices — One-Page Architecture Recall

```text
                         Clients
                            │
                            ▼
                      API Gateway
                ┌───────────┼───────────┐
                ▼           ▼           ▼
             Order       Payment     Customer
             Service      Service      Service
                │            │            │
             Order DB     Payment DB   Customer DB
                │
                └──── event ───────┐
                                   ▼
                              Message Broker
                          ┌────────┼────────┐
                          ▼        ▼        ▼
                      Inventory Shipping Analytics
```

## Cross-Cutting

```text
Discovery
Configuration
Security
Observability
Tracing
Rate Limiting
Resilience
CI/CD
```

## Distributed Data

```text
Local ACID
+
Saga
+
Outbox
+
Idempotency
+
Eventual Consistency
```

## Reliability

```text
Timeout
→ Retry
→ Circuit Breaker
→ Bulkhead
→ Rate Limit
→ Backpressure
```


---

<!-- 64_COMPARISON_MATRIX.md -->

# High-Value Comparison Matrix

## Saga vs 2PC

| Saga | 2PC |
|---|---|
| local transactions | distributed atomic protocol |
| compensation | rollback |
| scalable | coordination heavy |
| eventual consistency | strong atomicity |

## CQRS vs CRUD

| CQRS | CRUD |
|---|---|
| separate models | one model |
| complex | simple |
| scalable reads/writes | lower complexity |

## Choreography vs Orchestration

| Choreography | Orchestration |
|---|---|
| decentralized | centralized workflow |
| event-driven | coordinator |
| loose coupling | clearer flow |
| harder tracing | orchestrator complexity |

## REST vs Messaging

| REST/gRPC | Messaging |
|---|---|
| immediate response | decoupled |
| runtime dependency | temporal decoupling |
| simpler | resilient buffering |

## API Gateway vs Service Mesh

| Gateway | Mesh |
|---|---|
| north-south | east-west |
| client entry | service-to-service |
| API concerns | network policy |


---

<!-- 65_PRACTICE_QUESTIONS.md -->

# Microservices Practice Questions

1. What problem do microservices solve?
2. When should you avoid microservices?
3. Modular monolith vs microservices?
4. What is a bounded context?
5. How do you identify service boundaries?
6. Why database per service?
7. How do you query data across services?
8. Sync vs async communication?
9. API Gateway vs BFF?
10. What is service discovery?
11. What is a Saga?
12. Choreography vs orchestration?
13. Saga vs 2PC?
14. What is CQRS?
15. CQRS vs Event Sourcing?
16. What is Transactional Outbox?
17. Why do we need idempotency?
18. What is CDC?
19. What is eventual consistency?
20. Explain CAP.
21. Explain PACELC.
22. Retry best practices?
23. Timeout vs circuit breaker?
24. What is bulkhead?
25. What is backpressure?
26. Why exactly-once is difficult?
27. Service mesh vs API gateway?
28. Liveness vs readiness?
29. Logs vs metrics vs traces?
30. What is an SLO?
31. How do you secure service-to-service traffic?
32. Contract testing?
33. Expand-contract DB migration?
34. How do you version events?
35. What is a distributed monolith?
36. What are nano-services?
37. How do you troubleshoot p99 latency?
38. How do you migrate a monolith incrementally?
39. What is Strangler Fig?
40. What is your microservices production checklist?


---

<!-- 66_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

This pack is intentionally vendor-neutral.

Concepts align with established distributed-systems and microservices architecture practices, including:

- Domain-Driven Design
- independently deployable services
- database-per-service
- Saga
- CQRS
- Event Sourcing
- Transactional Outbox
- Change Data Capture
- API Gateway
- Circuit Breaker
- Bulkhead
- service discovery
- observability
- consumer-driven contracts
- progressive delivery

## Important

Technology products change faster than architecture principles.

For implementation-specific work, verify current documentation for the chosen stack, such as:

```text
Spring Boot / Spring Cloud
Kubernetes
Istio / Linkerd
Kafka
RabbitMQ
AWS
Azure
GCP
Dapr
OpenTelemetry
```

## Core Rule

A microservices architecture should be judged by:

```text
business alignment
independent delivery
resilience
data ownership
operability
security
cost
```

—not by the number of services.
