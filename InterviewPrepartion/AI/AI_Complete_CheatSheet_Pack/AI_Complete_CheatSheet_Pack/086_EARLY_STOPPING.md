# Early Stopping

## What / Why

Stop when validation stops improving.

## Mental Model

```text
patience
```

## When to Use

Use smaller supervised datasets.

## Common Mistake / Interview Trap

Validation noise can trigger premature stop.

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

> **Early Stopping:** Stop when validation stops improving.
