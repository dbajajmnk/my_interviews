# Streaming with Human-in-the-Loop

## Flow

```text
Run streaming
   ↓
ApprovalRequired
   ↓
stream pauses/settles
   ↓
Human approves/rejects
   ↓
run resumes
   ↓
stream continues
```

## Important

Approval is a workflow state, not a new unrelated user turn.

## Design

Persist:
- run state;
- interruption ID;
- requested action;
- approval decision;
- resume token/checkpoint.
