# Realtime Agents

## What

Realtime agents maintain a long-lived connection for low-latency text/audio interaction, tool calls, interruptions, and session events.

## Core Components

- `RealtimeAgent`
- `RealtimeRunner`
- `RealtimeSession`
- `RealtimeModel`

## Lifecycle

```text
Create RealtimeAgent
      ↓
Create RealtimeRunner
      ↓
runner.run()
      ↓
RealtimeSession
      ↓
send_message / send_audio
      ↓
iterate session events
```

## Use Cases

- voice assistant;
- customer support;
- telephony;
- live copilot.

## Important

Realtime sessions differ from one-shot text runs: the session stays live and continuously handles events, tools, and interruptions.
