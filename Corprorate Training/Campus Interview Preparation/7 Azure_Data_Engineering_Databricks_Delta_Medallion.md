# M07 — Azure Data Engineering, Databricks, Delta Lake & Medallion
## AI & Data Campus Interview Preparation

**Interview:** 28 August 2026, 3:00 PM IST  
**Framework:** Standard Interview Preparation Framework  
**Module:** M07  
**Phase:** Phase 2 — AI & Data Engineering Depth  
**Priority:** P1 — Strong Working Knowledge  
**Status:** Ready for Study / Practice

---

# 1. Module Objective

This module prepares you to explain, design, troubleshoot, secure, optimize, and teach an enterprise Azure data platform using:

- Azure Data Factory
- ADLS Gen2
- Azure Event Hubs
- Azure Databricks
- Apache Spark
- Delta Lake
- Medallion Architecture
- Azure Synapse Analytics
- Microsoft Fabric
- Unity Catalog
- Power BI integration
- Security, governance, lineage, monitoring, and cost controls

By the end of M07, you must be able to:

1. Whiteboard an end-to-end Azure data platform.
2. Explain service responsibilities clearly.
3. Avoid confusing orchestration, storage, compute, and serving layers.
4. Explain Databricks + Delta Lake internals at architect level.
5. Explain Bronze/Silver/Gold as quality boundaries.
6. Explain Unity Catalog governance.
7. Discuss Azure security using identity-first design.
8. Handle batch and streaming scenarios.
9. Explain Synapse vs Fabric vs Databricks at a decision level.
10. Troubleshoot production data platform failures.
11. Explain cost/performance trade-offs.
12. Teach the architecture to beginners and experienced engineers.

---

# 2. Master Azure Data Architecture

```text
                    SOURCE SYSTEMS
          ┌────────────┬────────────┬────────────┐
          │            │            │            │
        SaaS         RDBMS        Files        Events
          │            │            │            │
          └───────┬────┴──────┬────┴───────┬────┘
                  │           │            │
                  ↓           ↓            ↓
              ADF / Fabric Data Factory   Event Hubs
                  │                        │
                  └──────────┬─────────────┘
                             ↓
                         ADLS Gen2
                             ↓
                        BRONZE / RAW
                             ↓
                      Azure Databricks
                        Spark + Delta
                             ↓
                           SILVER
                             ↓
                            GOLD
                             ↓
            ┌────────────────┼─────────────────┐
            │                │                 │
         Synapse           Fabric            BI / AI
            │                │                 │
            └────────────── Power BI ──────────┘

Cross-Cutting:
Entra ID • Managed Identity • Key Vault • RBAC • Private Networking
Unity Catalog • Lineage • Monitoring • Cost • CI/CD
```

---

# 3. Architectural Layers

Think in layers:

```text
1. Source Layer
2. Ingestion / Orchestration Layer
3. Storage Layer
4. Processing Layer
5. Serving / Analytics Layer
6. Governance Layer
7. Security Layer
8. Observability Layer
```

A senior interview answer should identify the responsibility of each layer.

---

# 4. Azure Data Factory — What Is It?

Azure Data Factory (ADF) is a managed Azure service for data integration and orchestration.

It is commonly used to:

- move data,
- orchestrate pipelines,
- connect heterogeneous sources,
- schedule jobs,
- trigger processing,
- execute activities,
- coordinate external compute such as Databricks.

---

# 5. ADF Is Primarily an Orchestrator

Do not describe ADF as if it is simply a Spark engine.

Use:

```text
ADF
= Connectivity + Movement + Orchestration + Scheduling
```

Transformations may occur through:

- Mapping Data Flows,
- Databricks,
- SQL,
- stored procedures,
- other compute services.

---

# 6. Current Platform Direction

Microsoft now positions **Data Factory in Microsoft Fabric** as the next-generation data integration experience.

Interview-safe answer:

> "Azure Data Factory remains extremely relevant in existing Azure estates. For greenfield platform strategy, I would also evaluate Fabric Data Factory because Microsoft is increasingly converging integration, engineering, analytics, and BI capabilities inside Fabric."

Do not say:

> "ADF is obsolete."

That would be inaccurate and too simplistic.

---

# 7. ADF Core Concepts

Key concepts:

- Pipeline
- Activity
- Dataset
- Linked Service
- Trigger
- Integration Runtime
- Parameter
- Variable
- Monitor

---

# 8. Pipeline

A pipeline is a logical grouping of activities.

Example:

```text
Copy Data
 ↓
Run Databricks Notebook
 ↓
Validate Row Count
 ↓
Load Warehouse
 ↓
Notify
```

---

# 9. Activity

An activity is one processing step.

Examples:

- Copy Activity
- Lookup
- ForEach
- If Condition
- Execute Pipeline
- Databricks Notebook
- Stored Procedure

---

# 10. Linked Service

Linked Service defines connection information to an external resource.

Examples:

- Azure SQL
- ADLS
- Databricks
- Snowflake
- REST API

Think:

> "Connection definition."

---

# 11. Dataset

Dataset represents the structure/location of data consumed or produced by activities.

Think:

> "The data asset reference."

---

# 12. Integration Runtime

Integration Runtime provides compute/connectivity for data movement and activity dispatch.

High-level types:

- Azure Integration Runtime
- Self-hosted Integration Runtime
- Azure-SSIS Integration Runtime

---

# 13. When Self-Hosted Integration Runtime?

Use when ADF needs to access:

- on-prem databases,
- private network resources,
- restricted systems not reachable directly from Azure integration runtime.

---

# 14. ADF Trigger

Common trigger concepts:

- schedule,
- tumbling window,
- event-based.

Example:

```text
File arrives
  ↓
Trigger
  ↓
Pipeline
```

---

# 15. Parameterization

Avoid duplicating pipelines for every table.

Use parameters:

```text
source_table
target_path
load_type
watermark_column
```

This supports metadata-driven pipelines.

---

# 16. Metadata-Driven Ingestion

Instead of 100 nearly identical pipelines:

```text
Control Table
  ↓
Generic Pipeline
  ↓
Loop Tables
  ↓
Dynamic Source/Target
```

Benefits:

- DRY
- maintainability
- scalability

---

# 17. Incremental Load

Do not reload entire tables unnecessarily.

Possible approaches:

- timestamp watermark
- increasing ID
- CDC
- source change feed
- last modified timestamp

---

# 18. Watermark Pattern

```text
Read Last Watermark
 ↓
Extract Rows > Watermark
 ↓
Process
 ↓
Validate
 ↓
Update Watermark
```

Update watermark only after successful processing.

---

# 19. Azure Data Lake Storage Gen2

ADLS Gen2 is Azure object storage optimized for analytics workloads.

Key concepts:

- containers / file systems,
- directories,
- files,
- hierarchical namespace,
- ACLs,
- lifecycle management.

---

# 20. Why ADLS Gen2?

Useful because it provides:

- scalable storage,
- low cost,
- integration with analytics engines,
- hierarchical namespace,
- security controls.

---

# 21. Storage Zones

A common design:

```text
/raw
/bronze
/silver
/gold
/archive
/quarantine
```

But avoid creating folders without governance and lifecycle rules.

---

# 22. Raw Zone

Preserve original source fidelity where possible.

Benefits:

- audit,
- reprocessing,
- troubleshooting.

---

# 23. Azure Event Hubs

Azure Event Hubs is a managed real-time event ingestion platform.

Use for:

- telemetry,
- application logs,
- clickstreams,
- IoT events,
- transaction streams.

It supports high-throughput ingestion and Kafka-compatible workloads.

---

# 24. Event Hubs Core Concepts

- Event Hub
- Partition
- Producer
- Consumer Group
- Offset
- Retention

---

# 25. Event Hub Partition

Partitions enable parallel ingestion/consumption.

Ordering is guaranteed only within a partition.

---

# 26. Partition Key

Choose key based on ordering need.

Example:

```text
customer_id
device_id
account_id
```

All events for same key can route to same partition.

Trade-off:

Bad key distribution can cause hot partitions.

---

# 27. Consumer Group

Different consumers can independently read the same stream.

Example:

```text
Event Hub
 ├── Fraud Consumer Group
 ├── Analytics Consumer Group
 └── Archive Consumer Group
```

---

# 28. Batch + Streaming Together

Modern platforms often need both.

```text
Batch:
RDBMS → ADF → ADLS → Databricks

Streaming:
Apps → Event Hubs → Databricks Structured Streaming
```

Both can land into Delta Lake.

---

# 29. Azure Databricks

Azure Databricks is a managed analytics platform built around Apache Spark and the Databricks lakehouse ecosystem.

Used for:

- data engineering,
- streaming,
- analytics,
- ML,
- AI workloads.

---

# 30. Databricks Workspace

Provides environment for:

- notebooks,
- jobs,
- workflows,
- SQL,
- data governance,
- compute.

---

# 31. Databricks Compute

Architectural options may include:

- interactive/all-purpose compute,
- job compute,
- SQL warehouses,
- serverless capabilities depending on workload/region.

Senior principle:

> "Use ephemeral job-oriented compute where possible for predictable batch workloads rather than leaving interactive clusters running."

---

# 32. Why Databricks?

Strengths:

- Spark ecosystem,
- notebook productivity,
- distributed processing,
- Delta Lake,
- streaming,
- ML/AI integration,
- governance with Unity Catalog.

---

# 33. Delta Lake

Delta Lake adds a transaction layer on top of data-lake storage.

It provides capabilities such as:

- ACID transactions,
- schema enforcement,
- schema evolution,
- time travel/version history,
- reliable MERGE/UPDATE/DELETE semantics.

---

# 34. Why Delta Lake?

Plain Parquet files are excellent analytical storage but do not by themselves provide full table transaction semantics.

Delta adds:

```text
Parquet Data Files
       +
Transaction Log
       =
Delta Table
```

---

# 35. Delta Transaction Log

The transaction log records changes to the Delta table.

This enables:

- table versioning,
- concurrency control,
- consistent reads,
- time travel.

---

# 36. ACID in Delta

## Atomicity
A transaction completes fully or not at all.

## Consistency
Table remains valid.

## Isolation
Concurrent operations do not expose partial results.

## Durability
Committed data persists.

---

# 37. Schema Enforcement

Incoming data must conform to expected table schema unless evolution is explicitly allowed.

This prevents silent corruption.

---

# 38. Schema Evolution

Allows controlled schema change.

Example:

```text
Existing:
id, name

New:
id, name, country
```

Do not enable unrestricted schema evolution blindly.

---

# 39. Time Travel

Query a previous table version.

Useful for:

- debugging,
- rollback analysis,
- audit,
- recovery.

---

# 40. MERGE

Useful for upsert and SCD logic.

Concept:

```text
Target
MERGE Source
ON business_key
WHEN MATCHED → UPDATE
WHEN NOT MATCHED → INSERT
```

---

# 41. Delta Optimization Concepts

Performance may depend on:

- file size,
- partitioning,
- data skipping,
- clustering strategies,
- compaction.

Do not over-partition.

---

# 42. Medallion Architecture

```text
BRONZE
Raw / minimally processed

   ↓

SILVER
Validated / standardized / deduplicated

   ↓

GOLD
Business-ready / aggregated / serving
```

---

# 43. Bronze

Responsibilities:

- preserve source,
- ingest reliably,
- append raw records,
- record ingestion metadata.

---

# 44. Silver

Responsibilities:

- clean,
- validate,
- standardize,
- deduplicate,
- conform schema,
- enrich.

---

# 45. Gold

Responsibilities:

- business metrics,
- dimensional models,
- aggregates,
- curated serving tables.

---

# 46. Senior Principle

> **Medallion is not just three folders. It creates explicit quality and responsibility boundaries.**

---

# 47. Data Quality in Medallion

Example:

```text
Bronze
  ↓
Quality Checks
  ↓
Invalid → Quarantine
Valid → Silver
  ↓
Business Rules
  ↓
Gold
```

---

# 48. Quarantine Pattern

Bad records should not disappear silently.

Store:

- failed data,
- error reason,
- source reference,
- pipeline run ID.

---

# 49. Synapse Analytics

Azure Synapse Analytics provides integrated analytics capabilities across SQL, Spark, and data integration scenarios.

Interview position:

> "I evaluate Synapse primarily in the context of existing Azure analytical estates, SQL-oriented serving, and established enterprise workloads."

---

# 50. Microsoft Fabric

Microsoft Fabric is an integrated analytics platform covering:

- Data Factory
- Data Engineering
- Data Science
- Data Warehouse
- Real-Time Intelligence
- Power BI
- OneLake

It brings multiple workloads under one SaaS-style platform.

---

# 51. Fabric Lakehouse

Fabric Lakehouse combines:

- OneLake storage,
- Delta format,
- Spark processing,
- SQL analytics endpoint.

It supports one-copy patterns across engineering and analytics use cases.

---

# 52. OneLake

OneLake is Fabric's unified logical data lake.

Think:

> "One organization-wide data lake foundation for Fabric."

---

# 53. Fabric vs Azure Databricks

Do not answer as winner/loser.

Use decision factors:

```text
Existing Ecosystem
Team Skills
Data Science / AI Depth
Open Lakehouse Strategy
Power BI Integration
Governance
Operational Model
Cost
Platform Standardization
```

---

# 54. Interview-Safe Comparison

> "Fabric provides a highly integrated Microsoft analytics SaaS experience with strong OneLake and Power BI alignment. Databricks provides deep lakehouse, Spark, data engineering, ML, and AI capabilities. In many enterprises they may coexist, so I would choose based on workload boundaries and platform strategy rather than treating them as mutually exclusive."

---

# 55. Synapse vs Fabric

Current strategy should recognize that Microsoft is investing heavily in Fabric.

But existing Synapse estates remain relevant.

Strong answer:

> "For existing Synapse implementations, migration is a business and platform decision, not an automatic rewrite. For greenfield analytics, I would evaluate Fabric alongside Databricks based on capability, skills, integration, governance, and cost."

---

# 56. Unity Catalog

Unity Catalog is the unified governance layer for data and AI in Databricks.

It supports:

- access control,
- discovery,
- lineage,
- auditing,
- classification,
- sharing,
- AI governance.

---

# 57. Unity Catalog Namespace

Common hierarchy:

```text
catalog.schema.object
```

Example:

```text
production.sales.orders
```

---

# 58. Why Catalogs Matter

Catalog can represent:

- domain,
- environment,
- data isolation boundary.

Example:

```text
prod_finance
prod_sales
dev_shared
```

Design intentionally.

---

# 59. Unity Catalog Securable Objects

Examples:

- catalogs,
- schemas,
- tables,
- views,
- volumes,
- functions,
- models.

Permissions can be applied across these objects.

---

# 60. Unity Catalog Lineage

Lineage helps answer:

> "Where did this column come from?"

and:

> "Which downstream assets break if this table changes?"

---

# 61. Audit

Governance should capture:

- who accessed data,
- what changed,
- when,
- which object,
- which workload.

---

# 62. Data Classification

Classify data:

- public,
- internal,
- confidential,
- restricted.

Use tags/policies where supported.

---

# 63. Unity Catalog and AI

Modern Unity Catalog also governs AI assets and interactions.

Architectural insight:

> Governance increasingly needs to cover data, models, agents, and AI endpoints together rather than as separate silos.

---

# 64. Security Architecture

```text
User / Service
      ↓
Microsoft Entra ID
      ↓
Managed Identity / Service Principal
      ↓
RBAC / Data Permissions
      ↓
Key Vault
      ↓
Private Networking
      ↓
Data / Compute
```

---

# 65. Microsoft Entra ID

Use for identity.

Avoid hardcoded users/passwords in pipelines.

---

# 66. Managed Identity

Managed Identity lets Azure services authenticate without storing explicit credentials.

Use when supported.

---

# 67. Key Vault

Store:

- secrets,
- keys,
- certificates.

Do not store credentials directly in notebooks or pipeline JSON.

---

# 68. RBAC vs Data-Level ACL

Azure RBAC controls resource-level access.

Storage ACL / Unity Catalog permissions govern data-level access.

A production system often needs both.

---

# 69. Private Endpoint

Private endpoints can keep service traffic on private networking.

Relevant for:

- ADLS,
- Key Vault,
- SQL,
- other services.

---

# 70. Network Security

Consider:

- VNets,
- private endpoints,
- firewall rules,
- egress restrictions,
- DNS.

---

# 71. Secrets Anti-Pattern

Bad:

```python
password = "P@ssw0rd"
```

Better:

- Managed Identity,
- Key Vault,
- secret scopes where appropriate.

---

# 72. Batch Architecture Example

```text
On-Prem SQL
    ↓
ADF + Self-Hosted IR
    ↓
ADLS Bronze
    ↓
Databricks
    ↓
Delta Silver
    ↓
Delta Gold
    ↓
Power BI / Fabric / Synapse
```

---

# 73. Streaming Architecture Example

```text
Applications
    ↓
Event Hubs
    ↓
Databricks Structured Streaming
    ↓
Delta Bronze
    ↓
Streaming Transform
    ↓
Silver / Gold
    ↓
Real-Time Analytics / BI
```

---

# 74. Lambda vs Lakehouse Simplification

Traditional lambda architecture had separate batch and speed paths.

Modern lakehouse/streaming systems try to simplify using unified processing and storage.

Do not claim architecture complexity disappears entirely.

---

# 75. Checkpointing in Streaming

Checkpoint records progress/state.

Needed for:

- restart,
- exactly-once-like processing semantics depending on source/sink,
- state recovery.

---

# 76. Watermark in Streaming

Watermark helps manage late events and state retention.

Example:

> Accept events up to 10 minutes late.

---

# 77. Exactly-Once vs At-Least-Once

Do not casually claim perfect exactly-once end-to-end.

Semantics depend on:

- source,
- processing,
- sink,
- idempotency.

Senior answer:

> "I design end-to-end correctness using checkpointing plus idempotent sinks rather than relying only on marketing-level exactly-once claims."

---

# 78. CI/CD for Data Platform

Version:

- notebooks,
- SQL,
- pipeline definitions,
- infrastructure,
- configs,
- tests.

Use environments:

```text
DEV → TEST → PROD
```

---

# 79. Infrastructure as Code

Use declarative infrastructure for:

- storage,
- Databricks,
- networks,
- identities,
- Key Vault,
- monitoring.

Benefits:

- reproducibility,
- review,
- drift reduction.

---

# 80. Environment Configuration

Do not hardcode:

- storage names,
- endpoints,
- secrets,
- catalog names.

Use parameterized configuration.

---

# 81. Data Testing

Test:

- schema,
- nulls,
- uniqueness,
- ranges,
- referential integrity,
- row counts,
- business rules.

---

# 82. Unit Test vs Data Quality Test

Unit test:

- transformation logic.

Data quality test:

- actual dataset expectations.

Need both.

---

# 83. Observability

Monitor:

## Pipeline
- success/failure,
- duration,
- retries.

## Data
- freshness,
- row counts,
- quality.

## Spark
- stages,
- skew,
- spill,
- executor failures.

## Platform
- compute utilization,
- storage,
- cost.

---

# 84. Data SLA

Example:

> "Gold sales table must be available by 6:00 AM with <0.1% rejected records."

This is better than:

> "Pipeline should run daily."

---

# 85. Lineage + SLA

If Gold table misses SLA:

Lineage helps identify:

```text
Gold Sales
  ← Silver Orders
  ← Bronze Orders
  ← Source ERP
```

---

# 86. Failure Scenario — ADF Copy Fails

Check:

- source connectivity,
- credentials,
- Integration Runtime,
- schema,
- network,
- throttling,
- target availability.

---

# 87. Failure Scenario — Databricks Job Slow

Check:

- input size,
- partition count,
- skew,
- shuffle,
- join strategy,
- cluster sizing,
- file layout,
- UDFs.

---

# 88. Failure Scenario — Small Files

Symptoms:

- slow scans,
- high metadata overhead.

Fix:

- compaction,
- optimized writes,
- partition strategy.

---

# 89. Failure Scenario — Pipeline Duplicates Data

Likely:

- retry without idempotency,
- poor watermark handling,
- append instead of merge.

Fix:

- business keys,
- MERGE,
- checkpoint,
- correct watermark transaction.

---

# 90. Failure Scenario — Schema Drift

Need:

- schema validation,
- quarantine,
- backward-compatible evolution,
- alerting.

---

# 91. Failure Scenario — Gold Data Wrong

Debug from source forward:

```text
Source
 ↓
Bronze
 ↓
Silver
 ↓
Gold
```

Check business-rule logic and quality gates.

---

# 92. Failure Scenario — Permission Denied

Check:

- Entra identity,
- managed identity/service principal,
- Azure RBAC,
- ADLS ACL,
- Unity Catalog privilege,
- network.

---

# 93. Failure Scenario — Event Hub Lag

Check:

- consumer throughput,
- partitions,
- hot partition,
- downstream Spark lag,
- checkpoint,
- scaling.

---

# 94. Performance Optimization

Azure/Databricks performance depends on:

- data format,
- partitioning,
- file size,
- shuffle,
- clustering,
- compute type,
- autoscaling,
- cache,
- query pattern.

---

# 95. Cost Drivers

- ADF activity/data movement
- Databricks compute
- storage
- Event Hubs throughput/capacity
- network egress
- Fabric capacity
- Synapse compute
- Power BI/Fabric licensing/capacity

---

# 96. Cost Optimization

- shut down idle compute,
- use job/serverless compute where appropriate,
- autoscale,
- incremental loads,
- partition pruning,
- compaction,
- avoid unnecessary data movement,
- separate hot/cold storage,
- monitor unit economics.

---

# 97. Avoid Data Movement

If possible, process data close to where it lives.

Repeated movement between platforms increases:

- latency,
- egress,
- operational complexity.

---

# 98. Architecture Decision — ADF vs Databricks

Use ADF primarily for:

- orchestration,
- connectivity,
- data movement.

Use Databricks for:

- complex distributed transformations,
- Spark workloads,
- streaming,
- lakehouse engineering.

They complement each other.

---

# 99. Architecture Decision — Databricks vs SQL

Use SQL engine where transformations are primarily relational and data scale/platform fit is appropriate.

Use Spark/Databricks where:

- large distributed workloads,
- semi-structured data,
- complex transformations,
- streaming,
- ML/AI integration.

---

# 100. Architecture Decision — Batch vs Streaming

Ask:

1. Business freshness?
2. Event volume?
3. Ordering?
4. Cost?
5. Operational complexity?
6. Recovery requirements?

---

# 101. Architecture Decision — Fabric vs Databricks

Use a decision matrix.

| Factor | Fabric | Databricks |
|---|---|---|
| Microsoft BI integration | Very strong | Strong integration possible |
| OneLake-native experience | Native | Can integrate |
| Spark/data engineering | Strong | Deep |
| ML/AI ecosystem | Growing/integrated | Deep |
| SaaS simplicity | Strong | Managed but more engineering-oriented |
| Existing enterprise skills | Depends | Depends |

Do not overstate static winner.

---

# 102. Architecture Decision — Synapse vs Fabric

For greenfield:

Evaluate Fabric strongly.

For established Synapse:

Assess:

- migration value,
- feature parity,
- workload dependencies,
- cost,
- operational risk.

---

# 103. High-Level Design — Enterprise Azure Lakehouse

```text
                         SOURCES
          ┌──────────────┼──────────────┐
          │              │              │
       On-Prem         SaaS           Events
          │              │              │
          ↓              ↓              ↓
     Self-Hosted IR     ADF         Event Hubs
          └──────────────┬──────────────┘
                         ↓
                    ADLS Gen2
                         ↓
                    Delta Bronze
                         ↓
                  Azure Databricks
                         ↓
                    Delta Silver
                         ↓
                     Delta Gold
              ┌──────────┼──────────┐
              │          │          │
          Fabric       Synapse    Power BI
              │
           AI / ML

Governance:
Unity Catalog + Azure Policies + Lineage

Security:
Entra + Managed Identity + Key Vault + Private Endpoints
```

---

# 104. Low-Level Data Flow

```text
1. Trigger
2. Read watermark
3. Extract incremental rows
4. Land raw data
5. Validate raw
6. Transform Bronze → Silver
7. Deduplicate
8. Apply business rules
9. MERGE into Delta
10. Build Gold
11. Run quality checks
12. Publish
13. Update watermark
14. Record lineage/metrics
```

---

# 105. API / Operational Control

Operational APIs may support:

```text
POST /pipelines/{name}/runs
GET  /pipelines/runs/{id}
POST /pipelines/runs/{id}/retry
```

In practice, platform-native orchestration APIs and CI/CD may be used.

---

# 106. Disaster Recovery

Consider:

- source recoverability,
- storage redundancy,
- metadata backup,
- infrastructure recreation,
- checkpoint recovery,
- cross-region requirements.

Do not assume DR automatically exists because service is managed.

---

# 107. RPO / RTO

## RPO
How much data loss is acceptable?

## RTO
How long can platform be unavailable?

Architecture follows business target.

---

# 108. Interview Question — Explain ADF

> "Azure Data Factory is a managed data-integration and orchestration service. I primarily use it to connect data sources, move data, schedule pipelines, and coordinate transformations that may execute in services such as Databricks or SQL."

---

# 109. Cross-Question — ADF vs Databricks?

> "ADF is primarily orchestration and integration; Databricks is distributed compute and lakehouse engineering. I often use them together rather than treating them as substitutes."

---

# 110. Interview Question — Delta Lake

> "Delta Lake adds transactional table semantics on top of data-lake storage through a transaction log, enabling features such as ACID transactions, schema enforcement, controlled evolution, merge operations, and table versioning."

---

# 111. Cross-Question — Delta vs Parquet?

> "Parquet is a columnar file format. Delta Lake uses Parquet data files plus transaction metadata to provide reliable table semantics."

---

# 112. Interview Question — Medallion Architecture

> "Medallion separates raw ingestion, trusted conformed data, and business-ready data into Bronze, Silver, and Gold layers. The value is not the folder names; it is the explicit progression of data quality and responsibility."

---

# 113. Interview Question — Unity Catalog

> "Unity Catalog is Databricks' unified governance layer for data and AI. It centralizes access control, lineage, discovery, auditing, classification, and governance across governed assets."

---

# 114. Cross-Question — Unity Catalog vs Azure RBAC?

> "Azure RBAC governs Azure resources. Unity Catalog governs data and AI objects inside Databricks. Enterprise security often uses both layers."

---

# 115. Interview Question — Event Hubs

> "Event Hubs is Azure's managed high-throughput event ingestion platform. It is designed for scenarios such as telemetry, logs, clickstreams, and event streams, and can feed downstream processors such as Databricks."

---

# 116. Cross-Question — Event Hubs vs Queue?

> "Event Hubs is optimized for high-throughput streaming and multiple independent consumers. A queue is more appropriate for work-distribution semantics where each message is typically processed by one competing consumer."

---

# 117. Interview Question — Fabric

> "Fabric is Microsoft's integrated analytics platform combining data integration, lakehouse engineering, warehouse, data science, real-time analytics, and Power BI over OneLake. I would evaluate it as a platform strategy rather than just another ETL tool."

---

# 118. Q01 — Conceptual Questions

1. What is ADF?
2. Pipeline vs activity?
3. Dataset vs linked service?
4. Integration Runtime?
5. Why self-hosted IR?
6. Watermark?
7. ADLS Gen2?
8. Event Hubs?
9. Partition?
10. Consumer group?
11. Azure Databricks?
12. Delta Lake?
13. Delta vs Parquet?
14. Schema enforcement?
15. Time travel?
16. MERGE?
17. Medallion?
18. Unity Catalog?
19. Synapse?
20. Fabric?
21. OneLake?
22. Managed Identity?
23. Private Endpoint?

---

# 119. Q04 — Scenario Questions

1. Design on-prem SQL → Azure lakehouse.
2. Design streaming telemetry platform.
3. Build daily incremental loads for 200 tables.
4. Handle schema drift.
5. Design multi-domain governance.
6. Secure confidential HR data.
7. Reduce Databricks cost.
8. Handle millions of small files.
9. Migrate existing Synapse estate.
10. Decide Fabric vs Databricks.

---

# 120. Q06 — Debugging Questions

1. ADF cannot reach on-prem source.
2. Delta pipeline duplicates rows.
3. Databricks job has one long-running task.
4. Event Hub lag is rising.
5. Gold data is stale.
6. Permission denied on ADLS.
7. Unity Catalog access denied.
8. Streaming job reprocesses events.
9. Small files slow queries.
10. Schema evolution breaks consumer.

---

# 121. Q07 — Architecture Review

Weak design:

```text
SQL Server
 ↓
Databricks
 ↓
Power BI
```

Ask what is missing.

Potential:

- orchestration,
- raw storage,
- incremental load,
- Bronze/Silver/Gold,
- governance,
- identity,
- secrets,
- lineage,
- monitoring,
- retry,
- quality,
- cost,
- DR.

---

# 122. Q08 — Optimization

Optimize ADF:

- incremental loads,
- parallelism,
- correct IR,
- avoid unnecessary copies.

Optimize Databricks:

- partition pruning,
- reduce shuffle,
- right-size compute,
- job compute,
- efficient file size,
- optimize joins.

Optimize storage:

- Delta/Parquet,
- lifecycle policies,
- compaction.

---

# 123. Q10 — Edge/Test Cases

- source unavailable,
- empty batch,
- duplicate files,
- partial file,
- malformed schema,
- late event,
- out-of-order event,
- permission revoked,
- compute unavailable,
- retry duplicates data,
- watermark corrupted.

---

# 124. Q11 — Pseudocode

```text
function runIncrementalLoad(entity):

    config = readMetadata(entity)

    lastWatermark = readWatermark(entity)

    rows = extract(
        source=config.source,
        where=config.watermarkColumn > lastWatermark
    )

    landBronze(rows)

    valid, invalid = validate(rows)

    quarantine(invalid)

    silver = transform(valid)

    mergeSilver(silver)

    gold = buildBusinessModel(silver)

    validateGold(gold)

    publish(gold)

    updateWatermark(max(rows.watermark))

    writeMetrics()
```

---

# 125. Q12 — Cross-Question Survival

After drawing Azure architecture, expect:

1. Why ADF?
2. Why Databricks?
3. Why not use ADF Data Flow only?
4. Why Delta?
5. Why Medallion?
6. Why Event Hubs?
7. Why not batch?
8. How do you secure it?
9. How do you handle secrets?
10. How do you handle schema drift?
11. How do you avoid duplicates?
12. How do you monitor?
13. How do you reduce cost?
14. Fabric vs Databricks?
15. Synapse vs Fabric?
16. How do you recover from region failure?

---

# 126. Trainer Audition — Explain Medallion

> "Think of a food-processing line. Bronze is the raw material exactly as it arrives. Silver is cleaned and quality-checked. Gold is the final product prepared for the consumer. The value is that every stage has a clear quality expectation."

---

# 127. Trainer Audition — Explain ADF vs Databricks

> "ADF is like the logistics manager deciding when data should move and which job should run. Databricks is like the processing factory that performs large-scale transformations."

---

# 128. Trainer Audition — 45-Minute Lab

Objective:

Build:

```text
CSV → ADLS Bronze → Databricks → Delta Silver → Gold
```

Learners:

1. ingest file,
2. validate schema,
3. transform with PySpark,
4. write Delta,
5. MERGE updates,
6. query previous Delta version,
7. apply access permission concept,
8. inspect job metrics.

Stretch:

- event-driven trigger,
- incremental watermark,
- streaming variant.

---

# 129. Trainer Assessment

Rubric:

- correct architecture,
- incremental design,
- Delta usage,
- data quality,
- security,
- performance,
- observability,
- explanation,
- failure handling.

---

# 130. Whiteboard Script — 5-Minute Azure Platform

Use this exact order:

```text
1. Business consumers
2. Source types
3. Batch vs streaming
4. ADF/Event Hubs
5. ADLS
6. Bronze/Silver/Gold
7. Databricks + Delta
8. Serving: Fabric/Synapse/BI
9. Unity Catalog/governance
10. Entra/Managed Identity/Key Vault
11. Monitoring
12. Cost + DR
```

---

# 131. Senior-Level Principles

Memorize:

> **1. ADF orchestrates; Databricks computes.**

> **2. ADLS is storage; Delta adds table semantics.**

> **3. Medallion layers are quality boundaries, not cosmetic folders.**

> **4. Use Managed Identity instead of embedded credentials.**

> **5. Security exists at both Azure-resource and data-object layers.**

> **6. Watermarks must update only after successful loads.**

> **7. Streaming correctness needs checkpointing plus idempotency.**

> **8. Unity Catalog governs data and increasingly AI assets together.**

> **9. Fabric, Databricks, and Synapse should be compared by workload and enterprise strategy—not by marketing.**

> **10. Cost and operability are architecture requirements.**

---

# 132. High-Probability Rapid-Fire Questions

Answer in 30–60 seconds:

1. ADF?
2. pipeline?
3. activity?
4. dataset?
5. linked service?
6. integration runtime?
7. self-hosted IR?
8. watermark?
9. metadata-driven pipeline?
10. ADLS Gen2?
11. hierarchical namespace?
12. Event Hubs?
13. event partition?
14. consumer group?
15. Databricks?
16. Delta Lake?
17. Delta vs Parquet?
18. ACID?
19. schema enforcement?
20. schema evolution?
21. time travel?
22. MERGE?
23. Bronze?
24. Silver?
25. Gold?
26. Unity Catalog?
27. Synapse?
28. Fabric?
29. OneLake?
30. Managed Identity?
31. Key Vault?
32. RBAC?
33. private endpoint?
34. exactly-once?
35. cost optimization?

---

# 133. M07 Readiness Gate

Do not mark M07 complete until all P1 items can be answered clearly.

## Gate A — Azure Integration

- [ ] Explain ADF.
- [ ] Explain pipeline/activity/dataset/linked service.
- [ ] Explain Integration Runtime.
- [ ] Explain incremental load/watermark.
- [ ] Explain metadata-driven pipeline.
- [ ] Explain ADLS Gen2.
- [ ] Explain Event Hubs.

## Gate B — Databricks / Delta

- [ ] Explain Databricks.
- [ ] Explain Delta Lake.
- [ ] Explain Delta vs Parquet.
- [ ] Explain ACID.
- [ ] Explain schema enforcement/evolution.
- [ ] Explain time travel.
- [ ] Explain MERGE.
- [ ] Explain small-files/performance concerns.

## Gate C — Lakehouse / Governance

- [ ] Explain Bronze/Silver/Gold.
- [ ] Explain Unity Catalog.
- [ ] Explain catalog.schema.object.
- [ ] Explain lineage/audit.
- [ ] Explain Fabric Lakehouse.
- [ ] Explain OneLake.
- [ ] Explain Fabric vs Databricks without oversimplification.

## Gate D — Security / Production

- [ ] Explain Entra ID.
- [ ] Explain Managed Identity.
- [ ] Explain Key Vault.
- [ ] Explain RBAC vs data permissions.
- [ ] Explain private networking.
- [ ] Troubleshoot duplicate loads.
- [ ] Troubleshoot schema drift.
- [ ] Explain monitoring/cost/DR.

## Gate E — Interview Conversion

- [ ] Whiteboard Azure lakehouse in 5 minutes.
- [ ] Survive "ADF vs Databricks?"
- [ ] Survive "Delta vs Parquet?"
- [ ] Survive "Fabric vs Databricks?"
- [ ] Survive "Why Medallion?"
- [ ] Survive "How do you secure it?"
- [ ] Explain Medallion to beginner.
- [ ] Design one Azure data lab.

### Completion Rule

**M07 PASS = You can whiteboard and defend an enterprise Azure lakehouse from source ingestion through governance, serving, security, cost, and failure handling.**

Weak areas move to **M12 Gap Closure**.

---

# 134. M07 One-Minute Battle Card

```text
ADF
Orchestration + movement + integration.

ADLS
Scalable analytics storage.

EVENT HUBS
High-throughput event ingestion.

DATABRICKS
Distributed Spark/lakehouse compute.

DELTA
Parquet + transaction log.

BRONZE
Raw.

SILVER
Trusted/clean.

GOLD
Business-ready.

UNITY CATALOG
Data + AI governance.

FABRIC
Integrated analytics over OneLake.

SECURITY
Entra → Managed Identity → Key Vault → RBAC/ACL → Private Endpoint.

SENIOR PRINCIPLE
Orchestration, storage, compute, serving, governance, and security are separate responsibilities.
```

---

# 135. Current Platform Notes for Interview

As of August 2026:

- Microsoft describes **Data Factory in Microsoft Fabric** as the next-generation direction for data integration while Azure Data Factory remains supported and highly relevant to existing estates.
- Microsoft Fabric Data Engineering includes Lakehouse, Spark jobs, notebooks, and pipelines.
- Fabric Lakehouse uses Delta Lake and supports Spark + SQL analytics over the same logical lakehouse data.
- Unity Catalog is the unified governance layer for data and AI in Azure Databricks, covering access control, lineage, auditing, discovery, classification, and AI governance.

Use these points to sound current, but do not turn the interview into product-release trivia.

---

# 136. Official References

- Microsoft Learn — Azure Data Factory Introduction
- Microsoft Learn — Azure Event Hubs Overview
- Microsoft Learn — Microsoft Fabric Data Engineering
- Microsoft Learn — Microsoft Fabric Lakehouse
- Microsoft Learn — Azure Databricks Unity Catalog
- Microsoft Learn — Unity Catalog Getting Started

---

# 137. Next Module

After M07 passes its readiness gate:

# **M08 — Docker, Kubernetes, CI/CD & MLOps**

M08 will cover:

- container fundamentals,
- Docker images/layers,
- Dockerfile,
- container registry,
- Kubernetes,
- AKS,
- pods/deployments/services,
- ConfigMaps/Secrets,
- probes,
- autoscaling,
- CI/CD,
- deployment strategies,
- rollback,
- MLOps/LLMOps,
- prompt/model/version control,
- release gates,
- observability,
- production troubleshooting,
- readiness gate.

---

**End of M07 — Azure Data Engineering, Databricks, Delta Lake & Medallion**
