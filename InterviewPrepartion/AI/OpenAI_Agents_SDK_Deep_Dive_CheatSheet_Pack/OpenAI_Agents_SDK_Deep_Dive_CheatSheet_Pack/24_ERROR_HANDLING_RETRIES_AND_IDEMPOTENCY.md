# Error Handling, Retries and Idempotency

## Failure Types

- model/provider failure;
- rate limit;
- validation failure;
- tool exception;
- approval rejection;
- guardrail trip;
- streaming disconnect.

## Retry Policy

Retry transient failures only and cap attempts.

## Write Safety

Before retrying a write tool, require idempotency or deduplication.

## Agent-Level Recovery

Recovery strategies may include:
- tool-level retry;
- alternate tool/provider;
- handoff;
- human escalation;
- final controlled failure.
