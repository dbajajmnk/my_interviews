# Token Streaming vs Agent Event Streaming

## Token Streaming

Incremental model output:
```text
"H"
"He"
"Hel"
"Hello"
```

## Agent Event Streaming

Semantic runtime events:
```text
RunStarted
ToolCalled
ToolCompleted
AgentChanged
MessageDelta
ApprovalRequired
RunCompleted
```

## Why Semantic Events Win

Token streaming helps UX. Semantic events help:
- orchestration;
- debugging;
- UI progress;
- approval;
- audit;
- telemetry.

## Interview Point

> Token streaming is one event type inside a broader agent event stream.
