# Reference Architecture with Patterns

## Architecture

```text
Developer App
    │
    ▼
Facade: Agent SDK
    │
    ▼
Builder: Agent Configuration
    │
    ▼
Agent Runtime
    ├─ Strategy: routing/retry/termination
    ├─ State: lifecycle
    ├─ Chain: guardrails/policies
    │
    ├─ Adapter: ModelProvider
    │      └─ Decorator: tracing/retry
    │
    ├─ Command: ToolCall
    │      └─ Proxy: remote/secure tool
    │
    └─ Observer: events/telemetry
```

## How to Explain It

1. Facade protects the developer-facing surface.
2. Builder handles configuration.
3. Adapter isolates vendors.
4. Strategy isolates behavior/policy choices.
5. Command represents tool calls.
6. Chain applies guardrails.
7. Observer publishes runtime events.
8. Decorator adds cross-cutting behavior.
9. State controls lifecycle.
10. DI wires all components together.
