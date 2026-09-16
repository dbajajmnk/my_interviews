# Chain of Responsibility for Guardrails

## Intent

Pass a request through a sequence of handlers until all checks pass or one stops processing.

## Guardrail Pipeline

```text
Input
 ↓
Schema Check
 ↓
PII Check
 ↓
Policy Check
 ↓
Authorization
 ↓
Risk Check
 ↓
Execute
```

## Why It Fits

Each policy check has one responsibility and can be added/removed independently.

## Return Model

Handlers can return:
- PASS
- BLOCK
- REQUIRE_APPROVAL
- TRANSFORM
