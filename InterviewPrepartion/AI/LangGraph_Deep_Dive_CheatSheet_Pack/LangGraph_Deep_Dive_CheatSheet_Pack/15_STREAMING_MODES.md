# Streaming Modes

## Current Stream Modes

LangGraph supports multiple stream modes including:
- `values`
- `updates`
- `messages`
- `custom`
- `checkpoints`
- `tasks`
- `debug`

## Mental Model

- `values` → whole state after steps
- `updates` → node/task updates
- `messages` → token/message streaming
- `custom` → application-defined stream data
- `checkpoints` → checkpoint events
- `tasks` → task lifecycle
- `debug` → detailed execution information

## Use

Choose stream mode based on consumer:
- UI;
- telemetry;
- debugging;
- operations.
