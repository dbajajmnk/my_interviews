# iRun Corporate Training Interview Preparation
## Module 06 — API, Middleware & Integration Operations

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P0 — Must Be Strong Before Interview  
**Primary Goal:** Demonstrate strong production troubleshooting across REST APIs, gateways, middleware, service-to-service communication, authentication, DNS/TLS, retries, circuit breakers, queues, and distributed dependencies.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain an API request path end-to-end.
- Troubleshoot HTTP failures systematically.
- Distinguish 4xx vs 5xx behavior.
- Diagnose authentication and authorization problems.
- Investigate timeout and latency issues.
- Explain retries, backoff, idempotency, and circuit breakers.
- Diagnose DNS, TLS, gateway, and dependency failures.
- Handle “works locally but fails in production” integration scenarios.
- Explain synchronous vs asynchronous integrations.
- Troubleshoot messaging and queue issues at interview depth.
- Teach API/integration failures through realistic corporate labs.
- Whiteboard service-to-service request flow.
- Survive follow-up questions without relying on generic “check logs” answers.

The panel should think:

> **“He understands distributed application troubleshooting, not just HTTP status codes.”**

---

# 2. What the Client May Evaluate

The interviewer may test:

- REST request flow
- HTTP methods
- HTTP status codes
- 400 / 401 / 403 / 404
- 409 / 429
- 500 / 502 / 503 / 504
- Authentication vs authorization
- API gateways
- Load balancers
- DNS
- TLS/certificates
- Timeouts
- Retries
- Circuit breakers
- Rate limiting
- Idempotency
- Serialization
- Payload validation
- Downstream dependency failures
- Synchronous vs asynchronous communication
- Queues/messaging
- Correlation IDs
- Distributed tracing
- Integration lab design

---

# 3. API Request Flow Mental Model

Use:

```text
CLIENT
  |
DNS
  |
LOAD BALANCER / API GATEWAY
  |
AUTHENTICATION / AUTHORIZATION
  |
APPLICATION / SERVICE
  |
BUSINESS LOGIC
  |
+----------+-----------+-----------+
|          |           |           |
DB       CACHE       API       MESSAGE QUEUE
                          |
                    DOWNSTREAM SERVICE
```

When a request fails, identify **which hop is failing**.

---

# 4. Core Troubleshooting Flow

Use:

`Client → DNS → Network/TLS → Gateway → Auth → Service → Dependency → Runtime → Infrastructure`

Correlate with:

`Logs + Metrics + Traces`

---

# 5. HTTP Status Codes — Operational View

Do not memorize only definitions.

Understand what layer might generate them.

## 400 — Bad Request

Possible causes:

- Invalid payload
- Missing parameter
- Validation failure
- Serialization format issue
- Invalid header

## 401 — Unauthorized / Authentication Required

Possible causes:

- Missing token
- Invalid token
- Expired token
- Signature issue
- Wrong issuer/audience

## 403 — Forbidden

Authentication succeeded, but permission is insufficient.

Possible causes:

- Role mismatch
- Scope missing
- policy restriction

## 404 — Not Found

Possible causes:

- Wrong route
- Wrong resource
- gateway mapping
- version mismatch

## 409 — Conflict

Possible causes:

- Duplicate operation
- state conflict
- optimistic locking
- resource already exists

## 429 — Too Many Requests

Possible causes:

- Rate limit
- quota exceeded
- throttling

## 500 — Internal Server Error

Application-side unhandled failure.

## 502 — Bad Gateway

Gateway received invalid/unusable response from upstream.

## 503 — Service Unavailable

Service unavailable, overloaded, unhealthy, or no backend available.

## 504 — Gateway Timeout

Gateway waited too long for upstream response.

---

# 6. Strong Answer — “How Do You Troubleshoot an API Failure?”

> “I first establish whether the failure is client-side, gateway-level, service-level or downstream.
>
> I look at the HTTP status, correlation ID, request timing and recent changes. Then I correlate gateway logs, application logs, metrics and traces.
>
> I validate authentication, routing, service health and dependencies such as database or downstream APIs.
>
> If the issue is latency-related, I use traces and dependency metrics to identify where time is being spent.
>
> I form a hypothesis from evidence, validate it, restore service if needed and then document RCA.”

---

# 7. 401 vs 403

## 401

Question:

> “Who are you?”

Authentication problem.

## 403

Question:

> “You are authenticated, but are you allowed?”

Authorization problem.

## Strong Interview Answer

> “401 usually indicates the request could not be authenticated; 403 means identity is known but access is denied by authorization policy.”

---

# 8. Authentication Troubleshooting

Check:

- Token present?
- Token expired?
- Signature valid?
- Correct issuer?
- Correct audience?
- Correct scope?
- Certificate/key valid?
- Clock skew?
- Identity provider available?

---

# 9. Authorization Troubleshooting

Check:

- Role
- Scope
- Permission
- Resource ownership
- Policy
- Group membership
- Environment configuration

Do not confuse identity verification with access decision.

---

# 10. TLS / Certificate Troubleshooting

Possible symptoms:

- Handshake failure
- certificate expired
- hostname mismatch
- trust-chain issue
- unsupported protocol/cipher
- mTLS failure

Check:

- certificate validity
- SAN/hostname
- issuer/trust chain
- private key
- server/client configuration
- clock/time

---

# 11. DNS Troubleshooting

Possible issues:

- Name not resolving
- wrong record
- stale cache
- split DNS
- private endpoint DNS
- environment-specific record

Strong sequence:

`Resolve hostname → Verify IP → Test connectivity → Validate service`

---

# 12. Timeout Types

Timeout can exist at multiple layers:

- Client timeout
- Gateway timeout
- Service timeout
- DB timeout
- External API timeout
- Queue timeout
- Connection timeout
- Read timeout

Never say:

> “Increase timeout.”

before asking why the operation is slow.

---

# 13. Strong Answer — “API Is Timing Out. What Will You Do?”

> “I would identify which layer is enforcing the timeout and where the request actually spends time. I would use traces and dependency metrics to distinguish gateway delay, application processing, database latency or downstream API delay.
>
> I would also check thread/connection-pool saturation and recent changes.
>
> Increasing timeout may hide the symptom, so I would first identify the actual bottleneck.”

---

# 14. Retries

Retries are useful for transient failures.

Risks:

- Retry storm
- Duplicate processing
- Increased latency
- Load amplification
- Cascading failure

Good retry design:

- Limited attempts
- Exponential backoff
- Jitter
- Idempotency
- Retry only appropriate errors

---

# 15. Idempotency

An operation is idempotent if repeating it produces the same intended result.

Important for:

- Retries
- Payment/order processing
- Message redelivery
- APIs

Example:

Use idempotency key to prevent duplicate order creation.

---

# 16. Circuit Breaker

Purpose:

Prevent repeated calls to an unhealthy dependency.

States conceptually:

- Closed
- Open
- Half-open

Benefits:

- Fast failure
- Reduced pressure
- Prevent cascading failure

Circuit breaker is not a substitute for fixing the dependency.

---

# 17. Rate Limiting

Protects services from excessive traffic.

Common responses:

- 429

Strategies:

- Token bucket
- Leaky bucket
- fixed/sliding window

Interview depth:

Understand purpose and operational behavior, not algorithm details unless asked.

---

# 18. API Gateway

Typical responsibilities:

- Routing
- Authentication
- Authorization
- TLS termination
- Rate limiting
- Transformation
- Observability
- Version routing

Possible failures:

- Wrong route
- No healthy backend
- TLS
- auth
- timeout
- throttling

---

# 19. 502 vs 503 vs 504

## 502

Gateway contacted upstream but got invalid/bad response.

## 503

Service unavailable / unhealthy / overloaded.

## 504

Gateway timed out waiting for upstream.

Use evidence from gateway and service.

---

# 20. Payload / Serialization Problems

Examples:

- JSON field mismatch
- wrong data type
- missing required field
- enum mismatch
- date format
- content-type
- schema version

Symptoms:

- 400
- 415
- 422
- 500 if poorly handled

---

# 21. API Versioning Issues

Possible problems:

- Old client uses removed endpoint
- incompatible payload
- gateway routes wrong version
- backward compatibility broken

Operational strategy:

- Version awareness
- compatibility
- controlled deprecation

---

# 22. Downstream Dependency Failure

Example:

Service A calls Service B.

Service B slow/down.

Service A symptoms:

- timeout
- thread buildup
- retry storm
- 5xx
- degraded latency

Use distributed tracing to identify failing hop.

---

# 23. Cascading Failure

A small dependency problem can spread through:

- retries
- queue buildup
- thread-pool saturation
- connection-pool saturation
- resource exhaustion

Senior answer:

> “I look for amplification mechanisms, not only the original failure.”

---

# 24. “Works Locally but Fails in Production”

Check:

- DNS
- firewall
- TLS
- proxy
- API gateway
- auth
- certificate
- environment variables
- endpoint URL
- secrets
- rate limit
- network policy
- service discovery
- production-only data

---

# 25. Correlation IDs

Purpose:

Track one request across services.

Useful in:

- Logs
- Traces
- Gateway
- downstream services

Good corporate training point:

Every lab should teach learners how to follow one request.

---

# 26. Distributed Tracing

Trace:

```text
Client
  |
Gateway
  |
Service A
  |
DB
  |
Service B
```

Each hop has a span.

Tracing helps answer:

> “Where did the request spend time?”

---

# 27. Synchronous vs Asynchronous Integration

## Synchronous

Caller waits for response.

Examples:

- REST
- RPC

Risks:

- latency coupling
- cascading failure

## Asynchronous

Caller sends message/event.

Examples:

- Queue
- Kafka

Benefits:

- decoupling
- buffering

Risks:

- lag
- duplicate delivery
- eventual consistency
- harder traceability

---

# 28. Queue Fundamentals

Concepts:

- Producer
- Queue
- Consumer
- Message
- Ack
- Retry
- Dead-letter queue

Operational issues:

- backlog
- poison message
- consumer down
- auth failure
- duplicate
- retry loop

---

# 29. Dead-Letter Queue

Purpose:

Store messages that cannot be processed after retry policy.

Good answer:

> “DLQ prevents poison messages from blocking the main flow while preserving them for investigation and replay.”

---

# 30. Message Duplication

Possible causes:

- Retry
- redelivery
- consumer crash before ack
- at-least-once delivery

Mitigation:

- idempotent consumer
- deduplication key
- transactional design

---

# 31. Message Loss

Investigate:

- Producer acknowledgement
- broker durability
- retention
- consumer offset/ack
- DLQ
- network
- misconfiguration

Do not immediately assume broker lost message.

---

# 32. API 503 Troubleshooting Flow

```text
CLIENT
  |
GATEWAY / LOAD BALANCER
  |
Healthy Backend Available?
  |
SERVICE READY?
  |
Dependency Healthy?
  |
Runtime / Resource Saturation?
  |
Infrastructure?
```

---

# 33. API 504 Troubleshooting Flow

```text
Gateway Timeout
     |
Trace Request
     |
Service Processing
     |
DB / External API
     |
Thread / Connection Pool
     |
Network
     |
Root Cause
```

---

# 34. Scenario 1 — API 500 After Deployment

Check:

- deployment diff
- config
- payload
- DB migration
- dependency
- stack trace
- feature flag

Rollback if impact high and correlation strong.

---

# 35. Scenario 2 — API 401 Only in Production

Check:

- identity provider
- issuer/audience
- certificate
- secret
- clock
- gateway auth policy
- environment config

---

# 36. Scenario 3 — API Intermittently Returns 503

Check:

- one pod unhealthy?
- readiness probe
- load balancer
- autoscaling
- resource pressure
- dependency
- deployment version

---

# 37. Scenario 4 — API Latency Spikes Every Few Minutes

Check:

- GC
- batch job
- DB
- cache refresh
- autoscaling
- external API
- scheduled task
- connection pool

Use time correlation.

---

# 38. Scenario 5 — Retry Storm

Symptoms:

- dependency slows
- caller retries
- traffic multiplies
- system collapses further

Fix:

- backoff
- jitter
- circuit breaker
- retry policy
- capacity/root-cause fix

---

# 39. Scenario 6 — Queue Backlog Increasing

Check:

- producer rate
- consumer rate
- consumer health
- processing latency
- poison messages
- dependency
- retries
- scaling

Backlog is symptom.

---

# 40. Scenario 7 — Poison Message

Symptoms:

- same message repeatedly fails
- retries increase
- throughput degrades

Strategy:

- limited retries
- DLQ
- inspect payload
- fix consumer/schema
- replay safely

---

# 41. Corporate Training Angle

API training should be scenario-driven.

Do not teach:

> “401 means this, 403 means that”

only.

Teach:

> “Where in the request path could this response originate, what evidence would prove it, and how would you fix it?”

---

# 42. Lab 1 — 401 Authentication Failure

Inject:

- expired/wrong token

Learner tasks:

- inspect response
- inspect gateway/service log
- decode token metadata
- identify issue
- correct auth
- validate

---

# 43. Lab 2 — 503 No Healthy Backend

Inject:

- readiness failure

Learner tasks:

- gateway response
- health
- pod readiness
- app logs
- dependency
- restore
- validate

---

# 44. Lab 3 — 504 Slow Dependency

Inject:

- slow downstream API

Learner tasks:

- trace request
- identify slow span
- inspect timeout
- fix dependency/handling
- validate

---

# 45. Lab 4 — Retry Storm

Inject:

- dependency failure + aggressive retry

Learner observes:

- traffic amplification
- latency
- errors

Apply:

- backoff
- jitter
- circuit breaker

---

# 46. Lab 5 — Queue Poison Message

Inject:

- invalid message payload

Learner:

- sees repeated failure
- routes to DLQ
- fixes payload/schema
- replays safely

---

# 47. Whiteboard — Distributed API Troubleshooting

```text
               CLIENT
                  |
                 DNS
                  |
          LOAD BALANCER / GATEWAY
                  |
            AUTH / POLICY
                  |
              SERVICE A
             /    |     \
           DB    CACHE   QUEUE
                         |
                     SERVICE B
                  |
         LOGS + METRICS + TRACES
                  |
              HYPOTHESIS
                  |
           VALIDATE / RESTORE
                  |
               RCA
```

---

# 48. 30-Second Explain-on-Demand

> “For API incidents I troubleshoot hop by hop: client, DNS, TLS/network, gateway, authentication, service, downstream dependencies and platform. I correlate the status code with logs, metrics and traces, then validate the failing layer rather than treating the HTTP code itself as the root cause.”

---

# 49. 5-Minute Trainer Demo

### Topic

**401 vs 403**

Structure:

1. Analogy: building entry vs room permission.
2. Authentication.
3. Authorization.
4. Common failure examples.
5. Where logs appear.
6. Troubleshooting flow.
7. Security caution.
8. Key takeaway.

---

# 50. High-Probability Interview Questions

1. Explain API request flow.
2. 401 vs 403?
3. 500 vs 502 vs 503 vs 504?
4. How do you troubleshoot API timeout?
5. What is a gateway?
6. What is rate limiting?
7. What is 429?
8. What is retry?
9. Why can retry be dangerous?
10. What is exponential backoff?
11. What is jitter?
12. What is idempotency?
13. What is circuit breaker?
14. What is DNS?
15. How do you troubleshoot DNS?
16. What is TLS?
17. Common certificate issues?
18. Works locally but not prod?
19. How do traces help?
20. What is correlation ID?
21. Sync vs async integration?
22. What is DLQ?
23. Why duplicate messages occur?
24. How to troubleshoot queue backlog?
25. What is poison message?
26. How would you teach API troubleshooting?
27. Design an integration lab.

---

# 51. Cross-Question Drill

## Q1. 503 means service is down?

Not necessarily. It may be unhealthy, overloaded, no backend available, dependency failure, or gateway-generated.

## Q2. 504 means network issue?

Not necessarily. It means gateway timed out waiting; cause may be service, DB, API, pool, or network.

## Q3. Why not retry every 500 error?

Some failures are persistent or non-idempotent. Uncontrolled retries amplify load.

## Q4. Is 401 always generated by application?

No. Gateway, auth middleware, or identity layer may generate it.

## Q5. Can 403 occur with valid token?

Yes. Valid identity but insufficient permission.

## Q6. Why use correlation IDs if we have traces?

Correlation IDs remain useful for log search, legacy systems, and troubleshooting across mixed observability stacks.

## Q7. Is async always better?

No. It adds eventual consistency, operational complexity, and failure-handling needs.

## Q8. Can queue backlog be solved by adding consumers?

Sometimes, but first identify whether consumer throughput, poison messages, dependency slowness, partitioning, or capacity is the root cause.

## Q9. Why is idempotency important?

Because retries/redelivery can otherwise duplicate business effects.

## Q10. When should circuit breaker open?

When failure thresholds indicate continued calls are likely harmful; exact behavior depends on policy and system requirements.

---

# 52. Real Experience Mapping

Prepare truthful examples involving:

- REST API
- service integration
- authentication
- database dependency
- Azure Service Bus / queue
- deployment
- certificate/security
- gateway/network issue
- retry/error handling
- production troubleshooting

Use:

`Situation → Impact → Request Path → Evidence → Diagnosis → Action → Result → Prevention`

---

# 53. Red Flags

Do not:

- Treat status code as root cause.
- Retry everything.
- Increase timeout automatically.
- Confuse 401 and 403.
- Blame network without evidence.
- Ignore gateway-generated errors.
- Ignore DNS/TLS.
- Treat async communication as failure-free.
- Ignore duplicate delivery.
- Forget idempotency.
- Teach HTTP codes without end-to-end request context.

---

# 54. Quick Revision

## Request Path

**Client → DNS → TLS → Gateway → Auth → Service → Dependency**

## 4xx

**Request / identity / permission / quota**

## 5xx

**Service / gateway / dependency / timeout**

## Reliability

**Timeout + Retry + Backoff + Jitter + Circuit Breaker + Idempotency**

## Observability

**Correlation ID + Logs + Metrics + Traces**

## Golden Rule

> **Troubleshoot the request path, not just the HTTP status code.**

---

# 55. Module 06 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| API request flow | 5 | |
| HTTP status reasoning | 5 | |
| 401 vs 403 | 5 | |
| 5xx troubleshooting | 5 | |
| Timeout reasoning | 5 | |
| Retry/backoff/jitter | 4+ | |
| Idempotency | 4+ | |
| Circuit breaker | 5 | |
| DNS troubleshooting | 4+ | |
| TLS troubleshooting | 4+ | |
| Gateway understanding | 5 | |
| Distributed tracing | 5 | |
| Queue/messaging basics | 4+ | |
| DLQ / poison message | 4+ | |
| Scenario handling | 5 | |
| Whiteboard explanation | 5 | |
| Lab design | 5 | |
| Cross-question survival | 4+ | |

---

# 56. Module 06 Readiness Gate

## PASS only when you can:

- Draw an API request path.
- Explain 401 vs 403.
- Explain 500/502/503/504.
- Troubleshoot an API timeout.
- Explain retries, backoff, jitter, and idempotency.
- Explain circuit breakers.
- Troubleshoot DNS/TLS issues.
- Explain gateway-generated failures.
- Explain sync vs async integration.
- Explain DLQ and poison messages.
- Handle queue backlog scenario.
- Design at least three integration labs.
- Teach one API topic in five minutes.
- Survive at least 10 cross-questions.

### Minimum Score

**All critical P0 dimensions ≥ 4/5**

If answers become status-code memorization without end-to-end reasoning, Module 06 remains **BLOCKED**.

---

# 57. Final Module Outcome

After this module, the panel should think:

> **“He understands APIs and integrations as distributed production systems, can isolate failures across multiple hops, and can teach practical troubleshooting rather than memorized HTTP definitions.”**

That is the selection goal for Module 06.
