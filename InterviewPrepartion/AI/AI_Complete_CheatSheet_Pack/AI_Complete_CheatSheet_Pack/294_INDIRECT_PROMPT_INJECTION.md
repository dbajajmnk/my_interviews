# Indirect Prompt Injection

## What / Why

Injected instructions arrive through retrieved/web/email/document content.

## Mental Model

```text
external data → RAG/agent
```

## When to Use

Critical for agents.

## Common Mistake / Interview Trap

Mark content untrusted and restrict tool consequences.

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

> **Indirect Prompt Injection:** Injected instructions arrive through retrieved/web/email/document content.
