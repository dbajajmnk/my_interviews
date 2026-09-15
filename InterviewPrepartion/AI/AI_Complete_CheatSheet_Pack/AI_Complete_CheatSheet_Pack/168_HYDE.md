# HyDE

## What / Why

Generate hypothetical answer/document then embed it for retrieval.

## Mental Model

```text
query → hypothetical passage → vector search
```

## When to Use

Use when query vocabulary differs from corpus.

## Common Mistake / Interview Trap

Generated hypothesis can bias retrieval.

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

> **HyDE:** Generate hypothetical answer/document then embed it for retrieval.
