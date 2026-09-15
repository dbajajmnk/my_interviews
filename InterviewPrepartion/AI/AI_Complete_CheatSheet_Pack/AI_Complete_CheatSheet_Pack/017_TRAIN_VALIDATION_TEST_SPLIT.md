# Train Validation Test Split

## What / Why

Separate fitting, tuning and unbiased final evaluation.

## Mental Model

```text
train / validation / test
```

## When to Use

Use every supervised workflow.

## Common Mistake / Interview Trap

Do not repeatedly tune on the test set.

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

> **Train Validation Test Split:** Separate fitting, tuning and unbiased final evaluation.
