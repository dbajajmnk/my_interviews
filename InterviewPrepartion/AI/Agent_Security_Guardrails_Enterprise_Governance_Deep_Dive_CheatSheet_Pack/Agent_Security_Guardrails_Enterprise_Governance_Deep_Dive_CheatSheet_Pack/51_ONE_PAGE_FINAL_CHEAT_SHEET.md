# Agent Security, Guardrails & Enterprise Governance — One-Page Final Cheat Sheet

## Formula

```text
Secure Agent =
Identity
+ Authorization
+ Least Privilege
+ Guardrails
+ Validation
+ HITL
+ Isolation
+ Audit
```

## Threat Recall

Prompt Injection • Tool Abuse • Exfiltration • Secret Leakage • Tenant Leakage • RAG Poisoning • Memory Poisoning

## Production Rules

1. Treat model output as untrusted.
2. Authenticate and authorize outside the model.
3. Tenant context comes from trusted identity.
4. Tool execution needs validation and least privilege.
5. High-risk actions require approval.
6. Secrets never enter model context.
7. RAG/memory need ACLs and provenance.
8. Sandbox untrusted code.
9. Restrict network egress.
10. Audit every consequential action.

## 30-Second Answer

> I secure agents by treating the model as an untrusted decision engine. Identity and tenant context come from trusted application state, tool calls are authorized and validated outside the model, high-risk actions require human approval, credentials are scoped and server-side, RAG and memory enforce ACLs and provenance, and code/tool execution is sandboxed and network-restricted. Every consequential decision is traced and auditable under an enterprise governance model.

## Recall Line

> **The model can propose; trusted code must authorize and execute.**
