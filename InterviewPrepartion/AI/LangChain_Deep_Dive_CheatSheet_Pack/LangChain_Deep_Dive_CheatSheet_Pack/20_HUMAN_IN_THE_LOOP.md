# Human in the Loop

## Purpose

Use human approval for sensitive or uncertain actions.

## Pattern

```text
Agent proposes
 ↓
Pause/checkpoint
 ↓
Human review
 ├─ approve
 ├─ reject
 └─ edit
 ↓
Resume
```

## Good Use Cases

- payments;
- deletion;
- external communication;
- production change;
- legal/compliance action.

## Interview Point

> HITL should be an explicit runtime state, not an informal manual process outside the workflow.
