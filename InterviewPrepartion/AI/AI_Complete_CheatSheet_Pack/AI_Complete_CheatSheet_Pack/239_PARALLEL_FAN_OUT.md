# Parallel Fan Out

## What / Why

Delegate independent subtasks concurrently.

## Mental Model

```text
coordinator → A/B/C → merge
```

## When to Use

Use research/comparison.

## Common Mistake / Interview Trap

Merge conflicts/evidence quality matter.

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

> **Parallel Fan Out:** Delegate independent subtasks concurrently.
