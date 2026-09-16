# Runner and the Agent Loop

## Runner

`Runner` executes an agent workflow.

## Common Modes

- `Runner.run(...)`
- `Runner.run_sync(...)`
- `Runner.run_streamed(...)`

## Loop

```text
Input
 ↓
Agent model call
 ↓
Final?
 ├─ Yes → RunResult
 └─ No
      ├─ Tool call → execute → model again
      └─ Handoff → new agent → continue
```

## Runtime Responsibilities

The Runner coordinates:
- model turns;
- tool execution;
- handoffs;
- guardrails;
- context/usage accumulation;
- interruptions;
- final result generation.
