# Human in the Loop

## Workflow HITL

Executors can request information or approval from outside the workflow and wait for a response.

## Pattern

```text
Agent / Executor
      ↓
Request external input
      ↓
Workflow pauses
      ↓
Human / system response
      ↓
Resume
```

## Use Cases

- payment approval;
- destructive action;
- compliance review;
- content review;
- missing business input.

## Interview Point

> HITL should be a modeled workflow state with persisted recovery, not a manual side channel.
