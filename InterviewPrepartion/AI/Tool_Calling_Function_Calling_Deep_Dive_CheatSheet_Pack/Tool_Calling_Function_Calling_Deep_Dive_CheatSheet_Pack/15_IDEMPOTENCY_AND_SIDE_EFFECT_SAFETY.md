# Idempotency and Side-Effect Safety

## Problem

An agent may retry a tool call after:
- timeout;
- network failure;
- uncertain response;
- resume/replay.

## Danger

```text
charge_card()
network timeout
retry charge_card()
= duplicate charge
```

## Controls

Use:
- idempotency keys;
- deduplication;
- transaction IDs;
- write-once semantics;
- compensating transactions.

## Interview Phrase

> Any write tool that may be retried or resumed needs an idempotency story.
