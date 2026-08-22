# ARCH-03 / File 05 — Deployment, Cloud, Production Readiness & Rollback

**Priority:** P0  
**Suggested Time:** 70 minutes  
**GOJ Mapping:** M22 Production Engineering

---

# 1. Objective

Master:

- build/deploy pipeline;
- immutable artifacts;
- configuration;
- secrets;
- health/readiness;
- rolling deployment;
- canary;
- blue-green awareness;
- backward-compatible DB migration;
- feature flags;
- rollback;
- production readiness checklist.

---

# 2. 5W+H

## What?

Production deployment is the controlled transition from tested artifact to live traffic.

## Why?

Even correct code can fail due to configuration, dependency, migration, capacity, or rollout issues.

## Where?

CI/CD, cloud/Kubernetes/App Service/VM/container environments.

## When?

Every release.

## How?

Build once → verify → deploy gradually → observe → promote or rollback.

---

# 3. Real-Life Analogy

A bridge is not opened to all traffic immediately after construction.

It is inspected, tested, opened progressively, and monitored.

---

# 4. Visualization

```text
Commit
 ↓
Build
 ↓
Unit / Integration / Security
 ↓
Artifact
 ↓
Staging
 ↓
Canary / Rolling
 ↓
Production
 ↓
Observe
 ├── Promote
 └── Rollback
```

---

# 5. Mind Map

```text
Production Release
│
├── CI
├── Artifact
├── Config
├── Secrets
├── Health
├── Rolling
├── Canary
├── Migration
├── Feature Flag
└── Rollback
```

---

# 6. Core Concepts

## 6.1 Build Once

Promote same immutable artifact across environments where possible.

Avoid rebuilding differently for production.

---

## 6.2 Configuration

Separate environment-specific configuration from code.

Validate config at startup.

Fail fast for invalid critical configuration.

---

## 6.3 Health and Readiness

Liveness:

> process should be restarted?

Readiness:

> should receive traffic?

Startup may also require separate startup probe in some platforms.

---

## 6.4 Rolling Deployment

Replace instances gradually.

Requires backward compatibility during mixed-version window.

---

## 6.5 Canary

Small percentage/tenant receives new version first.

Monitor:

- error rate;
- latency;
- business metrics;
- AI quality/cost if applicable.

---

## 6.6 Blue-Green Awareness

Two environments:

```text
Blue = current
Green = new
```

Switch traffic when ready.

Pros:

- fast rollback.

Costs:

- duplicate capacity/state/migration complexity.

---

## 6.7 Database Migration

Use expand/contract:

```text
add new schema
→ deploy compatible app
→ backfill
→ switch
→ remove old later
```

Avoid destructive migration before old instances stop using field.

---

## 6.8 Feature Flags

Separate deployment from feature release.

Useful for:

- gradual enablement;
- kill switch;
- tenant canary.

But flags require lifecycle cleanup.

---

## 6.9 Rollback

Rollback code is easy only if:

- DB migration compatible;
- event schema compatible;
- model/index versions retained.

---

# 7. Engineering Depth

## 7.1 Production Readiness Checklist

Before release:

```text
security
capacity
timeouts/retries
health/readiness
metrics/logs/traces
alerts
runbook
rollback
migration
backup
feature flag
dependency limits
```

---

## 7.2 AI Rollout

Version:

- model;
- prompt;
- RAG index;
- tool policy.

Canary quality and cost, not only HTTP errors.

---

# 8. Implementation / Design

Example release:

```text
v1 running
→ DB additive migration
→ deploy v2 to 5%
→ validate error/latency/business metrics
→ 25%
→ 100%
→ remove old schema later
```

---

# 9. Hands-On Practice

A release requires renaming DB column.

Design zero-downtime expand/contract migration.

---

# 10. Google Interview Drill

## Problem — New Release Causes 20% 500 Errors After 10% Canary

### Clarify

- only canary?
- new endpoint?
- migration?
- config?
- dependency?
- logs/trace?

### Immediate Action

Stop promotion.

Depending impact:

- rollback canary;
- disable feature flag;
- inspect errors.

### Root Cause Example

New code expects DB column not present in one region.

### Prevention

- migration gate;
- startup compatibility check;
- canary by region;
- deployment dependency ordering.

### Follow-Up

Rollback must not depend on incompatible destructive DB migration.

---

# 11. Common Mistakes

1. Rebuild artifact per environment.
2. Secrets baked in image.
3. Liveness checks all dependencies.
4. Destructive migration first.
5. Canary without metrics.
6. Rollback not tested.
7. Feature flags never removed.
8. AI rollout watches only 500 errors.

---

# 12. Best Practices

- immutable artifact;
- config/secrets external;
- readiness-driven traffic;
- backward-compatible migrations;
- staged rollout;
- kill switch;
- tested rollback;
- production readiness review.

---

# 13. Interview Questions

1. Rolling vs canary?
2. Blue-green?
3. Liveness vs readiness?
4. Feature flag?
5. Expand/contract migration?
6. How rollback safely?
7. Why immutable artifact?
8. What belongs in readiness review?
9. How roll out AI model change?

---

# 14. Google-Level Follow-Ups

1. migration already applied?
2. one region unhealthy?
3. config drift?
4. canary too small?
5. event schema changed?
6. cache schema?
7. rollback after model/index change?
8. emergency hotfix?

---

# 15. Quick Revision

```text
Build once
External config/secrets
Readiness controls traffic
Deploy progressively
DB changes backward compatible
Feature flag = kill switch
Observe before promote
Rollback must be feasible
```

---

# 16. Readiness Gate

- [ ] CI/artifact.
- [ ] Config/secrets.
- [ ] Health/readiness.
- [ ] Rolling/canary.
- [ ] Migration.
- [ ] Rollback.
- [ ] Canary-failure drill.

**Gate:** READY / REPAIR

---

# 17. References

- CI/CD and cloud-native deployment references
