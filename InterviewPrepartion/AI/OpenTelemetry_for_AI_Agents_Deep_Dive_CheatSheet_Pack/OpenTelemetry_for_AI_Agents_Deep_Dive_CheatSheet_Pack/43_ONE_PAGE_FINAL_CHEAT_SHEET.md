# OpenTelemetry for AI Agents — One-Page Final Cheat Sheet

## Formula

```text
Agent Observability =
Traces
+ Metrics
+ Logs
+ Semantic Conventions
+ Context Propagation
+ Sampling
+ Privacy
```

## Trace Recall

```text
Agent/Workflow
 ├─ Model
 ├─ Tool
 ├─ Retrieval
 ├─ Memory
 ├─ Guardrail
 ├─ Handoff
 └─ Finalize
```

## Production Rules

1. Trace one user goal end to end.
2. Give model/tool/retrieval operations separate spans.
3. Propagate W3C trace context.
4. Prefer OTLP and a collector boundary.
5. Track latency, tokens, retries and cost.
6. Correlate logs with trace/span IDs.
7. Avoid high-cardinality metric labels.
8. Sample intelligently.
9. Redact PII/secrets before export.
10. Treat GenAI semantic conventions as evolving and isolate their mapping.

## 30-Second Answer

> I model every agent request as a distributed trace and create semantic child spans for agent turns, model generations, tools, retrieval, memory, guardrails and handoffs. Trace context propagates across services through W3C standards, telemetry is exported over OTLP through a collector, and metrics track tokens, cost, latency, retries and failures. Prompt/tool content is metadata-only by default with explicit redaction and retention policies for sensitive data.

## Recall Line

> **One user goal, one correlated trace across every operation that shaped the outcome.**
