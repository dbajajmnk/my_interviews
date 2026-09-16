# Tool Calling — Production Architecture

## Reference Architecture

```text
Client
  │
Agent Runtime
  │
Model
  │
Tool Call Proposal
  │
Tool Gateway
 ├─ Schema Validation
 ├─ Auth/AuthZ
 ├─ Policy
 ├─ Approval
 ├─ Retry/Timeout
 ├─ Audit
 └─ Dispatch
      │
      ├─ Local Functions
      ├─ Internal APIs
      ├─ Databases
      └─ MCP / Remote Tools
```

## Production Checklist

- typed schemas;
- explicit registry;
- identity propagation;
- least privilege;
- risk classification;
- HITL;
- idempotency;
- timeout/retry;
- circuit breaker;
- observability;
- versioning;
- testing.
