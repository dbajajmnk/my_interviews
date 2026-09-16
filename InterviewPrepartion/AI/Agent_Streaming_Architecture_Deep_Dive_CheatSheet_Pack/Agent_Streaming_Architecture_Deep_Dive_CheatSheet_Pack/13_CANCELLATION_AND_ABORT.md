# Cancellation and Abort

## Cancellation

Cancellation should propagate:
```text
Client
 ↓
API
 ↓
Agent runtime
 ↓
model/tool/retrieval calls
```

## Modes

Possible semantics:
- immediate cancel;
- cancel after current turn;
- cancel after current safe boundary.

## Rule

Define cancellation semantics explicitly; do not leave them accidental.
