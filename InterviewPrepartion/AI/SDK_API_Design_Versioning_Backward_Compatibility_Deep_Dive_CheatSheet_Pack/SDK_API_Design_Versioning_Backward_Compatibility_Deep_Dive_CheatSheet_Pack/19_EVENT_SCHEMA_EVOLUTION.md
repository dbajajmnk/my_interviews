# Event Schema Evolution

## Rules

- stable event type names;
- additive fields;
- unknown-event tolerance;
- event version metadata when needed.

## Rule

Consumers must be able to ignore fields they do not understand.
