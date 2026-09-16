# Streaming Structured Output

## Challenge

Partial structured data may not yet be valid or complete.

## Approaches

- stream text/progress, validate final object;
- stream field-level semantic events;
- aggregate then deserialize.

## Rule

Do not execute irreversible business actions from partial structured output.
