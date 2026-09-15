# Supervisor Pattern

## What / Why

Coordinator assigns tasks and combines results.

## Mental Model

```text
supervisor → workers → synthesis
```

## When to Use

Use multi-agent orchestration.

## Common Mistake / Interview Trap

Supervisor can become bottleneck/single point of error.

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

> **Supervisor Pattern:** Coordinator assigns tasks and combines results.
