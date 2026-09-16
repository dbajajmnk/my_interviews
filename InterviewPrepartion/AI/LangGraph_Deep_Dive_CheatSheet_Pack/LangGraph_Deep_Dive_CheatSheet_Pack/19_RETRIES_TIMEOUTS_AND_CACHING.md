# Retries, Timeouts and Caching

## RetryPolicy

Retry policies can be attached to nodes/tasks to handle transient failures.

## Timeouts

Timeouts bound node/task execution.

Use them to avoid:
- hung external APIs;
- runaway tools;
- stalled nodes.

## CachePolicy

Cache policies can reuse node/task results for matching inputs and optional TTL.

## Caution

Do not cache:
- security decisions;
- stale-sensitive transactional reads;
- non-deterministic results without understanding impact.

## Retry Rule

Retry only transient failures and only when side effects are safe/idempotent.
