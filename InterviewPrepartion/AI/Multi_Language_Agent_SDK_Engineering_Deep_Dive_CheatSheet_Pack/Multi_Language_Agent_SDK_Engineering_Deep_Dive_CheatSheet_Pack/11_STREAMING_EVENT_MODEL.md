# Streaming Event Model

## Canonical Events

- run.started;
- model.delta;
- tool.started;
- tool.completed;
- handoff;
- approval.requested;
- run.completed;
- run.failed.

## Rule

Normalize semantic events; do not leak raw provider stream packets into the public API.
