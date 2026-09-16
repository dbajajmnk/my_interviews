# Observer / Event Pattern

## Intent

Notify interested components without coupling the runtime to each subscriber.

## Agent Events

Examples:
- RunStarted
- ModelCalled
- ToolRequested
- ToolCompleted
- GuardrailTriggered
- RunCompleted
- RunFailed

## Consumers

Events may feed:
- UI streaming;
- logs;
- tracing;
- analytics;
- audit;
- evaluation.

## Architecture

```text
Agent Runtime
   │ emits
   ▼
Event Bus
 ├─ Telemetry
 ├─ UI Stream
 ├─ Audit
 └─ Evaluator
```
