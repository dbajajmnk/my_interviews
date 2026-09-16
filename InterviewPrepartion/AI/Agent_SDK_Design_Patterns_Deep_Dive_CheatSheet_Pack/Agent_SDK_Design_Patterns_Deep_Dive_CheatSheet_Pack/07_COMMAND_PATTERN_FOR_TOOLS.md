# Command Pattern for Tool Calls

## Intent

Represent an operation as an object/value that can be validated, logged, queued, retried, or approved.

## Agent Mapping

```text
Model Decision
   ↓
ToolCommand
   ├─ toolName
   ├─ arguments
   ├─ correlationId
   └─ metadata
   ↓
ToolExecutor
```

## Why It Fits

Tool calls need:
- validation;
- auditing;
- approval;
- replay;
- idempotency;
- async execution.

Command makes the action explicit.

## Interview Point

> I would model tool invocation as a command rather than letting the model directly invoke arbitrary application methods.
