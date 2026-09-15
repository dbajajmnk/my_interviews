# RAG Service

## What / Why

Dedicated retrieval/context service.

## Mental Model

```text
query → retrieval API → evidence
```

## When to Use

Use shared enterprise knowledge access.

## Common Mistake / Interview Trap

Avoid one universal index for unrelated domains.

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

> **RAG Service:** Dedicated retrieval/context service.
