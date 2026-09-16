# OpenAI Agents SDK — Production Architecture

## Reference Architecture

```text
Client / UI
    │
API Gateway + Auth
    │
Agent Service
    │
Agent + Runner
 ├─ OpenAI model / Responses API
 ├─ Function tools
 ├─ Enterprise APIs
 ├─ MCP tools
 ├─ Session store
 ├─ Approval service
 ├─ Guardrails / policy
 └─ Trace / metrics / audit
```

## Production Checklist

- stable tool schemas;
- identity propagation;
- least privilege;
- session persistence;
- timeouts/retries;
- HITL for risky writes;
- trace redaction;
- usage budgets;
- rate limiting;
- evaluation suite;
- cancellation behavior;
- failure runbooks.

## Durable Long-Running Work

For truly long-running/durable workflows that must survive long waits, retries, or process restarts, integrate the agent runtime with durable workflow orchestration rather than assuming a single in-memory request lifecycle is enough.
