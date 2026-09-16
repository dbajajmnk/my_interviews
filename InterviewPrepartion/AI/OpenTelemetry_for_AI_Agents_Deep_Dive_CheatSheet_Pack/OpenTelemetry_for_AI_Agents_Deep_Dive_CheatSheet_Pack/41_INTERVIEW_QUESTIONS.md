# OpenTelemetry for AI Agents — Interview Q&A

## 1. What is OpenTelemetry?

A vendor-neutral framework for generating, processing and exporting observability telemetry.

## 2. Trace vs span?

Trace is the end-to-end operation; spans are timed operations inside it.

## 3. How would you trace an agent?

Root agent/workflow span with child model, tool, retrieval, memory, guardrail and handoff spans.

## 4. What is OTLP?

The protocol commonly used to transport OpenTelemetry telemetry.

## 5. What does an OTel Collector do?

Receives, processes and exports telemetry.

## 6. Why W3C Trace Context?

To propagate trace identity across distributed service boundaries.

## 7. What GenAI data do you capture?

Model/provider, operation, latency, token usage, status and safe correlation metadata; sensitive content only under policy.

## 8. Why not log every prompt?

Privacy, security, retention, cost and compliance risk.

## 9. How do you monitor cost?

Aggregate token/model usage and derive cost/run and cost/successful task.

## 10. How do you trace tools?

Dedicated tool spans with name, duration, outcome, retries and safe metadata.

## 11. How do you observe RAG?

Retrieval and reranking spans plus result counts, filters, latency and provenance metadata.

## 12. What is sampling?

Selecting which traces to retain/export to control telemetry volume and cost.

## 13. Head vs tail sampling?

Head sampling decides early; tail sampling can decide after seeing outcome/latency/error.

## 14. How do you debug a bad agent answer?

Use evaluation/result to identify failure, then inspect trace path across model, retrieval, tools and orchestration.

## 15. One-line principle?

> One user goal should be traceable across every agentic operation that contributed to its outcome.
