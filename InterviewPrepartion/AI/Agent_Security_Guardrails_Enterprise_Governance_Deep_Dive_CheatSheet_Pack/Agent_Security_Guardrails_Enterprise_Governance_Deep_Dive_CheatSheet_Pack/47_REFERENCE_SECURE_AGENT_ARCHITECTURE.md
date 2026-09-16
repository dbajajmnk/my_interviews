# Reference Secure Agent Architecture

## Architecture

```text
User
 ↓ AuthN
API
 ↓ AuthZ + Tenant Context
Agent Runtime
 ├─ Input Guardrails
 ├─ Policy Engine
 ├─ Retrieval ACL
 ├─ Memory Policy
 ├─ Tool Dispatcher
 │    ├─ Schema Validation
 │    ├─ AuthZ
 │    ├─ HITL
 │    └─ Scoped Credential
 └─ Output Guardrails
      ↓
Audit + Trace + SIEM
```

## Rule

No security-critical decision should depend only on model reasoning.
