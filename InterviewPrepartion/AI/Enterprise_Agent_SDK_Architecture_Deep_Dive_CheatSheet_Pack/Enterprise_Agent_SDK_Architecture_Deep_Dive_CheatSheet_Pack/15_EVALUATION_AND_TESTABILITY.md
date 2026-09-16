# Evaluation and Testability

## Testing Hooks

The architecture should allow replacement of:
- model provider;
- tools;
- memory;
- retriever;
- clock;
- telemetry.

## Fake Model Example

Use a deterministic fake provider in unit tests:
```text
input A → tool_call(search)
input B → final("done")
```

## Evaluation Hooks

Capture:
- task outcome;
- selected tools;
- arguments;
- latency;
- cost;
- policy events;
- user feedback.

## Why Architecture Matters

If model/provider calls are hard-coded inside business code, testing becomes slow, expensive, and non-deterministic.
