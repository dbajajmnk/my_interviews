# Durable Agent Workflow

## What / Why

Persist step state/checkpoints between model/tool calls.

## Mental Model

```text
workflow engine + agent nodes
```

## When to Use

Use long-running/retriable operations.

## Common Mistake / Interview Trap

Exactly-once business effects require idempotency.

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

> **Durable Agent Workflow:** Persist step state/checkpoints between model/tool calls.
