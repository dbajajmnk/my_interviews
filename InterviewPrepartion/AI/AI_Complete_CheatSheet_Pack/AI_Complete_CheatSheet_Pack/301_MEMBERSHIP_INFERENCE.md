# Membership Inference

## What / Why

Infer whether a record was in training data.

## Mental Model

```text
query → confidence signal
```

## When to Use

Consider privacy-sensitive training.

## Common Mistake / Interview Trap

Differential privacy and data minimization can help.

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

> **Membership Inference:** Infer whether a record was in training data.
