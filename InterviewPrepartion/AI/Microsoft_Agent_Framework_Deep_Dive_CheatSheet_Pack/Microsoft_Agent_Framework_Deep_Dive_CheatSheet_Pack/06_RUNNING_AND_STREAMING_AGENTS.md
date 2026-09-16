# Running and Streaming Agents

## Run Modes

Agents support:
- normal runs;
- streaming runs;
- run options;
- typed responses/messages.

## Concept

```text
Input
 ↓
Agent.run / RunAsync
 ↓
Agent pipeline
 ↓
Provider/model
 ↓
Agent response

or

Input
 ↓
run(stream=True) / RunStreamingAsync
 ↓
incremental updates
```

## Why Streaming Matters

Streaming improves:
- UI responsiveness;
- tool progress visibility;
- long-task UX;
- operational diagnostics.
