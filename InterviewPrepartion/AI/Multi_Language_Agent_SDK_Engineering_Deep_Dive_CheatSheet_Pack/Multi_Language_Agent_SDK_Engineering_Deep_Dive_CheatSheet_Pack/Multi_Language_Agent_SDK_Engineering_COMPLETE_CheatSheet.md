# Multi-Language Agent SDK Engineering — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# Multi-Language Agent SDK Engineering — Master Index

## Purpose

This pack covers how to design, implement, test, package, version, document, and operate one Agent SDK across **Python, Java, C#, and TypeScript** without losing semantic consistency or language idioms.

Interview focus:
- canonical cross-language contract;
- idiomatic APIs;
- async and streaming differences;
- cancellation;
- builders and configuration;
- tools and structured outputs;
- serialization;
- exceptions/errors;
- context and dependency injection;
- package publishing;
- code generation vs handwritten SDKs;
- parity testing;
- backward compatibility;
- observability;
- documentation and examples;
- release automation.

## Master Mental Model

```text
                  Canonical Agent SDK Spec
                           │
        ┌──────────────────┼──────────────────┐
        ▼                  ▼                  ▼
      Python              Java              C#            TypeScript
  idiomatic API      idiomatic API      idiomatic API     idiomatic API
        │                  │                  │                │
        └────────────── Shared Semantics / Fixtures ──────────┘
                           │
                    Compatibility Matrix
                           │
                     Release Automation
```

## Core Principle

> Cross-language SDKs should share semantics, not syntax. The contract must be consistent while each language still feels native to its ecosystem.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_MULTI_LANGUAGE_SDK_ENGINEERING.md`
3. `03_CANONICAL_CROSS_LANGUAGE_CONTRACT.md`
4. `04_SEMANTIC_PARITY_VS_API_SHAPE.md`
5. `05_PUBLIC_API_SURFACE.md`
6. `06_AGENT_PRIMITIVE.md`
7. `07_TOOL_PRIMITIVE.md`
8. `08_RUN_AND_RESULT_PRIMITIVES.md`
9. `09_CONTEXT_AND_RUNTIME_DEPENDENCIES.md`
10. `10_STRUCTURED_OUTPUT_TYPES.md`
11. `11_STREAMING_EVENT_MODEL.md`
12. `12_ERROR_MODEL.md`
13. `13_CANCELLATION_AND_TIMEOUTS.md`
14. `14_RETRY_AND_RESILIENCE_CONTRACTS.md`
15. `15_CONFIGURATION_AND_BUILDERS.md`
16. `16_DEPENDENCY_INJECTION_STRATEGIES.md`
17. `17_SERIALIZATION_AND_WIRE_FORMATS.md`
18. `18_SCHEMA_AND_TYPE_GENERATION.md`
19. `19_PROVIDER_ADAPTERS.md`
20. `20_TOOL_REGISTRY_AND_DISPATCH.md`
21. `21_MEMORY_AND_RETRIEVAL_INTERFACES.md`
22. `22_OBSERVABILITY_INTERFACES.md`
23. `23_PYTHON_IDIOMATIC_DESIGN.md`
24. `24_JAVA_IDIOMATIC_DESIGN.md`
25. `25_CSHARP_IDIOMATIC_DESIGN.md`
26. `26_TYPESCRIPT_IDIOMATIC_DESIGN.md`
27. `27_ASYNC_MODEL_COMPARISON.md`
28. `28_STREAMING_MODEL_COMPARISON.md`
29. `29_COLLECTIONS_NULLABILITY_AND_OPTIONALS.md`
30. `30_GENERIC_TYPES_AND_TYPE_SAFETY.md`
31. `31_EXCEPTION_AND_ERROR_MAPPING.md`
32. `32_PACKAGE_STRUCTURE_PER_LANGUAGE.md`
33. `33_PACKAGE_PUBLISHING_PYPI_MAVEN_NUGET_NPM.md`
34. `34_VERSIONING_AND_RELEASE_PARITY.md`
35. `35_BACKWARD_COMPATIBILITY.md`
36. `36_DEPRECATION_STRATEGY.md`
37. `37_CODE_GENERATION_VS_HANDWRITTEN_SDKS.md`
38. `38_SHARED_TEST_FIXTURES.md`
39. `39_CROSS_LANGUAGE_CONTRACT_TESTS.md`
40. `40_PARITY_TESTING.md`
41. `41_PERFORMANCE_AND_MEMORY_PROFILE.md`
42. `42_SECURITY_AND_SECRET_HANDLING.md`
43. `43_DOCUMENTATION_AND_DEVELOPER_EXPERIENCE.md`
44. `44_REFERENCE_REPOSITORY_STRUCTURE.md`
45. `45_CI_CD_MATRIX_BUILD.md`
46. `46_INTERVIEW_QUESTIONS.md`
47. `47_SYSTEM_DESIGN_QUESTIONS.md`
48. `48_PARITY_CHECKLIST.md`
49. `49_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Contract foundation:** 01 → 22  
**Language-specific design:** 23 → 31  
**Packaging/release:** 32 → 37  
**Testing/quality:** 38 → 45  
**Interview/revision:** 46 → 49


---

<!-- Source: 01_30_SECOND_RECALL.md -->
# Multi-Language Agent SDK Engineering — 30-Second Recall

## Recall

```text
Multi-Language SDK =
One Semantic Contract
+ Four Idiomatic APIs
+ Shared Compatibility Rules
+ Shared Fixtures
+ Per-Language Packaging
+ Release Parity
```

## 30-Second Interview Answer

> I design one canonical semantic contract for Agent, Tool, Run, Context, Events, Errors and Results, then map it idiomatically into Python, Java, C# and TypeScript. I do not force identical syntax across languages. Instead I preserve equivalent behavior, shared wire formats, consistent error semantics, streaming/cancellation support, and common contract fixtures. Each SDK is packaged and released through its native ecosystem, with parity tests and a compatibility matrix preventing drift.

## Do Not Forget

- Same semantics ≠ same method signatures.
- Async models differ by language.
- Streaming abstractions differ by ecosystem.
- Error models must normalize provider/runtime failures consistently.
- Public types should be provider-neutral.
- Release parity needs automation.


---

<!-- Source: 02_WHAT_IS_MULTI_LANGUAGE_SDK_ENGINEERING.md -->
# What Is Multi-Language SDK Engineering?

## Definition

Multi-language SDK engineering means exposing one platform capability consistently across several programming ecosystems while preserving each language's conventions.

## Challenge

You are solving two problems simultaneously:
1. semantic consistency;
2. idiomatic developer experience.

## Rule

> Build one platform contract, not four unrelated SDKs.


---

<!-- Source: 03_CANONICAL_CROSS_LANGUAGE_CONTRACT.md -->
# Canonical Cross-Language Contract

## Canonical Concepts

Define language-neutral concepts first:
- Agent;
- Tool;
- Run;
- RunContext;
- StreamEvent;
- Result;
- Error;
- Cancellation;
- Capability metadata.

## Artifact

Maintain a canonical specification describing:
- names;
- behavior;
- lifecycle;
- error semantics;
- wire formats;
- compatibility guarantees.


---

<!-- Source: 04_SEMANTIC_PARITY_VS_API_SHAPE.md -->
# Semantic Parity vs API Shape

## Semantic Parity

The same operation means the same thing everywhere.

## API Shape

Language-specific syntax can differ.

## Example

```text
Python       → await agent.run(...)
Java         → agent.runAsync(...): CompletionStage<Result>
C#           → await agent.RunAsync(...)
TypeScript   → await agent.run(...)
```

## Rule

Preserve behavior, not superficial syntax.


---

<!-- Source: 05_PUBLIC_API_SURFACE.md -->
# Public API Surface

## Keep Small

Expose stable concepts:
- Agent;
- Tool;
- Run;
- Context;
- StreamEvent;
- Error;
- Provider adapter interfaces.

## Hide

Keep provider-specific HTTP details, transport quirks, raw payloads, retries, and telemetry plumbing internal.

## Rule

Every public symbol becomes a compatibility commitment.


---

<!-- Source: 06_AGENT_PRIMITIVE.md -->
# Agent Primitive

## Canonical Fields

- name;
- instructions;
- model/provider abstraction;
- tools;
- output type/schema;
- policies/middleware;
- metadata.

## Lifecycle

Agent definition should be mostly configuration; execution belongs to runtime/runner.


---

<!-- Source: 07_TOOL_PRIMITIVE.md -->
# Tool Primitive

## Canonical Contract

Tool should define:
- name;
- description;
- input schema;
- output contract;
- execution callback;
- risk/policy metadata.

## Rule

Never expose provider-specific tool descriptors as your public SDK's only abstraction.


---

<!-- Source: 08_RUN_AND_RESULT_PRIMITIVES.md -->
# Run and Result Primitives

## Run

Represents execution lifecycle.

## Result

Should expose normalized:
- final output;
- structured output;
- events/usage;
- status;
- errors;
- trace/run ID.

## Rule

Keep run metadata stable even if provider payloads differ.


---

<!-- Source: 09_CONTEXT_AND_RUNTIME_DEPENDENCIES.md -->
# Context and Runtime Dependencies

## Context Contains

Trusted application dependencies:
- identity;
- tenant;
- DB/service clients;
- feature flags;
- policy context.

## Rule

Do not serialize arbitrary dependency objects into model-visible context.


---

<!-- Source: 10_STRUCTURED_OUTPUT_TYPES.md -->
# Structured Output Types

## Goal

Expose typed output in every language.

## Mappings

- Python → Pydantic/dataclass style
- Java → record/POJO
- C# → record/class
- TypeScript → interface/type + runtime schema

## Rule

Compile-time typing must be paired with runtime validation.


---

<!-- Source: 11_STREAMING_EVENT_MODEL.md -->
# Streaming Event Model

## Canonical Events

- run.started;
- model.delta;
- tool.started;
- tool.completed;
- handoff;
- approval.requested;
- run.completed;
- run.failed.

## Rule

Normalize semantic events; do not leak raw provider stream packets into the public API.


---

<!-- Source: 12_ERROR_MODEL.md -->
# Cross-Language Error Model

## Normalize

- authentication;
- authorization;
- rate limit;
- timeout;
- validation;
- provider;
- tool;
- cancellation;
- internal runtime.

## Attach

- code;
- retryable flag;
- provider cause;
- trace ID;
- safe message.


---

<!-- Source: 13_CANCELLATION_AND_TIMEOUTS.md -->
# Cancellation and Timeouts

## Language Mapping

- Python → cancellation through async task/cancel scope
- Java → Future/CompletableFuture cancellation + timeout APIs
- C# → CancellationToken
- TypeScript → AbortSignal / AbortController

## Rule

Public semantics should be equivalent even though mechanisms differ.


---

<!-- Source: 14_RETRY_AND_RESILIENCE_CONTRACTS.md -->
# Retry and Resilience Contracts

## SDK Responsibility

Define where retries happen:
- provider adapter;
- tool adapter;
- caller.

## Avoid

Nested retries at multiple layers causing retry storms.

## Rule

Expose retryable classification, not hidden unlimited retries.


---

<!-- Source: 15_CONFIGURATION_AND_BUILDERS.md -->
# Configuration and Builders

## Python/TS

Keyword/object configuration often feels natural.

## Java/C#

Builder/options patterns often fit strongly typed configuration.

## Rule

Configuration semantics should match even if construction style differs.


---

<!-- Source: 16_DEPENDENCY_INJECTION_STRATEGIES.md -->
# Dependency Injection Strategies

## Python/TS

Constructor/function injection is usually enough.

## Java/C#

Integrate naturally with DI containers where appropriate.

## Rule

SDK must not require a specific DI framework to function.


---

<!-- Source: 17_SERIALIZATION_AND_WIRE_FORMATS.md -->
# Serialization and Wire Formats

## Canonical Wire Format

Use stable JSON-compatible contracts for:
- tool calls;
- events;
- errors;
- trace metadata;
- capabilities.

## Rule

Wire format is often a stronger cross-language contract than class names.


---

<!-- Source: 18_SCHEMA_AND_TYPE_GENERATION.md -->
# Schema and Type Generation

## Use

A canonical schema can generate:
- JSON Schema;
- OpenAPI models;
- DTOs;
- test fixtures.

## Caution

Generated types may be non-idiomatic.

## Rule

Generate repetitive transport models; hand-design developer-facing APIs.


---

<!-- Source: 19_PROVIDER_ADAPTERS.md -->
# Provider Adapters

## Interface

Provider adapter normalizes:
- request;
- model response;
- tool calls;
- streaming;
- usage;
- errors.

## Rule

Provider adapters are compatibility firewalls.


---

<!-- Source: 20_TOOL_REGISTRY_AND_DISPATCH.md -->
# Tool Registry and Dispatch

## Registry

Maps normalized tool definitions to executable handlers.

## Dispatcher

Handles:
- lookup;
- validation;
- authz;
- timeout;
- telemetry;
- execution.

## Rule

Keep model selection separate from tool execution.


---

<!-- Source: 21_MEMORY_AND_RETRIEVAL_INTERFACES.md -->
# Memory and Retrieval Interfaces

## Canonical Interfaces

- MemoryStore;
- Retriever;
- Reranker;
- Citation/Source.

## Rule

Provider/database implementations should sit behind stable interfaces.


---

<!-- Source: 22_OBSERVABILITY_INTERFACES.md -->
# Observability Interfaces

## Canonical Operations

- AgentRun;
- ModelCall;
- ToolCall;
- Retrieval;
- MemoryOperation;
- Handoff.

## Rule

Keep semantic telemetry aligned across all languages.


---

<!-- Source: 23_PYTHON_IDIOMATIC_DESIGN.md -->
# Python Idiomatic SDK Design

## Characteristics

- async/await;
- context managers;
- decorators;
- dataclasses/Pydantic;
- iterators/async iterators;
- exceptions.

## Example

```python
agent = Agent(
    name="support",
    tools=[search_tool],
)

result = await agent.run(
    "Find my order",
    context=ctx,
)
```

## Rule

Prefer simplicity and explicit typing without making Python feel like Java.


---

<!-- Source: 24_JAVA_IDIOMATIC_DESIGN.md -->
# Java Idiomatic SDK Design

## Characteristics

- builders;
- interfaces;
- records/POJOs;
- CompletableFuture/CompletionStage;
- Flow.Publisher or reactive integrations;
- checked vs unchecked exception decisions.

## Example

```java
var agent = Agent.builder()
    .name("support")
    .tools(List.of(searchTool))
    .build();

CompletionStage<RunResult> result =
    agent.runAsync("Find my order", context);
```

## Rule

Strong typing, builders and explicit interfaces should feel natural to Java developers.


---

<!-- Source: 25_CSHARP_IDIOMATIC_DESIGN.md -->
# C# Idiomatic SDK Design

## Characteristics

- async/await;
- Task/ValueTask;
- CancellationToken;
- records/classes;
- dependency injection;
- IAsyncEnumerable for streaming.

## Example

```csharp
var result = await agent.RunAsync(
    "Find my order",
    context,
    cancellationToken);
```

## Rule

Fit .NET async/cancellation and DI conventions naturally.


---

<!-- Source: 26_TYPESCRIPT_IDIOMATIC_DESIGN.md -->
# TypeScript Idiomatic SDK Design

## Characteristics

- Promise;
- AsyncIterable;
- discriminated unions;
- AbortSignal;
- structural typing;
- runtime schema validators.

## Example

```ts
const result = await agent.run("Find my order", {
  context,
  signal
});
```

## Rule

Use discriminated unions for events/errors and pair TypeScript types with runtime validation.


---

<!-- Source: 27_ASYNC_MODEL_COMPARISON.md -->
# Async Model Comparison

## Comparison

| Language | Common Async Primitive |
|---|---|
| Python | coroutine / await |
| Java | CompletionStage / CompletableFuture |
| C# | Task / ValueTask |
| TypeScript | Promise |

## Rule

Expose non-blocking APIs consistently; let sync helpers be optional convenience layers.


---

<!-- Source: 28_STREAMING_MODEL_COMPARISON.md -->
# Streaming Model Comparison

## Comparison

| Language | Natural Streaming Abstraction |
|---|---|
| Python | AsyncIterator |
| Java | Flow.Publisher / reactive stream |
| C# | IAsyncEnumerable |
| TypeScript | AsyncIterable / ReadableStream |

## Rule

Semantic event types should match even if stream containers differ.


---

<!-- Source: 29_COLLECTIONS_NULLABILITY_AND_OPTIONALS.md -->
# Collections, Nullability and Optionals

## Problem

Null/None/undefined semantics differ.

## Rule

Canonical spec must say whether a field is:
- required;
- optional;
- nullable;
- absent by default.

## Language Mapping

Avoid ambiguous “missing vs null” behavior across SDKs.


---

<!-- Source: 30_GENERIC_TYPES_AND_TYPE_SAFETY.md -->
# Generic Types and Type Safety

## Use

Generics help model:
- typed structured output;
- typed context;
- tool input/output.

## Caution

Do not make the public API unreadable with excessive generic complexity.


---

<!-- Source: 31_EXCEPTION_AND_ERROR_MAPPING.md -->
# Exception and Error Mapping

## Python/Java/C#

Exceptions are natural for fatal operation failures.

## TypeScript

Promise rejection / Error subclasses.

## Cross-Language

Keep normalized error codes and retryability consistent.


---

<!-- Source: 32_PACKAGE_STRUCTURE_PER_LANGUAGE.md -->
# Package Structure per Language

## Python

`agent_sdk/`

## Java

`com.company.agent.sdk`

## C#

`Company.AgentSdk`

## TypeScript

`@company/agent-sdk`

## Rule

Naming and module organization should follow ecosystem conventions.


---

<!-- Source: 33_PACKAGE_PUBLISHING_PYPI_MAVEN_NUGET_NPM.md -->
# Publishing: PyPI, Maven, NuGet and npm

## Registries

- Python → PyPI/private index
- Java → Maven Central/private Maven repo
- C# → NuGet
- TypeScript → npm/private registry

## Release

Automate:
- build;
- sign/provenance where needed;
- package;
- publish;
- release notes.


---

<!-- Source: 34_VERSIONING_AND_RELEASE_PARITY.md -->
# Versioning and Release Parity

## Strategy

Prefer aligned semantic versions when feature parity is intended.

## Reality

A language may lag temporarily.

## Need

Maintain explicit compatibility/parity matrix.

## Rule

Do not imply feature parity that does not exist.


---

<!-- Source: 35_BACKWARD_COMPATIBILITY.md -->
# Backward Compatibility

## Compatibility Areas

- source;
- binary where applicable;
- behavior;
- wire format;
- package dependencies.

## Rule

Public contracts should evolve additively where possible.


---

<!-- Source: 36_DEPRECATION_STRATEGY.md -->
# Deprecation Strategy

## Lifecycle

announce → mark deprecated → provide migration path → monitor usage → remove in major release.

## Language Mapping

Use native deprecation annotations/docs in each ecosystem.


---

<!-- Source: 37_CODE_GENERATION_VS_HANDWRITTEN_SDKS.md -->
# Code Generation vs Handwritten SDKs

## Generate

Good for:
- transport DTOs;
- API clients;
- repetitive schema types.

## Handwrite

Better for:
- developer-facing abstractions;
- fluent builders;
- idiomatic streaming/cancellation;
- ergonomic helpers.

## Rule

Generate mechanics; handcraft experience.


---

<!-- Source: 38_SHARED_TEST_FIXTURES.md -->
# Shared Test Fixtures

## Canonical Fixtures

- provider responses;
- tool calls;
- stream event sequences;
- errors;
- JSON schemas;
- trace snapshots.

## Benefit

Every SDK validates the same semantic cases.


---

<!-- Source: 39_CROSS_LANGUAGE_CONTRACT_TESTS.md -->
# Cross-Language Contract Tests

## Test

- serialization compatibility;
- error code mapping;
- tool schema behavior;
- event ordering;
- retryability classification.

## Rule

Contract tests protect the semantic boundary.


---

<!-- Source: 40_PARITY_TESTING.md -->
# Parity Testing

## Parity Matrix

Track every feature:
- Python;
- Java;
- C#;
- TypeScript.

## Example

```text
Streaming          ✓ ✓ ✓ ✓
HITL               ✓ ✓ ✓ ✓
Memory Store       ✓ ✓ ✓ ✓
Hosted Tool X      ✓ ✓ - ✓
```

## Rule

Parity gaps must be explicit, not discovered by customers.


---

<!-- Source: 41_PERFORMANCE_AND_MEMORY_PROFILE.md -->
# Performance and Memory Profile

## Measure

- startup time;
- allocation;
- stream throughput;
- serialization overhead;
- connection reuse.

## Language Sensitivity

Performance bottlenecks differ across runtimes; optimize only after measurement.


---

<!-- Source: 42_SECURITY_AND_SECRET_HANDLING.md -->
# Security and Secret Handling

## Rule

Never accept raw provider secrets as model-visible context.

## Use

- environment/secret managers;
- managed identity;
- scoped credentials;
- secure config.

## Cross-Language

Secret-handling semantics should be identical even if config mechanisms differ.


---

<!-- Source: 43_DOCUMENTATION_AND_DEVELOPER_EXPERIENCE.md -->
# Documentation and Developer Experience

## Every SDK Needs

- quickstart;
- installation;
- first agent;
- tools;
- streaming;
- errors;
- cancellation;
- advanced guides;
- migration notes.

## Rule

Examples must be idiomatic for the target language, not mechanically translated.


---

<!-- Source: 44_REFERENCE_REPOSITORY_STRUCTURE.md -->
# Reference Repository Structure

## Monorepo Example

```text
/spec
/fixtures
/examples
/python
/java
/dotnet
/typescript
/docs
/ci
```

## Benefits

Shared contract and fixtures while preserving separate package builds.


---

<!-- Source: 45_CI_CD_MATRIX_BUILD.md -->
# CI/CD Matrix Build

## Pipeline

```text
Canonical Spec Change
   ↓
Shared Contract Tests
   ↓
┌─────────┬─────────┬─────────┬────────────┐
│ Python  │ Java    │ C#      │ TypeScript │
│ build   │ build   │ build   │ build      │
│ test    │ test    │ test    │ test       │
└─────────┴─────────┴─────────┴────────────┘
   ↓
Parity Gate
   ↓
Publish Packages
```

## Rule

A release is not complete until parity and package publication status are known.


---

<!-- Source: 46_INTERVIEW_QUESTIONS.md -->
# Multi-Language Agent SDK Engineering — Interview Q&A

## 1. How do you design one SDK for four languages?

Define one canonical semantic contract, then implement idiomatic APIs per language.

## 2. Should method names/signatures be identical?

No. Semantics should match; syntax should feel native.

## 3. How do you normalize streaming?

Common event model mapped to AsyncIterator, Flow.Publisher, IAsyncEnumerable and AsyncIterable.

## 4. How do you normalize cancellation?

Common cancellation semantics mapped to each language's native mechanism.

## 5. How do you handle errors?

Shared error taxonomy/code/retryability with native exception mechanisms.

## 6. What belongs in public API?

Stable Agent, Tool, Run, Context, Result, Events and adapter abstractions.

## 7. Why provider adapters?

To isolate vendor changes and keep public contracts neutral.

## 8. Codegen or handwritten?

Generate transport/mechanical types; handcraft developer-facing APIs.

## 9. How do you guarantee parity?

Shared fixtures, contract tests, feature matrix and CI parity gate.

## 10. How do you publish?

Native registries: PyPI, Maven, NuGet, npm.

## 11. How do you version?

SemVer with explicit compatibility matrix and deprecation policy.

## 12. How do you test cross-language serialization?

Canonical JSON/wire fixtures executed by every SDK.

## 13. How do you handle structured output?

Canonical schema with idiomatic typed wrappers plus runtime validation.

## 14. What is the biggest mistake?

Forcing one language's design style onto every ecosystem.

## 15. One-line principle?

> One semantic contract, four idiomatic developer experiences.


---

<!-- Source: 47_SYSTEM_DESIGN_QUESTIONS.md -->
# Multi-Language Agent SDK Engineering — System Design Questions

## Q1 — Design a Cross-Language Agent SDK Platform

Canonical spec → adapters → language APIs → shared fixtures → CI parity → native package registries.

## Q2 — Design Streaming Across Four Languages

Semantic event envelope + native async stream abstraction + cancellation + reconnect/finalization rules.

## Q3 — Design Provider-Neutral Tool Calling

Canonical tool schema/dispatcher + provider adapters + validation/authz + normalized result/error.

## Q4 — Design Backward-Compatible SDK Evolution

Additive contracts + capability metadata + deprecation + migration guides + major-version removal.

## Q5 — Design Release Automation

Common spec version → matrix builds → parity tests → package publish → docs/release notes.

## Answer Framework

**Canonical semantics → idiomatic mapping → wire/error consistency → parity tests → packaging → compatibility.**


---

<!-- Source: 48_PARITY_CHECKLIST.md -->
# Multi-Language SDK Parity Checklist

## Checklist

- [ ] Agent behavior equivalent
- [ ] Tool schema semantics equivalent
- [ ] Structured output equivalent
- [ ] Streaming event types equivalent
- [ ] Cancellation supported
- [ ] Timeout semantics equivalent
- [ ] Error codes/retryability equivalent
- [ ] Context behavior equivalent
- [ ] Memory/retrieval interfaces equivalent
- [ ] Provider capabilities documented
- [ ] Observability semantics equivalent
- [ ] Shared fixtures passing
- [ ] Serialization compatible
- [ ] Version compatibility documented
- [ ] Deprecations synchronized
- [ ] Native packaging complete
- [ ] Docs/examples updated


---

<!-- Source: 49_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
# Multi-Language Agent SDK Engineering — One-Page Final Cheat Sheet

## Formula

```text
Multi-Language Agent SDK =
Canonical Semantics
+ Idiomatic APIs
+ Shared Wire Formats
+ Shared Error Model
+ Native Async/Streaming
+ Contract Tests
+ Parity Matrix
+ Native Packaging
```

## Language Recall

```text
Python     → async/await + AsyncIterator
Java       → CompletionStage + Flow.Publisher
C#         → Task + CancellationToken + IAsyncEnumerable
TypeScript → Promise + AbortSignal + AsyncIterable
```

## Production Rules

1. Share semantics, not syntax.
2. Keep provider types out of public API.
3. Normalize errors and retryability.
4. Define one semantic streaming event model.
5. Use native cancellation mechanisms.
6. Generate mechanics; handcraft developer experience.
7. Share canonical fixtures.
8. Run parity tests in CI.
9. Publish through native registries.
10. Keep compatibility/deprecation explicit.

## 30-Second Answer

> I define one language-neutral Agent SDK contract for Agent, Tool, Run, Context, Events, Results and Errors, then map that contract idiomatically into Python, Java, C# and TypeScript. The async and streaming containers differ per language, but event semantics, cancellation behavior, wire formats, error codes and provider abstractions remain consistent. Shared fixtures, cross-language contract tests and a CI parity matrix prevent drift, while each SDK is packaged and documented natively.

## Recall Line

> **One semantic contract, four idiomatic developer experiences.**
