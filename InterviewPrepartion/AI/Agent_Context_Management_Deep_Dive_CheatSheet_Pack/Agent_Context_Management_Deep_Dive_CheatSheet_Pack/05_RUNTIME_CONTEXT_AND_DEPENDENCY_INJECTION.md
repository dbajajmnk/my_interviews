# Runtime Context and Dependency Injection

## Purpose

Runtime context is an ideal place for trusted dependencies and request-scoped metadata.

## Pattern

```text
Runtime Context
 ├─ user_id
 ├─ tenant_id
 ├─ db_client
 ├─ auth_service
 ├─ logger
 └─ trace_context
```

## Benefit

Avoid:
- hidden globals;
- model-generated identity;
- hard-coded dependencies.

## Rule

Trusted runtime facts should come from authenticated application state, not from prompt text.
