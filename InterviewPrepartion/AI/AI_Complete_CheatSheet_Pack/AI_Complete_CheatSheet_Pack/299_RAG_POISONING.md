# RAG Poisoning

## What / Why

Malicious document enters knowledge base and influences answers/tools.

## Mental Model

```text
poison doc → retrieval
```

## When to Use

Use source trust, access, signatures, review.

## Common Mistake / Interview Trap

Freshness pipelines can ingest attacks quickly.

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

> **RAG Poisoning:** Malicious document enters knowledge base and influences answers/tools.
