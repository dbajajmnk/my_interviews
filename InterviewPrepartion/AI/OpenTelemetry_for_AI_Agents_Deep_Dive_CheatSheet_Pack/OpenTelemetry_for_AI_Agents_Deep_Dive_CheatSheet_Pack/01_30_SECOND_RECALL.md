# OpenTelemetry for AI Agents — 30-Second Recall

## Recall

```text
Observability =
Traces + Metrics + Logs + Events

Agent Trace =
Run
 → Agent/Turn
   → Model
   → Tool
   → Retrieval
   → Memory
   → Guardrail
   → Handoff
```

## 30-Second Interview Answer

> I instrument an agent as one end-to-end distributed trace, then create child spans for model calls, tool executions, retrieval, memory, handoffs, guardrails and workflow steps. I propagate W3C trace context across services, export through OTLP to an OpenTelemetry Collector, correlate logs and metrics using trace and span IDs, track token usage, latency, retries and cost, and redact sensitive prompts, tool arguments and results before telemetry leaves the application boundary.

## Do Not Forget

- Trace = end-to-end request/workflow.
- Span = one operation.
- Metrics answer “how much/how often.”
- Logs provide detailed records.
- OTLP transports telemetry.
- Collector receives/processes/exports.
- Sensitive prompt/tool content should be opt-in and redacted.
