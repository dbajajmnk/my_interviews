# Model Regression

## What / Why

Compare model/prompt/index/tool versions using fixed evals.

## Mental Model

```text
version diff → metrics
```

## When to Use

Use rollback gates.

## Common Mistake / Interview Trap

Vendor model alias changes can affect behavior.

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

> **Model Regression:** Compare model/prompt/index/tool versions using fixed evals.
