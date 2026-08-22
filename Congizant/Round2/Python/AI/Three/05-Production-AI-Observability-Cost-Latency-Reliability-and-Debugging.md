# AI-03 / File 05 — Production AI Observability, Cost, Latency, Reliability & Debugging

**Priority:** P0  
**Suggested Time:** 75 minutes

---

# 1. Objective

Master:

- traces;
- prompts/model/tool versioning;
- latency decomposition;
- token/tool cost;
- loops;
- timeouts;
- retries;
- circuit breakers;
- concurrency;
- queues;
- failure diagnosis;
- AI SLOs.

---

# 2. 5W+H

## What?

Production AI observability records enough context to explain what the system did, why operationally, and at what cost—without leaking sensitive information.

## Why?

Probabilistic systems fail in ways traditional logs alone may not explain.

## Where?

Model calls, tool calls, retrieval, routing, validation, agent loops.

## When?

Every production AI request/run.

## How?

Trace run → child model/tool spans → metrics → version metadata → safe audit.

---

# 3. Real-Life Analogy

A flight recorder does not fly the aircraft.

It records enough evidence to understand what happened when something goes wrong.

---

# 4. Visualization

```text
Agent Run Trace
├── Input metadata
├── Model call
├── Tool call A
├── Tool call B
├── Validation
└── Final result

Metrics:
latency + tokens + cost + steps + errors
```

---

# 5. Mind Map

```text
Production AI
│
├── Trace
├── Versions
├── Latency
├── Cost
├── Timeout
├── Retry
├── Concurrency
├── Queue
├── SLO
└── Debugging
```

---

# 6. Core Concepts

## 6.1 Trace Each Run

Useful metadata:

```text
run_id
user/tenant (privacy-safe identifier)
model version
prompt version
tool versions
step count
latency
token usage
tool outcomes
final status
```

---

## 6.2 Sensitive Logging

Do not automatically log:

- full prompts;
- raw PII;
- secrets;
- private documents.

Use redaction, sampling, secure access, and policy.

---

## 6.3 Latency Breakdown

Agent latency:

```text
routing
+ model calls
+ tool calls
+ retries
+ human wait
+ queue wait
```

One slow external tool can dominate.

---

## 6.4 Cost Breakdown

Track:

- input/output tokens;
- number of model calls;
- tool API costs;
- reranking/search;
- retries.

Agent loops can multiply cost rapidly.

---

## 6.5 Budgets

Per run:

```text
max steps
max tokens
max wall-clock time
max monetary cost
max tool calls
```

---

## 6.6 Retry

Do not retry every model/tool failure.

Need:

- transient classification;
- idempotency;
- bounded attempts;
- backoff/jitter;
- total deadline.

---

## 6.7 Concurrency

If 1,000 agent runs each launch 10 tools, actual downstream concurrency may explode.

Bound at:

- request;
- agent;
- tool;
- tenant.

---

## 6.8 Queues

Long-running agent jobs may run asynchronously:

```text
API
→ Job Queue
→ Agent Worker
→ Checkpoints
→ Result
```

---

# 7. Engineering Depth

## 7.1 SLOs for Agents

Examples:

```text
task completion rate
p95 run latency
p95 tool-call count
policy-violation rate
cost/run
human escalation rate
```

---

## 7.2 Debugging Bad Run

Flow:

```text
1. correct user/input?
2. correct model/prompt version?
3. routing correct?
4. tool schema correct?
5. tool call correct?
6. tool output correct?
7. state updated?
8. termination triggered?
9. output validated?
```

---

## 7.3 Runaway Loop

Symptoms:

- many repeated calls;
- high token cost;
- latency.

Controls:

- detect repeated action;
- max steps;
- no-progress detector;
- circuit breaker;
- human escalation.

---

# 8. Implementation / Code

Pseudo budget:

```python
@dataclass
class RunBudget:
    max_steps: int = 8
    max_tool_calls: int = 12
    max_seconds: int = 60
```

---

# 9. Hands-On Practice

A research agent cost increases 5×.

Investigate:

- step count;
- model call count;
- context growth;
- retries;
- tool failures;
- model change.

---

# 10. Google Interview Drill

## Problem — Agent Repeats Same Tool Until Timeout

### Clarify

- tool succeeds?
- result parsed?
- state updated?
- prompt says repeat?
- termination rule?
- model changed?

### First Approach

Increase timeout.

Wrong.

### Improve

- trace repeated calls;
- compare tool arguments/results;
- detect no-progress;
- cap identical repeated calls;
- fix state transition;
- max steps;
- escalation.

### Follow-Up

Add regression test:

> same tool/result cannot repeat beyond defined threshold without new evidence.

---

# 11. Common Mistakes

1. Log all prompts with PII.
2. Only total latency measured.
3. No per-run budget.
4. Unlimited parallel tools.
5. Retry every failure.
6. No run trace.
7. Model/prompt version absent.
8. Timeout increased instead of root-cause fix.

---

# 12. Best Practices

- trace every stage;
- redact sensitive data;
- record versions;
- bound loops/concurrency;
- meter cost;
- retry selectively;
- use checkpoints/queues for long runs;
- define AI-specific SLOs.

---

# 13. Interview Questions

1. How observe agent?
2. What should trace contain?
3. How control AI cost?
4. How control agent loops?
5. How handle long jobs?
6. What AI SLOs?
7. How debug repeated tool call?
8. How protect PII in logs?
9. How bound concurrency?
10. How retry safely?

---

# 14. Google-Level Follow-Ups

1. traces too expensive?
2. sampling?
3. one tenant causes 80% cost?
4. provider rate limit?
5. queue backlog?
6. human approval wait?
7. model latency spike?
8. regional outage?

---

# 15. Quick Revision

```text
Trace run + model + tools
Record versions
Protect sensitive logs
Bound steps/tokens/time/cost/tools
Measure task success + latency + cost
Retry selectively
Detect no-progress loops
Long work → queue/checkpoint
```

---

# 16. Readiness Gate

- [ ] Tracing.
- [ ] Sensitive logging.
- [ ] Latency/cost.
- [ ] Budgets.
- [ ] Retry.
- [ ] Concurrency.
- [ ] SLOs.
- [ ] Repeated-tool drill.

**Gate:** READY / REPAIR

---

# 17. References

- Observability and distributed tracing references
- Production AI engineering references
