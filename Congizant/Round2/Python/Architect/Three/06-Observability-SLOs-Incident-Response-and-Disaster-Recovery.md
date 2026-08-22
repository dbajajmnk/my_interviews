# ARCH-03 / File 06 — Observability, SLOs, Incident Response & Disaster Recovery

**Priority:** P0  
**Suggested Time:** 80 minutes  
**GOJ Mapping:** M22 Production Engineering

---

# 1. Objective

Master:

- logs;
- metrics;
- traces;
- correlation IDs;
- RED/USE-style awareness;
- SLIs/SLOs/SLAs;
- alerts;
- dashboards;
- runbooks;
- incident response;
- RCA;
- error budgets;
- backups;
- RPO/RTO;
- DR tests.

---

# 2. 5W+H

## What?

Observability provides evidence to understand production behavior; SLOs define acceptable service; incident/DR processes restore service safely.

## Why?

A system you cannot observe cannot be operated reliably.

## Where?

Every production service and dependency.

## When?

Before go-live and throughout operation.

## How?

Instrument critical paths, define SLOs, alert on user-impacting signals, practice recovery.

---

# 3. Real-Life Analogy

A hospital needs:

- monitors;
- alarms;
- procedures;
- emergency drills.

Having doctors alone is not enough.

---

# 4. Visualization

```text
Request
 ↓ traceId
Service
├── Logs
├── Metrics
└── Traces
      ↓
Dashboards / Alerts
      ↓
On-Call
      ↓
Runbook / Mitigation / Recovery
```

---

# 5. Mind Map

```text
Operations
│
├── Logs
├── Metrics
├── Traces
├── SLI
├── SLO
├── Alerts
├── Incident
├── RCA
├── Backup
└── DR
```

---

# 6. Core Concepts

## 6.1 Logs

Structured events.

Good fields:

```text
timestamp
service
level
request_id
tenant-safe identifier
event
error code
```

Do not log secrets/PII blindly.

---

## 6.2 Metrics

Examples:

- request rate;
- error rate;
- latency;
- saturation;
- queue depth;
- DB pool;
- cache hit;
- LLM 429/token cost.

---

## 6.3 Traces

Connect distributed request stages.

Essential for:

```text
frontend
→ gateway
→ Python API
→ DB
→ model/provider
```

---

## 6.4 RED Awareness

For services:

- Rate;
- Errors;
- Duration.

---

## 6.5 USE Awareness

For resources:

- Utilization;
- Saturation;
- Errors.

---

## 6.6 SLI / SLO / SLA

SLI:

> measured signal.

SLO:

> internal/reliability target.

SLA:

> external contractual commitment.

---

## 6.7 Alerting

Alert on symptoms/business impact rather than every low-level event.

Bad:

> one CPU spike.

Better:

> sustained error/latency SLO violation.

---

## 6.8 Runbook

For known incident:

```text
symptoms
checks
mitigation
rollback/failover
escalation
```

---

## 6.9 Incident Response

Typical sequence:

```text
detect
→ assess impact
→ mitigate
→ communicate
→ recover
→ verify
→ RCA
```

---

## 6.10 RCA

Blameless focus:

- root cause;
- contributing factors;
- detection gap;
- prevention actions.

---

## 6.11 RPO / RTO

RPO:

> acceptable data-loss window.

RTO:

> acceptable time to restore service.

---

## 6.12 Backup / Restore

Backup is useful only if restore works.

Test:

- recovery process;
- permissions;
- duration;
- data consistency.

Replication is not equivalent to backup.

---

# 7. Engineering Depth

## 7.1 Error Budgets

If SLO allows 0.1% failure, budget can guide:

- release pace;
- reliability investment.

Do not overcomplicate if organization does not use formal error budgets.

---

## 7.2 AI Observability

Track:

```text
model/prompt/index version
TTFT
generation latency
token usage
cost
retrieval latency
tool calls
fallback
evaluation outcome
```

---

## 7.3 Alert Fatigue

Too many noisy alerts cause humans to ignore real incidents.

Each alert needs:

- owner;
- action;
- severity;
- runbook.

---

# 8. Implementation / Design

Production dashboard:

```text
Traffic
Errors
p50/p95/p99
CPU/memory
DB pool
queue depth
cache hit
provider 429
AI cost/query
```

---

# 9. Hands-On Practice

Create SLOs for AI chat:

- availability;
- time to first token;
- total success;
- grounded response rate;
- cost per request threshold.

---

# 10. Google Interview Drill

## Problem — Users Report Intermittent 30-Second Timeouts, Dashboard Looks Green

### Clarify

- averages or percentiles?
- one region/tenant?
- traces sampled?
- dependency?
- queue/pool waits?

### Investigation

Look at:

- p99 latency;
- traces;
- DB pool wait;
- provider latency;
- specific tenant/region slices.

Suppose only p99 is bad due to provider retry chain.

### Improve

- better percentile alert;
- trace retry spans;
- cap total deadline;
- retry budget;
- provider fallback/degradation.

### Follow-Up

Update dashboard/runbook/alert to catch future occurrence.

---

# 11. Common Mistakes

1. Logs only.
2. Average latency only.
3. Alert every CPU spike.
4. No request correlation.
5. No runbook.
6. RCA = blame.
7. Backup never restored.
8. Replica called backup.
9. AI quality/cost not observed.

---

# 12. Best Practices

- structured logs;
- user-impact metrics;
- distributed traces;
- meaningful SLOs;
- actionable alerts;
- tested runbooks;
- restore drills;
- post-incident prevention.

---

# 13. Interview Questions

1. Logs vs metrics vs traces?
2. RED/USE?
3. SLI/SLO/SLA?
4. Error budget?
5. What should alert?
6. What is runbook?
7. Incident response?
8. RCA?
9. RPO/RTO?
10. Backup vs replication?

---

# 14. Google-Level Follow-Ups

1. observability cost?
2. trace sampling?
3. PII in logs?
4. false alerts?
5. multi-region DR?
6. backup corruption?
7. provider outage?
8. AI quality alert?

---

# 15. Quick Revision

```text
Logs = events
Metrics = trends
Traces = path
RED = rate/errors/duration
USE = utilization/saturation/errors
SLO = target
Alert on user impact
RPO = data loss
RTO = recovery time
Backup must be restorable
```

---

# 16. Readiness Gate

- [ ] Logs/metrics/traces.
- [ ] SLOs.
- [ ] Alerts/runbooks.
- [ ] Incident/RCA.
- [ ] RPO/RTO.
- [ ] Backup/restore.
- [ ] Timeout drill.

**Gate:** READY / REPAIR

---

# 17. References

- SRE/observability/disaster-recovery references
