# Streaming and Events

## Why Streaming Matters

Agent runs can be long. Developers need incremental visibility into:
- model tokens;
- tool starts;
- tool results;
- status changes;
- errors;
- final response.

## Event Model

```text
RunStarted
ModelStarted
TokenDelta
ToolCallRequested
ToolStarted
ToolCompleted
StateUpdated
RunCompleted
RunFailed
```

## API Shape

```text
agent.run(...)         → RunResult
agent.runStream(...)   → Stream<AgentEvent>
```

## Design Rule

Keep streamed event types stable. They become part of the public SDK contract and often feed UIs, tracing, and audit pipelines.
