# Observability and OpenTelemetry

## Built-In Telemetry Boundary

The agent pipeline includes telemetry layers, and Agent Framework integrates with OpenTelemetry-style instrumentation.

## Observe

- agent runs;
- model calls;
- tool calls;
- workflow executor activity;
- workflow events;
- checkpoint/delivery status;
- errors;
- latency.

## Architecture

```text
Agent / Workflow
   │
   ├─ spans
   ├─ metrics
   └─ events
        ↓
OpenTelemetry
        ↓
Collector / Backend
```

## Enterprise Rule

Do not log sensitive prompts/tool payloads by default. Apply redaction and data-governance policy.
