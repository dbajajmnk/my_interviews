# Workflow Checkpoints and Resume

## Purpose

Checkpointing saves workflow progress so execution can resume after a pause or failure.

## Why

Useful for:
- long-running workflows;
- human approval waits;
- transient failures;
- restart recovery.

## Production Rule

Checkpoint storage should be durable and external to the application process for production.

## Idempotency

Resume/retry paths must protect side effects from duplicate execution.
