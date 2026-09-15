# Agent Reliability

## What / Why

Use retries/idempotency/checkpoints/compensation for actions.

## Mental Model

```text
state machine + durable execution
```

## When to Use

Use long-running agents.

## Common Mistake / Interview Trap

Agent reasoning cannot substitute for transaction semantics.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Reliability:** Use retries/idempotency/checkpoints/compensation for actions.
