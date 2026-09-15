# Evaluation Pipeline

## What / Why

Run automatic/human eval suites before deployment.

## Mental Model

```text
candidate → eval gate
```

## When to Use

Use every model/prompt/RAG change.

## Common Mistake / Interview Trap

Eval set must evolve with failures.

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

> **Evaluation Pipeline:** Run automatic/human eval suites before deployment.
