# Batch Normalization

## What / Why

Normalizes intermediate activations using batch statistics.

## Mental Model

```text
normalize → scale/shift
```

## When to Use

Common CNN training.

## Common Mistake / Interview Trap

Small batches can be problematic.

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

> **Batch Normalization:** Normalizes intermediate activations using batch statistics.
