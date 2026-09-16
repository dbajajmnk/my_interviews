# Sampling Strategies

## Why

Tracing every production request can become expensive.

## Approaches

- head sampling;
- tail sampling;
- error-biased sampling;
- latency-biased sampling;
- workflow-specific rates.

## Agent Pattern

Keep:
- all failures;
- unusually expensive runs;
- long-latency traces;
- representative successful samples.
