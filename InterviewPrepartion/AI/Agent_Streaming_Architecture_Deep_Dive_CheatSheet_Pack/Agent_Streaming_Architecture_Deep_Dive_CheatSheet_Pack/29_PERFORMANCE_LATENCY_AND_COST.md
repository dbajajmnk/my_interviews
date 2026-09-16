# Performance, Latency and Cost

## Latency Metrics

Measure:
- time to first event;
- time to first token;
- time to first useful semantic event;
- tool latency;
- total completion time.

## Cost

Streaming does not inherently reduce model token cost, but it improves perceived latency and allows earlier user cancellation.

## Optimization

- reduce unnecessary low-level events;
- batch non-UI telemetry;
- use connection reuse where beneficial;
- cap buffer sizes.
