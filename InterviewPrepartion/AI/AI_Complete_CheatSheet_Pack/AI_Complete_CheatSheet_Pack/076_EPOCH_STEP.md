# Epoch Step

## What / Why

Epoch = pass through dataset; step = one optimizer update.

## Mental Model

```text
dataset / batch
```

## When to Use

Use training schedules.

## Common Mistake / Interview Trap

Streaming/pretraining may be step-based rather than epoch-based.

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

> **Epoch Step:** Epoch = pass through dataset; step = one optimizer update.
