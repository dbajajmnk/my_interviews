# Ordering, Idempotency and Duplicates

## Why

Reconnect/replay can cause event duplication.

## Controls

- event_id;
- sequence;
- dedupe cache;
- idempotent client handlers.

## Ordering

If concurrent tools emit events, define whether ordering is:
- global;
- per-run;
- per-tool/span.

## Rule

Design streaming consumers to tolerate duplicate delivery.
