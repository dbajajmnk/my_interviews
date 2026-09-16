# Streaming

## Purpose

`Runner.run_streamed(...)` supports incremental agent execution visibility.

## Use Cases

Stream:
- text/model events;
- tool activity;
- agent transitions;
- progress to user interfaces.

## Result Surface

`RunResultStreaming` supports event iteration plus controls such as current-agent and cancellation behavior.

## Production Rule

Treat UI streaming and durable run state separately. A client disconnect should not automatically imply business workflow cancellation.
