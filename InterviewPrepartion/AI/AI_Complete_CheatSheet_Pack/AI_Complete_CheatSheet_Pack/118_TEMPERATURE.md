# Temperature

## What / Why

Scales logits before sampling.

## Mental Model

```text
softmax(logits/T)
```

## When to Use

Use to adjust randomness.

## Common Mistake / Interview Trap

Higher temperature generally increases diversity/uncertainty.

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

> **Temperature:** Scales logits before sampling.
