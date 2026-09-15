# Agent Termination

## What / Why

Define completion, stop, escalation and loop limits.

## Mental Model

```text
success/fail/max steps
```

## When to Use

Mandatory.

## Common Mistake / Interview Trap

Unbounded loops waste cost and may act repeatedly.

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

> **Agent Termination:** Define completion, stop, escalation and loop limits.
