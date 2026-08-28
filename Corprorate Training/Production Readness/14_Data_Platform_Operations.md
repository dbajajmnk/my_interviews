# iRun Corporate Training Interview Preparation
## Module 14 — Data Platform Operations

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P2 — Interview-Level Operational Awareness  
**Primary Goal:** Build credible operational understanding of Spark/Databricks, Snowflake, Airflow, dbt, and Azure Data Factory without pretending deep specialist administration experience.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain the role of each major data platform in a production architecture.
- Identify the common operational failure points.
- Know what evidence to collect first.
- Explain where logs, metrics, job history, and dependency signals come from.
- Distinguish compute, orchestration, transformation, warehouse, and pipeline concerns.
- Troubleshoot common data-job failures systematically.
- Explain how data issues differ from online API incidents.
- Design trainer-level scenarios and practical labs.
- Handle product-specific questions honestly and safely.

The panel should think:

> **“He understands the operational architecture and failure model of the data stack, even where he is not claiming specialist-administrator depth.”**

---

# 2. Data Platform Mental Model

Use this simple end-to-end flow:

```text
SOURCE
  |
  v
INGESTION / PIPELINE
ADF / Kafka / File
  |
  v
PROCESSING
Spark / Databricks
  |
  v
TRANSFORMATION
dbt / SQL
  |
  v
WAREHOUSE
Snowflake
  |
  v
ORCHESTRATION
Airflow / Scheduler
  |
  v
CONSUMPTION
BI / Reports / Downstream Apps
```

Operationally, failures can occur at **source, movement, compute, transformation, orchestration, warehouse, or destination**.

---

# 3. Universal Data-Platform Troubleshooting Flow

Use:

`Trigger → Source → Credentials → Connectivity → Schema → Compute → Transformation → Destination → Data Quality → Reconciliation → Retry/Recovery`

Correlate with:

- Job history
- Logs
- Metrics
- Query history
- Dependency health
- Input/output counts

---

# 4. Spark — High-Level Architecture

Core concepts:

- Driver
- Executors
- Job
- Stage
- Task
- Partition
- Shuffle

Simplified:

```text
DRIVER
  |
Schedules Work
  |
+---------+---------+
|         |         |
EXEC 1   EXEC 2    EXEC 3
|         |         |
Tasks    Tasks     Tasks
```

---

# 5. Spark Driver

The driver:

- Coordinates application execution
- Builds execution plan
- Schedules tasks
- Tracks progress

Driver failure can stop the whole application.

---

# 6. Spark Executors

Executors:

- Run tasks
- Hold working data
- Perform transformations

Operational issues:

- Memory pressure
- executor loss
- skew
- slow task
- shuffle pressure

---

# 7. Spark Partition

A partition is a chunk of data processed in parallel.

Too few partitions:

- poor parallelism

Too many partitions:

- overhead

Uneven partitions:

- data skew

---

# 8. Data Skew

Data skew occurs when some partitions hold much more data than others.

Symptoms:

- Most tasks finish quickly
- A small number run much longer
- One executor becomes overloaded
- Job appears “stuck near completion”

Possible causes:

- Highly uneven keys
- join imbalance
- partitioning strategy

---

# 9. Shuffle

Shuffle moves data across executors between stages.

It can become expensive because of:

- Network
- disk
- serialization
- large intermediate data
- skew

Operational symptom:

- slow stage
- high I/O
- executor pressure

---

# 10. Spark Memory Failure

Possible causes:

- Large partitions
- cache/persist misuse
- skew
- insufficient executor memory
- huge joins
- large aggregation

Do not solve every issue by increasing memory.

---

# 11. Strong Answer — “Spark Job Is Slow. What Do You Check?”

> “I compare the current job with the normal baseline: input volume, stage duration, task distribution and resource usage. I look for skew, long-running tasks, shuffle-heavy stages, executor failures and dependency or storage latency. The key question is whether the workload grew or the processing rate degraded, and which stage explains the difference.”

---

# 12. Databricks — Operational View

Databricks provides managed analytics and data-processing capabilities around Spark and related tooling.

Operational concepts:

- Workspace
- Cluster / compute
- Job
- Notebook / task
- Runtime
- Data source
- Job run history

For interview:

Focus on **job execution and troubleshooting**, not platform administration internals.

---

# 13. Databricks Job Failure

Check:

- Job run history
- Failed task
- Cluster state
- Runtime version
- dependency/library
- credentials
- data source
- schema
- memory/compute
- notebook/script exception

---

# 14. Databricks Cluster Issue

Possible:

- cluster unavailable
- startup delay
- runtime mismatch
- insufficient resources
- library conflict
- permission
- quota

Strong approach:

Separate **cluster failure** from **application/job logic failure**.

---

# 15. Databricks Runtime Compatibility

A job can fail after runtime upgrade due to:

- library incompatibility
- changed defaults
- language/runtime version
- connector version

Compare last known good runtime.

---

# 16. Snowflake — High-Level Architecture

Conceptually separate:

- Storage
- Compute
- Database objects

Important operational concepts:

- Warehouse
- Database
- Schema
- Query history
- Roles/permissions

---

# 17. Virtual Warehouse

A Snowflake warehouse provides compute for queries.

Operational problems:

- Warehouse suspended
- under-sized
- overloaded/concurrency
- cost
- queueing

Do not confuse warehouse with database/schema.

---

# 18. Snowflake Query Performance

Check:

- Query history
- execution time
- scan volume
- warehouse size
- concurrency
- data pruning
- query design
- joins
- resource usage

Avoid immediately scaling warehouse.

---

# 19. Strong Answer — “Snowflake Query Is Slow. What Will You Check?”

> “I would first check query history and compare runtime with baseline. Then I would review scan volume, concurrency, warehouse state and size, query structure and whether the workload changed. Scaling compute may be useful, but I would first determine whether the issue is resource contention or an inefficient query/data-access pattern.”

---

# 20. Snowflake Access Failure

Check:

- Role
- permission
- warehouse access
- database/schema privilege
- credentials
- network/security policy
- object existence

Differentiate authentication from authorization.

---

# 21. Airflow — High-Level Architecture

Core concepts:

- DAG
- Task
- Scheduler
- Worker
- Executor
- Dependency

Mental model:

```text
DAG
 |
Scheduler
 |
Tasks
 |
Workers
 |
External Systems
```

---

# 22. DAG

A DAG defines workflow tasks and dependencies.

Operational concerns:

- Dependency order
- retries
- schedule
- task failure
- branching

---

# 23. Airflow Scheduler

Scheduler determines when tasks should run.

If tasks do not start:

- scheduler health
- DAG parsing
- schedule
- dependency
- queue
- worker capacity

---

# 24. Airflow Task Failure

Check:

- Task logs
- upstream task
- credentials
- input
- external dependency
- code exception
- retry state
- timeout

Do not treat DAG failure as one monolithic issue.

---

# 25. Airflow Retry

Useful for transient failures.

Avoid:

- Retry forever
- Hiding permanent data/schema issue

Use proper:

- retry count
- delay
- alert
- idempotency

---

# 26. dbt — Operational View

dbt focuses on transforming data using SQL-based models and dependency graphs.

Core concepts:

- Model
- Source
- Test
- Dependency
- Build/run

For interview:

Understand operational failures more than authoring syntax.

---

# 27. dbt Model Failure

Possible causes:

- SQL error
- missing source
- schema change
- permission
- dependency
- data type
- warehouse issue

Check:

- failed model
- upstream dependency
- compiled SQL
- warehouse query error

---

# 28. dbt Tests

Tests can detect:

- Null issues
- uniqueness
- referential integrity
- custom data-quality problems

Operational value:

> A pipeline can technically run but still produce incorrect data.

---

# 29. Data Quality Failure

Important distinction:

**Technical success != data correctness**

Examples:

- pipeline green
- row count wrong
- duplicate rows
- null key
- stale data

This is highly interview-relevant.

---

# 30. Azure Data Factory — Mental Model

Core concepts:

- Pipeline
- Activity
- Dataset
- Linked Service
- Trigger
- Integration Runtime

Simplified:

```text
TRIGGER
  |
PIPELINE
  |
ACTIVITY
  |
LINKED SERVICE
  |
SOURCE / TARGET
```

---

# 31. ADF Pipeline

A pipeline groups activities into a workflow.

Possible failures:

- trigger
- activity
- linked service
- credential
- integration runtime
- source
- target

---

# 32. ADF Linked Service

Represents connection information to external system.

Common failure:

- Credential expired
- wrong endpoint
- permission
- network
- secret rotation

---

# 33. Integration Runtime

ADF Integration Runtime provides compute/connectivity for data movement or execution scenarios.

Operational problems:

- unavailable
- network inaccessible
- self-hosted runtime down
- permission
- capacity

---

# 34. ADF Trigger Failure

If pipeline did not start:

- Trigger enabled?
- schedule?
- event?
- timezone?
- permissions?
- trigger dependency?

Same principle as batch troubleshooting.

---

# 35. ADF Activity Failure

Check:

- activity output
- error code
- linked service
- source/target
- schema
- mapping
- integration runtime
- timeout

---

# 36. Strong Answer — “ADF Pipeline Failed. What Will You Check?”

> “I first determine whether the trigger fired and which activity failed. Then I inspect activity output and error code, validate the linked service, credentials, Integration Runtime, source/target connectivity and schema or mapping changes. If partial data moved, I also verify replay/idempotency and reconcile output before rerunning.”

---

# 37. Cross-Platform Failure Categories

Across all data platforms, common categories are:

1. Trigger/schedule
2. Credentials
3. Network
4. Source unavailable
5. Schema change
6. Data quality
7. Compute/resource
8. Transformation error
9. Destination error
10. Retry/replay issue

This is the reusable interview framework.

---

# 38. Schema Drift

Schema drift means input structure changes unexpectedly.

Examples:

- column added
- column removed
- data type changed
- nested field changed

Possible consequences:

- pipeline failure
- silent data issue
- mapping error

Mitigation:

- contract/versioning
- validation
- schema checks
- alerting

---

# 39. Data Lineage

Lineage answers:

> Where did this data come from and where does it go?

Operational value:

- Impact analysis
- RCA
- Compliance
- downstream dependency analysis

---

# 40. Reconciliation

For data platforms:

```text
Source Count
   |
Processed Count
   |
Rejected Count
   |
Target Count
```

All records should be accounted for.

---

# 41. Data Freshness

A pipeline may succeed but data may be stale.

Monitor:

- Last successful load
- source timestamp
- ingestion delay
- target freshness

This is a better business signal than only job status.

---

# 42. Scenario 1 — Spark Job Stuck at 95%

Check:

- Long-running partitions
- skew
- executor failure
- shuffle
- one large key

---

# 43. Scenario 2 — Databricks Job Failed After Runtime Upgrade

Check:

- Runtime change
- library compatibility
- connector
- language version
- last known good runtime

---

# 44. Scenario 3 — Snowflake Query Suddenly Slow

Check:

- query history
- data volume
- concurrency
- warehouse
- query plan/access pattern

---

# 45. Scenario 4 — Airflow DAG Did Not Start

Check:

- Scheduler
- DAG parse
- schedule
- dependency
- worker/executor
- enablement

---

# 46. Scenario 5 — dbt Build Green but Report Wrong

Check:

- data-quality tests
- source freshness
- transformation logic
- duplicate/null data
- downstream semantic assumptions

---

# 47. Scenario 6 — ADF Pipeline Partially Loaded Data

Check:

- failed activity
- committed data
- retry semantics
- duplicates
- safe rerun
- reconciliation

---

# 48. Scenario 7 — Credential Rotation Broke Multiple Pipelines

Check:

- secret source
- linked services
- app identities
- deployment propagation
- dependency map

RCA should include rotation process and validation gaps.

---

# 49. Scenario 8 — Data Freshness SLA Missed

Even if pipeline eventually succeeds, business impact exists.

Check:

- trigger
- queue
- compute
- source delay
- processing duration
- downstream delivery

---

# 50. Corporate Training Angle

Do not teach all product screens.

Teach:

**Architecture → Healthy Run → Failure Signal → Evidence → Recovery → Data Validation**

Learners should answer:

- Which stage failed?
- Is data partially committed?
- Is rerun safe?
- How do we prove correctness?

---

# 51. Lab 1 — Spark Data Skew

Inject:

- Highly uneven key distribution

Learners:

- observe long tail
- inspect task distribution
- identify skew
- explain mitigation

---

# 52. Lab 2 — Databricks Runtime Mismatch

Inject:

- incompatible library/runtime

Learners:

- inspect job history
- identify failed task
- compare environment
- correct dependency/runtime

---

# 53. Lab 3 — Snowflake Slow Query

Inject:

- inefficient query or constrained warehouse

Learners:

- inspect query history
- compare baseline
- identify bottleneck
- improve
- validate

---

# 54. Lab 4 — Airflow Failed Dependency

Inject:

- upstream task failure

Learners:

- inspect DAG
- task logs
- dependency
- retry safely

---

# 55. Lab 5 — dbt Data Quality Failure

Inject:

- duplicate/null data

Learners:

- run tests
- identify model/source
- fix
- validate downstream

---

# 56. Lab 6 — ADF Broken Linked Service

Inject:

- expired credential

Learners:

- inspect activity failure
- validate linked service
- correct secret
- rerun safely
- reconcile

---

# 57. Whiteboard — Data Platform Troubleshooting

```text
               TRIGGER
                  |
                SOURCE
                  |
            INGESTION / ADF
                  |
             PROCESSING
         Spark / Databricks
                  |
           TRANSFORMATION
                 dbt
                  |
              WAREHOUSE
              Snowflake
                  |
             ORCHESTRATION
               Airflow
                  |
             CONSUMPTION
                  |
        DATA QUALITY / FRESHNESS
                  |
             RECONCILIATION
```

---

# 58. 30-Second Explain-on-Demand

> “For data-platform incidents I follow the pipeline stage by stage: trigger, source, credentials, connectivity, schema, compute, transformation, destination and data quality. I also verify partial commits and reconciliation before rerunning, because a green job status is not enough if the resulting data is incomplete or incorrect.”

---

# 59. 5-Minute Trainer Demo

### Topic: Technical Success vs Data Success

1. Pipeline runs successfully.
2. Target row count is wrong.
3. Explain data-quality issue.
4. Show source/processed/rejected/target counts.
5. Explain dbt tests / validation.
6. Explain freshness.
7. Reconciliation.
8. Key takeaway.

---

# 60. High-Probability Interview Questions

1. Explain Spark driver and executor.
2. What is a partition?
3. What is data skew?
4. What is shuffle?
5. How do you troubleshoot slow Spark job?
6. What is Databricks operationally?
7. How do you troubleshoot Databricks job failure?
8. What is Snowflake warehouse?
9. How do you troubleshoot slow Snowflake query?
10. What is Airflow DAG?
11. Role of scheduler?
12. How do you troubleshoot failed Airflow task?
13. What is dbt?
14. What are dbt tests?
15. What is ADF pipeline?
16. What is Linked Service?
17. What is Integration Runtime?
18. How do you troubleshoot ADF failure?
19. What is schema drift?
20. What is data lineage?
21. What is data freshness?
22. Why is reconciliation important?
23. How would you teach these platforms?
24. Which areas are you strongest/less deep in?

---

# 61. Cross-Question Drill

## Q1. Spark job slow — increase executors?

Not automatically. Check skew, shuffle, workload, partitioning and stage bottlenecks first.

## Q2. Snowflake query slow — increase warehouse?

Possibly, but first check concurrency, scan volume and query pattern.

## Q3. Airflow DAG failed — is scheduler broken?

Not necessarily. A task or dependency may have failed.

## Q4. dbt run succeeded. Is data correct?

Not necessarily. Validate tests, freshness, counts and business rules.

## Q5. ADF pipeline failed after 70% — rerun?

Only after verifying partial commits, idempotency and reconciliation.

## Q6. Data skew means more data overall?

No. It means uneven distribution across partitions.

## Q7. Can pipeline be healthy but data stale?

Yes. Last-success status may not reflect freshness SLA.

## Q8. Is Databricks just Spark?

Databricks builds a managed platform around Spark and broader data/AI workflows; do not reduce it to only Spark.

## Q9. Is Airflow a data-processing engine?

No. It orchestrates workflows; processing usually happens in external systems.

## Q10. What if you have not administered Snowflake directly?

State the boundary, explain the operational architecture and diagnostic method, and validate product-specific labs before delivery.

---

# 62. Honest Gap-Handling Position

Recommended phrasing:

> “My strongest production background is in application engineering, cloud, APIs, messaging, databases and troubleshooting. For specialist platforms such as Databricks, Snowflake, Airflow or dbt, I focus on the operational architecture, failure modes, evidence sources and validated labs required by the curriculum. I would not overstate deep platform-administrator experience, but I can teach the troubleshooting workflow responsibly after validating the scenarios.”

---

# 63. Red Flags

Do not:

- Claim deep administration of every data platform.
- Treat Spark slow job as “add memory.”
- Treat Snowflake performance as “scale warehouse.”
- Treat Airflow as processing engine.
- Treat green pipeline as proof of correct data.
- Ignore partial commits.
- Rerun without reconciliation.
- Ignore schema drift.
- Ignore data freshness.
- Teach product UI instead of operational reasoning.

---

# 64. Quick Revision

**Spark:** Driver → Executors → Stages → Tasks → Partitions

**Databricks:** Cluster/Compute → Job → Task → Runtime

**Snowflake:** Warehouse = Compute

**Airflow:** DAG → Scheduler → Task → Worker

**dbt:** Models → Dependencies → Tests

**ADF:** Trigger → Pipeline → Activity → Linked Service → Integration Runtime

**Golden Rule:** Data operations require both technical completion and data correctness.

---

# 65. Module 14 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| Spark architecture | 3+ | |
| Data skew/shuffle | 3+ | |
| Spark troubleshooting | 3+ | |
| Databricks operations | 3+ | |
| Snowflake concepts | 3+ | |
| Snowflake troubleshooting | 3+ | |
| Airflow DAG/scheduler | 3+ | |
| Airflow troubleshooting | 3+ | |
| dbt concepts/tests | 3+ | |
| ADF concepts | 3+ | |
| ADF troubleshooting | 3+ | |
| Schema drift | 3+ | |
| Data quality/freshness | 4 | |
| Reconciliation | 4 | |
| Scenario handling | 3+ | |
| Trainer lab design | 3+ | |
| Honest gap handling | 5 | |
| Cross-question survival | 3+ | |

---

# 66. Module 14 Readiness Gate

## PASS only when you can:

- Explain the end-to-end data-platform flow.
- Explain Spark driver/executor/partition.
- Explain data skew.
- Explain Databricks job troubleshooting.
- Explain Snowflake warehouse and basic query diagnostics.
- Explain Airflow DAG/scheduler/task.
- Explain dbt models/tests at operational depth.
- Explain ADF pipeline/activity/linked service/integration runtime.
- Explain schema drift, freshness, and reconciliation.
- Handle at least five common data-platform incidents.
- Design at least three trainer scenarios.
- State specialist boundaries confidently.
- Survive at least 10 follow-up questions.

### Minimum Score

**P2 target average ≥ 3/5, with honest-gap handling at 5/5.**

If answers become product-feature memorization or overclaim specialist experience, Module 14 remains **BLOCKED**.

---

# 67. Final Module Outcome

After this module, the panel should think:

> **“He understands where data-platform failures occur, how to diagnose them operationally, and how to teach the required scenarios responsibly without pretending to be a deep specialist in every platform.”**

That is the selection goal for Module 14.
