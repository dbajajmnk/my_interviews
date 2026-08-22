# ARCH-01 / File 01 — System Design Method, Requirements & Capacity

**Priority:** P0  
**Suggested Time:** 70 minutes  
**GOJ Mapping:** M21 Architecture & Distributed Systems

---

# 1. Objective

Master:

- requirement clarification;
- functional vs non-functional requirements;
- scale estimation;
- traffic/concurrency;
- storage/bandwidth estimation;
- latency/SLA/SLO;
- availability/consistency priorities;
- high-level architecture sequencing.

---

# 2. 5W+H

## What?

System design is the process of converting business requirements into components, interfaces, data models, operational constraints, and trade-offs.

## Why?

Architecture quality depends on requirements, not on how many technologies are drawn.

## Where?

Web systems, APIs, enterprise platforms, distributed services.

## When?

Architect interviews and real production design.

## How?

Requirements → estimates → APIs/data → high-level design → bottleneck deep dives → failure/trade-offs.

---

# 3. Real-Life Analogy

You do not design a bridge before knowing:

- what must cross it;
- expected traffic;
- span;
- safety requirements.

Architecture without requirements is decoration.

---

# 4. Visualization

```text
Problem
 ↓
Functional Requirements
 ↓
Non-Functional Requirements
 ↓
Scale / Capacity
 ↓
API + Data
 ↓
High-Level Design
 ↓
Deep Dive
 ↓
Failures / Trade-Offs
```

---

# 5. Mind Map

```text
System Design
│
├── Functional
├── Non-Functional
│   ├── latency
│   ├── availability
│   ├── consistency
│   └── security
├── Scale
├── APIs
├── Data
└── Architecture
```

---

# 6. Core Concepts

## 6.1 Functional Requirements

What must users/system do?

Example URL shortener:

- create short URL;
- redirect;
- optional expiration;
- analytics maybe.

Do not add features before clarifying core scope.

---

## 6.2 Non-Functional Requirements

Examples:

```text
availability
latency
throughput
consistency
durability
security
privacy
cost
regional/data residency
```

Need priorities.

Example:

> Redirect latency may matter more than analytics freshness.

---

## 6.3 Capacity Estimation

Estimate only to guide architecture.

Suppose:

```text
100M redirects/day
```

Average:

```text
~1,157 requests/sec
```

Peak might be several times average.

You do not need fake precision.

---

## 6.4 Concurrency

Approximate:

```text
concurrency ≈ requests/sec × average response time
```

If:

```text
2,000 RPS × 0.2 sec ≈ 400 concurrent requests
```

Useful for pool/capacity reasoning.

---

## 6.5 Storage

Estimate:

```text
records/day × bytes/record × retention
```

Include indexes/replication overhead conceptually if relevant.

---

## 6.6 Read vs Write Ratio

High-read systems may benefit from:

- cache;
- CDN;
- read replicas.

High-write systems require different thinking.

---

## 6.7 Latency Budget

Break target:

```text
gateway
+ app
+ cache/DB
+ remote dependencies
+ network
```

This prevents hand-wavy “low latency.”

---

## 6.8 SLI / SLO / SLA Awareness

SLI:

> measured indicator.

SLO:

> target.

SLA:

> contractual commitment.

Example:

```text
SLI: p95 latency
SLO: p95 < 300 ms
SLA: 99.9% monthly availability contract
```

---

# 7. Engineering Depth

## 7.1 Availability vs Consistency

Some systems prioritize:

- latest exact balance;
- globally available feed;
- eventually consistent analytics.

Do not choose a consistency model before business requirement.

---

## 7.2 Estimate to Trigger Decisions

If data = 20 GB total:

> sharding discussion is probably premature.

If requests = 100/sec:

> 30 microservices may be unnecessary.

---

# 8. Implementation / Design

Quick design worksheet:

```text
Users:
Peak RPS:
Read/write ratio:
Data/day:
Retention:
Latency target:
Availability target:
Consistency needs:
Critical failure:
Security/privacy:
```

---

# 9. Hands-On Practice

For image-sharing service:

Clarify:

- upload size;
- daily uploads;
- public/private;
- feed?
- CDN?
- deletion;
- transformations;
- latency.

Estimate only what changes architecture.

---

# 10. Google Interview Drill

## Problem — Design URL Shortener

### Clarify

- create + redirect?
- custom aliases?
- expiration?
- analytics?
- read/write ratio?
- traffic scale?

### First Design

```text
Client
→ API
→ Database
```

Enough as baseline.

### Estimate

Reads greatly exceed writes.

### Improve

```text
Client
→ Load Balancer
→ Stateless API
→ Cache
→ DB
```

Redirect path benefits from cache.

### Edge Cases

- collision;
- expired URL;
- malicious URL;
- cache miss;
- hot key.

### Follow-Up

At massive scale:

- partition by short code;
- replicas;
- CDN/edge redirect depending product.

### Goal

Show progressive design, not instant overengineering.

---

# 11. Common Mistakes

1. Designing before requirements.
2. Estimating everything.
3. Fake precision.
4. Microservices immediately.
5. Sharding small data.
6. Ignoring read/write ratio.
7. No latency budget.
8. No failure/security questions.

---

# 12. Best Practices

- clarify first;
- estimate only decision-driving numbers;
- start simple;
- identify bottleneck;
- scale progressively;
- state assumptions explicitly.

---

# 13. Interview Questions

1. Functional vs non-functional?
2. What estimates matter?
3. How estimate concurrency?
4. SLI/SLO/SLA?
5. Why read/write ratio matters?
6. How build latency budget?
7. When not to shard?
8. How start a system-design interview?

---

# 14. Google-Level Follow-Ups

1. traffic 100×?
2. global users?
3. 99.999% availability?
4. strict consistency?
5. cost cap?
6. regional outage?
7. sudden viral spike?
8. delete requirement?

---

# 15. Quick Revision

```text
Requirements first
Estimate only what changes design
Start simple
Walk critical path
Find bottleneck
Scale progressively
State assumptions
Defend trade-offs
```

---

# 16. Readiness Gate

- [ ] Functional requirements.
- [ ] NFRs.
- [ ] RPS/concurrency.
- [ ] Storage estimation.
- [ ] SLO thinking.
- [ ] Progressive design.
- [ ] URL-shortener drill.

**Gate:** READY / REPAIR

---

# 17. References

- Distributed systems and system-design fundamentals
