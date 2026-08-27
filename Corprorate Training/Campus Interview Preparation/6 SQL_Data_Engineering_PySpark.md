# M06 — SQL, Data Engineering & PySpark
## AI & Data Campus Interview Preparation

**Interview:** 28 August 2026, 3:00 PM IST  
**Framework:** Standard Interview Preparation Framework  
**Module:** M06  
**Phase:** Phase 2 — AI & Data Engineering Depth  
**Priority:** P1 — Strong Working Knowledge  
**Status:** Ready for Study / Practice

---

# 1. Module Objective

This module prepares you to explain, design, troubleshoot, optimize, and teach the data-engineering foundation behind the AI & Data Campus.

By the end of M06, you must be able to:

1. Explain core SQL concepts confidently.
2. Solve practical SQL interview questions.
3. Explain ETL vs ELT.
4. Compare Data Lake, Data Warehouse, and Lakehouse.
5. Explain batch vs streaming.
6. Explain Spark architecture.
7. Explain driver, executors, jobs, stages, and tasks.
8. Explain transformations, actions, and lazy evaluation.
9. Explain partitioning and shuffle.
10. Optimize PySpark workloads.
11. Explain data quality and schema evolution.
12. Troubleshoot common production data-pipeline failures.
13. Teach these concepts to mixed-skill learners.
14. Defend architecture trade-offs in interview discussion.

---

# 2. Master Mental Model

```text
Source Systems
    ↓
Ingestion
    ↓
Raw / Bronze
    ↓
Clean / Silver
    ↓
Business / Gold
    ↓
Warehouse / Lakehouse
    ↓
Analytics / BI / ML / AI
```

Core technologies may include:

```text
SQL
+
Python
+
PySpark
+
Cloud Storage
+
Orchestration
+
Warehouse / Lakehouse
```

---

# 3. What Is Data Engineering?

Data Engineering is the discipline of designing and operating systems that collect, transform, store, govern, and serve data reliably for downstream consumers.

Consumers may include:

- BI dashboards,
- analytics,
- ML models,
- GenAI systems,
- APIs,
- operational applications.

---

# 4. Business Problem

Organizations usually have data scattered across:

- transactional databases,
- APIs,
- files,
- SaaS platforms,
- logs,
- streams,
- IoT,
- CRM,
- ERP.

The data is often:

- inconsistent,
- duplicated,
- delayed,
- incomplete,
- differently formatted.

Data engineering turns this raw data into trusted, usable data products.

---

# 5. Data Engineering Lifecycle

```text
Source
 ↓
Ingest
 ↓
Validate
 ↓
Transform
 ↓
Store
 ↓
Serve
 ↓
Monitor
 ↓
Govern
```

---

# 6. SQL Fundamentals

SQL is the primary language for working with structured relational data.

Key areas:

- SELECT
- WHERE
- JOIN
- GROUP BY
- HAVING
- ORDER BY
- subqueries
- CTEs
- window functions
- indexes
- transactions

---

# 7. INNER JOIN

Returns matching rows from both tables.

```sql
SELECT e.employee_id,
       e.name,
       d.department_name
FROM employee e
JOIN department d
  ON e.department_id = d.department_id;
```

---

# 8. LEFT JOIN

Returns all rows from the left table and matching rows from the right.

```sql
SELECT e.employee_id,
       e.name,
       d.department_name
FROM employee e
LEFT JOIN department d
  ON e.department_id = d.department_id;
```

Useful for detecting missing relationships.

---

# 9. JOIN Interview Trap

Suppose an employee has no department.

An INNER JOIN removes that employee.

A LEFT JOIN preserves them with NULL department fields.

---

# 10. GROUP BY

Used for aggregation.

```sql
SELECT department_id,
       COUNT(*) AS employee_count
FROM employee
GROUP BY department_id;
```

---

# 11. HAVING vs WHERE

## WHERE

Filters rows before grouping.

## HAVING

Filters aggregated groups after grouping.

```sql
SELECT department_id,
       COUNT(*) AS employee_count
FROM employee
GROUP BY department_id
HAVING COUNT(*) > 10;
```

---

# 12. Subquery

```sql
SELECT name
FROM employee
WHERE salary > (
    SELECT AVG(salary)
    FROM employee
);
```

---

# 13. CTE

Common Table Expression improves readability.

```sql
WITH avg_salary AS (
    SELECT AVG(salary) AS value
    FROM employee
)
SELECT e.name,
       e.salary
FROM employee e
CROSS JOIN avg_salary a
WHERE e.salary > a.value;
```

---

# 14. Window Functions

Window functions calculate values across related rows without collapsing the result set.

Examples:

- ROW_NUMBER
- RANK
- DENSE_RANK
- SUM OVER
- AVG OVER
- LAG
- LEAD

---

# 15. ROW_NUMBER

```sql
SELECT employee_id,
       department_id,
       salary,
       ROW_NUMBER() OVER (
           PARTITION BY department_id
           ORDER BY salary DESC
       ) AS rn
FROM employee;
```

---

# 16. Top N per Group

Find top 3 salaries per department.

```sql
WITH ranked AS (
    SELECT employee_id,
           department_id,
           salary,
           ROW_NUMBER() OVER (
               PARTITION BY department_id
               ORDER BY salary DESC
           ) AS rn
    FROM employee
)
SELECT *
FROM ranked
WHERE rn <= 3;
```

High-probability interview question.

---

# 17. RANK vs DENSE_RANK

Suppose salaries:

```text
100
100
90
80
```

RANK:

```text
1
1
3
4
```

DENSE_RANK:

```text
1
1
2
3
```

---

# 18. LAG / LEAD

Compare current row with previous/next row.

Example:

```sql
SELECT order_date,
       sales,
       LAG(sales) OVER (
           ORDER BY order_date
       ) AS previous_sales
FROM daily_sales;
```

---

# 19. Index

An index is a data structure that improves lookup speed.

Trade-off:

```text
Read Performance ↑
Write Cost ↑
Storage ↑
Maintenance ↑
```

---

# 20. Why Not Index Every Column?

Because indexes:

- consume storage,
- slow writes,
- require maintenance,
- may not help low-selectivity queries.

Choose based on access patterns.

---

# 21. Composite Index

Example:

```text
(customer_id, order_date)
```

Column order matters.

Index usefulness depends on query predicates and database optimizer behavior.

---

# 22. Query Optimization

Check:

- execution plan,
- full scans,
- join order,
- indexes,
- unnecessary columns,
- filters,
- aggregation,
- sorting,
- cardinality.

Senior principle:

> "Do not optimize SQL by intuition alone; inspect the execution plan."

---

# 23. SELECT *

Avoid in production when unnecessary.

Problems:

- extra I/O,
- network cost,
- unstable contracts,
- prevents some optimizations.

---

# 24. Transactions

Transaction properties:

**ACID**

- Atomicity
- Consistency
- Isolation
- Durability

---

# 25. Isolation Levels

Common conceptual levels:

- Read Uncommitted
- Read Committed
- Repeatable Read
- Serializable

Higher isolation:

- stronger consistency,
- lower concurrency.

Exact implementation depends on database.

---

# 26. Normalization

Normalization reduces duplication and improves consistency.

Common forms:

- 1NF
- 2NF
- 3NF

For interviews, explain the purpose rather than memorizing theory only.

---

# 27. Denormalization

Duplicates/combines data to improve read performance.

Often used in:

- analytics,
- reporting,
- star schemas.

Trade-off:

- faster reads,
- more storage,
- update complexity.

---

# 28. OLTP vs OLAP

## OLTP

- high transaction volume,
- small reads/writes,
- normalized schema,
- current operational data.

## OLAP

- analytical queries,
- large scans,
- aggregations,
- historical data.

---

# 29. ETL vs ELT

## ETL

```text
Extract
 ↓
Transform
 ↓
Load
```

Transform before loading to target.

## ELT

```text
Extract
 ↓
Load
 ↓
Transform
```

Use target compute platform for transformations.

---

# 30. Why ELT Became Popular

Modern cloud warehouses/lakehouses offer scalable compute.

So organizations can:

- land raw data quickly,
- preserve source fidelity,
- transform later,
- support multiple downstream use cases.

---

# 31. ETL vs ELT Decision

Use based on:

- compliance,
- data volume,
- transformation complexity,
- target capabilities,
- latency,
- governance.

---

# 32. Data Lake

Stores large volumes of raw/semi-structured/structured data.

Benefits:

- flexibility,
- low-cost storage,
- multi-format support.

Risks:

- poor governance,
- data swamp,
- unclear quality.

---

# 33. Data Warehouse

Curated analytical store optimized for structured reporting.

Strengths:

- strong schema,
- SQL,
- BI,
- governed data.

---

# 34. Lakehouse

Combines:

- lake storage flexibility,
- warehouse-like reliability/management.

Typical capabilities:

- ACID transactions,
- schema enforcement,
- versioning,
- SQL analytics,
- open storage formats.

---

# 35. Lake vs Warehouse vs Lakehouse

| Area | Data Lake | Warehouse | Lakehouse |
|---|---|---|---|
| Data types | Broad | Mostly structured | Broad |
| Cost | Lower storage | Higher | Balanced |
| Governance | Must be added | Strong | Strong when designed well |
| Transactions | Traditionally weak | Strong | Strong |
| ML/AI | Strong raw-data support | Limited raw-data flexibility | Strong |
| BI | Requires curation | Strong | Strong |

---

# 36. Batch Processing

Processes accumulated data at intervals.

Example:

- nightly sales load.

Benefits:

- simple,
- cost-efficient.

Limitations:

- higher latency.

---

# 37. Streaming

Processes events continuously or near-real-time.

Example:

- fraud detection,
- telemetry,
- clickstream.

Benefits:

- low latency.

Trade-offs:

- complexity,
- ordering,
- late events,
- retries,
- state.

---

# 38. Batch vs Streaming

Do not use streaming because it sounds modern.

Ask:

> "How fresh does the business data actually need to be?"

---

# 39. Data Pipeline

A pipeline may include:

```text
Extract
 ↓
Validate
 ↓
Transform
 ↓
Enrich
 ↓
Store
 ↓
Publish
```

Cross-cutting:

- retries,
- logging,
- lineage,
- quality,
- monitoring.

---

# 40. Idempotent Pipeline

Re-running the same input should not create duplicate or corrupt output.

Important for retries.

Approaches:

- unique business keys,
- merge/upsert,
- checkpoints,
- partition overwrite,
- transaction IDs.

---

# 41. Data Quality Dimensions

- completeness,
- accuracy,
- uniqueness,
- validity,
- consistency,
- timeliness.

---

# 42. Data Quality Example

Customer table:

```text
customer_id = NULL
```

violates completeness.

Duplicate customer ID violates uniqueness.

Invalid date violates validity.

---

# 43. Data Quality Gates

Pipeline:

```text
Raw Data
 ↓
Quality Check
 ↓
Pass?
 ├── Yes → Continue
 └── No → Quarantine / Alert
```

---

# 44. Schema Evolution

Source schemas change over time.

Examples:

- new column,
- removed column,
- type changed,
- renamed field.

Pipeline must define:

- backward compatibility,
- versioning,
- failure policy.

---

# 45. Breaking vs Non-Breaking Changes

Adding optional column:

Often non-breaking.

Changing integer to string:

Potentially breaking.

Removing required field:

Breaking.

---

# 46. Late-Arriving Data

Data may arrive after expected processing window.

Need:

- watermark,
- reprocessing,
- update logic,
- reconciliation.

---

# 47. Slowly Changing Dimensions

Common types:

## Type 1

Overwrite old value.

No history.

## Type 2

Create new row/version.

Preserve history.

High-probability data-engineering interview question.

---

# 48. Star Schema

```text
              Date Dim
                 |
Customer Dim — Fact Sales — Product Dim
                 |
              Store Dim
```

Fact table:

- measures,
- foreign keys.

Dimensions:

- descriptive attributes.

---

# 49. Fact Table

Examples:

- sales amount,
- quantity,
- discount.

---

# 50. Dimension Table

Examples:

- customer,
- product,
- region,
- date.

---

# 51. PySpark / Apache Spark

Apache Spark is a distributed processing engine for large-scale data.

PySpark is its Python API.

---

# 52. Why Spark?

Traditional single-machine processing struggles with large datasets.

Spark distributes computation across machines.

---

# 53. Spark Architecture

```text
Driver
  ↓
Cluster Manager
  ↓
Executors
  ↓
Tasks
```

---

# 54. Driver

Responsibilities:

- creates Spark session/context,
- builds execution plan,
- schedules work,
- coordinates executors,
- collects results.

---

# 55. Executor

Executor runs tasks on worker nodes.

Responsibilities:

- compute,
- cache partitions,
- return results.

---

# 56. Cluster Manager

Examples conceptually:

- Kubernetes,
- YARN,
- standalone,
- managed cloud runtime.

Allocates resources.

---

# 57. Spark Application

A Spark application typically consists of:

- driver,
- executors.

---

# 58. Job

An action triggers a Spark job.

---

# 59. Stage

Jobs are split into stages.

Stage boundaries often occur around shuffle.

---

# 60. Task

A task works on one partition.

High-level:

```text
Job
 ↓
Stages
 ↓
Tasks
```

---

# 61. RDD

Resilient Distributed Dataset is Spark's lower-level distributed data abstraction.

Modern applications often prefer DataFrames because:

- easier APIs,
- optimizer support,
- better execution planning.

---

# 62. DataFrame

Distributed table-like abstraction with schema.

Benefits:

- Catalyst optimizer,
- Tungsten execution,
- SQL compatibility.

---

# 63. Transformations

Create a new DataFrame/RDD.

Examples:

- select,
- filter,
- map,
- join,
- groupBy.

Transformations are usually lazy.

---

# 64. Actions

Trigger execution.

Examples:

- count,
- collect,
- show,
- write.

---

# 65. Lazy Evaluation

Spark builds a logical execution plan before running.

Why?

Allows optimizer to combine/reorder operations.

---

# 66. Catalyst Optimizer

Optimizes DataFrame/SQL query plans.

High-level flow:

```text
Logical Plan
 ↓
Optimized Logical Plan
 ↓
Physical Plan
 ↓
Execution
```

---

# 67. Partition

A partition is a chunk of distributed data processed by a task.

Too few partitions:

- poor parallelism.

Too many:

- scheduling overhead.

---

# 68. Narrow Transformation

Data can be processed without moving large amounts across partitions.

Examples:

- filter,
- map.

---

# 69. Wide Transformation

Requires data redistribution.

Examples:

- groupBy,
- join,
- distinct.

Often causes shuffle.

---

# 70. Shuffle

Shuffle moves data between executors/partitions.

Expensive because it may involve:

- network,
- serialization,
- disk,
- sorting.

---

# 71. Why Shuffle Is Expensive

Example:

```text
groupBy(customer_id)
```

All rows for same customer may need to reach same partition.

That requires redistribution.

---

# 72. Spark Optimization Principle

> **Reduce unnecessary shuffle.**

---

# 73. Broadcast Join

If one table is small, broadcast it to executors.

```text
Large Table
   JOIN
Small Dimension
```

Avoids large shuffle on both sides.

---

# 74. Broadcast Join Trade-Off

If "small" table is actually too large:

- executor memory pressure,
- failures.

Measure size.

---

# 75. Data Skew

Some keys have disproportionately large data.

Example:

```text
country = "US"
```

holds 70% of records.

One partition becomes huge.

Symptoms:

- one task takes much longer,
- executor OOM.

---

# 76. Skew Mitigation

Options:

- salting,
- repartitioning,
- skew join optimization,
- pre-aggregation,
- broadcast small side.

---

# 77. repartition vs coalesce

## repartition

Can increase or decrease partitions.

Typically causes shuffle.

## coalesce

Usually reduces partitions with less shuffle.

Use based on need.

---

# 78. Cache / Persist

Cache reused intermediate data when beneficial.

Bad practice:

Caching everything.

Costs memory and may reduce performance.

---

# 79. collect()

`collect()` brings all result data to driver.

Dangerous for large datasets.

May cause driver OOM.

---

# 80. UDF

User Defined Function allows custom logic.

But Python UDFs may be slower than built-in Spark functions.

Prefer built-in functions when possible.

---

# 81. Why Built-In Functions Are Better

They can be optimized by Catalyst and often avoid serialization overhead.

---

# 82. Predicate Pushdown

Filter data as early/close to source as possible.

Example:

Instead of reading 1 TB then filtering:

```text
Read only required partitions/rows.
```

---

# 83. Column Pruning

Read only required columns.

Avoid:

```python
df.select("*")
```

when only 3 columns are needed.

---

# 84. Partition Pruning

If data stored by date:

```text
/year=2026/month=08/day=28/
```

Filter on partition columns to avoid reading unrelated files.

---

# 85. Small Files Problem

Thousands/millions of tiny files create:

- metadata overhead,
- slow listing,
- inefficient tasks.

Mitigation:

- compaction,
- optimized write size,
- partition strategy.

---

# 86. File Formats

## CSV

Simple, human-readable.

Weak:

- schema,
- compression,
- type handling.

## JSON

Good for nested data.

Larger and slower for analytics.

## Parquet

Columnar.

Strong for analytics.

Benefits:

- compression,
- column pruning,
- predicate pushdown.

---

# 87. Why Parquet?

Analytics often reads subset of columns.

Columnar format reduces I/O.

---

# 88. PySpark Example

```python
from pyspark.sql import functions as F

sales = spark.read.parquet("/data/sales")

result = (
    sales
    .filter(F.col("year") == 2026)
    .groupBy("region")
    .agg(F.sum("amount").alias("total_sales"))
)

result.write.mode("overwrite").parquet("/output/region_sales")
```

---

# 89. PySpark Join Example

```python
from pyspark.sql.functions import broadcast

result = orders.join(
    broadcast(customers),
    on="customer_id",
    how="left"
)
```

Use only when customer table is reasonably small.

---

# 90. Data Pipeline Architecture

```text
Sources
 ↓
Ingestion
 ↓
Raw Storage
 ↓
Validation
 ↓
Spark Transformations
 ↓
Curated Storage
 ↓
Warehouse / BI / ML / AI
```

---

# 91. Bronze / Silver / Gold

## Bronze

Raw/landing data.

## Silver

Cleaned, standardized, deduplicated.

## Gold

Business-ready aggregates/models.

---

# 92. Why Medallion Architecture?

Benefits:

- separation of concerns,
- traceability,
- reprocessing,
- quality boundaries,
- business clarity.

---

# 93. Production Pipeline Concerns

Need:

- idempotency,
- retry,
- checkpointing,
- quality validation,
- monitoring,
- lineage,
- schema management,
- SLA.

---

# 94. Failure Handling

Example:

```text
Ingestion fails
 ↓
Retry
 ↓
Still fails
 ↓
Dead-letter / Quarantine
 ↓
Alert
```

---

# 95. Orchestration

Orchestrator manages:

- dependency order,
- schedule,
- retries,
- parameterization,
- monitoring.

Do not confuse orchestration with transformation.

---

# 96. Logging

Capture:

- run ID,
- source,
- row counts,
- failures,
- duration,
- quality checks.

---

# 97. Monitoring

Key metrics:

- pipeline success rate,
- freshness,
- processing time,
- row counts,
- data-quality failures,
- skew,
- executor failures.

---

# 98. Data Lineage

Lineage answers:

> "Where did this data come from, and what transformations produced it?"

Important for:

- governance,
- debugging,
- audits.

---

# 99. Data Governance

Includes:

- ownership,
- classification,
- access control,
- lineage,
- retention,
- quality,
- cataloging.

---

# 100. Security

Controls:

- least privilege,
- managed identity,
- encryption,
- secret management,
- row/column-level security,
- private networking,
- audit logs.

---

# 101. Cost Optimization

Data engineering cost depends on:

- compute duration,
- cluster size,
- storage,
- shuffle,
- data scans,
- idle resources.

Optimize:

- autoscaling,
- job clusters,
- partition pruning,
- column pruning,
- efficient formats,
- cluster shutdown.

---

# 102. Interview Question — ETL vs ELT

Strong answer:

> "ETL transforms data before loading it into the analytical target. ELT loads raw data first and performs transformations using the target platform's compute. ELT became common in cloud data platforms because storage is cheap and scalable compute allows multiple downstream transformations."

---

# 103. Cross-Question — Which Is Better?

> "Neither is universally better. I choose based on compliance, target capabilities, transformation requirements, latency, and whether raw data can safely land in the platform."

---

# 104. Interview Question — Data Lake vs Warehouse

> "A data lake is optimized for flexible storage of large volumes and multiple formats, while a warehouse is optimized for governed analytical querying. A lakehouse attempts to combine low-cost flexible storage with warehouse-like reliability and query capabilities."

---

# 105. Interview Question — What Is Lazy Evaluation?

> "Spark records transformations and builds a logical execution plan. It waits until an action requires a result, then optimizes and executes the plan. This allows Spark to reduce unnecessary work."

---

# 106. Interview Question — What Causes Shuffle?

Typical operations:

- groupBy,
- distinct,
- joins,
- repartition,
- orderBy.

---

# 107. Interview Question — Why Is Shuffle Expensive?

> "Because records must move across partitions, often involving serialization, network transfer, disk spill, and sorting."

---

# 108. Interview Question — Data Skew?

> "Data skew occurs when some partition keys contain far more records than others. A few tasks become bottlenecks while the rest of the cluster sits idle."

---

# 109. Interview Question — Broadcast Join?

> "If one side of a join is small, Spark can copy it to executors so the large side does not have to shuffle. It improves performance when the broadcast side fits safely in memory."

---

# 110. Interview Question — repartition vs coalesce?

> "Repartition creates a new partition distribution and typically shuffles data; it can increase or decrease partitions. Coalesce is commonly used to reduce partitions with less movement."

---

# 111. Scenario — Slow Spark Job

Troubleshoot:

```text
Execution Plan
 ↓
Input Size
 ↓
Partition Count
 ↓
Shuffle
 ↓
Skew
 ↓
Join Strategy
 ↓
Caching
 ↓
UDFs
 ↓
File Layout
 ↓
Executor Memory
```

---

# 112. Scenario — One Task Takes 30 Minutes

Likely:

- skew,
- huge partition,
- spill,
- bad key distribution.

---

# 113. Scenario — Driver OOM

Common causes:

- collect large dataset,
- huge broadcast,
- large metadata,
- excessive result collection.

---

# 114. Scenario — Many Small Files

Fix:

- compaction,
- better output partitioning,
- optimize write strategy.

---

# 115. Scenario — Duplicate Rows After Retry

Likely non-idempotent pipeline.

Fix:

- merge/upsert,
- business keys,
- checkpoint,
- deduplication.

---

# 116. Scenario — Schema Changed

Need:

- schema validation,
- versioning,
- compatibility rules,
- alert or controlled evolution.

---

# 117. SQL Practice — Second Highest Salary

```sql
SELECT MAX(salary) AS second_highest
FROM employee
WHERE salary < (
    SELECT MAX(salary)
    FROM employee
);
```

Alternative with DENSE_RANK for duplicates.

---

# 118. SQL Practice — Duplicate Records

```sql
SELECT email,
       COUNT(*) AS cnt
FROM customer
GROUP BY email
HAVING COUNT(*) > 1;
```

---

# 119. SQL Practice — Employees Without Department

```sql
SELECT e.*
FROM employee e
LEFT JOIN department d
  ON e.department_id = d.department_id
WHERE d.department_id IS NULL;
```

---

# 120. SQL Practice — Running Total

```sql
SELECT order_date,
       amount,
       SUM(amount) OVER (
           ORDER BY order_date
       ) AS running_total
FROM sales;
```

---

# 121. SQL Practice — Latest Record per Customer

```sql
WITH ranked AS (
    SELECT *,
           ROW_NUMBER() OVER (
               PARTITION BY customer_id
               ORDER BY updated_at DESC
           ) AS rn
    FROM customer_status
)
SELECT *
FROM ranked
WHERE rn = 1;
```

---

# 122. Q01 — Conceptual Questions

1. ETL vs ELT?
2. OLTP vs OLAP?
3. Lake vs warehouse vs lakehouse?
4. Batch vs streaming?
5. What is data quality?
6. What is schema evolution?
7. What is idempotency?
8. What is SCD Type 1 vs Type 2?
9. What is Spark?
10. Driver vs executor?
11. Transformation vs action?
12. What is lazy evaluation?
13. What is partition?
14. What is shuffle?
15. What is data skew?
16. broadcast join?
17. repartition vs coalesce?
18. Why Parquet?
19. What is lineage?
20. What is medallion architecture?

---

# 123. Q03 — Coding / SQL

Practice:

1. second highest salary,
2. nth highest salary,
3. duplicates,
4. top N per department,
5. running total,
6. latest record,
7. gaps in dates,
8. moving average,
9. joins,
10. CTE + window function.

---

# 124. Q04 — Scenario Questions

1. Design nightly batch pipeline.
2. Design near-real-time fraud pipeline.
3. Handle schema change.
4. Handle late data.
5. Handle duplicate events.
6. Optimize slow Spark job.
7. Handle skew.
8. Reduce cloud cost.
9. Design Bronze/Silver/Gold.
10. Support BI + ML from same data.

---

# 125. Q06 — Debugging

1. driver OOM,
2. executor OOM,
3. slow shuffle,
4. skew,
5. many small files,
6. duplicated rows,
7. missing partitions,
8. stale data,
9. broken schema,
10. failed quality checks.

---

# 126. Q07 — Code Review

Bad PySpark:

```python
rows = df.collect()

for row in rows:
    process(row)
```

Problems:

- pulls everything to driver,
- destroys distributed processing,
- OOM risk.

---

# 127. Q08 — Optimization

Improve Spark:

- filter early,
- select required columns,
- reduce shuffle,
- broadcast small dimension,
- optimize partitions,
- avoid unnecessary UDFs,
- use Parquet/Delta,
- cache only reused data,
- compact small files.

---

# 128. Q10 — Edge Cases

- empty input,
- duplicate records,
- null keys,
- late events,
- schema mismatch,
- malformed record,
- skewed key,
- missing partition,
- reprocessing same batch.

---

# 129. Q11 — Data Pipeline Pseudocode

```text
function runPipeline(batchId):

    files = discoverSource(batchId)

    validateSource(files)

    raw = ingest(files)

    quality = validate(raw)

    if quality.failed:
        quarantine(raw)
        alert()
        stop

    clean = transform(raw)

    mergeIntoSilver(clean)

    aggregates = buildGold(clean)

    publish(aggregates)

    recordLineage()
    recordMetrics()
```

---

# 130. Q12 — Cross-Question Survival

Expect:

1. Why Spark?
2. Why not SQL only?
3. Why batch instead of streaming?
4. Why lakehouse?
5. Why Parquet?
6. How do you handle retries?
7. How do you guarantee idempotency?
8. How do you handle schema evolution?
9. How do you detect skew?
10. How do you reduce shuffle?
11. How do you monitor quality?
12. How do you control cost?

---

# 131. Trainer Audition — Explain ETL vs ELT

> "Imagine moving house. ETL means you clean and organize everything before putting it into the new house. ELT means you move everything into a large storage area first, then organize it there. Cloud platforms made the second approach practical because they offer large storage and powerful compute."

---

# 132. Trainer Audition — Explain Shuffle

> "Imagine a classroom where students are initially seated randomly, but now everyone with the same department must sit together. Students have to move across the room. In Spark, shuffle is that data movement across partitions, and it is expensive because it uses network and disk."

---

# 133. Trainer Audition — Lab

Objective:

Build a Bronze → Silver → Gold pipeline.

Learners:

1. read raw sales CSV,
2. validate schema,
3. remove invalid rows,
4. deduplicate,
5. enrich,
6. aggregate,
7. write Parquet/Delta,
8. inspect execution plan.

Stretch:

- introduce skew and optimize it.

---

# 134. Trainer Assessment

Assess:

- correctness,
- idempotency,
- schema handling,
- partition strategy,
- performance,
- explanation,
- code quality.

---

# 135. Whiteboard Script — 5-Minute Data Platform

```text
1. Business consumers
2. Sources
3. Batch / stream requirement
4. Ingestion
5. Raw/Bronze
6. Transform/Silver
7. Business/Gold
8. Warehouse/Lakehouse
9. Security
10. Quality
11. Monitoring
12. Cost / SLA
```

---

# 136. Senior-Level Principles

Memorize:

> **1. Choose batch or streaming based on business latency, not trend.**

> **2. Data quality is part of the pipeline, not an afterthought.**

> **3. Idempotency is essential for reliable retries.**

> **4. Reduce unnecessary shuffle in Spark.**

> **5. Do not collect large datasets to the driver.**

> **6. Partitioning should follow access patterns, not arbitrary columns.**

> **7. Source schema changes need explicit compatibility rules.**

> **8. Medallion architecture creates quality boundaries, not just folders.**

> **9. Lakehouse is an architecture choice, not simply another storage account.**

> **10. Measure before optimizing.**

---

# 137. High-Probability Rapid-Fire Questions

Answer in 30–60 seconds:

1. WHERE vs HAVING?
2. ROW_NUMBER vs RANK vs DENSE_RANK?
3. CTE?
4. window function?
5. index?
6. why not index all columns?
7. OLTP vs OLAP?
8. ETL vs ELT?
9. lake vs warehouse?
10. lakehouse?
11. batch vs streaming?
12. idempotency?
13. data quality?
14. schema evolution?
15. SCD Type 1 vs 2?
16. Spark architecture?
17. driver?
18. executor?
19. transformation?
20. action?
21. lazy evaluation?
22. Catalyst?
23. partition?
24. shuffle?
25. narrow vs wide transformation?
26. broadcast join?
27. skew?
28. repartition vs coalesce?
29. cache?
30. collect risk?
31. UDF issue?
32. predicate pushdown?
33. partition pruning?
34. small files?
35. why Parquet?

---

# 138. M06 Readiness Gate

Do not mark M06 complete until all P1 items can be answered clearly.

## Gate A — SQL

- [ ] Explain joins.
- [ ] Explain WHERE vs HAVING.
- [ ] Explain CTE.
- [ ] Explain window functions.
- [ ] Solve Top-N per group.
- [ ] Explain indexes.
- [ ] Explain transaction/ACID basics.

## Gate B — Data Engineering

- [ ] Explain ETL vs ELT.
- [ ] Explain batch vs streaming.
- [ ] Explain lake vs warehouse vs lakehouse.
- [ ] Explain Bronze/Silver/Gold.
- [ ] Explain data quality.
- [ ] Explain idempotency.
- [ ] Explain schema evolution.
- [ ] Explain SCD Type 1 vs Type 2.

## Gate C — Spark

- [ ] Explain driver/executor.
- [ ] Explain job/stage/task.
- [ ] Explain transformation/action.
- [ ] Explain lazy evaluation.
- [ ] Explain shuffle.
- [ ] Explain partitions.
- [ ] Explain broadcast join.
- [ ] Explain skew.
- [ ] Explain repartition vs coalesce.
- [ ] Explain collect risk.

## Gate D — Production

- [ ] Troubleshoot slow Spark job.
- [ ] Handle duplicate reprocessing.
- [ ] Handle schema change.
- [ ] Handle bad data.
- [ ] Explain monitoring.
- [ ] Explain lineage.
- [ ] Explain cost optimization.

## Gate E — Interview Conversion

- [ ] Whiteboard data platform in 5 minutes.
- [ ] Solve at least 5 SQL questions.
- [ ] Survive "Why Spark?"
- [ ] Survive "Why lakehouse?"
- [ ] Survive "Why streaming?"
- [ ] Explain ETL/ELT to beginner.
- [ ] Explain shuffle to beginner.
- [ ] Design one PySpark lab.

### Completion Rule

**M06 PASS = You can explain and troubleshoot an end-to-end data pipeline and survive practical SQL/Spark cross-questioning.**

Weak areas move to **M12 Gap Closure**.

---

# 139. M06 One-Minute Battle Card

```text
ETL
Transform before load.

ELT
Load first, transform on target compute.

LAKE
Flexible raw storage.

WAREHOUSE
Governed analytics.

LAKEHOUSE
Lake flexibility + warehouse reliability.

BATCH
Scheduled/accumulated processing.

STREAM
Continuous low-latency events.

SPARK
Distributed compute engine.

DRIVER
Plans and coordinates.

EXECUTOR
Runs tasks.

LAZY
Transformations execute only when action triggers.

SHUFFLE
Cross-partition data movement.

BROADCAST
Send small table to executors.

SKEW
Uneven key distribution.

PARQUET
Columnar analytics format.

SENIOR PRINCIPLE
Data quality + idempotency + observability are part of the pipeline.
```

---

# 140. Next Module

After M06 passes its readiness gate:

# **M07 — Azure Data Engineering, Databricks, Delta Lake & Medallion**

M07 will cover:

- Azure Data Factory,
- ADLS Gen2,
- Event Hubs,
- Databricks,
- Spark on Azure,
- Delta Lake,
- ACID,
- schema enforcement/evolution,
- time travel,
- Medallion,
- Synapse,
- Microsoft Fabric,
- governance,
- Unity Catalog,
- security,
- performance,
- cost,
- enterprise whiteboarding,
- readiness gate.

---

**End of M06 — SQL, Data Engineering & PySpark**
