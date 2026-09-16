# Streaming

## Why

Agent runs may involve multiple model/tool steps. Streaming improves user experience and exposes progress.

## What Can Stream

Depending on mode and runtime:
- messages;
- state updates;
- token chunks;
- custom progress events.

## Concept

```text
agent.stream(...)
   ↓
state/message/tool events
   ↓
UI / API / telemetry
```

## Production Design

Separate:
- user-facing stream;
- telemetry stream;
- audit persistence.

Do not assume the client will remain connected for the full run.
