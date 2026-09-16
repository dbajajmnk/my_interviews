# Agent Anatomy

## Core Components

1. **Goal / Task** — what must be achieved.
2. **Model** — reasoning/generation engine.
3. **Instructions** — policy, role, boundaries.
4. **Context** — information available now.
5. **State** — current execution status.
6. **Tools** — approved external capabilities.
7. **Memory** — retained information when needed.
8. **Guardrails** — safety and policy controls.
9. **Observability** — logs, metrics, traces, cost.
10. **Termination logic** — when to stop.

## Architecture

```text
                 ┌─────────────┐
User / System ──▶│    Agent    │
                 └──────┬──────┘
        ┌───────────────┼────────────────┐
        ▼               ▼                ▼
     Model          Instructions       Context
        │                                │
        ├───────────────┬────────────────┤
        ▼               ▼                ▼
      Tools           State            Memory
        │               │                │
        └───────────────┴────────────────┘
                        ▼
                     Result
                        │
                Guardrails + Trace
```

## Design Principle

Keep the agent core small. Put external capabilities behind interfaces.

Example abstractions:
```text
ModelProvider
ToolRegistry
StateStore
MemoryStore
Retriever
PolicyEngine
Telemetry
```

## 20-Second Recall

> The agent is not just the model. The model is one component inside a controlled runtime that includes tools, state, policies, and telemetry.
