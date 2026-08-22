# FS-02 / File 06 — Database Security, Migrations, Scaling & Architecture

**Priority:** P0  
**Suggested Time:** 65 minutes  
**GOJ Mapping:** M18 + M20 + M21

---

# 1. Objective

Master:

- SQL injection prevention;
- least privilege;
- secrets;
- migrations;
- backward-compatible schema evolution;
- replication;
- partitioning;
- sharding awareness;
- SQL vs NoSQL;
- caching;
- backup/recovery awareness;
- data architecture trade-offs.

---

# 2. 5W+H

## What?

Production database architecture includes security, evolution, availability, and scaling beyond individual queries.

## Why?

Data systems outlive code releases and must evolve safely.

## Where?

Enterprise full-stack and AI-enabled systems.

## When?

Every production database.

## How?

Secure access → controlled migrations → observe → scale read/write/storage bottleneck intentionally.

---

# 3. Real-Life Analogy

A database is a bank vault.

You need:

- controlled access;
- audit;
- backup;
- safe renovations;
- capacity planning.

You do not rebuild the vault during business hours without a migration plan.

---

# 4. Visualization

```text
Application
   ↓
Connection Pool
   ↓
Primary DB
 ├── Replicas
 ├── Backups
 └── Partitions/Shards (only when needed)

Security:
least privilege + secrets + encryption
```

---

# 5. Mind Map

```text
Production Data
│
├── Security
├── Migration
├── Backup/Recovery
├── Replication
├── Partitioning
├── Sharding
├── SQL vs NoSQL
└── Caching
```

---

# 6. Core Concepts

## 6.1 SQL Injection

Unsafe:

```python
sql = f"SELECT * FROM users WHERE email = '{email}'"
```

Use parameterized query:

```python
cursor.execute(
    "SELECT * FROM users WHERE email = %s",
    (email,),
)
```

Placeholder syntax varies by driver.

---

## 6.2 Least Privilege

Application DB user should have only required permissions.

Do not run app as database superuser.

---

## 6.3 Secrets

Credentials:

- secret manager/environment injection;
- rotation;
- no source control;
- no logs.

---

## 6.4 Migration

Schema changes must consider running old/new application versions.

Risky:

```text
rename/drop column
```

while old pods still use it.

Use expand/contract pattern:

```text
1. add new compatible schema
2. deploy code supporting both
3. migrate/backfill
4. switch reads/writes
5. remove old schema later
```

---

## 6.5 Large Backfill

Avoid one huge transaction if it locks/loads production.

Use:

- batches;
- checkpoints;
- throttling;
- observability.

---

## 6.6 Replication

Read replicas can scale reads and improve availability options.

Trade-off:

- replica lag;
- read-after-write consistency.

Do not route a just-written read blindly to lagging replica if strong freshness required.

---

## 6.7 Partitioning

Split one logical table into partitions, often by:

- date;
- tenant;
- key range.

Helps maintenance/query pruning in suitable workloads.

Not equivalent to sharding across independent database servers.

---

## 6.8 Sharding

Distribute data across database nodes by shard key.

Complexity:

- cross-shard queries;
- transactions;
- rebalancing;
- hotspot;
- operational burden.

Use only when simpler scaling no longer suffices.

---

## 6.9 SQL vs NoSQL

Choose from requirements.

SQL strong fit:

- relationships;
- transactions;
- flexible querying;
- constraints.

Document/NoSQL strong fit may include:

- flexible aggregate documents;
- high-scale key/document access;
- domain-specific access patterns.

Do not choose NoSQL merely for “scale.”

---

## 6.10 Cache Is Not Source of Truth by Default

Cache improves latency/load but adds consistency complexity.

---

# 7. Engineering Depth

## 7.1 Read Scale Path

Before sharding:

```text
query optimize
→ indexes
→ cache
→ read replicas
→ partition/archive
→ sharding if truly needed
```

Not universal order, but captures KIS: solve measured bottleneck with simplest sufficient step.

---

## 7.2 AI Data Architecture

Typical AI-enabled system may use multiple stores:

```text
Relational DB
- users
- permissions
- jobs
- metadata

Object Storage
- source documents

Vector Store
- embeddings/index

Cache
- hot results/session-independent data
```

One database need not solve every access pattern.

---

## 7.3 Backup vs High Availability

Replication is not a substitute for backup.

Backups protect against:

- accidental delete;
- corruption;
- logical errors;
- ransomware scenarios depending setup.

Need tested restore.

---

# 8. Implementation / Design

Expand/contract example:

```text
v1: full_name
v2 add: first_name, last_name
backfill
dual-read/write if needed
switch
remove full_name later
```

---

# 9. Hands-On Practice

Explain:

1. parameterized SQL;
2. rolling migration;
3. replica lag;
4. partition vs shard;
5. when NoSQL is justified;
6. backup restore test.

---

# 10. Google Interview Drill

## Problem — Orders Database at 2 Billion Rows

Symptoms:

- latest-order queries slow;
- old data rarely accessed;
- 90% reads;
- writes growing;
- one primary DB.

### Clarify

- query patterns?
- data age distribution?
- SLA?
- retention?
- regional needs?
- current indexes/plans?
- storage limits?

### First Approach

Shard immediately.

Too early.

### Improve in stages

1. inspect plans/indexes;
2. keyset pagination;
3. archive/partition by time if suitable;
4. read replicas for read-heavy workload;
5. cache hot queries where valid;
6. shard only if write/storage/scale still requires.

### Edge Cases

- read-after-write;
- replica lag;
- global order IDs;
- partition pruning;
- reporting across archive.

### Follow-Up

If sharding:

- choose shard key;
- avoid hot shard;
- cross-shard reporting;
- rebalancing.

---

# 11. Common Mistakes

1. String-concatenated SQL.
2. App uses DB admin credentials.
3. Destructive migration in one deploy.
4. Giant backfill transaction.
5. Replica assumed perfectly fresh.
6. Partition = sharding.
7. Shard before optimizing.
8. No restore testing.
9. “NoSQL because scale.”

---

# 12. Best Practices

- parameterize queries;
- least privilege;
- rotate secrets;
- backward-compatible migrations;
- batch backfills;
- monitor replica lag;
- scale measured bottleneck;
- test backups;
- use fit-for-purpose stores.

---

# 13. Interview Questions

1. How prevent SQL injection?
2. Why least privilege?
3. Safe schema migration?
4. Expand/contract?
5. Read replica?
6. Replica lag?
7. Partition vs shard?
8. SQL vs NoSQL?
9. Backup vs replication?
10. How scale 2B-row table?

---

# 14. Google-Level Follow-Ups

1. multi-region writes?
2. shard key?
3. hot tenant?
4. cross-shard transaction?
5. GDPR delete?
6. vector DB consistency?
7. backup RPO/RTO?

---

# 15. Quick Revision

```text
Parameterized SQL
Least privilege
Secrets outside code
Expand/contract migration
Batch backfills
Replica = read scale, may lag
Partition ≠ shard
Shard only when justified
Backup ≠ replication
Choose store by access pattern
```

---

# 16. Readiness Gate

- [ ] SQL injection.
- [ ] Least privilege.
- [ ] Migration.
- [ ] Replica lag.
- [ ] Partition vs shard.
- [ ] SQL vs NoSQL.
- [ ] Backup/restore.
- [ ] 2B-order drill.

**Gate:** READY / REPAIR

---

# 17. References

- OWASP SQL Injection guidance
- PostgreSQL / MySQL migration, replication, partitioning documentation
