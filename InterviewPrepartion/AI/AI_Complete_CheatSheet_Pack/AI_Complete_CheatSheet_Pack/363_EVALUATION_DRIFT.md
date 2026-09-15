# Evaluation Drift

## What / Why

Production failures differ from benchmark.

## Mental Model

```text
prod samples → update eval set
```

## When to Use

Continuously expand golden set.

## Common Mistake / Interview Trap

Static eval suites become stale.

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

> **Evaluation Drift:** Production failures differ from benchmark.
