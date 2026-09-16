# Reference Implementation Blueprint

## Package Layout

```text
agent-sdk/
├─ api/
│  ├─ Agent
│  ├─ Tool
│  ├─ RunContext
│  └─ AgentEvent
├─ runtime/
│  ├─ DefaultAgentRuntime
│  ├─ ExecutionLoop
│  └─ StateManager
├─ model/
│  ├─ ModelProvider
│  └─ adapters/
├─ tools/
│  ├─ ToolRegistry
│  └─ ToolExecutor
├─ memory/
├─ retrieval/
├─ policy/
├─ telemetry/
├─ evaluation/
└─ testing/
```

## Execution Blueprint

```text
Developer defines Agent
        ↓
SDK validates configuration
        ↓
Runtime starts run
        ↓
Context + state loaded
        ↓
Model decides
        ↓
Tool/policy path OR final
        ↓
Events + trace emitted
        ↓
Run result returned
```

## Production Checklist

- stable public API;
- provider abstraction;
- tool authorization;
- streaming;
- cancellation;
- normalized errors;
- telemetry;
- testing fakes;
- versioning strategy;
- documentation/examples.
