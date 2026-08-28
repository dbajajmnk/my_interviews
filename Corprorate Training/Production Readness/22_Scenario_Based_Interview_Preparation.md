# iRun Corporate Training Interview Preparation
## Module 22 — Scenario-Based Interview Preparation

**Interview Target:** iRun Application / Production Operations Corporate Trainer  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P0/P1 — Interview Conversion Critical  
**Primary Goal:** Convert all prior modules into live production-incident performance by solving realistic scenarios with structured reasoning, evidence selection, safe mitigation, validation, RCA, and trainer explanation.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Handle unfamiliar production scenarios without guessing.
- Use the universal troubleshooting framework automatically.
- Prioritize impact, scope, and recent change.
- Choose the right evidence source.
- Distinguish symptom, hypothesis, mitigation, and root cause.
- Explain your reasoning aloud.
- Handle scenario mutations and follow-up questions.
- Avoid tool-first/random troubleshooting.
- Connect Java, JVM, APIs, Kubernetes, Kafka, batch, data, SharePoint, and AI Ops scenarios.
- Turn each scenario into a trainer-ready case study.
- Survive pressure questions such as “What next?”, “Why?”, “What if that is normal?”, and “How do you know?”

The panel should think:

> **“He can solve production incidents systematically and teach the reasoning behind the solution.”**

---

# 2. Universal Scenario Framework

For every scenario use:

```text
1. BUSINESS IMPACT
2. SCOPE
3. SYMPTOM
4. RECENT CHANGE
5. HEALTH
6. LOGS
7. METRICS
8. TRACES
9. DEPENDENCIES
10. RUNTIME
11. INFRASTRUCTURE
12. HYPOTHESIS
13. VALIDATION
14. MITIGATION
15. RECOVERY VALIDATION
16. RCA
17. PREVENTION
```

Do not skip directly to commands.

---

# 3. Scenario Answer Template

Use this spoken structure:

> “First I would understand the impact and scope. Then I would check recent changes and the health of the affected component. I would use logs, metrics and traces to identify the failing layer, validate dependencies, and only then move into runtime or infrastructure diagnostics if the evidence points there. I would form a hypothesis, validate it safely, mitigate to restore service, confirm recovery, and complete RCA and preventive actions.”

This is the default backbone.

---

# 4. Scenario 01 — Application Is Slow

## Symptoms
- Users report high response time.
- No complete outage.

## First Questions
- All users or subset?
- All endpoints or one?
- Since when?
- Recent deployment?
- Traffic spike?

## Evidence
- Latency metrics
- Error rate
- traces
- DB latency
- downstream API latency
- CPU/memory
- connection pool

## Likely Causes
- Slow DB query
- connection pool exhaustion
- downstream API
- GC
- thread starvation
- CPU throttling
- network latency

## Strong Answer
> “I would first scope the latency and compare it with baseline. Then I would use traces to identify where the request time is spent, correlate DB/downstream metrics, and check runtime saturation only if dependencies are healthy. I would avoid increasing resources or timeouts until the bottleneck is proven.”

## Cross-Questions
- What if CPU is normal?
- What if DB is healthy?
- What if only one instance is slow?
- What if no errors appear in logs?

---

# 5. Scenario 02 — Application Is Down

## Check
- Process/pod status
- health/readiness
- deployment status
- startup logs
- configuration
- secrets
- dependencies
- resource exhaustion

## Mitigation
- Rollback
- failover
- restore config
- restart only if justified

## Golden Rule
**Down is a symptom; determine whether the failure is startup, dependency, runtime, platform, or routing.**

---

# 6. Scenario 03 — Java Application Will Not Start

## Evidence
- Startup logs
- root exception
- profile
- environment variables
- secrets
- port
- DB connectivity
- bean creation
- migration

## Common Causes
- `BeanCreationException`
- wrong profile
- missing config
- port conflict
- DB unavailable
- incompatible dependency

## Cross-Question
> “Would you take a heap dump?”

No. This is primarily an application-startup issue unless evidence points to runtime memory.

---

# 7. Scenario 04 — High CPU

## First Checks
- Sustained or short spike?
- Traffic correlated?
- Recent deployment?
- One process or whole node?

## Runtime Evidence
- JVM: thread dumps / JFR
- .NET: counters / trace
- Node: CPU profile / event-loop lag

## Possible Causes
- Busy loop
- serialization
- regex
- GC
- retry storm
- traffic
- CPU throttling

## Golden Rule
**Find the hot activity before changing capacity.**

---

# 8. Scenario 05 — High Memory

## Check
- Heap trend
- process RSS
- GC
- workload
- cache
- native memory
- container limit

## Distinguish
- High memory
- leak
- OOM
- OOMKilled

## Strong Answer
> “High memory alone is not a leak. I would look at memory trend, post-GC baseline, process vs heap memory, recent changes, and retained-object evidence before concluding a leak.”

---

# 9. Scenario 06 — OutOfMemoryError

## First Step
Identify exact OOM type.

## Evidence
- Heap dump
- GC logs
- memory trend
- container limit
- native/thread count

## Avoid
> “Increase Xmx.”

That may only delay failure.

---

# 10. Scenario 07 — Connection Pool Exhaustion

## Symptoms
- Latency
- DB timeouts
- waiting threads
- active connections maxed

## Possible Causes
- Slow queries
- long transactions
- connection leak
- traffic spike
- DB capacity

## Golden Rule
**A full pool tells you connections are busy; it does not tell you why.**

---

# 11. Scenario 08 — API Returns 503

## Flow
```text
Client -> Gateway -> Service -> Ready Backend -> Dependency
```

## Check
- No healthy backend?
- readiness failing?
- service overload?
- dependency unavailable?
- circuit breaker?
- deployment issue?

## Cross-Question
> “Does 503 mean application crashed?”

No.

---

# 12. Scenario 09 — API Timeout

## Determine
- Which timeout?
- Where did time go?

## Evidence
- trace
- DB latency
- downstream API
- connection pool
- thread/event-loop behavior

## Avoid
> “Increase timeout.”

---

# 13. Scenario 10 — Kubernetes Pod Restarting

## Evidence
- Pod state
- restart count
- previous logs
- events
- exit reason
- liveness
- OOMKilled
- config/secrets

## Golden Rule
**Kubernetes already restarts it; diagnose why it exits.**

---

# 14. Scenario 11 — Deployment Failed

## Check
- Artifact/image
- runtime version
- ConfigMap
- Secret
- port
- probes
- DB migration
- certificate
- resources
- network

## Mitigation
Rollback if impact is high and previous version is safe.

---

# 15. Scenario 12 — Kafka Consumer Lag

## Check
- Producer rate
- consumer rate
- lag by partition
- consumer health
- downstream latency
- retries
- partition skew
- rebalance

## Avoid
> “Add more consumers.”

before validating partition count and bottleneck.

---

# 16. Scenario 13 — Batch Job Did Not Execute

## Separate
Scheduler issue vs application issue.

## Check
- Trigger
- timezone
- enabled state
- dependency
- concurrency
- scheduler logs
- job creation

## Recovery
Determine whether catch-up/backfill is safe.

---

# 17. Scenario 14 — Data Pipeline Failed

## Flow
```text
Trigger -> Source -> Credential -> Schema -> Compute -> Transform -> Destination
```

## Check
- Partial commit?
- Safe rerun?
- Data reconciliation?
- Freshness impact?

---

# 18. Scenario 15 — Intermittent Production Failure

## High-Value Questions
- One instance?
- one region?
- one user?
- specific time?
- load-related?
- expiring token?
- race condition?
- dependency instability?

Use correlation IDs and instance IDs.

---

# 19. Scenario 16 — Poor Performance, No Obvious Error

## Possible
- Slow dependency
- queueing
- GC
- throttling
- lock
- saturation
- cache miss

## Golden Rule
**No error log does not mean healthy behavior.**

---

# 20. Scenario 17 — Post-Deployment Degradation

## Check
- Change correlation
- version-specific telemetry
- error/latency baseline
- configuration difference
- dependency compatibility

## Decision
Rollback if safe and impact is material.

---

# 21. Scenario 18 — Multi-Service Distributed Incident

## Use
- Trace
- correlation ID
- service metrics
- dependency graph

## Flow
```text
Client -> Gateway -> Service A -> Service B -> DB -> Queue
```

Find the first degraded hop.

---

# 22. Scenario 19 — Database Latency

## Check
- Query duration
- locks
- pool utilization
- connections
- indexes
- traffic
- plan change
- DB CPU

## Avoid
> “Scale DB.”

until bottleneck is understood.

---

# 23. Scenario 20 — Certificate / Authentication Outage

## Check
- Expiry
- hostname
- trust chain
- secret rotation
- token issuer/audience
- clock
- identity provider

## Golden Rule
**Separate authentication, authorization, and TLS.**

---

# 24. Scenario 21 — JVM Deadlock

## Evidence
- Thread dump
- blocked threads
- lock ownership
- circular wait

## Mitigation
Restart may restore service.

## Permanent Fix
Correct lock ordering/concurrency design.

---

# 25. Scenario 22 — JVM GC Pressure

## Evidence
- GC frequency
- pause time
- allocation
- heap occupancy
- latency

## Possible Root Causes
- Heap sizing
- allocation pressure
- retention
- workload

Do not tune collector first.

---

# 26. Scenario 23 — Node.js Event Loop Blocking

## Evidence
- Event-loop lag
- CPU
- CPU profile

## Causes
- Sync I/O
- large JSON
- regex
- CPU-heavy loop

## Golden Rule
**Distinguish dependency waiting from main-thread blocking.**

---

# 27. Scenario 24 — .NET ThreadPool Starvation

## Symptoms
- High latency
- CPU not necessarily high
- queued work
- blocking calls

## Evidence
- runtime counters
- trace
- dependency latency

---

# 28. Scenario 25 — SharePoint Access Denied

## Scope
- one user
- one site
- one document

## Check
- identity
- group
- permission
- inheritance
- resource-specific access

## Golden Rule
**Restore minimum required access, not Full Control.**

---

# 29. Scenario 26 — SharePoint Sync Failure

Browser works, sync fails.

Focus:
- OneDrive client
- account/session
- local sync state
- path/file constraints
- network

Do not call it a SharePoint outage.

---

# 30. Scenario 27 — Spark Job Stuck Near Completion

## Possible
- Data skew
- long partition
- shuffle
- executor issue

## Evidence
- Stage/task distribution
- long-running tasks
- partition size

---

# 31. Scenario 28 — Snowflake Query Suddenly Slow

## Check
- Query history
- baseline
- workload
- scan volume
- concurrency
- warehouse
- query design

Do not scale first.

---

# 32. Scenario 29 — Airflow DAG Did Not Start

## Check
- Scheduler
- DAG parsing
- schedule
- dependency
- worker capacity
- enablement

Separate orchestration from task execution.

---

# 33. Scenario 30 — dbt Run Green, Data Wrong

## Key Point
Technical success != data correctness.

Check:
- tests
- source freshness
- duplicates
- nulls
- transformation logic
- reconciliation

---

# 34. Scenario 31 — ADF Pipeline Partially Loaded

## Check
- Failed activity
- committed data
- source/target
- schema
- linked service
- Integration Runtime
- replay safety

Before rerun:
- idempotency
- reconciliation

---

# 35. Scenario 32 — AI Says “Root Cause Found”

## Response
Treat as hypothesis.

Validate:
- Source logs
- metrics
- traces
- environment
- product documentation

AI cannot replace proof.

---

# 36. Scenario 33 — Monitoring Is Green but Users Complain

## Possible
- Dashboard too broad
- missing business metric
- one region
- one endpoint
- one tenant
- sampling gap

## Golden Rule
**Dashboards are models of reality, not reality itself.**

---

# 37. Scenario 34 — Restart Fixes Issue

## Question
Is incident resolved?

No.

Capture:
- recurrence
- evidence
- root cause
- prevention

Restart = mitigation unless root cause is proven.

---

# 38. Scenario 35 — Same Incident Repeats

Investigate:
- Was RCA correct?
- Were actions completed?
- Were they effective?
- Was monitoring improved?
- Did the actual systemic cause remain?

Repeated incidents expose weak RCA.

---

# 39. Scenario 36 — No Logs

Possible:
- Process never started
- logging misconfigured
- log pipeline broken
- crash before initialization

Use:
- platform events
- exit code
- deployment state
- runtime evidence

---

# 40. Scenario 37 — One Pod Slow, Others Healthy

Compare:
- Pod/node
- version
- resource
- network
- dependency
- local cache/state

Scope reduces search dramatically.

---

# 41. Scenario 38 — Queue Backlog Increasing

Check:
- producer rate
- consumer rate
- consumer health
- dependency latency
- retries
- poison messages
- oldest-message age

Backlog is symptom.

---

# 42. Scenario 39 — Poison Message

Need:
- retry limit
- DLT/DLQ
- root error
- payload/schema correction
- safe replay

Avoid infinite retries.

---

# 43. Scenario 40 — Duplicate Processing

Check:
- retry
- redelivery
- manual rerun
- commit timing
- idempotency

Business-side effect is what matters.

---

# 44. Scenario Mutation Technique

Interviewers often change one fact.

Example:

> “What if CPU is normal?”

Do not restart the whole answer.

Update the hypothesis set:

- dependency wait
- lock
- connection pool
- network
- queue

Keep all unchanged facts.

---

# 45. The “What Next?” Drill

For every scenario, panel may ask repeatedly:

> “What next?”

Your answer should always be the **next evidence-driven step**, not a random new tool.

---

# 46. The “Why?” Drill

Panel may ask:

> “Why that check?”

Answer with information value.

Example:
> “I would inspect the trace because it tells me which downstream span accounts for the latency, which narrows the investigation faster than reading all logs.”

---

# 47. The “What If That Is Normal?” Drill

Example:
> “CPU is 80%, but that is normal.”

Then remove CPU as abnormal evidence and continue.

Do not force your original theory.

---

# 48. The “How Do You Know?” Drill

Answer with validation evidence:

- error rate baseline
- latency recovery
- queue drain
- health
- successful business transaction
- reconciliation
- no recurrence

---

# 49. Trainer Scenario Delivery Pattern

For any scenario taught to learners:

```text
1. Give business context
2. Hide root cause
3. Provide symptom
4. Give evidence sources
5. Let learners form hypothesis
6. Give progressive hints
7. Recover
8. Validate
9. RCA
10. Prevent
```

This keeps labs diagnostic rather than procedural.

---

# 50. Scenario Difficulty Levels

## Level 1 — Single Cause
Example: wrong DB password.

## Level 2 — Cross-Layer
Example: API latency caused by DB pool.

## Level 3 — Distributed
Example: retry storm causes cascading failure.

## Level 4 — Ambiguous
Several plausible hypotheses, limited evidence.

Corporate training should progress through these levels.

---

# 51. Pressure Interview Round

Practice 10 scenarios with:

- 60 seconds initial answer
- 3 cross-questions
- 1 scenario mutation
- 1 “How do you know?” question

Target:
Stay structured throughout.

---

# 52. Scenario Scoring Rubric

Score 0–5 on:

| Dimension | Target |
|---|---:|
| Impact/scope | 5 |
| Evidence selection | 5 |
| Layer isolation | 5 |
| Hypothesis quality | 5 |
| Validation | 5 |
| Safe mitigation | 5 |
| Recovery validation | 5 |
| RCA/prevention | 5 |
| Communication clarity | 5 |
| Cross-question survival | 5 |

---

# 53. Real Experience Mapping

Where a scenario matches genuine experience, prepare a truthful story.

Use:

**Situation → Impact → Evidence → Diagnosis → Action → Result → Prevention**

If not personal experience:

Say:

> “A representative production scenario would be…”

Never imply illustrative scenarios are your own.

---

# 54. Red Flags

Do not:

- Jump to restart.
- Jump to scale.
- Increase timeout automatically.
- Blame DB/network without evidence.
- Treat status code as root cause.
- Treat high memory as leak automatically.
- Treat lag as Kafka failure.
- Rerun batch blindly.
- Treat green dashboard as proof.
- accept AI conclusion as fact.
- continue defending a disproven hypothesis.

---

# 55. Quick Revision

**Scenario Core:** Impact → Scope → Change → Evidence → Layer → Hypothesis → Validate → Mitigate → Verify → RCA

**Evidence:** Logs + Metrics + Traces + Runtime + Platform

**Never confuse:** Symptom ≠ Root Cause ≠ Mitigation

**Golden Rule:** Every production answer should be evidence-driven and reversible where possible.

---

# 56. Module 22 Readiness Gate

## PASS only when you can:

- Handle at least 20 scenarios without notes.
- Answer each initial scenario in 60–90 seconds.
- Survive three follow-up questions per scenario.
- Adapt when one fact changes.
- Explain why each diagnostic step is chosen.
- Distinguish symptom, hypothesis, mitigation, and root cause.
- Validate recovery with measurable evidence.
- Avoid bluffing on specialist tools.
- Turn at least five scenarios into trainer labs.
- Maintain calm structure under pressure.

### Minimum Score

**P0/P1 target average ≥ 4/5, with evidence selection, validation, safe mitigation, and cross-question survival at 5/5.**

If answers become random, tool-first, or assumption-driven, Module 22 remains **BLOCKED**.

---

# 57. Final Module Outcome

After this module, the panel should think:

> **“He can take an unfamiliar production problem, structure it quickly, choose the right evidence, reason through changing facts, restore safely, validate the outcome, and teach the same diagnostic discipline to engineers.”**

That is the selection goal for Module 22.
