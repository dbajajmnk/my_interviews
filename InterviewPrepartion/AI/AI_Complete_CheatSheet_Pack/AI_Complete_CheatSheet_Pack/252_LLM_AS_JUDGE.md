# LLM as Judge

## What / Why

Use a model to score outputs against rubric.

## Mental Model

```text
candidate + rubric → judge
```

## When to Use

Use scalable evaluation with calibration.

## Common Mistake / Interview Trap

Judge bias/self-preference must be checked.

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

> **LLM as Judge:** Use a model to score outputs against rubric.
