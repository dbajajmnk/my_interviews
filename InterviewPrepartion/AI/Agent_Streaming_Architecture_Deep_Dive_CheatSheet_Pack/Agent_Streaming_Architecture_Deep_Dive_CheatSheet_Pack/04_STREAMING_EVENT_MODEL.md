# Streaming Event Model

## Recommended Envelope

```json
{
  "event_id": "evt_123",
  "run_id": "run_456",
  "type": "tool.completed",
  "timestamp": "2026-09-16T10:00:00Z",
  "sequence": 17,
  "data": {}
}
```

## Core Fields

- event_id
- run_id
- type
- sequence
- timestamp
- payload/data
- optional agent/tool identifiers

## Why Sequence Matters

Useful for:
- ordering;
- deduplication;
- resume;
- replay.
