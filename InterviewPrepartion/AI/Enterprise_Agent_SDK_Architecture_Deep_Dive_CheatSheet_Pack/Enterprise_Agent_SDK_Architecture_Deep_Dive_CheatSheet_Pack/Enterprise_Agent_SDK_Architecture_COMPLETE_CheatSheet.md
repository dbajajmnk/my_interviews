# Enterprise Agent SDK Architecture — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# Enterprise Agent SDK Architecture — Master Index

## Purpose

This pack focuses on the architecture of an enterprise-grade Agent SDK: how to expose stable developer APIs while hiding model-provider, tool-runtime, memory, retrieval, telemetry, policy, and orchestration complexity.

It is designed for senior engineering interviews where the candidate is expected to think beyond prompt engineering and explain reusable SDK/platform design.

## Master Architecture

```text
Developer Application
        │
        ▼
┌──────────────────────────────┐
│ Public Agent SDK API         │
│ Agent / Tool / Run / Context │
└──────────────┬───────────────┘
               ▼
┌──────────────────────────────┐
│ Agent Runtime / Orchestrator │
└───────┬───────────┬──────────┘
        │           │
        ▼           ▼
 Model Gateway   Tool Runtime
        │           │
        ▼           ▼
 Providers      Enterprise APIs

        ┌───────────┼───────────┐
        ▼           ▼           ▼
     Memory      Retrieval    Policy
        │           │           │
        └───────────┼───────────┘
                    ▼
             Observability
```

## Core Architecture Principle

> Keep the public SDK contract small, stable, provider-neutral, and easy to use. Put complexity behind internal adapters and extension points.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_AN_AGENT_SDK.md`
3. `03_PUBLIC_API_VS_INTERNAL_RUNTIME.md`
4. `04_CORE_SDK_ABSTRACTIONS.md`
5. `05_AGENT_RUNTIME_ARCHITECTURE.md`
6. `06_MODEL_PROVIDER_ABSTRACTION.md`
7. `07_TOOL_REGISTRY_AND_TOOL_RUNTIME.md`
8. `08_CONTEXT_STATE_MEMORY_CONTRACTS.md`
9. `09_RETRIEVAL_INTEGRATION.md`
10. `10_STREAMING_AND_EVENTS.md`
11. `11_SYNC_ASYNC_AND_CANCELLATION.md`
12. `12_ERROR_MODEL_RETRY_TIMEOUTS.md`
13. `13_SECURITY_AND_POLICY_BOUNDARIES.md`
14. `14_OBSERVABILITY_AND_TRACING_HOOKS.md`
15. `15_EVALUATION_AND_TESTABILITY.md`
16. `16_MULTI_LANGUAGE_SDK_ARCHITECTURE.md`
17. `17_EXTENSIBILITY_AND_PLUGIN_MODEL.md`
18. `18_BACKWARD_COMPATIBILITY_ARCHITECTURE.md`
19. `19_REFERENCE_IMPLEMENTATION_BLUEPRINT.md`
20. `20_INTERVIEW_QUESTIONS.md`
21. `21_SYSTEM_DESIGN_QUESTIONS.md`
22. `22_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

For interview preparation today:

**First pass:** 01 → 05  
**Second pass:** 06 → 15  
**Third pass:** 16 → 19  
**Interview rehearsal:** 20 → 22


---

<!-- Source: 01_30_SECOND_RECALL.md -->
# Enterprise Agent SDK — 30-Second Recall

## Recall

```text
Public SDK
  ↓
Agent Runtime
  ├─ Model Gateway
  ├─ Tool Runtime
  ├─ Context/State
  ├─ Memory
  ├─ Retrieval
  ├─ Policy
  ├─ Telemetry
  └─ Evaluation Hooks
```

**Public contract should be stable. Internal providers should be replaceable.**

## 30-Second Interview Answer

> I would design the Agent SDK as a thin, stable developer-facing contract over a modular runtime. The public API would expose concepts such as Agent, Tool, Run, Context, and Events, while model providers, retrieval, memory, policy, telemetry, and orchestration sit behind interfaces. That gives us provider neutrality, testability, backward compatibility, and consistent behavior across Java, Python, C#, and TypeScript.

## Never Forget

- SDK != framework internals.
- Public API should not leak vendor-specific types.
- Model choice is an adapter concern.
- Tool execution needs security boundaries.
- Streaming and cancellation belong in the contract.
- Errors need normalized SDK exceptions.
- Telemetry hooks should be built in, not bolted on later.


---

<!-- Source: 02_WHAT_IS_AN_AGENT_SDK.md -->
# What Is an Agent SDK?

## Definition

An Agent SDK is a developer-facing library that makes it easier and safer to build, run, test, and integrate AI agents.

It should hide infrastructure complexity while preserving extension points.

## Developer Experience Goal

Without SDK:
```text
Application
 ├─ raw model API
 ├─ prompt code
 ├─ tool JSON
 ├─ retries
 ├─ state logic
 ├─ telemetry
 └─ provider-specific glue
```

With SDK:
```text
agent = Agent(...)
agent.add_tool(...)
result = agent.run(...)
```

## SDK Responsibilities

A good SDK may provide:
- agent definition;
- tool registration;
- provider abstraction;
- structured outputs;
- context/state model;
- streaming events;
- memory/retrieval hooks;
- retries/timeouts;
- telemetry hooks;
- evaluation hooks;
- testing utilities.

## Not Its Job

Avoid putting business-specific workflows directly into the base SDK.

The SDK should provide primitives and extension points; applications compose them.


---

<!-- Source: 03_PUBLIC_API_VS_INTERNAL_RUNTIME.md -->
# Public API vs Internal Runtime

## Public API

This is what application developers import and depend on.

Examples:
```text
Agent
AgentBuilder
Tool
RunContext
RunResult
AgentEvent
ModelClient
```

## Internal Runtime

Internal components may include:
- planner;
- execution loop;
- provider adapters;
- tool dispatcher;
- state manager;
- policy engine;
- telemetry bridge;
- retry engine.

## Why Separate Them

If internal architecture changes, applications should not break.

Example:

```text
SDK v1 App Code
     │
     ▼
Stable Public API
     │
     ├─ Runtime v1
     └─ Runtime v2
```

## Design Rule

> Public types should describe business-neutral Agent SDK concepts, not one cloud provider's request/response objects.


---

<!-- Source: 04_CORE_SDK_ABSTRACTIONS.md -->
# Core Agent SDK Abstractions

## Recommended Interfaces

```text
Agent
AgentRuntime
ModelProvider
Tool
ToolRegistry
RunContext
StateStore
MemoryProvider
Retriever
PolicyEngine
Telemetry
Evaluator
```

## Conceptual Java Example

```java
public interface ModelProvider {
    ModelResponse generate(ModelRequest request);
}

public interface Tool {
    String name();
    ToolResult execute(ToolInput input, RunContext context);
}

public interface MemoryProvider {
    List<MemoryItem> recall(MemoryQuery query);
    void remember(MemoryItem item);
}
```

## SOLID Mapping

- **S**: each provider has one reason to change.
- **O**: new model/tool/memory adapters can be added.
- **L**: implementations honor stable contracts.
- **I**: use small interfaces, not giant runtime APIs.
- **D**: runtime depends on interfaces, not concrete vendors.

## Patterns

Common patterns:
- Adapter
- Strategy
- Factory
- Builder
- Command
- Observer/Event
- Facade
- Dependency Injection


---

<!-- Source: 05_AGENT_RUNTIME_ARCHITECTURE.md -->
# Agent Runtime Architecture

## Runtime Responsibilities

The runtime coordinates a run from start to finish:
1. create run context;
2. assemble instructions/context;
3. invoke model;
4. validate decision;
5. execute tool if needed;
6. update state;
7. emit events;
8. evaluate stop condition;
9. return result.

## Runtime Loop

```text
start(run)
   ↓
build_context()
   ↓
model.generate()
   ↓
decision
 ┌─┴───────────┐
tool          final
 ↓              ↓
execute       return
 ↓
state update
 ↓
loop
```

## Runtime Must Also Handle

- max steps;
- timeout;
- cancellation;
- retry;
- tool failures;
- provider failures;
- policy denials;
- streaming;
- telemetry.

## Interview Point

> The runtime is the execution engine; the SDK is the developer contract around it.


---

<!-- Source: 06_MODEL_PROVIDER_ABSTRACTION.md -->
# Model Provider Abstraction

## Goal

Applications should not depend directly on one model vendor.

## Internal Contract

```text
ModelProvider
 ├─ AzureOpenAIProvider
 ├─ OpenAIProvider
 ├─ AnthropicProvider
 └─ LocalModelProvider
```

## Normalize

The SDK should normalize:
- messages/input;
- structured output request;
- tool-call request;
- usage/tokens;
- finish reason;
- provider errors;
- streaming chunks.

## Avoid Lowest-Common-Denominator Design

Provider neutrality does **not** mean ignoring advanced provider features.

Use capability discovery:

```text
supportsTools()
supportsStreaming()
supportsStructuredOutput()
supportsVision()
```

Then applications can fail fast or select a compatible provider.

## Interview Answer

> I would keep a stable internal model contract plus capability metadata, then implement provider-specific adapters. That avoids vendor lock-in without pretending all providers are identical.


---

<!-- Source: 07_TOOL_REGISTRY_AND_TOOL_RUNTIME.md -->
# Tool Registry and Tool Runtime

## Tool Registry

The registry tells the agent which approved tools exist.

Each tool should define:
- name;
- description;
- input schema;
- output schema;
- permission metadata;
- timeout;
- retry policy.

## Runtime Flow

```text
Model proposes tool call
        ↓
Tool Registry lookup
        ↓
Schema validation
        ↓
Authorization / policy
        ↓
Optional approval
        ↓
Execute
        ↓
Normalize result
        ↓
Emit telemetry
```

## Key Rule

The model should never invoke arbitrary methods directly.

## Tool Categories

- read-only query tools;
- write/action tools;
- long-running tools;
- privileged tools;
- human approval tools.

## Production Controls

Use:
- allowlists;
- scoped credentials;
- input validation;
- output size limits;
- idempotency keys;
- auditing.


---

<!-- Source: 08_CONTEXT_STATE_MEMORY_CONTRACTS.md -->
# Context, State, and Memory Contracts

## RunContext

RunContext may carry:
- run ID;
- user/tenant identity;
- deadline;
- locale;
- trace context;
- request metadata.

## State Contract

StateStore tracks execution state.

Possible operations:
```text
load(runId)
save(runId, state)
checkpoint(runId)
resume(runId)
```

## Memory Contract

MemoryProvider should be separate from StateStore.

Possible operations:
```text
recall(query)
remember(item)
forget(key)
```

## Why Separation Matters

State is operational execution data.

Memory is retained knowledge/context with different:
- retention;
- privacy;
- lifecycle;
- security;
- relevance rules.


---

<!-- Source: 09_RETRIEVAL_INTEGRATION.md -->
# Retrieval Integration

## Retriever Contract

```java
interface Retriever {
    RetrievalResult retrieve(RetrievalQuery query);
}
```

## SDK Role

The base Agent SDK should provide a retrieval extension point, not hard-code one vector database.

## Possible Backends

- Azure AI Search;
- Elasticsearch;
- pgvector;
- vector DB;
- enterprise search;
- knowledge graph.

## Metadata

Return:
- content;
- source;
- score;
- metadata;
- permissions;
- citation/reference identifier.

## Architecture Principle

Retrieval is a capability used by the agent. It should remain independently replaceable and independently testable.


---

<!-- Source: 10_STREAMING_AND_EVENTS.md -->
# Streaming and Events

## Why Streaming Matters

Agent runs can be long. Developers need incremental visibility into:
- model tokens;
- tool starts;
- tool results;
- status changes;
- errors;
- final response.

## Event Model

```text
RunStarted
ModelStarted
TokenDelta
ToolCallRequested
ToolStarted
ToolCompleted
StateUpdated
RunCompleted
RunFailed
```

## API Shape

```text
agent.run(...)         → RunResult
agent.runStream(...)   → Stream<AgentEvent>
```

## Design Rule

Keep streamed event types stable. They become part of the public SDK contract and often feed UIs, tracing, and audit pipelines.


---

<!-- Source: 11_SYNC_ASYNC_AND_CANCELLATION.md -->
# Sync, Async, and Cancellation

## Need

Enterprise SDKs should support:
- synchronous runs;
- async/future-based runs;
- streaming;
- cancellation.

## Language Mapping

| Language | Common Async Model |
|---|---|
| Java | CompletableFuture / reactive streams |
| Python | async / await |
| C# | Task / async-await |
| TypeScript | Promise / AsyncIterable |

## Cancellation

Cancellation should propagate through:
```text
SDK → runtime → provider/tool → network call
```

Do not merely stop returning output while backend work continues.

## Timeouts

Use layered timeouts:
- whole run;
- model call;
- tool call;
- retrieval call.


---

<!-- Source: 12_ERROR_MODEL_RETRY_TIMEOUTS.md -->
# Error Model, Retry, and Timeouts

## Normalized Errors

Expose SDK-level exceptions such as:
- AuthenticationError
- AuthorizationError
- ValidationError
- ProviderError
- ToolError
- TimeoutError
- RateLimitError
- PolicyDeniedError

## Why Normalize

Applications should not need provider-specific catch blocks everywhere.

## Retry Rules

Retry only transient failures:
- rate limits;
- temporary provider errors;
- network instability.

Do not automatically retry:
- invalid input;
- authorization failure;
- destructive actions without idempotency.

## Backoff

Use bounded exponential backoff + jitter and expose retry metadata in telemetry.


---

<!-- Source: 13_SECURITY_AND_POLICY_BOUNDARIES.md -->
# Security and Policy Boundaries

## Identity

Propagate caller identity or workload identity where appropriate. Avoid shared unrestricted service credentials.

## Authorization

Authorization happens in enforceable code/policy layers.

The model must not be the final authority.

## Tool Security

For each tool define:
- required scope/role;
- read/write classification;
- data sensitivity;
- approval requirement.

## Prompt Injection Defense

Treat retrieved/tool content as untrusted data.

Do not allow untrusted content to redefine:
- system policy;
- tool permissions;
- identity;
- security boundaries.

## Enterprise Rule

> Model output is untrusted input until validated.


---

<!-- Source: 14_OBSERVABILITY_AND_TRACING_HOOKS.md -->
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


---

<!-- Source: 15_EVALUATION_AND_TESTABILITY.md -->
# Evaluation and Testability

## Testing Hooks

The architecture should allow replacement of:
- model provider;
- tools;
- memory;
- retriever;
- clock;
- telemetry.

## Fake Model Example

Use a deterministic fake provider in unit tests:
```text
input A → tool_call(search)
input B → final("done")
```

## Evaluation Hooks

Capture:
- task outcome;
- selected tools;
- arguments;
- latency;
- cost;
- policy events;
- user feedback.

## Why Architecture Matters

If model/provider calls are hard-coded inside business code, testing becomes slow, expensive, and non-deterministic.


---

<!-- Source: 16_MULTI_LANGUAGE_SDK_ARCHITECTURE.md -->
# Multi-Language SDK Architecture

## Goal

Offer consistent concepts across Java, Python, C#, and TypeScript without forcing identical syntax.

## Shared Semantic Contract

```text
Agent
Tool
RunContext
RunResult
AgentEvent
ModelProvider
MemoryProvider
Retriever
```

## Language-Native APIs

Keep semantics consistent, but idiomatic style per language.

Examples:
- Java → builders/interfaces;
- Python → decorators/context managers;
- C# → fluent builders/async Tasks;
- TypeScript → Promise/AsyncIterable and typed objects.

## What Must Stay Consistent

- lifecycle;
- error categories;
- event meanings;
- tool schema semantics;
- telemetry attributes;
- versioning policy.

## Avoid

Do not mechanically translate one language SDK into another. That produces unnatural developer experience.


---

<!-- Source: 17_EXTENSIBILITY_AND_PLUGIN_MODEL.md -->
# Extensibility and Plugin Model

## Extension Points

Support safe extension through interfaces:
- model providers;
- memory backends;
- retrievers;
- telemetry exporters;
- evaluators;
- tools.

## Registration

Prefer explicit registration:
```text
builder.withModelProvider(...)
builder.withMemory(...)
builder.addTool(...)
```

This is easier to reason about than hidden global discovery.

## Compatibility

Extensions should declare:
- SDK version compatibility;
- capabilities;
- required configuration.

## Security

Third-party extensions must not automatically inherit unrestricted credentials or tool permissions.


---

<!-- Source: 18_BACKWARD_COMPATIBILITY_ARCHITECTURE.md -->
# Backward Compatibility Architecture

## Stable Surface

Keep stable:
- core public types;
- common method signatures;
- error categories;
- event contracts.

## Evolution Techniques

Use:
- additive optional fields;
- default methods where safe;
- deprecation periods;
- migration guides;
- compatibility shims;
- capability negotiation.

## Breaking Changes

Breaking changes may include:
- removing public methods;
- changing semantic behavior;
- changing exception categories;
- changing event meaning;
- changing tool contract format.

## Rule

> Internal freedom comes from external discipline: the more stable the contract, the more safely the runtime can evolve.


---

<!-- Source: 19_REFERENCE_IMPLEMENTATION_BLUEPRINT.md -->
# Reference Implementation Blueprint

## Package Layout

```text
agent-sdk/
├─ api/
│  ├─ Agent
│  ├─ Tool
│  ├─ RunContext
│  └─ AgentEvent
├─ runtime/
│  ├─ DefaultAgentRuntime
│  ├─ ExecutionLoop
│  └─ StateManager
├─ model/
│  ├─ ModelProvider
│  └─ adapters/
├─ tools/
│  ├─ ToolRegistry
│  └─ ToolExecutor
├─ memory/
├─ retrieval/
├─ policy/
├─ telemetry/
├─ evaluation/
└─ testing/
```

## Execution Blueprint

```text
Developer defines Agent
        ↓
SDK validates configuration
        ↓
Runtime starts run
        ↓
Context + state loaded
        ↓
Model decides
        ↓
Tool/policy path OR final
        ↓
Events + trace emitted
        ↓
Run result returned
```

## Production Checklist

- stable public API;
- provider abstraction;
- tool authorization;
- streaming;
- cancellation;
- normalized errors;
- telemetry;
- testing fakes;
- versioning strategy;
- documentation/examples.


---

<!-- Source: 20_INTERVIEW_QUESTIONS.md -->
# Enterprise Agent SDK — Interview Q&A

## 1. What is an Agent SDK?

A reusable developer library that exposes stable primitives for building and running agents while hiding provider, tool, state, telemetry, and policy plumbing.

## 2. What should the public API expose?

Small domain-neutral primitives such as Agent, Tool, RunContext, RunResult, AgentEvent, and configuration/builders.

## 3. How do you avoid vendor lock-in?

Use a normalized internal ModelProvider interface with provider-specific adapters and capability discovery.

## 4. How should tools be represented?

As typed/structured contracts with name, description, schema, authorization metadata, timeout, and execution handler.

## 5. Why separate state and memory?

State is execution-scoped. Memory has independent retention, privacy, and lifecycle semantics.

## 6. Why streaming support?

Agent tasks may take time; applications need token deltas, tool events, progress, and errors incrementally.

## 7. How do you support cancellation?

Pass a cancellation/deadline context through runtime, provider, retrieval, and tool layers.

## 8. How should errors work?

Normalize provider-specific failures into SDK-level error categories while retaining causal details internally.

## 9. How do you make it testable?

Dependency inversion, deterministic fake model providers, fake tools, in-memory state/memory, and trace capture.

## 10. How do you support multiple languages?

Share semantic contracts and lifecycle behavior but expose idiomatic language-native APIs.

## 11. How do you secure tool calls?

Validate schema, enforce auth/authz outside the model, use least privilege, classify read/write risk, audit calls, and require approval for sensitive operations.

## 12. What belongs in observability?

Run/model/tool/retrieval spans, errors, retries, tokens, latency, cost metadata, and policy decisions.

## 13. How do you evolve an SDK?

Prefer additive changes, deprecations, migration guides, compatibility shims, and semantic versioning.

## 14. What is the biggest architecture mistake?

Leaking provider-specific types throughout the public SDK and application code.

## 15. What is your one-line architecture principle?

> Stable contracts outside, replaceable adapters inside.


---

<!-- Source: 21_SYSTEM_DESIGN_QUESTIONS.md -->
# Enterprise Agent SDK — System Design Questions

## Q1 — Design a Multi-Provider Agent SDK

Cover:
- public Agent API;
- ModelProvider abstraction;
- capability discovery;
- tool registry;
- context/state;
- event stream;
- errors;
- telemetry;
- testing.

## Q2 — Design Multi-Language SDKs

Explain:
1. shared semantic specification;
2. language-specific implementation;
3. generated schemas only where useful;
4. common conformance tests;
5. consistent telemetry and errors.

## Q3 — Design Tool Execution Security

```text
Tool Request
 ↓
Registry
 ↓
Schema Validation
 ↓
AuthZ
 ↓
Risk Classification
 ↓
Approval if required
 ↓
Execution
 ↓
Audit
```

## Q4 — Design Long-Running Agent Runs

Use:
- async run handle;
- persistent state/checkpoints;
- event stream;
- cancellation;
- resume;
- deadlines;
- durable tool result recording.

## Q5 — How Would You Explain Trade-offs?

Always mention:
- simplicity vs flexibility;
- abstraction vs provider features;
- stability vs rapid evolution;
- developer experience vs configurability;
- synchronous ease vs async scalability.

## Answer Framework

For any SDK architecture question:

**Public API → Runtime → Providers → Tools → State/Memory → Security → Events → Errors → Observability → Testing → Versioning.**


---

<!-- Source: 22_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
# Enterprise Agent SDK — One-Page Final Cheat Sheet

## Formula

```text
Enterprise Agent SDK =
Stable Public API
+ Modular Runtime
+ Provider Abstraction
+ Tool Runtime
+ State/Memory
+ Streaming
+ Security
+ Telemetry
+ Testability
+ Versioning
```

## Public API

Keep small:
- Agent
- Tool
- RunContext
- RunResult
- AgentEvent

## Internal Interfaces

- ModelProvider
- ToolRegistry
- StateStore
- MemoryProvider
- Retriever
- PolicyEngine
- Telemetry
- Evaluator

## Design Patterns

Adapter • Strategy • Factory • Builder • Command • Observer • Facade • Dependency Injection

## Production Rules

1. Do not leak vendor request/response types.
2. Normalize errors.
3. Build streaming/cancellation in from day one.
4. Treat model output as untrusted input.
5. Keep auth/authz deterministic.
6. Add telemetry hooks at runtime boundaries.
7. Make every external dependency replaceable in tests.
8. Use language-native APIs for multi-language SDKs.
9. Evolve additively where possible.
10. Keep the runtime complex so the developer experience can stay simple.

## 30-Second Answer

> I would design the Agent SDK as a stable facade over a modular runtime. The application depends on provider-neutral types such as Agent, Tool, RunContext, and AgentEvent. Internally, model providers, tools, memory, retrieval, policy, telemetry, and evaluation are interfaces with adapters. That gives us multi-provider support, multi-language consistency, testability, security, and backward-compatible evolution.
