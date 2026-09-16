# OpenTelemetry for AI Agents — System Design Questions

## Q1 — Design Observability for an Enterprise Agent Platform

Use SDK instrumentation → OTLP → collector → backend, with W3C propagation, semantic spans, metrics, sampling and redaction.

## Q2 — Trace a Multi-Agent Workflow

Root workflow span → supervisor → child agent spans → model/tool spans, preserving one trace ID.

## Q3 — Design Privacy-Safe GenAI Telemetry

Metadata by default, content allowlist/opt-in, redaction processor, RBAC, retention limits and audit.

## Q4 — Design Cost Observability

Token usage per model/span → pricing service/version → aggregate cost/run/workflow/successful task.

## Q5 — Correlate Evals with Production Traces

Attach safe evaluation/case identifiers and use trace IDs in evaluation records/dashboards.

## Answer Framework

**Signals → semantic spans → propagation → OTLP → collector → sampling/redaction → backend → SLO/eval correlation.**
