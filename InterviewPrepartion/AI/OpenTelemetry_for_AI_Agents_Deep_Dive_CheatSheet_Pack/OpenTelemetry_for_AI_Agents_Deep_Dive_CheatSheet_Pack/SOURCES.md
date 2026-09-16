# Verified Source Notes

## OpenTelemetry

Verified against current OpenTelemetry documentation:
- Semantic Conventions provide common naming across traces, metrics, logs, profiles and resources.
- OpenTelemetry GenAI observability conventions standardize GenAI operations and token-related telemetry.
- The GenAI conventions remain actively evolving; official Microsoft Foundry documentation currently calls their status Development.

## OpenAI Agents SDK

Verified against current OpenAI Agents SDK tracing documentation:
- built-in workflow traces;
- task/turn/agent/generation/function/guardrail/handoff spans;
- custom spans;
- trace processors;
- grouping and metadata.

## Microsoft Agent Framework

Verified against current Microsoft Agent Framework documentation:
- framework/workflow OpenTelemetry observability;
- workflow-specific spans/logs/metrics;
- DevUI trace visualization;
- OTLP endpoint integration.

## Microsoft Foundry

Verified against current Microsoft Foundry observability documentation:
- traces stored in Azure Monitor Application Insights;
- OpenTelemetry semantic conventions;
- server-side and client-side tracing;
- tool, token, latency, retrieval and retry visibility;
- privacy/redaction guidance.

## Currency Note

Exact GenAI semantic-convention names, stability levels, framework span names and instrumentation switches can evolve. Verify the currently published specification/version before production implementation.
