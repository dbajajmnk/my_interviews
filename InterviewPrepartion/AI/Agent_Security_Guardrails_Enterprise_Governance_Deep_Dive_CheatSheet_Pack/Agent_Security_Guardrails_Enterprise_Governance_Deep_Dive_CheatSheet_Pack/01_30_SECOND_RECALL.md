# Agent Security — 30-Second Recall

## Recall

```text
Secure Agent =
Identity
+ Authorization
+ Least Privilege
+ Guardrails
+ Validation
+ HITL
+ Sandboxing
+ Tenant Isolation
+ Audit
```

## 30-Second Interview Answer

> I treat the LLM as an untrusted decision engine, not an authority. The model can propose a tool call, but trusted application code validates arguments, enforces tenant and user authorization, applies policy and risk classification, requests HITL approval for high-risk actions, executes with least-privilege credentials, and records the decision in telemetry and audit logs. Retrieval, memory, secrets, outputs, and network egress are governed separately.

## Do Not Forget

- Prompt injection is expected, not exceptional.
- Model-generated arguments are untrusted input.
- Authentication is not authorization.
- Content safety is not access control.
- RAG and memory can be poisoned.
- Tool permissions should come from trusted context, not model text.
