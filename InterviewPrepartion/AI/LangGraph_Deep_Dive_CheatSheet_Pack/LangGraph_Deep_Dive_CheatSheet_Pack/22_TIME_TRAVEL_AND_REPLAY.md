# Time Travel and Replay

## What

Checkpoint history allows earlier graph states to be inspected and reused.

## Use Cases

- debugging;
- branch from historical state;
- replay;
- experimentation;
- recovery.

## Mental Model

```text
checkpoint 1 → checkpoint 2 → checkpoint 3
                    │
                    └── fork / replay
```

## Caution

Replaying a workflow with side-effecting nodes can duplicate actions unless those actions are idempotent or protected.
