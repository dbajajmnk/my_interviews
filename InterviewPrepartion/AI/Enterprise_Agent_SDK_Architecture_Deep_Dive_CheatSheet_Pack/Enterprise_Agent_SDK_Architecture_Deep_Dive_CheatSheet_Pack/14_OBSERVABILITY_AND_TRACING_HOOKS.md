# Observability and Tracing Hooks

## Built-In Telemetry

The SDK should emit hooks/events for:
- run;
- model invocation;
- tool call;
- retrieval;
- policy check;
- retries;
- errors;
- token usage;
- latency.

## Trace Shape

```text
Agent Run Span
 ├─ Context Build
 ├─ Model Call
 ├─ Retrieval
 ├─ Tool Call
 ├─ Policy Check
 └─ Finalization
```

## Correlation

Every run should have:
- run ID;
- trace ID;
- optional conversation/session ID;
- tool call ID.

## Privacy

Do not blindly log prompts, secrets, or sensitive tool payloads. Support redaction and configurable capture.
