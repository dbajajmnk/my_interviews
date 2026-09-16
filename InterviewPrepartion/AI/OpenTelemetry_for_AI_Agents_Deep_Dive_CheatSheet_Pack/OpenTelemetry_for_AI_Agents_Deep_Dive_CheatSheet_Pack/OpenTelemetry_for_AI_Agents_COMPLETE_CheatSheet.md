# OpenTelemetry for AI Agents — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
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


---

<!-- Source: 01_30_SECOND_RECALL.md -->
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


---

<!-- Source: 02_WHAT_IS_OBSERVABILITY.md -->
# What Is Observability?

## Definition

Observability is the ability to understand a system's internal behavior from emitted telemetry.

## Three Questions

An agent platform must help answer:
1. What happened?
2. Where did time/cost/failure occur?
3. Why did the final behavior emerge?

## Agent-Specific Challenge

A single user request may create many nested operations:
- several model calls;
- retrieval;
- multiple tools;
- retries;
- handoffs;
- memory operations.


---

<!-- Source: 03_OPENTELEMETRY_FOUNDATIONS.md -->
# OpenTelemetry Foundations

## What

OpenTelemetry is a vendor-neutral observability framework for producing, collecting and exporting telemetry.

## Signals

- traces;
- metrics;
- logs;
- events/profiles depending on ecosystem support.

## Architecture

```text
Application
 ↓
OTel API/SDK
 ↓
Processor
 ↓
Exporter
 ↓
Collector
 ↓
Backend
```


---

<!-- Source: 04_TRACES_SPANS_METRICS_LOGS_EVENTS.md -->
# Traces, Spans, Metrics, Logs and Events

## Trace

End-to-end operation.

## Span

Timed operation within a trace.

## Metric

Aggregated numeric measurement over time.

## Log

Detailed event/message record.

## Span Event

Point-in-time event attached to a span.

## Rule

Use the right signal rather than putting everything into logs.


---

<!-- Source: 05_TRACE_AND_SPAN_HIERARCHY.md -->
# Trace and Span Hierarchy

## Example

```text
support_agent_request
 ├─ invoke_agent
 │   ├─ model_call
 │   ├─ retrieve_kb
 │   ├─ execute_tool
 │   └─ model_call
 └─ persist_session
```

## Why Hierarchy Matters

It reveals:
- ownership;
- timing;
- nesting;
- dependencies;
- failure origin.


---

<!-- Source: 06_SPAN_CONTEXT_AND_PARENT_CHILD_RELATIONSHIPS.md -->
# Span Context and Parent/Child Relationships

## Span Context

Carries trace identity across operations.

## Parent/Child

A child span represents work causally inside another operation.

## Links

Span links are useful when work is related but not naturally parent-child, such as asynchronous fan-in/fan-out or event processing.

## Rule

Represent actual causality rather than forcing every relationship into nesting.


---

<!-- Source: 07_W3C_TRACE_CONTEXT.md -->
# W3C Trace Context

## Purpose

Standard propagation format for distributed trace identity.

## Common Headers

- `traceparent`
- `tracestate`

## Agent Example

```text
API → Agent Runtime → Tool Service → Database
       same distributed trace context
```

## Rule

Propagate trace context across every network boundary you control.


---

<!-- Source: 08_BAGGAGE.md -->
# OpenTelemetry Baggage

## What

Baggage propagates key/value context across service boundaries.

## Possible Uses

- workflow correlation;
- non-sensitive routing metadata.

## Caution

Baggage can travel broadly. Do not put secrets or unnecessary PII into it.


---

<!-- Source: 09_RESOURCE_ATTRIBUTES.md -->
# Resource Attributes

## Purpose

Describe the entity producing telemetry.

## Examples

- service.name;
- service.version;
- deployment.environment;
- cloud/container metadata.

## Agent SDK Use

Add SDK/runtime version so traces can be correlated with releases.


---

<!-- Source: 10_OTLP_AND_EXPORTERS.md -->
# OTLP and Exporters

## OTLP

OpenTelemetry Protocol transports telemetry between SDKs, collectors and compatible backends.

## Exporters

Exporters send telemetry to:
- OTLP collector;
- console;
- vendor-specific destinations.

## Rule

Prefer an OTLP boundary so application code is less coupled to a single observability vendor.


---

<!-- Source: 11_OPENTELEMETRY_COLLECTOR.md -->
# OpenTelemetry Collector

## Role

A collector receives, processes and exports telemetry.

## Pipeline

```text
Receivers
  ↓
Processors
  ↓
Exporters
```

## Processors

Can perform:
- batching;
- sampling;
- attribute filtering;
- redaction;
- routing.

## Rule

Centralize telemetry processing policy where practical.


---

<!-- Source: 12_INSTRUMENTATION_AUTO_VS_MANUAL.md -->
# Auto vs Manual Instrumentation

## Auto

Useful for standard libraries:
- HTTP;
- database;
- runtime;
- framework calls.

## Manual

Required for domain semantics:
- agent run;
- planning;
- tool invocation;
- approval;
- memory write;
- custom orchestration.

## Rule

Auto-instrument infrastructure; manually instrument the agent semantics the runtime uniquely understands.


---

<!-- Source: 13_GENAI_SEMANTIC_CONVENTIONS.md -->
# GenAI Semantic Conventions

## Purpose

OpenTelemetry GenAI semantic conventions standardize naming for generative AI operations, attributes, metrics and events.

## Important Status

The GenAI conventions are actively evolving and are currently documented with Development status.

## Design Consequence

Create an internal telemetry abstraction so semantic-convention changes do not leak across the whole SDK.

## Benefit

Standard naming improves cross-provider and cross-language observability.


---

<!-- Source: 14_AGENT_RUN_SPANS.md -->
# Agent Run Spans

## Recommended Root

Represent one logical agent invocation/workflow as the root or major parent span.

## Attributes

Useful metadata:
- agent name/version;
- run ID;
- workflow;
- tenant-safe correlation;
- status.

## Rule

Do not attach secrets or raw user identity unnecessarily.


---

<!-- Source: 15_MODEL_CALL_SPANS.md -->
# Model Call Spans

## Capture

- provider/system;
- model;
- operation;
- latency;
- token usage;
- status/error.

## Optional Sensitive Data

Prompt/completion content should follow explicit telemetry policy.

## Rule

Model spans should make it easy to separate model latency from tool/runtime latency.


---

<!-- Source: 16_TOOL_EXECUTION_SPANS.md -->
# Tool Execution Spans

## Capture

- tool name;
- call ID;
- duration;
- status;
- retry count;
- authorization/approval outcome.

## Arguments/Results

Only capture when policy permits, and redact sensitive values.

## Rule

Tool execution should be visible as its own operation, not hidden inside the model span.


---

<!-- Source: 17_RETRIEVAL_RAG_SPANS.md -->
# Retrieval / RAG Spans

## Capture

- retriever/index;
- query class;
- top-k;
- filters;
- latency;
- result count;
- reranker latency.

## Avoid

Do not dump whole confidential document chunks into span attributes by default.

## Benefit

Separates retrieval failure from generation failure.


---

<!-- Source: 18_MEMORY_OPERATION_SPANS.md -->
# Memory Operation Spans

## Operations

- create_memory;
- search_memory;
- update_memory;
- upsert_memory;
- delete_memory.

## Capture

- memory namespace/type;
- latency;
- item count;
- success/failure.

## Privacy

Memory contents may be highly sensitive; capture metadata by default, content only by explicit policy.


---

<!-- Source: 19_WORKFLOW_ORCHESTRATION_SPANS.md -->
# Workflow and Orchestration Spans

## Use

Represent:
- plan;
- invoke_workflow;
- executor step;
- router;
- aggregation.

## Goal

Trace control flow as well as model calls.

## Rule

The orchestration trace should let an engineer reconstruct the path taken.


---

<!-- Source: 20_MULTI_AGENT_TRACE_HIERARCHY.md -->
# Multi-Agent Trace Hierarchy

## Pattern

```text
invoke_workflow
 └─ invoke_agent(supervisor)
     ├─ invoke_agent(researcher)
     │   └─ model/tool...
     └─ invoke_agent(writer)
         └─ model...
```

## Correlation

Keep one end-to-end trace while preserving agent-specific child spans.

## Rule

Agent identity must be explicit in telemetry when multiple agents participate.


---

<!-- Source: 21_GUARDRAIL_AND_POLICY_SPANS.md -->
# Guardrail and Policy Spans

## Capture

- policy/guardrail name;
- allow/deny;
- latency;
- reason code;
- severity.

## Privacy

Prefer normalized decision metadata over storing sensitive raw content.

## Benefit

Makes safety/policy latency and false positives diagnosable.


---

<!-- Source: 22_HITL_AND_APPROVAL_TELEMETRY.md -->
# HITL and Approval Telemetry

## Events

- approval.requested;
- approval.approved;
- approval.rejected;
- approval.resumed.

## Metrics

- approval rate;
- wait duration;
- unnecessary escalation rate.

## Rule

Do not record confidential approval comments without explicit need.


---

<!-- Source: 23_STREAMING_OBSERVABILITY.md -->
# Streaming Observability

## Measure

- time to first event;
- time to first token;
- stream duration;
- cancellations;
- disconnects;
- completion status.

## Trace

Streaming does not require one span per token. Use meaningful spans/events and metrics.

## Rule

Avoid telemetry explosion from token-level logging.


---

<!-- Source: 24_TOKEN_USAGE_METRICS.md -->
# Token Usage Metrics

## Track

- input tokens;
- output tokens;
- cached input tokens where available;
- tokens by model/agent/workflow.

## Uses

- capacity;
- cost;
- regression;
- prompt/context optimization.

## Rule

Token metrics should be aggregated; avoid high-cardinality dimensions.


---

<!-- Source: 25_COST_METRICS.md -->
# Cost Metrics

## Useful Metrics

- cost/run;
- cost/successful task;
- cost/tool path;
- cost/tenant/workflow.

## Caution

Price changes over time; keep pricing/version assumptions outside raw trace semantics.

## Rule

Cost per successful task is a better business measure than tokens alone.


---

<!-- Source: 26_LATENCY_AND_PERFORMANCE_METRICS.md -->
# Latency and Performance Metrics

## Measure

- end-to-end latency;
- model latency;
- tool latency;
- retrieval latency;
- p50/p95/p99;
- queue/wait time.

## Diagnosis

A trace lets you answer whether the bottleneck was model, tool, retrieval, orchestration or network.


---

<!-- Source: 27_ERROR_RETRY_AND_FAILURE_TELEMETRY.md -->
# Error, Retry and Failure Telemetry

## Capture

- error type;
- operation;
- status;
- retry attempt;
- fallback used;
- terminal outcome.

## Rule

Record errors in normalized attributes/events; do not blindly attach raw stack/context containing secrets.


---

<!-- Source: 28_LOG_CORRELATION.md -->
# Log Correlation

## Pattern

Include trace ID/span ID in logs so engineers can move from a log line to the full distributed trace.

## Rule

Logs explain details; traces explain causality.


---

<!-- Source: 29_METRIC_DESIGN.md -->
# Metric Design

## Good Metrics

- agent runs;
- task success proxy;
- model calls/run;
- tool calls/run;
- error rate;
- retry rate;
- latency;
- token use;
- cost.

## Cardinality

Avoid labels such as raw prompt, user text, document IDs at massive cardinality.

## Rule

Metrics must remain aggregatable and operationally affordable.


---

<!-- Source: 30_SAMPLING_STRATEGIES.md -->
# Sampling Strategies

## Why

Tracing every production request can become expensive.

## Approaches

- head sampling;
- tail sampling;
- error-biased sampling;
- latency-biased sampling;
- workflow-specific rates.

## Agent Pattern

Keep:
- all failures;
- unusually expensive runs;
- long-latency traces;
- representative successful samples.


---

<!-- Source: 31_PRIVACY_PII_AND_REDACTION.md -->
# Privacy, PII and Redaction

## Sensitive Sources

- prompts;
- completions;
- tool args;
- tool results;
- retrieved docs;
- memory values.

## Controls

- default metadata-only;
- field allowlists;
- redaction;
- hashing/pseudonymization;
- retention limits;
- RBAC.

## Rule

Telemetry is production data and deserves production security.


---

<!-- Source: 32_PROMPT_AND_COMPLETION_CAPTURE_POLICY.md -->
# Prompt and Completion Capture Policy

## Default Recommendation

Capture model metadata and usage by default; make raw prompt/completion capture opt-in according to environment and data policy.

## Environment

Development can allow richer capture than production.

## Rule

Observability value must be balanced against privacy, compliance and cost.


---

<!-- Source: 33_TRACE_BASED_DEBUGGING.md -->
# Trace-Based Debugging

## Debug Questions

- Which agent made the bad decision?
- Which tool failed?
- Why was there a retry?
- Which retrieval returned poor evidence?
- Where was latency added?

## Method

Start at root span, follow critical path, compare input/output metadata and status at each semantic operation.


---

<!-- Source: 34_EVALUATION_TRACE_CORRELATION.md -->
# Evaluation + Trace Correlation

## Why

Evaluation says the run was bad; the trace explains where behavior diverged.

## Pattern

Store evaluation run/case IDs as safe correlation metadata.

## Benefit

Links quality metrics with operational evidence.


---

<!-- Source: 35_OPENAI_AGENTS_SDK_TRACING.md -->
# OpenAI Agents SDK Tracing

## Current Built-In Tracing

Current OpenAI Agents SDK tracing records an end-to-end workflow and nested spans.

## Python Span Types Documented

The current SDK automatically traces operations including:
- runner/task/turn;
- agent execution;
- LLM generation;
- function tools;
- guardrails;
- handoffs;
- supported audio operations.

## Trace Metadata

Traces support workflow name, trace ID, optional grouping and metadata.

## Extensibility

Custom spans and custom trace processors can be used to integrate additional destinations or application-specific operations.

## Important

OpenAI SDK tracing is its own tracing facility. When integrating into a broader enterprise OTel architecture, create a deliberate bridge/correlation strategy rather than assuming all trace formats are automatically identical.


---

<!-- Source: 36_MICROSOFT_AGENT_FRAMEWORK_OTEL.md -->
# Microsoft Agent Framework + OpenTelemetry

## Current Position

Microsoft Agent Framework emits OpenTelemetry telemetry for agents/workflows and follows GenAI semantic conventions.

## Workflow Observability

Current documentation describes workflow-specific spans, logs and metrics in addition to standard GenAI telemetry.

## DevUI

DevUI can display Agent Framework OpenTelemetry traces and can export them through an OTLP endpoint to external observability systems.

## Sensitive Data

Framework telemetry options can control whether serialized inputs/outputs are included.


---

<!-- Source: 37_MICROSOFT_FOUNDRY_TRACING.md -->
# Microsoft Foundry Tracing

## Architecture

Microsoft Foundry stores agent trace telemetry in Azure Monitor Application Insights using OpenTelemetry semantic conventions.

## Current Capabilities

Tracing can show:
- inputs/outputs;
- tool usage;
- retries;
- latency;
- token usage;
- retrieval operations.

## Server vs Client

Server-side tracing is the simplest starting point for supported hosted scenarios. Client-side OTel instrumentation adds visibility around custom application code.

## Privacy

Microsoft guidance explicitly warns that traces can include prompts, tool arguments/results and other sensitive content and recommends redaction/minimization.


---

<!-- Source: 38_MULTI_LANGUAGE_SDK_INSTRUMENTATION.md -->
# Multi-Language Agent SDK Instrumentation

## Goal

Python, Java, C# and TypeScript SDKs should emit equivalent semantic telemetry.

## Canonical Contract

Define internal concepts:
```text
AgentRun
ModelCall
ToolCall
Retrieval
MemoryOperation
Handoff
Guardrail
```
then map each language to OTel APIs idiomatically.

## Rule

Common semantics, idiomatic instrumentation.


---

<!-- Source: 39_PRODUCTION_ARCHITECTURE.md -->
# OpenTelemetry for Agents — Production Architecture

## Reference Architecture

```text
Clients
   ↓
API Gateway
   ↓
Agent Runtime ──→ Model Provider
   │  ├─────────→ Tool Services
   │  ├─────────→ Vector/DB
   │  └─────────→ Memory Service
   │
   └─ OTel SDK
        ↓ OTLP
   OTel Collector
   ├─ batch
   ├─ redact
   ├─ sample
   └─ route
        ↓
  Observability Backend
   ├─ traces
   ├─ metrics
   └─ logs
```

## Production Checklist

- W3C propagation;
- stable semantic layer;
- OTLP;
- collector;
- sampling;
- token/cost metrics;
- trace/log correlation;
- PII redaction;
- retention;
- RBAC;
- release/version attributes.


---

<!-- Source: 40_TESTING_OBSERVABILITY.md -->
# Testing Observability

## Test

- root span exists;
- child span relationships correct;
- trace context propagates;
- errors recorded;
- token metrics emitted;
- sensitive fields redacted;
- collector receives telemetry.

## Rule

Observability is part of system behavior and should have automated tests.


---

<!-- Source: 41_INTERVIEW_QUESTIONS.md -->
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


---

<!-- Source: 42_SYSTEM_DESIGN_QUESTIONS.md -->
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


---

<!-- Source: 43_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
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
