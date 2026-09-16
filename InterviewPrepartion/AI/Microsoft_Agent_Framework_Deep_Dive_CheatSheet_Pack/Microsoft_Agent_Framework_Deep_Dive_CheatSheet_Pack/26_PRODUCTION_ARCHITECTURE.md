# Microsoft Agent Framework — Production Architecture

## Reference Architecture

```text
Client / UI
    │
Gateway / Auth
    │
Agent Service
    │
Microsoft Agent Framework
 ├─ Agent
 │   ├─ Provider
 │   ├─ Tools
 │   ├─ Middleware
 │   ├─ Context Providers
 │   └─ AgentSession
 │
 ├─ Workflow Runtime
 │   ├─ Executors
 │   ├─ Edges
 │   ├─ State
 │   └─ Checkpoints
 │
 ├─ A2A
 ├─ MCP / Enterprise Tools
 ├─ Durable Stores
 └─ OpenTelemetry
```

## Production Checklist

- durable session store;
- durable checkpoint store;
- identity propagation;
- scoped tools;
- bounded loops;
- retries/timeouts;
- HITL for sensitive actions;
- observability;
- model/tool cost controls;
- evaluation;
- multi-tenant isolation.
