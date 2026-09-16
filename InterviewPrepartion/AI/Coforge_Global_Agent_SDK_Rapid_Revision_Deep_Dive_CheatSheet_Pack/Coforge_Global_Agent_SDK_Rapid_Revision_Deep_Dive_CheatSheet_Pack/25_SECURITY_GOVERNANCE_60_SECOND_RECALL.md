# Security & Governance — 60-Second Recall

## Formula

```text
Identity + AuthZ + Least Privilege + Guardrails + Validation + HITL + Isolation + Audit
```

## 60-Second Answer

> I treat the LLM as an untrusted decision engine. The model may propose an action, but trusted code validates, authorizes, applies policy, requests approval if required, executes with scoped credentials, and audits the outcome.

## Recall Points

- Prompt injection expected.
- Secrets stay outside model context.
- RAG/memory need ACLs.
- Tool access is a security boundary.
