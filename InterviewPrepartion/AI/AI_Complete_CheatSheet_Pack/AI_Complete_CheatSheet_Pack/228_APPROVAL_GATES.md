# Approval Gates

## What / Why

Policy blocks sensitive tool execution until approved.

## Mental Model

```text
payment/delete/deploy → approve
```

## When to Use

Use financial, destructive, external communication actions.

## Common Mistake / Interview Trap

Do not rely on model self-classification alone.

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

> **Approval Gates:** Policy blocks sensitive tool execution until approved.
