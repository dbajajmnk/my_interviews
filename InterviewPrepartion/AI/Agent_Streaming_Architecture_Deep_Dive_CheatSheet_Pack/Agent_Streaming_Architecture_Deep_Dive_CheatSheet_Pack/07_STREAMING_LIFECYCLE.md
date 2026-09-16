# Streaming Lifecycle

## Lifecycle

```text
RunCreated
 ↓
RunStarted
 ↓
Events...
 ↓
Final model/tool step
 ↓
Post-processing
 ↓
Persistence/finalization
 ↓
RunCompleted
```

## Important

The run can still be finalizing after the final visible text delta.

## Consumers

Client code should wait for a terminal run event/state before assuming:
- session persistence is done;
- approvals are finalized;
- final result metadata is stable.
