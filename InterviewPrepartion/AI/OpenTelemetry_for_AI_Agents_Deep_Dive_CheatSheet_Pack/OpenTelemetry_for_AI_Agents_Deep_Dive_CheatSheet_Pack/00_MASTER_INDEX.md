# OpenTelemetry for AI Agents — Master Index

## Purpose

This pack covers observability as the production visibility layer for AI agents and Agent SDKs.

Interview focus:
- traces, spans, metrics, logs, events;
- OpenTelemetry architecture;
- OTLP and collectors;
- W3C trace context;
- resource attributes;
- GenAI semantic conventions;
- agent, model, tool, retrieval, memory, workflow and multi-agent spans;
- token/cost/latency telemetry;
- sampling;
- context propagation;
- privacy/redaction;
- trace-based debugging;
- evaluation correlation;
- OpenAI Agents SDK;
- Microsoft Agent Framework;
- Microsoft Foundry;
- production observability architecture.

## Master Mental Model

```text
User Request
   ↓
Agent Run Span
   ├─ Agent/Turn Span
   │    ├─ Model Span
   │    ├─ Tool Span
   │    ├─ Retrieval Span
   │    ├─ Memory Span
   │    └─ Guardrail Span
   ├─ Handoff / Workflow Span
   └─ Finalization
        ↓
OpenTelemetry SDK
        ↓
OTLP Exporter
        ↓
OTel Collector
        ↓
Observability Backend
(Jaeger / Azure Monitor / Datadog / etc.)
```

## Core Principle

> If an agent can make multiple model calls, tools, retrievals, handoffs, retries and memory operations, a single application log line is not observability. You need correlated traces across the entire execution path.

## Current Standards Note

OpenTelemetry GenAI semantic conventions are actively evolving and currently carry Development status in the official specification. Build adapters around semantic-convention versions rather than hard-coding an assumption that every attribute is permanently stable.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_OBSERVABILITY.md`
3. `03_OPENTELEMETRY_FOUNDATIONS.md`
4. `04_TRACES_SPANS_METRICS_LOGS_EVENTS.md`
5. `05_TRACE_AND_SPAN_HIERARCHY.md`
6. `06_SPAN_CONTEXT_AND_PARENT_CHILD_RELATIONSHIPS.md`
7. `07_W3C_TRACE_CONTEXT.md`
8. `08_BAGGAGE.md`
9. `09_RESOURCE_ATTRIBUTES.md`
10. `10_OTLP_AND_EXPORTERS.md`
11. `11_OPENTELEMETRY_COLLECTOR.md`
12. `12_INSTRUMENTATION_AUTO_VS_MANUAL.md`
13. `13_GENAI_SEMANTIC_CONVENTIONS.md`
14. `14_AGENT_RUN_SPANS.md`
15. `15_MODEL_CALL_SPANS.md`
16. `16_TOOL_EXECUTION_SPANS.md`
17. `17_RETRIEVAL_RAG_SPANS.md`
18. `18_MEMORY_OPERATION_SPANS.md`
19. `19_WORKFLOW_ORCHESTRATION_SPANS.md`
20. `20_MULTI_AGENT_TRACE_HIERARCHY.md`
21. `21_GUARDRAIL_AND_POLICY_SPANS.md`
22. `22_HITL_AND_APPROVAL_TELEMETRY.md`
23. `23_STREAMING_OBSERVABILITY.md`
24. `24_TOKEN_USAGE_METRICS.md`
25. `25_COST_METRICS.md`
26. `26_LATENCY_AND_PERFORMANCE_METRICS.md`
27. `27_ERROR_RETRY_AND_FAILURE_TELEMETRY.md`
28. `28_LOG_CORRELATION.md`
29. `29_METRIC_DESIGN.md`
30. `30_SAMPLING_STRATEGIES.md`
31. `31_PRIVACY_PII_AND_REDACTION.md`
32. `32_PROMPT_AND_COMPLETION_CAPTURE_POLICY.md`
33. `33_TRACE_BASED_DEBUGGING.md`
34. `34_EVALUATION_TRACE_CORRELATION.md`
35. `35_OPENAI_AGENTS_SDK_TRACING.md`
36. `36_MICROSOFT_AGENT_FRAMEWORK_OTEL.md`
37. `37_MICROSOFT_FOUNDRY_TRACING.md`
38. `38_MULTI_LANGUAGE_SDK_INSTRUMENTATION.md`
39. `39_PRODUCTION_ARCHITECTURE.md`
40. `40_TESTING_OBSERVABILITY.md`
41. `41_INTERVIEW_QUESTIONS.md`
42. `42_SYSTEM_DESIGN_QUESTIONS.md`
43. `43_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Foundation:** 01 → 13  
**Agent telemetry model:** 14 → 23  
**Metrics/reliability/privacy:** 24 → 34  
**Framework mapping:** 35 → 38  
**Production/interview:** 39 → 43
