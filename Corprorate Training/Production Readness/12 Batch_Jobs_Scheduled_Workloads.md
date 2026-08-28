# iRun Corporate Training Interview Preparation
## Module 12 — Batch Jobs & Scheduled Workloads

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P1 — Strong Working Readiness  
**Primary Goal:** Demonstrate production ownership of scheduled and batch workloads: scheduling, dependencies, failures, retries, idempotency, partial processing, reconciliation, observability, recovery, and safe reruns.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain batch and scheduled workload architecture.
- Distinguish batch, scheduled, asynchronous, and real-time processing.
- Troubleshoot jobs that did not start, failed, hung, or ran slowly.
- Handle dependency and downstream failures.
- Explain retries, backoff, idempotency, checkpoints, and safe reruns.
- Diagnose duplicate and partial processing.
- Explain reconciliation and audit trails.
- Handle missed schedules and overlapping executions.
- Define monitoring and alerting for batch workloads.
- Explain SLA/SLO considerations for scheduled processing.
- Design practical trainer labs and incident simulations.
- Survive scenario-based cross-questioning.

---

# 2. Core Mental Model

```text
SCHEDULER / TRIGGER
        |
        v
     JOB START
        |
        v
 INPUT / SOURCE
        |
        v
   PROCESSING
    /   |    \
  DB   API   QUEUE
    \   |    /
        v
 OUTPUT / TARGET
        |
        v
 VALIDATION
        |
        v
 RECONCILIATION
        |
        v
 AUDIT + METRICS + ALERTS
```

Troubleshoot the **stage**, not merely the final job status.

---

# 3. Batch vs Real-Time Processing

## Batch
Processes accumulated work together or on a schedule.

Examples:
- Nightly reports
- Payroll
- Billing
- ETL
- File processing
- Reconciliation

## Real-Time
Processes work immediately or near immediately.

Examples:
- API request
- payment authorization
- live notification

A production system may use both.

---

# 4. Scheduled vs Event-Driven Workload

**Scheduled:** time triggers execution.

**Event-driven:** an event/message triggers processing.

Do not assume scheduled work is always batch or that asynchronous work is always scheduled.

---

# 5. Scheduler Responsibilities

Typical responsibilities:

- Trigger time
- Calendar
- Dependencies
- Concurrency rules
- Retry policy
- Execution history
- Notifications

Examples may include cron, enterprise schedulers, cloud schedulers, Kubernetes CronJobs, or workflow orchestrators.

Focus on concepts unless the interviewer asks for a specific product.

---

# 6. Cron Fundamentals

Cron expresses recurring schedules.

Interview readiness requires understanding:

- minute
- hour
- day
- month
- weekday
- timezone implications

Operational risk:

> A syntactically correct schedule can still be operationally wrong because of timezone or business-calendar assumptions.

---

# 7. Kubernetes CronJob — Conceptual View

```text
CronJob
   |
Schedule
   |
   v
  Job
   |
  Pod
   |
Container
   |
Batch Application
```

Troubleshooting can span scheduler, Job, Pod, container, application, and dependencies.

---

# 8. Job Did Not Start

Check:

1. Was trigger/schedule reached?
2. Is scheduler enabled?
3. Timezone correct?
4. Previous execution blocking?
5. Concurrency policy?
6. Dependency satisfied?
7. Credentials valid?
8. Resource/scheduling issue?
9. Trigger configuration changed?
10. Scheduler events/logs?

Do not start by debugging application code if the process never launched.

---

# 9. Job Started but Failed Immediately

Check:

- Exit code
- startup logs
- configuration
- secrets
- file/path
- permissions
- input availability
- dependency
- runtime
- recent deployment

Same evidence-first principle as online applications.

---

# 10. Long-Running Job

Possible causes:

- Increased input volume
- Slow query
- downstream latency
- resource constraint
- lock/contention
- retry behavior
- inefficient algorithm
- queue backlog
- external API throttling

Compare current duration against historical baseline.

---

# 11. Hung Job vs Slow Job

A **slow job** is making progress slowly.

A **hung job** appears to make no meaningful progress.

Evidence:

- processed-record count
- heartbeat
- logs
- CPU
- I/O
- thread state
- DB activity
- checkpoint movement

This distinction matters before terminating a process.

---

# 12. Dependency Management

Batch jobs may depend on:

- Previous job
- File arrival
- DB state
- API
- queue
- business calendar
- data warehouse
- credentials

A failed dependency should be visible rather than appearing as a mysterious application failure.

---

# 13. Retry Strategy

Retries are appropriate for transient failures.

Good design:

- Limited attempts
- Backoff
- Jitter where useful
- Retryable error classification
- Idempotent operation
- Alert after threshold

Bad design:

> Retry forever until it works.

---

# 14. Idempotency

A rerun should not create unintended duplicate business effects.

Example:

If 8,000 of 10,000 records completed before failure, rerunning should not blindly duplicate the first 8,000.

Mechanisms:

- Business key
- Idempotency key
- Processing status
- Upsert
- Checkpoint
- Deduplication
- Transaction boundary

---

# 15. Checkpointing

Checkpoint records progress so processing can resume safely.

Example:

```text
Total Records: 1,000,000
Last Successful Checkpoint: 650,000
Failure
Resume from validated checkpoint
```

Benefits:

- Faster recovery
- Less duplicate work
- Lower operational risk

---

# 16. Partial Processing

One of the most important batch scenarios.

Ask:

- What completed?
- What failed?
- Was output committed?
- Can successful work remain?
- Can failed portion be replayed?
- Are there downstream side effects?
- How will totals be reconciled?

Never rerun blindly.

---

# 17. Reconciliation

Reconciliation verifies that expected and actual processing agree.

Example:

```text
Input       = 10,000
Successful  =  9,950
Failed      =     50
---------------------
Accounted   = 10,000
```

Reconciliation is especially important for financial, billing, payroll, and data-processing workloads.

---

# 18. Audit Trail

A useful audit trail may capture:

- Job ID
- Start/end time
- Trigger
- Input count
- Success count
- Failure count
- Retry count
- Output count
- Checkpoint
- Version
- Operator action
- Final status

It supports both troubleshooting and governance.

---

# 19. Duplicate Processing

Possible causes:

- Manual rerun
- Scheduler triggered twice
- retry after uncertain commit
- message redelivery
- overlapping executions

Prevention:

- Idempotency
- locking/concurrency control
- business keys
- deduplication
- run IDs

---

# 20. Overlapping Executions

Example:

Nightly job normally takes 2 hours but now takes 7 hours; next scheduled execution starts before the first finishes.

Risks:

- duplicate work
- lock contention
- resource saturation
- inconsistent data

Controls:

- concurrency policy
- distributed lock
- job state
- skip/queue next execution
- alert

---

# 21. Missed Schedule

Possible causes:

- Scheduler outage
- disabled job
- timezone
- maintenance
- infrastructure unavailable
- deployment/configuration
- calendar rule

Recovery questions:

- Should it run immediately?
- Should it be skipped?
- Does order matter?
- Will downstream jobs be affected?
- Is backfill required?

Business semantics determine the answer.

---

# 22. Backfill

Backfill processes missed historical work.

Important:

- Define range
- avoid duplicates
- protect downstream capacity
- monitor separately
- reconcile after completion

Do not launch a large backfill into production without capacity awareness.

---

# 23. Job Timeout

Timeout should protect the platform from runaway execution, but setting it too low can kill legitimate long jobs.

Investigate:

- historical duration
- workload
- bottleneck
- dependency
- progress

Do not simply increase timeout.

---

# 24. File-Based Batch Processing

Common problems:

- File missing
- Wrong filename
- Incomplete upload
- wrong encoding
- malformed records
- duplicate file
- wrong permissions
- archive failure

Good design may use:

- arrival validation
- checksum
- manifest
- processed/archive folder
- file ID
- reconciliation

---

# 25. Poison Record

A single malformed record may repeatedly break processing.

Strategies:

- Validate
- isolate
- quarantine
- continue when business rules allow
- capture failure reason
- replay after correction

Avoid losing the entire batch unnecessarily when architecture supports record-level isolation.

---

# 26. Database Batch Problems

Possible issues:

- Long transactions
- locks
- deadlocks
- slow queries
- transaction-log pressure
- connection pool exhaustion
- huge commits

Operational improvements may include:

- chunking
- indexing
- smaller transactions
- controlled concurrency

---

# 27. API-Driven Batch Problems

Calling external APIs at scale introduces:

- rate limits
- timeout
- retry storms
- quota
- partial success
- dependency outage

Use:

- throttling
- bounded concurrency
- backoff
- checkpoints
- idempotency

---

# 28. Queue-Based Batch / Worker Processing

Monitor:

- Producer rate
- Consumer rate
- Queue depth
- Oldest-message age
- Failure rate
- DLQ
- processing duration

Queue depth alone is insufficient; rate and age matter.

---

# 29. Batch Observability

Minimum useful signals:

- Start/end
- Duration
- Status
- Records processed
- Success/failure counts
- Throughput
- Retry count
- Checkpoint
- Dependency latency
- Resource utilization

---

# 30. Batch Alerting

Useful alerts:

- Job did not start
- Job failed
- Duration exceeds baseline
- No progress
- Error rate high
- Reconciliation mismatch
- SLA deadline approaching
- backlog age increasing

Alert on **business completion**, not just process existence.

---

# 31. SLA/SLO for Batch

Examples:

- Nightly settlement complete by 05:00.
- 99.9% of daily jobs complete successfully.
- 99% of records processed within 2 hours.

Batch reliability often depends on deadline and completeness rather than API-style availability.

---

# 32. Strong Answer — “Nightly Job Failed Halfway. What Do You Do?”

> “I first determine business impact and exactly how far processing progressed. I inspect the job logs, checkpoint and committed output to distinguish completed, failed and unknown work. Before rerunning, I verify idempotency and downstream side effects. If supported, I resume from a validated checkpoint or replay only failed records. After completion I reconcile input, success, failure and output totals, then perform RCA.”

---

# 33. Strong Answer — “Job Did Not Run”

> “I separate scheduling from application execution. I first verify the scheduler, trigger time, timezone, enablement, dependency and concurrency state. If a Job or process was created, I then move into runtime logs and infrastructure. That prevents wasting time debugging application code when the scheduler never launched it.”

---

# 34. Strong Answer — “Batch Is Taking Twice as Long”

> “I compare the current run with historical baseline: input volume, throughput, dependency latency, query duration, retries and resource utilization. Duration alone is a symptom. I want to know whether work volume increased or processing rate degraded, and then identify which stage caused the difference.”

---

# 35. Scenario 1 — Missed Nightly Job

Evidence:

- No execution record
- Scheduler active
- timezone recently changed

Actions:

- Assess downstream dependency
- determine safe catch-up
- run/backfill
- validate
- prevent recurrence

---

# 36. Scenario 2 — Job Fails at 80%

Evidence:

- checkpoint at 78%
- DB committed prior chunks
- downstream calls already made

Decision:

Do not restart from zero until idempotency and side effects are understood.

---

# 37. Scenario 3 — Duplicate Billing

Possible cause:

- Manual rerun after uncertain completion

RCA themes:

- Missing idempotency
- weak audit trail
- no reconciliation
- unsafe runbook

This is a powerful interview scenario.

---

# 38. Scenario 4 — Job Never Finishes

Check:

- Progress metric
- DB locks
- thread state
- external API
- retry loop
- queue
- resource
- timeout

Determine slow vs hung.

---

# 39. Scenario 5 — One Bad Record Breaks Entire File

Improve:

- record validation
- quarantine
- error report
- continue when safe
- replay corrected record

Business rules decide whether partial completion is acceptable.

---

# 40. Scenario 6 — Backfill Overloads Production

Cause:

- Historical workload processed with uncontrolled concurrency.

Prevention:

- capacity planning
- throttling
- separate windows
- bounded concurrency
- monitoring

---

# 41. Scenario 7 — Overlapping Jobs

Symptoms:

- Duplicate records
- DB locks
- CPU/DB pressure

Check concurrency control and scheduler policy.

---

# 42. Corporate Training Angle

Do not teach only scheduler syntax.

Teach the lifecycle:

**Trigger → Execute → Progress → Commit → Validate → Reconcile → Audit**

Every lab should answer:

- What failed?
- What already succeeded?
- Is rerun safe?
- How do we prove completion?

---

# 43. Lab 1 — Missed Schedule

Inject:

- Disabled schedule or timezone mismatch

Learners:

- inspect scheduler
- identify trigger issue
- assess catch-up
- execute safely
- validate

---

# 44. Lab 2 — Partial Failure

Inject:

- Failure after 60% processing

Learners:

- inspect checkpoint
- identify committed work
- resume/replay safely
- reconcile totals

---

# 45. Lab 3 — Duplicate Rerun

Inject:

- Same batch submitted twice

Learners:

- detect duplicate
- use business/run ID
- add idempotency
- validate

---

# 46. Lab 4 — Slow Batch

Inject:

- slow DB query

Learners:

- compare historical duration
- identify throughput reduction
- inspect DB
- fix
- validate baseline

---

# 47. Lab 5 — Poison Record

Inject:

- malformed record

Learners:

- isolate failure
- quarantine
- continue safely
- correct/replay
- reconcile

---

# 48. Lab 6 — API Rate Limit

Inject:

- 429 from external dependency

Learners:

- identify throttling
- reduce concurrency
- apply backoff
- resume from checkpoint
- validate

---

# 49. Whiteboard — Batch Troubleshooting

```text
             SCHEDULE
                |
             TRIGGER
                |
          DID JOB START?
           /          \
         NO            YES
         |              |
 Scheduler/Config    PROCESSING
                       |
              IS PROGRESS MOVING?
                 /          \
               NO            YES
               |              |
        Hang/Dependency     Slow/Error
               \              /
                \            /
                 CHECKPOINT
                     |
                 SAFE RERUN?
                     |
               RECONCILIATION
                     |
                  COMPLETE
                     |
                 RCA / PREVENT
```

---

# 50. 30-Second Explain-on-Demand

> “For batch incidents I separate scheduling, execution, progress, commit and reconciliation. Before rerunning anything, I determine what already completed and whether processing is idempotent. The goal is not just to make the job green; it is to prove that all expected business work completed exactly as intended.”

---

# 51. 5-Minute Trainer Demo

### Topic: Safe Batch Rerun

1. Job processes 10,000 records.
2. Failure occurs after 8,000.
3. Ask what was committed.
4. Explain idempotency.
5. Explain checkpoint.
6. Resume/replay.
7. Reconcile 10,000 records.
8. Audit.
9. RCA.
10. Key takeaway.

---

# 52. High-Probability Interview Questions

1. What is batch processing?
2. Batch vs real-time?
3. Scheduled vs event-driven?
4. How do you troubleshoot a job that did not run?
5. What is idempotency?
6. Why are checkpoints useful?
7. What is partial processing?
8. How do you safely rerun a failed job?
9. What is reconciliation?
10. How do you prevent duplicates?
11. What causes overlapping executions?
12. How do you handle missed schedules?
13. What is backfill?
14. How do you troubleshoot a slow job?
15. Slow vs hung job?
16. How do you handle poison records?
17. How do API rate limits affect batch?
18. What should a batch dashboard contain?
19. What alerts would you configure?
20. How do SLAs differ for batch?
21. How would you teach batch operations?
22. Design a batch incident lab.

---

# 53. Cross-Question Drill

## Q1. Job failed. Should we rerun immediately?

Not until we know what completed, what committed, and whether rerun is safe.

## Q2. Is retry the same as rerun?

No. Retry may repeat an operation or step; rerun may restart a larger workflow.

## Q3. Does checkpoint guarantee idempotency?

No. It helps recovery, but business side effects still require idempotent design.

## Q4. Input count equals output count. Is reconciliation complete?

Not necessarily. Validate correctness, duplicates, failures, and business rules.

## Q5. Why not allow overlapping runs?

Some workloads safely support it, but others create duplicates, contention, or inconsistent state. It must be intentional.

## Q6. Job process is alive. Is it healthy?

Not necessarily. Check progress and completion deadline.

## Q7. Can increasing timeout solve slow batch?

It may prevent termination but does not address why processing degraded.

## Q8. Is a poison record always skipped?

No. Business rules may require the whole batch to fail. Isolation is a design decision.

## Q9. Why monitor oldest queue-message age?

A stable queue depth can still hide messages that are stuck too long.

## Q10. Is backfill just rerunning yesterday's job?

Not necessarily. It may cover a defined historical range and needs duplicate/capacity controls.

---

# 54. Real Experience Mapping

Prepare truthful examples involving:

- Scheduled jobs
- Queue processing
- Azure Service Bus
- Data processing
- Database operations
- API integrations
- Retry/error handling
- Deployment/configuration
- Production monitoring
- Reconciliation or validation

Use:

**Situation → Business Deadline → Failure Stage → Evidence → Safe Recovery → Validation → RCA → Prevention**

---

# 55. Red Flags

Do not:

- Rerun blindly.
- Assume failed status means zero work completed.
- Retry indefinitely.
- Ignore idempotency.
- Ignore downstream side effects.
- Confuse slow with hung.
- Declare success without reconciliation.
- Monitor only process status.
- Allow overlapping execution accidentally.
- Run large backfills without capacity planning.
- Teach only cron syntax.

---

# 56. Quick Revision

**Batch lifecycle:** Trigger → Process → Commit → Validate → Reconcile → Audit

**Failed halfway:** Progress → Commit state → Idempotency → Checkpoint → Safe replay

**Slow:** Volume vs throughput → Dependency → Resource → Retry

**Missed:** Scheduler → Timezone → Dependency → Catch-up decision

**Completion:** Green status is not enough; prove business completeness.

---

# 57. Module 12 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| Batch architecture | 4+ | |
| Scheduling concepts | 4+ | |
| Job-not-started diagnosis | 5 | |
| Slow/hung distinction | 5 | |
| Dependencies | 4+ | |
| Retry strategy | 5 | |
| Idempotency | 5 | |
| Checkpointing | 5 | |
| Partial processing | 5 | |
| Safe rerun | 5 | |
| Reconciliation | 5 | |
| Audit trail | 4+ | |
| Duplicate prevention | 5 | |
| Overlapping jobs | 4+ | |
| Backfill | 4+ | |
| Batch observability | 5 | |
| Scenario handling | 5 | |
| Trainer lab design | 5 | |
| Whiteboard explanation | 4+ | |
| Cross-question survival | 4+ | |

---

# 58. Module 12 Readiness Gate

## PASS only when you can:

- Explain batch vs real-time and scheduled vs event-driven processing.
- Troubleshoot a job that never started.
- Distinguish slow from hung processing.
- Explain retries and idempotency.
- Explain checkpointing.
- Recover safely from partial processing.
- Explain reconciliation.
- Prevent duplicate and overlapping execution.
- Explain missed schedule and backfill strategy.
- Define meaningful batch monitoring and alerts.
- Handle at least five production scenarios.
- Design at least three practical labs.
- Draw the batch troubleshooting flow.
- Survive at least 10 follow-up questions.

### Minimum Score

**P1 target average ≥ 3.5/5, with no critical dimension below 3.**

If the recovery strategy becomes “rerun the job” without commit-state, idempotency, and reconciliation reasoning, Module 12 remains **BLOCKED**.

---

# 59. Final Module Outcome

After this module, the panel should think:

> **“He understands scheduled workloads as business-critical production flows, can recover partial failures safely, and can teach engineers how to prove complete and correct processing rather than simply rerunning jobs.”**

That is the selection goal for Module 12.
