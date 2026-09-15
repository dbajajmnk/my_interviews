# Ingestion

## What / Why

Load and normalize source data.

## Mental Model

```text
files/APIs/DB → canonical docs
```

## When to Use

Use reliable incremental ingestion.

## Common Mistake / Interview Trap

Garbage in → garbage out.

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

> **Ingestion:** Load and normalize source data.
