# Training Data Poisoning

## What / Why

Adversary corrupts training/fine-tuning data.

## Mental Model

```text
poisoned examples → model behavior
```

## When to Use

Use provenance/filtering/anomaly review.

## Common Mistake / Interview Trap

Small targeted poison can have outsized effect.

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

> **Training Data Poisoning:** Adversary corrupts training/fine-tuning data.
