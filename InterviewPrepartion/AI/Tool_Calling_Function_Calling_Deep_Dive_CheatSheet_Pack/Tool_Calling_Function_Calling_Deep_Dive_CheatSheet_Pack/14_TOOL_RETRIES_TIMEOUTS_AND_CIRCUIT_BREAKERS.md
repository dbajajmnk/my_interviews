# Retries, Timeouts and Circuit Breakers

## Timeouts

Every external tool should have a bounded execution time.

## Retries

Retry only transient failures:
- network issues;
- temporary 5xx;
- rate limits.

## Circuit Breaker

Stop hammering a failing dependency after repeated failures.

## Rule

Retry policy belongs to the tool/integration layer, not to unconstrained model improvisation.
