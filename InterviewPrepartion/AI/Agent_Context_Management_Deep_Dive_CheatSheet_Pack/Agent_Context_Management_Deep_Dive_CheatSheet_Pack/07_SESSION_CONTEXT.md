# Session Context

## Definition

A session groups related interactions across multiple agent runs.

## Session Key

Typical identifier:
```text
session_id / conversation_id / thread_id
```

## Production Questions

- who owns the session?
- how long is it retained?
- can it be resumed?
- is it tenant-scoped?
- can it be deleted?

## Rule

Do not use process-local session memory when the system must scale horizontally or survive restarts.
