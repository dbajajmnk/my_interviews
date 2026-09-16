# Durable Execution

## Definition

Durable execution means graph progress is persisted so work can survive interruption, failure, or process restart.

## Why Important

Agents may:
- wait for humans;
- call slow tools;
- run for minutes/hours;
- experience provider failures;
- need later resumption.

## Principle

Persist state at meaningful boundaries and make side effects idempotent.

## Enterprise Recall

> Durable execution converts an agent from an ephemeral request handler into a resumable workflow.
