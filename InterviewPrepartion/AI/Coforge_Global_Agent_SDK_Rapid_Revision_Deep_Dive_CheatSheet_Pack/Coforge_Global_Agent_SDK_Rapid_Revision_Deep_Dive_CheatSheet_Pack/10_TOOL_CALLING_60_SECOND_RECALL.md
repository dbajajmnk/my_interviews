# Tool Calling — 60-Second Recall

## Formula

```text
Tool Calling = Schema + Model Selection + Validation + AuthZ + Policy + Execution + Audit
```

## 60-Second Answer

> The model proposes a tool call and arguments, but the application owns execution. I validate schema, business rules, authorization, risk policy, idempotency, timeout, approval, and telemetry before calling the underlying service.

## Recall Points

- Model chooses; platform governs.
- Tool schema quality matters.
- Auth context never comes from model arguments.
- Retries + writes require idempotency.
