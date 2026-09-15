# LoRA

## What / Why

Low-rank adapters train small matrices instead of all weights.

## Mental Model

```text
W + BA
```

## When to Use

Use efficient fine-tuning.

## Common Mistake / Interview Trap

Adapter compatibility/versioning matters.

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

> **LoRA:** Low-rank adapters train small matrices instead of all weights.
