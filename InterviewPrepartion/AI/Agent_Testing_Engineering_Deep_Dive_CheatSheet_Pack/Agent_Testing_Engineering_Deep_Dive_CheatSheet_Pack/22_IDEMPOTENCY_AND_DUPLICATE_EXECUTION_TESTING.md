# Idempotency and Duplicate Execution Testing

## Critical Scenario

Execute the same write twice with same idempotency key.

## Expected

One business side effect.

## Use

Especially for:
- payment;
- ticket creation;
- email/send;
- workflow resume.
