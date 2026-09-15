# RAG Pipeline

## What / Why

Ingest → parse → chunk → embed → index → retrieve → rerank → prompt → generate → cite/evaluate.

## Mental Model

```text
end-to-end pipeline
```

## When to Use

Use as production checklist.

## Common Mistake / Interview Trap

Every stage can degrade quality.

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

> **RAG Pipeline:** Ingest → parse → chunk → embed → index → retrieve → rerank → prompt → generate → cite/evaluate.
