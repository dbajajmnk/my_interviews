# Greedy Decoding

## What / Why

Choose highest probability token each step.

## Mental Model

```text
argmax
```

## When to Use

Use deterministic-ish generation baseline.

## Common Mistake / Interview Trap

May produce repetitive/suboptimal sequences.

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

> **Greedy Decoding:** Choose highest probability token each step.
