# Distributed Tracing

## Trace

One end-to-end request.

```text
Trace
 ├── Span Gateway
 ├── Span Order
 ├── Span Payment
 └── Span DB
```

## Key Data

```text
traceId
spanId
parentSpan
duration
status
attributes
```

## Uses

- latency diagnosis
- dependency map
- failure localization

## Trap

Tracing every detail at 100% sampling can be expensive.
