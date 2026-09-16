# Streaming Observability

## Measure

- time to first event;
- time to first token;
- stream duration;
- cancellations;
- disconnects;
- completion status.

## Trace

Streaming does not require one span per token. Use meaningful spans/events and metrics.

## Rule

Avoid telemetry explosion from token-level logging.
