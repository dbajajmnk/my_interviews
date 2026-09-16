# LangGraph — System Design Questions

## Q1 — Design a Human-Approved Refund Agent

```text
START
  ↓
load_order
  ↓
check_policy
  ↓
recommend_refund
  ↓
interrupt(approval)
  ↓
approved?
 ├─ yes → execute_refund
 └─ no  → reject
  ↓
END
```

Discuss checkpoints, idempotency, auth, audit, and retries.

## Q2 — Design a Research Workflow

```text
plan
 ↓
Send(researcher, topic1)
Send(researcher, topic2)
Send(researcher, topic3)
 ↓
reducer
 ↓
synthesize
 ↓
END
```

## Q3 — Design a Supervisor Multi-Agent Graph

Use:
- supervisor node;
- specialized subgraphs;
- explicit shared state;
- conditional routing;
- termination conditions;
- per-agent tool boundaries.

## Q4 — Design Long-Running Durable Workflow

Discuss:
- thread ID;
- checkpoints;
- resume;
- timeouts;
- retries;
- human waits;
- idempotent side effects;
- state retention.

## Q5 — When Would You Use Functional API?

When normal function composition gives clearer code and you still want LangGraph task durability/retry/caching behavior.

## Answer Framework

**State → nodes → edges → routing → persistence → HITL → parallelism → failures → streaming → observability.**
