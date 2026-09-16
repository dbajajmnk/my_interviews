# OpenTelemetry — 60-Second Recall

## Formula

```text
One User Goal = One Correlated Trace
```

## 60-Second Answer

> I trace the full agent run and create semantic child spans for model calls, tools, retrieval, memory, guardrails, and handoffs. W3C trace context propagates across services, telemetry flows via OTLP through a collector, and metrics track tokens, latency, cost, retries, and failures.

## Recall Points

- Trace = causality.
- Span = operation.
- Metrics = aggregates.
- Redact sensitive content.
