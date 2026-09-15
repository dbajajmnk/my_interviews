# Long Running Agent

## What / Why

Persists context/checkpoints across long tasks and environments.

## Mental Model

```text
session → checkpoints → resume
```

## When to Use

Use research/coding/ops tasks lasting many turns.

## Common Mistake / Interview Trap

Need cancellation, budgets and durable state.

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

> **Long Running Agent:** Persists context/checkpoints across long tasks and environments.
