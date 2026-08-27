# M10 — Enterprise System Design & Architecture Whiteboarding
## AI & Data Campus Interview Preparation

**Interview:** 28 August 2026, 3:00 PM IST  
**Framework:** Standard Interview Preparation Framework  
**Module:** M10  
**Phase:** Phase 3 — Architecture & Interview Conversion  
**Priority:** P0 — Must Pass  
**Status:** Ready for Study / Practice

---

# 1. Module Objective

This module prepares you for senior-level **System Design / Solution Architecture / Whiteboarding** discussions around AI and Data systems.

By the end of M10, you must be able to:

1. Clarify functional requirements before designing.
2. Define non-functional requirements explicitly.
3. Produce a clean High-Level Design (HLD).
4. Drill into Low-Level Design (LLD) only where needed.
5. Design APIs and data contracts.
6. Select storage based on access patterns.
7. Explain caching, scaling, security, logging, monitoring, deployment, and failure handling.
8. Compare alternatives and justify trade-offs.
9. Design three likely interview systems:
   - Enterprise RAG Platform
   - Enterprise Agentic AI Platform
   - Azure Data Lakehouse Platform
10. Survive architecture cross-questioning.
11. Whiteboard clearly and progressively.
12. Avoid technology-first design.

---

# 2. Locked System Design Answer Structure

For every system-design question, follow this order:

```text
1. Functional Requirements
2. Non-Functional Requirements
3. Constraints / Assumptions
4. High-Level Design
5. API Design
6. Data / Storage Design
7. Detailed Component Design
8. Caching
9. Scaling
10. Security
11. Logging
12. Monitoring / Observability
13. Deployment
14. Failure Handling
15. DR / Resilience
16. Cost
17. Trade-Offs
18. Alternatives
```

Do not jump straight to Azure, Kubernetes, LangGraph, or vector databases.

---

# 3. First 3 Minutes of Any System Design Interview

A strong candidate does not begin drawing immediately.

Ask:

### Functional
- Who are the users?
- What are the main use cases?
- Read-only or actions too?
- Real-time or asynchronous?
- Is multi-tenancy required?

### Scale
- Approximate user count?
- Requests per second?
- Data volume?
- Document count?
- Event throughput?

### Quality / Risk
- Accuracy expectations?
- Security/compliance?
- PII?
- Availability target?
- Latency target?

Then state assumptions if numbers are unavailable.

---

# 4. Functional Requirements

Functional requirements describe what the system must do.

Example for RAG:

```text
FR1. Ingest enterprise documents.
FR2. Support user questions.
FR3. Retrieve authorized content.
FR4. Generate grounded responses.
FR5. Return citations.
FR6. Support document updates/deletes.
FR7. Capture feedback.
```

---

# 5. Non-Functional Requirements

Typical NFRs:

- availability,
- latency,
- scalability,
- reliability,
- security,
- privacy,
- consistency,
- auditability,
- maintainability,
- cost,
- observability.

Example:

```text
Availability: 99.9%
P95 latency: < 4s
Tenant isolation: mandatory
Audit retention: 1 year
No cross-tenant data leakage
```

---

# 6. Capacity Estimation

You do not need perfect math.

Use simple estimation.

Example:

```text
100,000 users
10% daily active
5 queries/day
= 50,000 queries/day

Average ≈ 0.6 QPS
Peak maybe 10x
≈ 6 QPS
```

The purpose is architecture sizing, not mathematical precision.

---

# 7. Read-Heavy vs Write-Heavy

This decision influences:

- caching,
- replicas,
- indexing,
- consistency,
- database choice.

RAG query systems are often read-heavy.

Ingestion is asynchronous/write-oriented.

---

# 8. Sync vs Async

Use synchronous path for:

- interactive query,
- short tool operation.

Use asynchronous path for:

- large document ingestion,
- report generation,
- long-running agent workflows,
- bulk processing.

---

# 9. High-Level Design Principle

HLD should show major responsibilities, not low-level classes.

Example:

```text
Client
 ↓
API Gateway
 ↓
Application Service
 ↓
Domain Services
 ↓
Storage / External Services
```

Cross-cutting:

```text
Identity
Observability
Security
Caching
Messaging
```

---

# 10. API Gateway

Responsibilities may include:

- authentication integration,
- routing,
- throttling,
- rate limiting,
- request size limits,
- observability.

Do not place business logic in the gateway.

---

# 11. Service Layer

Business logic belongs in application/domain services.

For AI:

- orchestration,
- retrieval,
- policy,
- prompt/model routing,
- tool execution.

---

# 12. API Design Principles

Use:

- clear resource names,
- versioning,
- idempotency,
- validation,
- pagination,
- correlation IDs,
- proper HTTP status codes.

---

# 13. Example — Ask API

```http
POST /api/v1/questions
```

Request:

```json
{
  "question": "What is our India leave policy?",
  "conversationId": "c123"
}
```

Response:

```json
{
  "answer": "...",
  "citations": [],
  "requestId": "r123"
}
```

---

# 14. Example — Document Ingestion

```http
POST /api/v1/documents
```

Response:

```json
{
  "documentId": "d123",
  "status": "QUEUED"
}
```

Use async processing for large documents.

---

# 15. Idempotency

For operations with side effects:

```http
Idempotency-Key: <unique-key>
```

Prevents duplicate processing during retries.

---

# 16. Database Selection Principle

Do not choose database by popularity.

Choose by:

- access pattern,
- consistency,
- scale,
- query type,
- latency,
- operational need.

---

# 17. Relational Database

Use for:

- transactions,
- relational integrity,
- structured queries,
- configuration,
- workflow state.

---

# 18. Document Database

Use for:

- flexible JSON-like data,
- rapidly evolving schema,
- document-oriented access.

---

# 19. Vector Store

Use for:

- semantic similarity retrieval.

Do not store irreplaceable system-of-record data only in vector index.

---

# 20. Graph Database

Use when relationships are first-class.

Examples:

- knowledge graph,
- dependency graph,
- fraud network,
- multi-hop reasoning.

---

# 21. Object Storage

Use for:

- documents,
- raw data,
- large files,
- data lake.

---

# 22. Cache

Use for expensive/repeated reads.

Examples:

- configuration,
- session,
- retrieval,
- semantic responses.

---

# 23. Cache Risks

- stale data,
- permission leakage,
- invalidation complexity.

Security-sensitive cache keys must include:

```text
tenant
authorization context
data version
```

---

# 24. Scaling — Horizontal vs Vertical

## Vertical

Bigger machine.

## Horizontal

More instances.

Cloud-native applications often prefer horizontal scaling where feasible.

---

# 25. Stateless Services

Prefer stateless API instances.

Persist state externally.

Benefits:

- easier scaling,
- failover,
- rolling deployment.

---

# 26. Load Balancer

Distributes traffic across instances.

Need:

- health checks,
- connection handling,
- TLS.

---

# 27. Rate Limiting

Protect:

- system capacity,
- LLM quota,
- tool APIs,
- cost.

Apply per:

- user,
- tenant,
- API key.

---

# 28. Queue

Use queue to decouple workloads.

Example:

```text
API
 ↓
Queue
 ↓
Workers
```

Benefits:

- retries,
- smoothing bursts,
- independent scaling.

---

# 29. Backpressure

When downstream cannot keep up:

- queue,
- throttle,
- reject,
- degrade gracefully.

Do not allow infinite accumulation.

---

# 30. Circuit Breaker

Stop repeated calls to failing dependencies.

Relevant for:

- LLM,
- vector DB,
- external APIs,
- database.

---

# 31. Timeout

Every remote call needs bounded timeout.

---

# 32. Retry

Retry transient failures only.

Use:

- exponential backoff,
- jitter,
- max attempts,
- idempotency.

---

# 33. Bulkhead

Isolate failure domains.

Example:

Separate resource pools for:

- RAG traffic,
- agent traffic,
- ingestion.

A spike in one should not collapse all workloads.

---

# 34. Graceful Degradation

Examples:

- re-ranker unavailable → use initial retrieval,
- preferred model unavailable → fallback model,
- vector search unavailable → keyword fallback.

---

# 35. Observability

Every architecture answer should include:

```text
Logs
Metrics
Traces
Alerts
Dashboards
```

For AI:

```text
Quality
Tokens
Cost
Retrieval
Tool Calls
```

---

# 36. Logging

Capture:

- request ID,
- tenant,
- component,
- status,
- error.

Avoid secrets/PII.

---

# 37. Metrics

Examples:

- RPS,
- latency,
- error rate,
- saturation,
- token usage,
- retrieval recall,
- agent step count.

---

# 38. Distributed Tracing

Trace:

```text
Gateway
 ↓
API
 ↓
Retrieval
 ↓
LLM
 ↓
Tool
```

---

# 39. Alerting

Alert on:

- availability,
- latency,
- error rate,
- failed ingestion,
- quality degradation,
- cost spike,
- security anomaly.

---

# 40. Security Architecture

Use layered model:

```text
Identity
 ↓
Authentication
 ↓
Authorization
 ↓
Data Access
 ↓
Tool Access
 ↓
Output Validation
 ↓
Audit
```

---

# 41. Security Checklist

- Entra/OIDC
- least privilege
- Managed Identity
- Key Vault
- private networking
- encryption
- tenant isolation
- PII controls
- audit
- secret rotation

---

# 42. Multi-Tenancy

Options:

## Shared Everything

Cheaper, more isolation complexity.

## Shared App + Isolated Data

Common enterprise compromise.

## Fully Isolated

Strongest boundary, highest cost.

---

# 43. Tenant Isolation

Need isolation at:

- storage,
- cache,
- index,
- logs,
- memory,
- tools.

---

# 44. Availability

Design for failure.

Use:

- multiple instances,
- zones,
- managed services,
- retries,
- health checks,
- failover.

---

# 45. RPO / RTO

RPO:

> acceptable data loss.

RTO:

> acceptable recovery time.

State business targets.

---

# 46. Disaster Recovery

Consider:

- backup,
- replication,
- infrastructure as code,
- cross-region,
- restore tests.

---

# 47. Deployment

Typical:

```text
DEV → TEST → STAGE → PROD
```

Use:

- immutable artifacts,
- automated tests,
- approval gates,
- canary/blue-green,
- rollback.

---

# 48. Architecture Trade-Offs

Every design has trade-offs.

Examples:

- consistency vs availability,
- latency vs quality,
- isolation vs cost,
- simplicity vs flexibility,
- managed service vs control,
- single provider vs portability.

---

# 49. DESIGN 1 — Enterprise RAG Platform

---

# 50. Functional Requirements — RAG

```text
FR1. Ingest documents.
FR2. Parse and index content.
FR3. Ask natural-language questions.
FR4. Retrieve only authorized content.
FR5. Generate grounded answers.
FR6. Return citations.
FR7. Update/delete documents.
FR8. Capture feedback.
```

---

# 51. NFR — RAG

```text
Availability: 99.9%
P95 latency: < 4 sec
Multi-tenant
No cross-tenant leakage
Support millions of chunks
Auditability
Cost budget/request
```

---

# 52. RAG HLD

```text
                    USERS
                      ↓
                API Gateway
                      ↓
              AuthN / AuthZ
                      ↓
               RAG Service
          ┌───────────┼────────────┐
          │           │            │
      Query Proc   Retrieval    Policy
          │           │            │
          │      Hybrid Search     │
          │           ↓            │
          │        Re-Rank         │
          └───────────┼────────────┘
                      ↓
                Context Builder
                      ↓
                  LLM Gateway
                      ↓
                    Model
                      ↓
               Output Validator
                      ↓
                  Response

INGESTION:
Sources → Queue → Parser → Chunker → Embedding → Index
```

---

# 53. RAG Data Stores

- Object storage → source documents
- Relational/metadata DB → document status/config
- Vector/search store → embeddings/index
- Cache → approved repeated retrieval
- Audit store → trace/security

---

# 54. RAG Scaling

Ingestion:

- queue,
- parallel workers,
- batch embeddings.

Query:

- stateless APIs,
- autoscaling,
- replicated search,
- model concurrency control.

---

# 55. RAG Security

Critical:

```text
User identity
 ↓
Tenant/ACL
 ↓
Authorized retrieval
 ↓
Context
 ↓
LLM
```

Never rely on prompt to hide unauthorized data.

---

# 56. RAG Failure Handling

- embedding provider down,
- search timeout,
- stale index,
- re-ranker down,
- model unavailable.

Define fallback/degraded behavior.

---

# 57. RAG Trade-Offs

- vector-only vs hybrid
- Top-K recall vs noise
- dedicated vector DB vs existing search/DB
- large model vs small model
- shared vs isolated index

---

# 58. RAG Cross-Questions

Expect:

1. Why RAG?
2. Why not fine-tuning?
3. Why vector DB?
4. How do you secure it?
5. How do you update/delete?
6. How do you evaluate?
7. How do you scale?
8. How do you reduce cost?

---

# 59. DESIGN 2 — Enterprise Agentic AI Platform

---

# 60. Functional Requirements — Agentic Platform

```text
FR1. Accept user goal.
FR2. Select appropriate tools.
FR3. Maintain execution state.
FR4. Support retries.
FR5. Support human approval.
FR6. Execute authorized actions.
FR7. Audit full trajectory.
FR8. Resume interrupted runs.
```

---

# 61. NFR — Agent

```text
Safety
Auditability
Bounded autonomy
Resumability
Low duplicate-action risk
Cost budget/run
Latency appropriate to use case
```

---

# 62. Agent HLD

```text
User
 ↓
Gateway
 ↓
Identity
 ↓
Agent Orchestrator
 ├── Planner / Router
 ├── State Store
 ├── Memory
 ├── Policy Engine
 └── Tool Gateway
        ├── RAG
        ├── SQL
        ├── APIs
        └── Action Tools
 ↓
Human Approval
 ↓
Execution
 ↓
Audit / Trace
```

---

# 63. Agent State

Store:

```text
run_id
goal
current_step
tool_results
approval
retry_count
status
```

---

# 64. Agent Tool Security

Model does not directly execute unrestricted operations.

Use:

```text
Model proposes
 ↓
Policy validates
 ↓
Authorization validates
 ↓
Tool adapter executes
```

---

# 65. Agent Stop Conditions

- completed,
- max steps,
- timeout,
- no valid action,
- human escalation.

---

# 66. Agent Reliability

Need:

- checkpoint,
- retry,
- idempotency,
- duplicate-action prevention,
- circuit breaker.

---

# 67. Multi-Agent

Use only if specialization creates value.

Example:

```text
Supervisor
 ├── Research Agent
 ├── Data Agent
 └── Action Agent
```

---

# 68. Agent Scaling

Scale:

- orchestrator API,
- state store,
- workers,
- tool concurrency.

Watch:

- LLM provider quotas,
- agent loops,
- cost.

---

# 69. Agent Observability

Track:

- decision,
- node,
- tool,
- input,
- output,
- retry,
- approval,
- latency,
- cost.

---

# 70. Agent Trade-Offs

- workflow vs agent
- single vs multi-agent
- autonomy vs control
- synchronous vs asynchronous
- model strength vs cost

---

# 71. Agent Cross-Questions

1. Why agent?
2. Why not workflow?
3. How stop loops?
4. How secure tools?
5. How persist state?
6. How recover?
7. How avoid duplicate actions?
8. How evaluate trajectory?
9. How control cost?

---

# 72. DESIGN 3 — Enterprise Azure Lakehouse

---

# 73. Functional Requirements — Lakehouse

```text
FR1. Ingest batch data.
FR2. Ingest streaming events.
FR3. Preserve raw data.
FR4. Clean/conform data.
FR5. Build business-ready models.
FR6. Support BI/analytics/AI.
FR7. Provide lineage/governance.
FR8. Support incremental loads.
```

---

# 74. NFR — Lakehouse

```text
Freshness SLA
Data quality SLA
Scalability
Security
Lineage
Cost efficiency
Recoverability
```

---

# 75. Lakehouse HLD

```text
Sources
 ├── Databases
 ├── SaaS
 ├── Files
 └── Events
      ↓
ADF / Fabric Data Factory / Event Hubs
      ↓
ADLS / OneLake
      ↓
Bronze
      ↓
Databricks / Spark
      ↓
Silver
      ↓
Gold
      ↓
Fabric / Synapse / Power BI / AI

Governance:
Unity Catalog / Platform Governance

Security:
Entra / Managed Identity / Key Vault / Private Network
```

---

# 76. Lakehouse Storage

Use:

- raw immutable source,
- Delta tables,
- curated layers.

Keep source lineage.

---

# 77. Incremental Load

Use:

- CDC,
- watermark,
- source timestamps.

Must be idempotent.

---

# 78. Streaming

Use Event Hubs + Structured Streaming where business latency requires.

Need:

- checkpointing,
- late-event handling,
- idempotent sink.

---

# 79. Data Quality

Gate:

```text
Bronze
 ↓
Validation
 ↓
Silver
 ↓
Business Rules
 ↓
Gold
```

Invalid data → quarantine.

---

# 80. Governance

Track:

- ownership,
- lineage,
- classification,
- access,
- schema,
- retention.

---

# 81. Lakehouse Scaling

Scale:

- storage independently,
- Spark compute,
- ingestion throughput,
- BI serving.

---

# 82. Lakehouse Cost

Control:

- incremental processing,
- job compute,
- autoscaling,
- file optimization,
- partition pruning,
- idle shutdown.

---

# 83. Lakehouse Failure Handling

- source unavailable,
- schema drift,
- bad record,
- partial batch,
- duplicate retry,
- streaming lag.

---

# 84. Lakehouse Trade-Offs

- batch vs stream
- Fabric vs Databricks
- Synapse vs Fabric
- shared lake vs domain isolation
- denormalized vs dimensional serving

---

# 85. Cross-Cutting Architecture — Security

Use:

```text
Entra
 ↓
Managed Identity
 ↓
RBAC / ACL / Catalog Permissions
 ↓
Key Vault
 ↓
Private Endpoints
```

---

# 86. Cross-Cutting Architecture — Observability

Every design should answer:

- What do we log?
- Which metrics?
- Which traces?
- What alerts?
- What dashboards?
- What SLO?

---

# 87. Cross-Cutting Architecture — Cost

Ask:

> "What is the unit cost?"

Examples:

- cost/query,
- cost/agent run,
- cost/GB processed,
- cost/document.

---

# 88. Cross-Cutting Architecture — Governance

Track:

- owner,
- version,
- release,
- data lineage,
- model/prompt version,
- policy.

---

# 89. Cross-Cutting Architecture — Failure Handling

Always cover:

```text
Timeout
Retry
Fallback
Circuit Breaker
Queue
Idempotency
Dead Letter
Human Escalation
```

Use only where relevant.

---

# 90. Cross-Cutting Architecture — DR

State:

- backup,
- restore,
- infrastructure recreation,
- region strategy,
- RPO/RTO.

---

# 91. Whiteboard Technique

Use progressive drawing.

Do not draw entire diagram immediately.

Sequence:

```text
User
 ↓
Core Service
 ↓
Data
```

Then add:

```text
Cache
Queue
Security
Observability
Scaling
```

This makes explanation easier.

---

# 92. Whiteboard Communication

Say what you are doing.

Example:

> "I'll first establish the synchronous user path, then I'll add the asynchronous ingestion path, and after that I'll cover security and scaling."

This demonstrates control.

---

# 93. Requirement Clarification Script

Use:

> "Before I choose technologies, I'd like to clarify the user journey, scale, latency target, data sensitivity, and whether the system performs read-only assistance or production actions."

Strong senior opening.

---

# 94. Technology Selection Script

Use:

> "I'll first define the required capability. Then I'll map that to a service. I don't want to choose a product before we establish the workload."

---

# 95. Trade-Off Script

Use:

> "The advantage of this choice is X. The cost is Y. If the priority changes from latency to isolation, I would choose Z instead."

---

# 96. Unknown Scale

If interviewer does not provide scale:

> "I'll assume 100K registered users, 10K DAU, and peak tens of QPS. The architecture can scale horizontally if those numbers grow."

State assumptions clearly.

---

# 97. Avoid Overengineering

Do not automatically add:

- Kafka,
- Kubernetes,
- multi-region,
- microservices,
- multi-agent.

Use only when justified.

---

# 98. Monolith vs Microservices

Start with modular monolith if:

- small team,
- simple domain,
- moderate scale.

Use microservices when:

- independent scaling,
- team autonomy,
- clear bounded contexts,
- operational maturity.

---

# 99. Managed Service vs Self-Hosted

Managed service:

- faster delivery,
- lower ops burden.

Self-hosted:

- more control,
- potentially more portability,
- higher operations.

---

# 100. Consistency

Strong consistency:

- financial transactions,
- permissions.

Eventual consistency:

- search index,
- analytics replication.

---

# 101. CAP — Interview Level

Distributed system trade-off during network partition:

- consistency,
- availability.

Do not overuse CAP where irrelevant.

---

# 102. Caching Strategies

Patterns:

- cache-aside,
- write-through,
- write-behind.

For interview, cache-aside is most common.

---

# 103. Cache-Aside

```text
Read Cache
 ↓ miss
Read DB
 ↓
Populate Cache
```

Need TTL/invalidation.

---

# 104. Pagination

Use cursor-based pagination for large/changing datasets where appropriate.

Avoid unbounded result sets.

---

# 105. API Versioning

Example:

```text
/api/v1/...
```

Avoid breaking existing consumers without migration plan.

---

# 106. Event-Driven Design

Use events where:

- decoupling needed,
- asynchronous side effects,
- multiple consumers.

Do not use events for every internal method call.

---

# 107. Event Schema

Version event schema.

Need:

- event ID,
- timestamp,
- type,
- version,
- correlation ID.

---

# 108. Exactly-Once Trap

Do not claim exactly-once casually.

Use:

> "I design for idempotent processing so retries do not create incorrect duplicate effects."

---

# 109. Security Whiteboard Checklist

After architecture:

```text
AuthN?
AuthZ?
Secrets?
Encryption?
Private network?
PII?
Tenant isolation?
Audit?
```

---

# 110. Performance Whiteboard Checklist

```text
Latency?
Throughput?
Cache?
Parallelism?
Data locality?
Model latency?
Network?
```

---

# 111. Reliability Whiteboard Checklist

```text
Retry?
Timeout?
Circuit breaker?
Fallback?
Queue?
Idempotency?
DR?
```

---

# 112. Observability Whiteboard Checklist

```text
Logs?
Metrics?
Traces?
Alerts?
Quality?
Cost?
```

---

# 113. Interview Question — Design RAG System

Use M04 + this architecture method.

Do not answer only:

```text
PDF → Embedding → Vector DB → LLM
```

Need:

- ingestion lifecycle,
- security,
- retrieval,
- evaluation,
- updates,
- observability,
- cost.

---

# 114. Interview Question — Design Agent System

Do not answer only:

```text
LLM → Tools
```

Need:

- state,
- policy,
- authorization,
- checkpoint,
- stop condition,
- human approval,
- idempotency,
- audit.

---

# 115. Interview Question — Design Data Platform

Do not answer only:

```text
ADF → Databricks → Power BI
```

Need:

- source,
- storage,
- quality,
- incremental load,
- governance,
- security,
- monitoring,
- cost,
- DR.

---

# 116. Q01 — Conceptual Questions

1. Functional vs non-functional requirement?
2. HLD vs LLD?
3. Vertical vs horizontal scaling?
4. Cache vs DB?
5. Sync vs async?
6. Queue?
7. Circuit breaker?
8. Idempotency?
9. RPO/RTO?
10. Multi-tenancy?
11. Stateless service?
12. Rate limiting?
13. Load balancer?
14. Event-driven architecture?
15. Strong vs eventual consistency?

---

# 117. Q04 — Scenario Questions

1. Design enterprise RAG.
2. Design customer-service agent.
3. Design Azure lakehouse.
4. Scale to 1M users.
5. Secure multi-tenant SaaS.
6. Handle provider outage.
7. Reduce P95 latency.
8. Reduce cost.
9. Add multi-region DR.
10. Handle 10x traffic spike.

---

# 118. Q06 — Debugging Questions

1. Latency spikes.
2. Cache leaks tenant data.
3. duplicate write.
4. queue backlog.
5. vector DB unavailable.
6. LLM rate limit.
7. DB connection saturation.
8. region outage.
9. stale data.
10. poor AI quality despite healthy infrastructure.

---

# 119. Q07 — Architecture Review

Weak:

```text
Client
 ↓
Backend
 ↓
LLM
 ↓
Database
```

Ask what's missing.

Possible:

- gateway,
- auth,
- authorization,
- cache,
- queue,
- retrieval,
- policy,
- tools,
- observability,
- retries,
- rate limits,
- deployment,
- DR.

---

# 120. Q08 — Optimization

Latency:

- cache,
- reduce hops,
- parallelize,
- smaller model,
- optimize retrieval.

Scale:

- horizontal services,
- queue workers,
- replicas.

Cost:

- model routing,
- autoscale,
- cache,
- batch.

---

# 121. Q10 — Edge Cases

- empty request,
- huge payload,
- duplicate request,
- provider timeout,
- partial failure,
- unauthorized tenant,
- stale cache,
- failed deployment,
- data corruption,
- model regression.

---

# 122. Q11 — Architecture Pseudocode

```text
function handleRequest(user, request):

    identity = authenticate(user)
    permissions = authorize(identity)

    validate(request)

    cached = cache.get(
        tenantAwareKey(request, permissions)
    )

    if cached:
        return cached

    result = executeDomainFlow(
        request,
        permissions
    )

    validateOutput(result)

    cache.put(...)

    recordMetrics()
    recordTrace()
    recordCost()

    return result
```

---

# 123. Q12 — Cross-Question Survival

After any architecture, expect:

1. Why this architecture?
2. Why this database?
3. Why cache?
4. How scale?
5. How secure?
6. What fails?
7. How recover?
8. How monitor?
9. How deploy?
10. How roll back?
11. How handle cost?
12. What alternative?
13. What would change at 100x scale?
14. What would you remove for MVP?
15. How would you test this?

---

# 124. Trainer Audition — Explain System Design

> "System design is not about drawing many boxes. It is about understanding the business requirement and making justified decisions about responsibilities, data, scale, security, reliability, and trade-offs."

---

# 125. Trainer Audition — Architecture Exercise

Give learners:

> "Design an employee policy assistant."

Require:

1. functional requirements,
2. NFRs,
3. HLD,
4. data design,
5. security,
6. failure handling,
7. trade-offs.

Do not give them technology names first.

---

# 126. Trainer Assessment Rubric

Evaluate:

- requirement clarity,
- component boundaries,
- data design,
- scalability,
- security,
- reliability,
- observability,
- trade-offs,
- communication.

---

# 127. 20-Minute System Design Timebox

```text
0–3 min
Requirements

3–5 min
Scale + NFRs

5–10 min
HLD

10–14 min
Deep Dive

14–17 min
Security + Scale + Failure

17–19 min
Trade-offs

19–20 min
Summary
```

---

# 128. 5-Minute Architecture Summary

Use:

> "The user enters through a secured API layer. The application is stateless and horizontally scalable. Long-running work is decoupled through messaging. Data is stored according to access pattern, with caching for expensive reads. All sensitive access uses identity and authorization. The design includes timeouts, retries, circuit breakers, observability, controlled deployment, and a defined DR strategy."

Then tailor to system.

---

# 129. Senior-Level Principles

Memorize:

> **1. Start with requirements, not technologies.**

> **2. State assumptions explicitly.**

> **3. Design for failure.**

> **4. Separate synchronous user paths from asynchronous heavy work.**

> **5. Choose storage by access pattern.**

> **6. Security and observability are architecture, not add-ons.**

> **7. Every cache needs an invalidation and security story.**

> **8. Every retry needs an idempotency story.**

> **9. Every design needs a cost story.**

> **10. Every architecture choice should have an alternative and trade-off.**

---

# 130. High-Probability Rapid-Fire Questions

Answer in 30–60 seconds:

1. FR vs NFR?
2. HLD vs LLD?
3. stateless?
4. horizontal scaling?
5. load balancer?
6. API gateway?
7. rate limiting?
8. cache?
9. cache invalidation?
10. queue?
11. backpressure?
12. circuit breaker?
13. retry?
14. idempotency?
15. bulkhead?
16. graceful degradation?
17. multi-tenancy?
18. RPO?
19. RTO?
20. DR?
21. relational vs NoSQL?
22. vector DB?
23. graph DB?
24. event-driven?
25. strong vs eventual consistency?
26. observability?
27. SLO?
28. blue-green?
29. canary?
30. cost optimization?

---

# 131. M10 Readiness Gate

Do not mark M10 complete until all P0 items can be answered clearly.

## Gate A — Method

- [ ] Clarify requirements before design.
- [ ] Define NFRs.
- [ ] State assumptions.
- [ ] Draw HLD.
- [ ] Design APIs.
- [ ] Choose data stores by access pattern.
- [ ] Explain trade-offs.

## Gate B — Cross-Cutting Concerns

- [ ] Caching.
- [ ] Scaling.
- [ ] Security.
- [ ] Logging.
- [ ] Monitoring.
- [ ] Deployment.
- [ ] Failure handling.
- [ ] DR.
- [ ] Cost.

## Gate C — RAG Design

- [ ] Whiteboard full enterprise RAG.
- [ ] Explain ingestion.
- [ ] Explain ACL-aware query path.
- [ ] Explain evaluation.
- [ ] Explain update/delete.
- [ ] Explain scale/cost/failure.

## Gate D — Agent Design

- [ ] Whiteboard enterprise agent platform.
- [ ] Explain state/checkpoint.
- [ ] Explain tool authorization.
- [ ] Explain human approval.
- [ ] Explain idempotency.
- [ ] Explain trajectory observability.

## Gate E — Data Platform Design

- [ ] Whiteboard Azure lakehouse.
- [ ] Explain batch + stream.
- [ ] Explain Bronze/Silver/Gold.
- [ ] Explain security/governance.
- [ ] Explain quality/failure/cost.

## Gate F — Interview Conversion

- [ ] Complete one 20-minute design.
- [ ] Survive "Why this technology?"
- [ ] Survive "What fails?"
- [ ] Survive "How scale?"
- [ ] Survive "How secure?"
- [ ] Survive "How reduce cost?"
- [ ] Survive "What alternative?"
- [ ] Explain design to beginner.

### Completion Rule

**M10 PASS = You can lead a structured 20-minute architecture interview, defend decisions, and cover production concerns without interviewer prompting.**

Weak items move to **M12 Gap Closure**.

---

# 132. M10 One-Minute Battle Card

```text
START
Requirements.

THEN
NFRs + scale + assumptions.

HLD
Major responsibilities only.

DATA
Choose by access pattern.

SCALE
Stateless + horizontal + queue.

SECURITY
Identity → AuthZ → Data/Tool permissions.

RELIABILITY
Timeout + retry + idempotency + circuit breaker.

OBSERVABILITY
Logs + metrics + traces + AI quality.

DEPLOY
Immutable + canary + rollback.

DR
RPO + RTO.

TRADE-OFF
Always explain alternative.

SENIOR PRINCIPLE
Do not design with technology names first.
```

---

# 133. Next Module

After M10 passes its readiness gate:

# **M11 — Corporate Trainer Audition & Curriculum Defense**

M11 will cover:

- trainer selection criteria,
- adult learning,
- mixed-skill audiences,
- classroom control,
- explain-on-demand,
- whiteboard audition,
- labs,
- assessments,
- rubrics,
- remediation,
- curriculum sequencing,
- learning outcomes,
- capstone design,
- trainer credibility,
- unknown-question handling,
- difficult learner scenarios,
- curriculum defense,
- readiness gate.

---

**End of M10 — Enterprise System Design & Architecture Whiteboarding**
