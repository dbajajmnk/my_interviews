# Agent Testing Engineering — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# Agent Testing Engineering — Master Index

## Purpose

This pack covers testing as the engineering discipline that makes agent systems repeatable, debuggable, and release-safe.

Interview focus:
- unit vs integration vs end-to-end testing;
- deterministic fake models;
- fake tools and retrievers;
- contract testing;
- graph/workflow testing;
- state-transition testing;
- streaming testing;
- HITL testing;
- tool failure injection;
- retry/idempotency tests;
- memory/RAG testing;
- prompt/version regression;
- security/adversarial testing;
- CI/CD test pyramids;
- production confidence.

## Master Mental Model

```text
                    Agent System
                         │
        ┌────────────────┼────────────────┐
        ▼                ▼                ▼
   Deterministic      Probabilistic     Integration
      Logic              Logic            Boundaries
        │                │                │
        ▼                ▼                ▼
 Unit / Contract    Eval / Golden Set   Integration / E2E
        │                │                │
        └────────────────┼────────────────┘
                         ▼
                    CI Release Gate
```

## Core Principle

> Test deterministic behavior deterministically, test model behavior statistically, and test integration boundaries explicitly.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_AGENT_TESTING.md`
3. `03_TEST_PYRAMID_FOR_AGENT_SYSTEMS.md`
4. `04_UNIT_TESTING_AGENT_LOGIC.md`
5. `05_FAKE_MODEL_PATTERN.md`
6. `06_SCRIPTED_MODEL_RESPONSES.md`
7. `07_FAKE_TOOL_PATTERN.md`
8. `08_TOOL_CONTRACT_TESTING.md`
9. `09_RETRIEVER_TESTING.md`
10. `10_RAG_PIPELINE_TESTING.md`
11. `11_MEMORY_TESTING.md`
12. `12_CONTEXT_ASSEMBLY_TESTING.md`
13. `13_STRUCTURED_OUTPUT_TESTING.md`
14. `14_TOOL_CALL_TESTING.md`
15. `15_STATE_TRANSITION_TESTING.md`
16. `16_LANGGRAPH_WORKFLOW_TESTING.md`
17. `17_ORCHESTRATION_TESTING.md`
18. `18_MULTI_AGENT_TESTING.md`
19. `19_STREAMING_TESTING.md`
20. `20_HITL_TESTING.md`
21. `21_RETRY_TIMEOUT_AND_CIRCUIT_BREAKER_TESTING.md`
22. `22_IDEMPOTENCY_AND_DUPLICATE_EXECUTION_TESTING.md`
23. `23_FAILURE_INJECTION.md`
24. `24_CHAOS_AND_RESILIENCE_TESTING.md`
25. `25_SECURITY_AND_PROMPT_INJECTION_TESTING.md`
26. `26_AUTHORIZATION_AND_TENANT_ISOLATION_TESTING.md`
27. `27_PROMPT_AND_MODEL_REGRESSION_TESTING.md`
28. `28_GOLDEN_DATASET_TESTING.md`
29. `29_PROPERTY_BASED_AND_FUZZ_TESTING.md`
30. `30_PERFORMANCE_AND_LOAD_TESTING.md`
31. `31_COST_BUDGET_TESTING.md`
32. `32_OBSERVABILITY_AND_TRACE_ASSERTIONS.md`
33. `33_CI_CD_TEST_GATES.md`
34. `34_TEST_ENVIRONMENTS_AND_FIXTURES.md`
35. `35_PYTHON_REFERENCE_TESTS.md`
36. `36_JAVA_REFERENCE_TESTS.md`
37. `37_TYPESCRIPT_REFERENCE_TESTS.md`
38. `38_CSHARP_REFERENCE_TESTS.md`
39. `39_PRODUCTION_VALIDATION_AND_CANARY.md`
40. `40_INTERVIEW_QUESTIONS.md`
41. `41_SYSTEM_DESIGN_QUESTIONS.md`
42. `42_TESTING_CHECKLIST.md`
43. `43_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Foundation:** 01 → 14  
**Workflow/runtime testing:** 15 → 24  
**Security/regression/performance:** 25 → 34  
**Language implementation:** 35 → 38  
**Production/interview:** 39 → 43


---

<!-- Source: 01_30_SECOND_RECALL.md -->
# Agent Testing — 30-Second Recall

## Recall

```text
Agent Testing =
Deterministic Tests
+ Fake Models
+ Fake Tools
+ Contract Tests
+ Workflow Tests
+ Eval Cases
+ Failure Injection
+ Security Tests
+ Performance Tests
+ CI Gates
```

## 30-Second Interview Answer

> I test agent systems in layers. Deterministic code such as routing, state transitions, auth, and tool handlers gets normal unit and contract tests. Model-dependent behavior uses scripted fake models and golden evaluation cases. I test tool calls, retrieval, memory, streaming, HITL, retries, and orchestration explicitly, inject failures to verify resilience, and enforce critical regression, safety, latency, and cost thresholds in CI before release.

## Do Not Forget

- Do not hit a real LLM in every unit test.
- Fake models should produce deterministic tool calls/events.
- Test traces and state transitions, not only final text.
- Retry tests must include idempotency.
- Security and tenant-isolation tests are mandatory.


---

<!-- Source: 02_WHAT_IS_AGENT_TESTING.md -->
# What Is Agent Testing?

## Definition

Agent testing verifies the behavior of the complete agent system: model interaction, tools, state, retrieval, memory, orchestration, safety, streaming, and integrations.

## Why Harder Than Normal Testing

Agent systems combine:
- deterministic code;
- probabilistic models;
- distributed services;
- asynchronous execution;
- changing prompts/models.

## Rule

Separate deterministic and probabilistic concerns so the test suite remains fast and diagnosable.


---

<!-- Source: 03_TEST_PYRAMID_FOR_AGENT_SYSTEMS.md -->
# Test Pyramid for Agent Systems

## Pyramid

```text
                Production / Canary
                      ▲
                    E2E
                  Integration
            Eval / Golden Regression
          Contract / Workflow Tests
               Unit Tests
```

## Principle

Most tests should be cheap and deterministic. Real-model and end-to-end tests should be fewer but high value.


---

<!-- Source: 04_UNIT_TESTING_AGENT_LOGIC.md -->
# Unit Testing Agent Logic

## Unit-Test

- routers;
- validators;
- policies;
- tool handlers;
- context builders;
- memory policies;
- state reducers;
- termination conditions.

## Avoid

Do not make unit tests depend on network model APIs.


---

<!-- Source: 05_FAKE_MODEL_PATTERN.md -->
# Fake Model Pattern

## Purpose

Replace live model behavior with deterministic scripted outputs.

## Fake Model Can Emit

- final text;
- structured output;
- tool call;
- handoff;
- malformed response;
- refusal;
- timeout/error.

## Benefit

Fast, repeatable tests of the runtime loop.


---

<!-- Source: 06_SCRIPTED_MODEL_RESPONSES.md -->
# Scripted Model Responses

## Pattern

```text
Call 1 → tool_call(search, {"q":"x"})
Call 2 → final("done")
```

## Use

Verify:
- loop sequencing;
- tool execution;
- state update;
- finalization.

## Rule

Script the smallest response sequence needed for the behavior under test.


---

<!-- Source: 07_FAKE_TOOL_PATTERN.md -->
# Fake Tool Pattern

## Purpose

Use deterministic tool doubles instead of real external systems.

## Modes

Fake tool may:
- return success;
- return known data;
- throw timeout;
- throw authorization error;
- return malformed payload.

## Rule

Make tool fakes controllable per test case.


---

<!-- Source: 08_TOOL_CONTRACT_TESTING.md -->
# Tool Contract Testing

## Verify

- input schema;
- required fields;
- output shape;
- errors;
- auth behavior;
- backward compatibility.

## Rule

Tool schema and actual implementation must never drift.


---

<!-- Source: 09_RETRIEVER_TESTING.md -->
# Retriever Testing

## Test

- query normalization;
- metadata filters;
- tenant filters;
- top-k behavior;
- empty results;
- stale docs;
- exact-match cases.

## Rule

Test retrieval independently of answer generation.


---

<!-- Source: 10_RAG_PIPELINE_TESTING.md -->
# RAG Pipeline Testing

## Layers

- ingestion;
- chunking;
- indexing;
- retrieval;
- reranking;
- context assembly;
- grounded answer.

## Test Dataset

Maintain known questions with expected supporting documents.


---

<!-- Source: 11_MEMORY_TESTING.md -->
# Memory Testing

## Test

- write policy;
- read policy;
- recall;
- update;
- conflict;
- expiry;
- delete;
- tenant isolation.

## Critical

Verify forgotten/deleted memory no longer influences later runs.


---

<!-- Source: 12_CONTEXT_ASSEMBLY_TESTING.md -->
# Context Assembly Testing

## Test

- relevant sources included;
- irrelevant sources excluded;
- token budget respected;
- secrets excluded;
- stale context handled;
- user/tenant scope enforced.


---

<!-- Source: 13_STRUCTURED_OUTPUT_TESTING.md -->
# Structured Output Testing

## Test

- valid schema;
- malformed response;
- missing fields;
- invalid enum;
- semantic invalidity;
- refusal;
- incomplete generation.

## Rule

Schema-valid output still requires business-rule tests.


---

<!-- Source: 14_TOOL_CALL_TESTING.md -->
# Tool Call Testing

## Assert

- expected tool name;
- expected arguments;
- no unnecessary tool;
- approval when required;
- error recovery.

## Metric

Tool selection and argument correctness can be evaluated independently.


---

<!-- Source: 15_STATE_TRANSITION_TESTING.md -->
# State Transition Testing

## Pattern

```text
NEW
 ↓
VALIDATED
 ↓
APPROVAL
 ↓
EXECUTING
 ↓
DONE
```

## Test

- allowed transitions;
- denied transitions;
- replay;
- resume;
- terminal states.


---

<!-- Source: 16_LANGGRAPH_WORKFLOW_TESTING.md -->
# LangGraph / Graph Workflow Testing

## Test Nodes

Test nodes independently as state transformations.

## Test Graph

Verify:
- routing;
- reducers;
- conditional edges;
- parallel updates;
- checkpoints;
- interrupts;
- resume behavior.

## Rule

Graph topology and state semantics deserve tests separate from LLM quality.


---

<!-- Source: 17_ORCHESTRATION_TESTING.md -->
# Orchestration Testing

## Test

- correct route;
- sequential order;
- parallel fan-out;
- aggregation;
- retry/replan;
- termination.

## Rule

Assert execution path when path itself matters.


---

<!-- Source: 18_MULTI_AGENT_TESTING.md -->
# Multi-Agent Testing

## Test

- role routing;
- handoff;
- agent-as-tool;
- context isolation;
- duplicate work;
- final synthesis.

## Baseline

Compare against a simpler single-agent solution where possible.


---

<!-- Source: 19_STREAMING_TESTING.md -->
# Streaming Testing

## Test

- event ordering;
- duplicate events;
- cancellation;
- disconnect;
- reconnect;
- final completion;
- tool progress.

## Rule

Last token is not necessarily run completion.


---

<!-- Source: 20_HITL_TESTING.md -->
# Human-in-the-Loop Testing

## Scenarios

- approval required;
- approval accepted;
- rejected;
- modified;
- duplicate approval;
- resume after restart.

## Rule

HITL should be testable as a deterministic workflow state.


---

<!-- Source: 21_RETRY_TIMEOUT_AND_CIRCUIT_BREAKER_TESTING.md -->
# Retry, Timeout and Circuit Breaker Testing

## Test

- transient failure retries;
- permanent failure no-retry;
- max attempts;
- timeout;
- breaker opens;
- breaker recovers.


---

<!-- Source: 22_IDEMPOTENCY_AND_DUPLICATE_EXECUTION_TESTING.md -->
# Idempotency and Duplicate Execution Testing

## Critical Scenario

Execute the same write twice with same idempotency key.

## Expected

One business side effect.

## Use

Especially for:
- payment;
- ticket creation;
- email/send;
- workflow resume.


---

<!-- Source: 23_FAILURE_INJECTION.md -->
# Failure Injection

## Inject

- model 500;
- rate limit;
- tool timeout;
- malformed output;
- DB unavailable;
- retriever empty;
- session write failure.

## Goal

Verify graceful recovery, fallback, or clean failure.


---

<!-- Source: 24_CHAOS_AND_RESILIENCE_TESTING.md -->
# Chaos and Resilience Testing

## Use

For mature systems, test:
- dependency outage;
- network latency;
- partial region failure;
- event duplication;
- delayed approval.

## Rule

Chaos testing validates system-level resilience, not model intelligence.


---

<!-- Source: 25_SECURITY_AND_PROMPT_INJECTION_TESTING.md -->
# Security and Prompt Injection Testing

## Attack Cases

- malicious user prompt;
- malicious retrieved doc;
- malicious tool output;
- prompt asking for secrets;
- tool privilege escalation.

## Expected

Security boundaries remain intact.


---

<!-- Source: 26_AUTHORIZATION_AND_TENANT_ISOLATION_TESTING.md -->
# Authorization and Tenant Isolation Testing

## Critical Tests

- unauthorized tool denied;
- cross-tenant retrieval denied;
- cross-tenant memory denied;
- stream subscription denied;
- cache keys isolated.

## Rule

Tenant isolation needs negative tests, not only happy paths.


---

<!-- Source: 27_PROMPT_AND_MODEL_REGRESSION_TESTING.md -->
# Prompt and Model Regression Testing

## Trigger Changes

- prompt;
- model version;
- temperature/settings;
- schema;
- tool descriptions.

## Action

Run regression dataset and compare:
- success;
- tools;
- safety;
- latency;
- cost.


---

<!-- Source: 28_GOLDEN_DATASET_TESTING.md -->
# Golden Dataset Testing

## Include

- production examples;
- edge cases;
- adversarial inputs;
- historic incidents.

## Rule

Continuously grow the golden set from real failures.


---

<!-- Source: 29_PROPERTY_BASED_AND_FUZZ_TESTING.md -->
# Property-Based and Fuzz Testing

## Useful For

- parsers;
- schemas;
- tool arguments;
- routers;
- state reducers.

## Examples

Generate random valid/invalid inputs and assert invariants.


---

<!-- Source: 30_PERFORMANCE_AND_LOAD_TESTING.md -->
# Performance and Load Testing

## Measure

- p50/p95/p99 latency;
- throughput;
- concurrent runs;
- tool bottlenecks;
- streaming connection count.

## Rule

Test realistic agent paths, not only empty API endpoints.


---

<!-- Source: 31_COST_BUDGET_TESTING.md -->
# Cost Budget Testing

## Test

- max agent turns;
- max tool calls;
- max retrieval calls;
- max token budget.

## CI Guard

Fail if a change materially increases cost without justified value.


---

<!-- Source: 32_OBSERVABILITY_AND_TRACE_ASSERTIONS.md -->
# Observability and Trace Assertions

## Assert

- run span created;
- tool span child of run;
- error recorded;
- retry count present;
- trace IDs propagated.

## Rule

Observability is testable behavior.


---

<!-- Source: 33_CI_CD_TEST_GATES.md -->
# CI/CD Test Gates

## Pipeline

```text
Lint
 ↓
Unit
 ↓
Contract
 ↓
Workflow
 ↓
Agent regression
 ↓
Security
 ↓
Performance budget
 ↓
PASS → deploy
```

## Rule

Critical agent eval/test thresholds belong in CI, not only dashboards.


---

<!-- Source: 34_TEST_ENVIRONMENTS_AND_FIXTURES.md -->
# Test Environments and Fixtures

## Fixtures

- fake model;
- fake tools;
- seeded vector store;
- isolated tenant data;
- deterministic clock;
- fixed IDs.

## Rule

Remove unnecessary randomness from engineering tests.


---

<!-- Source: 35_PYTHON_REFERENCE_TESTS.md -->
# Python Reference Tests

## Example

```python
def test_router_sends_billing_to_billing_agent():
    router = Router(model=FakeModel("billing"))
    result = router.route("refund issue")
    assert result.agent == "billing"

def test_write_tool_is_idempotent():
    tool = FakeCreateTicketTool()
    a = tool.create("k1")
    b = tool.create("k1")
    assert a.id == b.id
    assert tool.write_count == 1
```


---

<!-- Source: 36_JAVA_REFERENCE_TESTS.md -->
# Java Reference Tests

## Example

```java
@Test
void unauthorizedToolCallIsRejected() {
    var context = new ToolContext("user-1", "tenant-a");
    when(auth.can(context, "delete")).thenReturn(false);

    assertThrows(
        AuthorizationException.class,
        () -> tool.execute(input, context)
    );
}
```

## Pattern

JUnit + mocks/fakes + deterministic domain assertions.


---

<!-- Source: 37_TYPESCRIPT_REFERENCE_TESTS.md -->
# TypeScript Reference Tests

## Example

```ts
it("emits tool.started before tool.completed", async () => {
  const events = await collect(runWithFakeTool());
  const started = events.findIndex(e => e.type === "tool.started");
  const completed = events.findIndex(e => e.type === "tool.completed");

  expect(started).toBeLessThan(completed);
});
```


---

<!-- Source: 38_CSHARP_REFERENCE_TESTS.md -->
# C# Reference Tests

## Example

```csharp
[Fact]
public async Task Retry_Does_Not_Duplicate_Write()
{
    var result1 = await service.ExecuteAsync("idem-123");
    var result2 = await service.ExecuteAsync("idem-123");

    Assert.Equal(result1.Id, result2.Id);
    Assert.Equal(1, store.WriteCount);
}
```


---

<!-- Source: 39_PRODUCTION_VALIDATION_AND_CANARY.md -->
# Production Validation and Canary

## After CI

Use:
- canary rollout;
- shadow traffic;
- sampled traces;
- business KPI checks.

## Rollback Signals

- task success drop;
- safety regression;
- cost spike;
- latency spike;
- tool failure increase.


---

<!-- Source: 40_INTERVIEW_QUESTIONS.md -->
# Agent Testing — Interview Q&A

## 1. How do you unit test an agent?

Fake the model and tools; test routing/state/policies deterministically.

## 2. Why fake models?

To make agent loop tests repeatable and cheap.

## 3. What should contract tests verify?

Tool/retriever schemas, outputs, errors, and compatibility.

## 4. How do you test LangGraph?

Test nodes, reducers, routing, checkpoints, interrupts, and resume independently.

## 5. How do you test tool calling?

Expected tool, arguments, authorization, approval, and failure recovery.

## 6. How do you test memory?

Write/read/expiry/update/delete plus tenant isolation.

## 7. How do you test RAG?

Retriever correctness, context assembly, then end-to-end grounded answer separately.

## 8. How do you test streaming?

Event order, cancellation, disconnect, resume, duplicate handling, terminal state.

## 9. Why test idempotency?

Retries and resumes can repeat writes.

## 10. What is failure injection?

Deliberately making model/tool/dependency calls fail to verify recovery.

## 11. How do you regression test prompt/model changes?

Run golden datasets and compare success, safety, latency, cost, and traces.

## 12. How do tests differ from evals?

Tests assert deterministic invariants; evals score probabilistic quality. Mature systems need both.

## 13. What goes in CI?

Fast unit/contract/workflow tests plus targeted agent regression and safety gates.

## 14. What is production validation?

Canary/shadow rollout with live metrics and rollback thresholds.

## 15. One-line principle?

> Make the agent runtime deterministic wherever engineering correctness requires it.


---

<!-- Source: 41_SYSTEM_DESIGN_QUESTIONS.md -->
# Agent Testing — System Design Questions

## Q1 — Design a Test Platform for Agent SDK

Need fake model provider, fake tool registry, trace assertions, golden datasets, CI gates.

## Q2 — Test a Multi-Agent System

Validate route, handoff, context isolation, final synthesis, cost, and termination.

## Q3 — Test HITL Workflow

Persist interruption, approve/reject, restart process, resume, assert side effect exactly once.

## Q4 — Test Agentic RAG

Seed fixed corpus, test expected documents, reranking, access filters, grounded answer.

## Q5 — Test Streaming SDK

Script event sequence and verify ordering, cancellation, reconnect, terminal completion.

## Answer Framework

**Unit → fake model/tool → contract → workflow → failure injection → eval regression → CI gate → canary.**


---

<!-- Source: 42_TESTING_CHECKLIST.md -->
# Agent Testing — Checklist

## Checklist

- [ ] router tests
- [ ] state-transition tests
- [ ] fake-model loop tests
- [ ] tool contract tests
- [ ] authorization tests
- [ ] idempotency tests
- [ ] retriever/RAG tests
- [ ] memory tests
- [ ] structured-output tests
- [ ] streaming tests
- [ ] HITL tests
- [ ] failure-injection tests
- [ ] prompt-injection tests
- [ ] tenant-isolation tests
- [ ] performance tests
- [ ] cost-budget tests
- [ ] trace assertions
- [ ] golden regression suite
- [ ] CI release gates
- [ ] canary rollback thresholds


---

<!-- Source: 43_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
# Agent Testing — One-Page Final Cheat Sheet

## Formula

```text
Agent Testing =
Unit
+ Fake Model
+ Fake Tool
+ Contract
+ Workflow
+ Failure Injection
+ Security
+ Eval Regression
+ CI Gate
+ Canary
```

## Key Rules

1. Do not call real LLMs in every unit test.
2. Script model behavior for runtime tests.
3. Test state and trajectory.
4. Test tool contracts separately.
5. Test RAG and memory independently.
6. Verify HITL resume.
7. Test retries with idempotency.
8. Inject failures.
9. Run security/tenant negative tests.
10. Use canary validation after CI.

## 30-Second Answer

> I treat agent testing as layered engineering. Deterministic logic gets unit and contract tests, the agent loop uses scripted fake models and tools, retrieval and memory are tested independently, graph state and orchestration paths are asserted explicitly, and streaming, HITL, retries, idempotency, authorization, and failure recovery each have dedicated scenarios. Probabilistic quality is handled through golden evaluation datasets, and critical regression thresholds are enforced in CI before canary release.

## Recall Line

> **Test deterministic behavior deterministically; test probabilistic behavior statistically.**
