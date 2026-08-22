# ARCH-01 / File 03 — Data Architecture, Consistency, Replication & Sharding

**Priority:** P0  
**Suggested Time:** 80 minutes  
**GOJ Mapping:** M18 + M21

---

# 1. Objective

Master:

- storage selection;
- SQL vs NoSQL;
- object/search/key-value/graph stores;
- consistency;
- transactions;
- replication;
- partitioning;
- sharding;
- read/write patterns;
- eventual consistency;
- IDs;
- data lifecycle.

---

# 2. 5W+H

## What?

Data architecture chooses storage and consistency models based on access patterns, invariants, and scale.

## Why?

Wrong data design creates hard performance and correctness problems.

## Where?

Every production system.

## When?

After core entities/access patterns are understood.

## How?

Access patterns → consistency/invariants → storage → indexes → replication/partitioning only when needed.

---

# 3. Real-Life Analogy

Different files belong in different systems:

- bank ledger;
- photo archive;
- search index;
- phonebook.

One cabinet need not solve every job.

---

# 4. Visualization

```text
Application
├── Relational DB → transactions/relationships
├── Key-Value     → fast key access/cache
├── Search Index  → text/search
├── Object Store  → files/blobs
└── Graph Store   → relationship traversals
```

---

# 5. Mind Map

```text
Data Architecture
│
├── Access Pattern
├── Consistency
├── Transaction
├── Replication
├── Partition
├── Shard
├── Index
└── Lifecycle
```

---

# 6. Core Concepts

## 6.1 Choose by Access Pattern

Ask:

- read by ID?
- range query?
- joins?
- full-text search?
- graph traversal?
- object/blob?
- transaction?

Do not choose database by popularity.

---

## 6.2 Strong vs Eventual Consistency

Strong consistency:

> reads reflect latest committed state according to model.

Eventual:

> replicas/derived views converge over time.

Use eventual consistency only where business tolerates temporary divergence.

---

## 6.3 Source of Truth vs Derived Stores

Example:

```text
Relational DB = order source of truth
Search index = derived search view
Cache = derived acceleration
Analytics warehouse = derived reporting
```

Derived data can be rebuilt.

---

## 6.4 Replication

Copies data for:

- availability;
- read scale;
- disaster recovery support.

Trade-offs:

- replication lag;
- failover complexity;
- consistency.

---

## 6.5 Read Replica

Good for read-heavy traffic.

But:

> read-after-write may be stale.

Use primary/consistency routing when freshness required.

---

## 6.6 Partitioning

Split table/data into logical partitions:

- date;
- tenant;
- key range.

Can improve maintenance/pruning.

---

## 6.7 Sharding

Distribute data across separate database nodes.

Need shard key.

Problems:

- cross-shard query;
- rebalancing;
- hotspot;
- cross-shard transaction.

Use only when single-system scaling is insufficient.

---

## 6.8 Shard Key

Good shard key:

- high cardinality;
- distributes load;
- aligns common access;
- avoids hotspot.

Example `tenant_id` may work or create hot enterprise tenant.

---

## 6.9 IDs

Distributed systems may need IDs that can be generated without single DB bottleneck.

Options:

- UUID;
- time-based IDs;
- database-generated IDs;
- centralized ID service.

Choose based on ordering/index/storage needs.

---

# 7. Engineering Depth

## 7.1 CAP Awareness

During network partition, distributed systems face trade-off between consistency and availability for operations affected by the partition.

Do not reduce CAP to:

> choose any two all the time.

Partition tolerance is generally a real distributed-systems concern; behavior choices matter during partitions.

---

## 7.2 CQRS Awareness

Separate read/write models when needs diverge substantially.

Do not use CQRS for simple CRUD by default.

---

## 7.3 Eventual Derived Views

Search/index/cache update may lag behind source DB.

Need:

- freshness metric;
- retry/rebuild;
- user-facing consistency policy.

---

# 8. Implementation / Design

E-commerce:

```text
Orders → relational source of truth
Product Images → object storage/CDN
Product Search → search index
Session/cache → key-value cache
Analytics → warehouse/lake
```

---

# 9. Hands-On Practice

Choose storage for:

1. payments;
2. product images;
3. full-text product search;
4. relationship recommendations;
5. session cache.

Explain why.

---

# 10. Google Interview Drill

## Problem — Scale Order History to Billions of Rows

### Clarify

- latest orders most common?
- retention?
- user-based access?
- reporting?
- read/write ratio?
- current DB bottleneck?

### First Approach

Shard immediately.

Premature.

### Improve progressively

```text
indexes
→ keyset pagination
→ archive/partition old data
→ read replicas
→ cache hot summaries
→ shard only if remaining scale demands it
```

### If Sharding Needed

Potential key:

```text
customer_id
```

Trade-off:

- customer order history local;
- cross-customer reporting harder;
- hotspot for very large customers.

### Follow-Up

Analytics can use separate derived warehouse rather than cross-shard OLTP query.

---

# 11. Common Mistakes

1. One DB for every workload.
2. No distinction source vs derived.
3. Eventual consistency used for critical ledger blindly.
4. Replica assumed immediately current.
5. Sharding too early.
6. Bad shard key.
7. CAP oversimplified.
8. CQRS used for fashion.

---

# 12. Best Practices

- start from access pattern;
- keep source-of-truth clear;
- derive specialized views;
- define consistency per use case;
- replicate/partition progressively;
- shard only when justified;
- monitor lag/freshness.

---

# 13. Interview Questions

1. How choose database?
2. SQL vs NoSQL?
3. Strong vs eventual consistency?
4. Source vs derived store?
5. Replication?
6. Replica lag?
7. Partition vs shard?
8. Shard-key characteristics?
9. CAP?
10. CQRS?

---

# 14. Google-Level Follow-Ups

1. multi-region writes?
2. hot shard?
3. cross-shard transaction?
4. global reporting?
5. disaster recovery?
6. tenant migration?
7. re-sharding?
8. GDPR deletion?

---

# 15. Quick Revision

```text
Access pattern first
Source of truth explicit
Derived stores can lag/rebuild
Replica helps reads/availability but may lag
Partition ≠ shard
Shard only when needed
Consistency is a business decision
```

---

# 16. Readiness Gate

- [ ] Storage selection.
- [ ] Consistency.
- [ ] Source/derived.
- [ ] Replication.
- [ ] Partition/shard.
- [ ] CAP awareness.
- [ ] Billion-orders drill.

**Gate:** READY / REPAIR

---

# 17. References

- Distributed data systems references
