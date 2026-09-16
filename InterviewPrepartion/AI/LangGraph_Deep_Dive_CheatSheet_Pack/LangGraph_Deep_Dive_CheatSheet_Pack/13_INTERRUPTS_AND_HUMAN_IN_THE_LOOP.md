# Interrupts and Human-in-the-Loop

## What

`interrupt()` pauses graph execution and surfaces a value to the caller.

## Resume

Resume the graph using `Command` with a resume value.

## Mental Model

```text
Agent proposes action
      ↓
 interrupt()
      ↓
 Human review
      ↓
Command(resume=...)
      ↓
Graph continues
```

## Important Runtime Detail

When resumed, the interrupted node can re-execute from the beginning, so code before the interrupt should be designed carefully for idempotency.

## Requirement

Interrupts rely on persistence/checkpointing.
