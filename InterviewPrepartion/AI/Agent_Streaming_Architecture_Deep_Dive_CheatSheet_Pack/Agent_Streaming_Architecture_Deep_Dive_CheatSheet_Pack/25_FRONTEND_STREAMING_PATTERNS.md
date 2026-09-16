# Frontend Streaming Patterns

## UI State

Model UI as explicit phases:
- connecting;
- thinking/processing;
- tool activity;
- waiting approval;
- streaming answer;
- completed;
- failed.

## Rendering

Avoid directly rendering every raw event. Map runtime events into stable UI events/view models.

## Cancellation

Provide a cancel button only if backend semantics are well defined.
