# Public API vs Internal Runtime

## Public API

This is what application developers import and depend on.

Examples:
```text
Agent
AgentBuilder
Tool
RunContext
RunResult
AgentEvent
ModelClient
```

## Internal Runtime

Internal components may include:
- planner;
- execution loop;
- provider adapters;
- tool dispatcher;
- state manager;
- policy engine;
- telemetry bridge;
- retry engine.

## Why Separate Them

If internal architecture changes, applications should not break.

Example:

```text
SDK v1 App Code
     │
     ▼
Stable Public API
     │
     ├─ Runtime v1
     └─ Runtime v2
```

## Design Rule

> Public types should describe business-neutral Agent SDK concepts, not one cloud provider's request/response objects.
