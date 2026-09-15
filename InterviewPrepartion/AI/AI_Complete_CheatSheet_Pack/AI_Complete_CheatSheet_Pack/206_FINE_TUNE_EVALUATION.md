# Fine Tune Evaluation

## What / Why

Compare base vs tuned on held-out representative tasks.

## Mental Model

```text
base/tuned → eval suite
```

## When to Use

Use regression checks.

## Common Mistake / Interview Trap

Check capability loss and safety regressions.

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

> **Fine Tune Evaluation:** Compare base vs tuned on held-out representative tasks.
