# Access Controlled RAG

## What / Why

Apply document/row/tenant permissions before retrieval/generation.

## Mental Model

```text
identity → ACL filter → retrieval
```

## When to Use

Mandatory for enterprise multi-user RAG.

## Common Mistake / Interview Trap

Never retrieve unauthorized content then ask model to hide it.

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

> **Access Controlled RAG:** Apply document/row/tenant permissions before retrieval/generation.
