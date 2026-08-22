# PY-04 / File 04 — Debugging, Testing & Performance Diagnostics

**Priority:** P0  
**Suggested Time:** 55 minutes  
**GOJ Mapping:** M14 Debugging & Troubleshooting + selected M17 Testing

---

# 1. Objective

Master a repeatable debugging method:

- reproduce;
- isolate;
- inspect evidence;
- form hypothesis;
- test;
- fix;
- prevent regression.

Also cover:

- logging;
- traceback;
- tests;
- profiling;
- performance diagnosis.

---

# 2. 5W+H

## What?

Debugging is systematic root-cause analysis.

## Why?

Senior engineers are judged by how quickly and safely they narrow failures.

## Where?

Development, CI, production, performance incidents, integration issues.

## When?

Whenever actual behavior differs from expected behavior.

## How?

Evidence before guesses.

---

# 3. Real-Life Analogy

A doctor does not prescribe ten medicines randomly.

They:

> observe → test → diagnose → treat → verify.

---

# 4. Visualization

```text
Symptom
 ↓
Reproduce
 ↓
Narrow Scope
 ↓
Evidence
 ↓
Hypothesis
 ↓
Test Hypothesis
 ↓
Fix
 ↓
Regression Test
 ↓
Monitor
```

---

# 5. Mind Map

```text
Debugging
│
├── Reproduction
├── Logs
├── Traceback
├── Breakpoints
├── Tests
├── Profiling
├── Root Cause
└── Prevention
```

---

# 6. Core Concepts

## 6.1 Reproduce First

Capture:

- exact input;
- environment;
- frequency;
- stack trace;
- version;
- timing.

---

## 6.2 Read Traceback from Bottom Up

The final exception often gives the immediate failure; walk upward to understand call path.

---

## 6.3 Logging

Prefer structured useful context.

Bad:

```python
print("error")
```

Better:

```python
logger.exception(
    "Failed to process order",
    extra={"order_id": order_id}
)
```

Never log secrets.

---

## 6.4 Assertions vs Runtime Validation

Assertions are for programmer invariants, not untrusted user validation.

Do not rely on:

```python
assert user_input
```

for security/business validation.

---

## 6.5 Unit Test

Tests isolated logic.

## 6.6 Integration Test

Tests components together:

- DB;
- API;
- queue;
- external adapter.

## 6.7 Regression Test

A bug fix should ideally add a test reproducing the original defect.

---

## 6.8 Profiling

Do not optimize based on guess.

Tools:

- `cProfile`;
- `timeit`;
- `tracemalloc`;
- application metrics.

---

# 7. Engineering Depth

## 7.1 Performance Bug

If endpoint is slow:

```text
total latency
├── Python CPU
├── DB
├── network
├── external API
├── serialization
└── lock/queue wait
```

Measure each stage.

---

## 7.2 Production Debugging

Use:

- correlation/request ID;
- logs;
- metrics;
- traces;
- error aggregation;
- deployment/version correlation.

Avoid debugging production by adding random `print()` calls.

---

# 8. Implementation / Code

## Timing

```python
from time import perf_counter

start = perf_counter()
result = operation()
elapsed = perf_counter() - start
```

For real services, use metrics/tracing rather than scattered timing prints.

---

# 9. Hands-On Practice

## Practice 1

A function sometimes returns stale data.

Ask:

- cache?
- mutable default?
- shared state?
- race?
- transaction?

## Practice 2

Endpoint p95 jumps from 200 ms to 2 sec.

Break down dependencies and inspect traces.

---

# 10. Google Interview Drill

## Problem — API Is Slow After Deployment

### Clarify

- all endpoints?
- only new release?
- CPU/memory?
- DB latency?
- error rate?
- traffic changed?

### First Approach

Rollback immediately?

May be appropriate if severe, but diagnosis still needed.

### Improve

```text
deployment diff
→ metrics
→ traces
→ DB
→ external calls
→ CPU profile
```

### Edge Cases

- connection pool exhaustion;
- N+1 query;
- blocking async call;
- cache miss storm;
- retry storm.

### Follow-Up

How would you prevent recurrence?

- regression/performance test;
- SLO alerts;
- code review;
- load test;
- canary deployment.

---

# 11. Common Mistakes

1. Fixing before reproducing.
2. Guessing without evidence.
3. Logging secrets.
4. Catching exceptions and hiding them.
5. No regression test.
6. Optimizing unmeasured code.
7. Ignoring downstream latency.
8. Treating symptom as root cause.

---

# 12. Best Practices

- reproduce;
- reduce;
- instrument;
- test one hypothesis at a time;
- add regression coverage;
- monitor after fix;
- prefer structured logs and traces.

---

# 13. Interview Questions

1. How do you debug a production issue?
2. Unit vs integration test?
3. What is regression test?
4. How do you debug slow API?
5. How do you profile Python?
6. Why not catch `Exception` everywhere?
7. What should logs contain?
8. What should logs never contain?

---

# 14. Google-Level Follow-Ups

1. no reproduction locally?
2. intermittent failure?
3. only under load?
4. one Kubernetes pod?
5. DB pool saturation?
6. async endpoint with blocking SDK?
7. rollback vs hotfix?

---

# 15. Quick Revision

```text
Reproduce
→ evidence
→ isolate
→ hypothesis
→ test
→ fix
→ regression test
→ monitor
```

---

# 16. Readiness Gate

- [ ] Explain debugging flow.
- [ ] Read traceback.
- [ ] Explain test layers.
- [ ] Diagnose slow API.
- [ ] Explain profiling.
- [ ] Add regression thinking.
- [ ] Survive deployment-latency drill.

**Gate:** READY / REPAIR

---

# 17. References

- Python logging
- Python traceback
- Python `cProfile`
- Python `timeit`
- Python testing documentation
