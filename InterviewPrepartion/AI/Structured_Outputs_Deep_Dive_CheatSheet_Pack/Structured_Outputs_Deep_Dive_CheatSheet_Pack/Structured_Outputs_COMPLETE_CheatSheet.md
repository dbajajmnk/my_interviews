# Structured Outputs — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# Structured Outputs — Master Index

## Purpose

This pack covers Structured Outputs as the typed contract layer between LLMs/agents and enterprise applications.

Interview focus:
- structured output vs free text vs JSON mode;
- JSON Schema;
- strict schema adherence;
- provider-native structured output;
- tool-based structured output;
- function calling;
- schema design;
- typed deserialization;
- validation;
- refusals and incomplete generations;
- streaming;
- versioning;
- backward compatibility;
- framework support in OpenAI, LangChain, and Microsoft Agent Framework;
- enterprise production patterns.

## Master Mental Model

```text
Unstructured Input
      ↓
     Model
      ↓
Schema-Constrained Generation
      ↓
Structured Result
      ↓
Validation / Parse
      ↓
Typed Domain Object
      ↓
API / Workflow / Database / UI
```

## Core Principle

> Structured Outputs turn model responses into contracts. They improve shape reliability, but they do not guarantee semantic correctness of the values inside that shape.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_ARE_STRUCTURED_OUTPUTS.md`
3. `03_FREE_TEXT_VS_JSON_MODE_VS_STRUCTURED_OUTPUT.md`
4. `04_JSON_SCHEMA_FUNDAMENTALS.md`
5. `05_STRICT_SCHEMA_ADHERENCE.md`
6. `06_SCHEMA_DESIGN_PRINCIPLES.md`
7. `07_REQUIRED_OPTIONAL_ENUMS_AND_BOUNDS.md`
8. `08_NESTED_OBJECTS_ARRAYS_AND_UNIONS.md`
9. `09_STRUCTURED_OUTPUT_VS_FUNCTION_CALLING.md`
10. `10_PROVIDER_NATIVE_VS_TOOL_BASED_STRATEGIES.md`
11. `11_TYPED_MODELS_PYDANTIC_ZOD_POJO_RECORDS.md`
12. `12_VALIDATION_AND_DESERIALIZATION.md`
13. `13_REFUSALS_AND_INCOMPLETE_OUTPUTS.md`
14. `14_ERROR_HANDLING_AND_RETRY.md`
15. `15_STREAMING_STRUCTURED_OUTPUTS.md`
16. `16_SCHEMA_VERSIONING_AND_COMPATIBILITY.md`
17. `17_SCHEMA_EVOLUTION_PATTERNS.md`
18. `18_SECURITY_AND_DATA_VALIDATION.md`
19. `19_PROMPT_DESIGN_FOR_STRUCTURED_OUTPUTS.md`
20. `20_OPENAI_STRUCTURED_OUTPUTS.md`
21. `21_LANGCHAIN_STRUCTURED_OUTPUTS.md`
22. `22_MICROSOFT_AGENT_FRAMEWORK_STRUCTURED_OUTPUTS.md`
23. `23_AGENT_SDK_DESIGN_FOR_STRUCTURED_OUTPUTS.md`
24. `24_PRODUCTION_ARCHITECTURE.md`
25. `25_TESTING_AND_CONTRACT_TESTS.md`
26. `26_PERFORMANCE_LATENCY_AND_COST.md`
27. `27_PYTHON_EXAMPLE.md`
28. `28_JAVA_EXAMPLE.md`
29. `29_TYPESCRIPT_EXAMPLE.md`
30. `30_CSHARP_EXAMPLE.md`
31. `31_INTERVIEW_QUESTIONS.md`
32. `32_SYSTEM_DESIGN_QUESTIONS.md`
33. `33_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Core:** 01 → 12  
**Reliability/production:** 13 → 26  
**Language examples:** 27 → 30  
**Interview mode:** 31 → 33


---

<!-- Source: 01_30_SECOND_RECALL.md -->
# Structured Outputs — 30-Second Recall

## Recall

```text
Structured Output =
Schema
+ constrained generation
+ parse
+ validate
+ typed result
```

## 30-Second Interview Answer

> Structured Outputs let an LLM return data that conforms to an explicit schema instead of arbitrary prose. I define a JSON Schema or language type, let the provider/framework constrain generation where supported, deserialize into a typed object, validate business rules, and then pass that object to downstream APIs or workflows. The schema guarantees structure, not business correctness.

## Do Not Forget

- Valid JSON is not the same as schema-conformant JSON.
- Schema conformance is not the same as semantic correctness.
- Structured output is for typed results; tool calling is for actions.
- Business validation must still run after parsing.
- Schema changes are API-contract changes.


---

<!-- Source: 02_WHAT_ARE_STRUCTURED_OUTPUTS.md -->
# What Are Structured Outputs?

## Definition

Structured Outputs are model responses constrained to match a developer-defined schema or application type.

## Why

Enterprise applications need predictable machine-readable results for:
- APIs;
- workflow routing;
- extraction;
- UI rendering;
- database writes;
- automation.

## Example

```json
{
  "category": "billing",
  "priority": "high",
  "customer_id": "C123"
}
```

## Value

They reduce brittle:
- regex parsing;
- ad-hoc string parsing;
- repeated repair prompts;
- downstream type uncertainty.


---

<!-- Source: 03_FREE_TEXT_VS_JSON_MODE_VS_STRUCTURED_OUTPUT.md -->
# Free Text vs JSON Mode vs Structured Output

## Comparison

| Mode | Guarantees |
|---|---|
| Free text | No machine-readable contract |
| JSON mode | Valid JSON syntax |
| Structured output | JSON/schema shape adherence |

## Important Distinction

JSON mode can produce:
```json
{"foo":"bar"}
```
even if your application expected:
```json
{"category":"billing","priority":"high"}
```

Structured output aims to enforce the declared schema.

## Interview Point

> JSON mode is syntactic reliability. Structured Outputs provide contract-level structural reliability.


---

<!-- Source: 04_JSON_SCHEMA_FUNDAMENTALS.md -->
# JSON Schema Fundamentals

## Core Keywords

Common schema concepts:
- `type`
- `properties`
- `required`
- `items`
- `enum`
- numeric/string constraints
- `additionalProperties`

## Example

```json
{
  "type": "object",
  "properties": {
    "category": {
      "type": "string",
      "enum": ["billing", "technical", "account"]
    },
    "priority": {
      "type": "string",
      "enum": ["low", "medium", "high"]
    }
  },
  "required": ["category", "priority"],
  "additionalProperties": false
}
```

## Rule

Keep schemas explicit, narrow, and aligned with real downstream domain types.


---

<!-- Source: 05_STRICT_SCHEMA_ADHERENCE.md -->
# Strict Schema Adherence

## What

Strict mode means generation is constrained to conform to the supplied schema where the provider supports that capability.

## Why

Without strict schema adherence, applications may still receive:
- missing fields;
- unexpected fields;
- wrong types;
- invalid enum values.

## Still Not Enough

This can be schema-valid:
```json
{"age": 999, "country_code": "ZZ"}
```

But it may still be wrong for your domain.

## Rule

**Schema validation first; business validation second.**


---

<!-- Source: 06_SCHEMA_DESIGN_PRINCIPLES.md -->
# Schema Design Principles

## Principles

1. Keep the schema minimal.
2. Prefer explicit fields over generic blobs.
3. Use enums when values are bounded.
4. Avoid unnecessary nesting.
5. Keep descriptions precise.
6. Use stable names.
7. Make downstream semantics obvious.

## Bad

```json
{"data":"anything"}
```

## Better

```json
{
  "customer_id":"C123",
  "issue_type":"billing",
  "confidence":0.91
}
```

## Interview Rule

> A schema should represent the application contract, not merely make the model output look organized.


---

<!-- Source: 07_REQUIRED_OPTIONAL_ENUMS_AND_BOUNDS.md -->
# Required, Optional, Enums and Bounds

## Required Fields

Mark truly mandatory fields as required so missing values are caught early.

## Optional Fields

Use optionality deliberately. Too many optional fields weaken the contract.

## Enums

Enums are excellent for:
- routing;
- statuses;
- categories;
- policy decisions.

## Bounds

Use bounds where supported/appropriate:
- numeric ranges;
- string lengths;
- array sizes.

## Rule

If downstream code branches on a field, constrain that field as much as reasonably possible.


---

<!-- Source: 08_NESTED_OBJECTS_ARRAYS_AND_UNIONS.md -->
# Nested Objects, Arrays and Unions

## Nested Objects

Use nested objects when the domain naturally has grouped sub-entities.

## Arrays

Use arrays for repeated items:
```json
{
  "items": [
    {"id":"A1","score":0.9},
    {"id":"A2","score":0.8}
  ]
}
```

## Unions

Union/variant schemas can model multiple result types, but they increase complexity.

## Rule

Start simple. Complex schemas increase generation difficulty and maintenance burden.


---

<!-- Source: 09_STRUCTURED_OUTPUT_VS_FUNCTION_CALLING.md -->
# Structured Output vs Function Calling

## Structured Output

Use when the model's job is to return typed data.

## Function / Tool Calling

Use when the model should request an external action or capability.

## Example

```text
Extract invoice fields → Structured Output
Fetch invoice from ERP → Tool Call
Approve invoice → Tool Call
```

## Interview Answer

> Structured output describes what the model returns. Function calling describes what action the model wants the application to execute.


---

<!-- Source: 10_PROVIDER_NATIVE_VS_TOOL_BASED_STRATEGIES.md -->
# Provider-Native vs Tool-Based Structured Output

## Provider-Native

The model/provider directly enforces a response schema.

## Tool-Based

A framework can emulate structured output by asking the model to call a synthetic tool/function whose arguments represent the desired result.

## Trade-Off

Provider-native:
- cleaner;
- usually more direct;
- capability-dependent.

Tool-based:
- broader fallback;
- may add tool-call semantics/overhead.

## Rule

Prefer provider-native schema enforcement when supported and reliable; use tool-based fallback when portability requires it.


---

<!-- Source: 11_TYPED_MODELS_PYDANTIC_ZOD_POJO_RECORDS.md -->
# Typed Models: Pydantic, Zod, POJOs and Records

## Why Typed Models

Language-native models:
- generate schemas;
- deserialize results;
- improve IDE support;
- reduce manual parsing.

## Examples

- Python → Pydantic/dataclass
- TypeScript → Zod/type schema
- Java → POJO/record + JSON Schema mapping
- C# → class/record + serializer/schema

## Rule

Keep the language type and schema derived from one source of truth where possible.


---

<!-- Source: 12_VALIDATION_AND_DESERIALIZATION.md -->
# Validation and Deserialization

## Pipeline

```text
Raw structured response
      ↓
JSON parse
      ↓
Schema/type validation
      ↓
Business validation
      ↓
Typed domain object
```

## Business Validation

Examples:
- account must exist;
- date must be in allowed range;
- total must equal line-item sum;
- user must have permission for requested action.

## Rule

Never write directly to a database just because the response deserialized successfully.


---

<!-- Source: 13_REFUSALS_AND_INCOMPLETE_OUTPUTS.md -->
# Refusals and Incomplete Outputs

## Why

A provider may not return a schema-conformant result when:
- the model refuses;
- generation is interrupted;
- token/output limit is reached;
- provider/runtime fails.

## Application Flow

```text
Response
 ├─ valid structured result → continue
 ├─ refusal → handle safely
 ├─ incomplete → retry/recover
 └─ provider error → failure policy
```

## Rule

Treat refusal/incomplete states as first-class response outcomes, not parser exceptions.


---

<!-- Source: 14_ERROR_HANDLING_AND_RETRY.md -->
# Error Handling and Retry

## Failure Categories

- JSON parse failure;
- schema validation failure;
- business validation failure;
- refusal;
- incomplete generation;
- provider error;
- timeout.

## Retry

Retry only when a different attempt can realistically succeed.

## Repair Strategy

Possible recovery:
- simplify schema;
- provide clearer examples;
- retry transient failures;
- ask model to regenerate;
- split task into smaller structured subtasks.

## Rule

Do not create infinite 'repair JSON' loops.


---

<!-- Source: 15_STREAMING_STRUCTURED_OUTPUTS.md -->
# Streaming Structured Outputs

## Challenge

Partial JSON is not a complete typed object.

## Approaches

1. stream raw/token deltas and parse only at completion;
2. stream structured field/event updates when the framework supports it;
3. aggregate then deserialize.

## Production Rule

Do not trigger irreversible downstream actions from partially streamed structured data.


---

<!-- Source: 16_SCHEMA_VERSIONING_AND_COMPATIBILITY.md -->
# Schema Versioning and Compatibility

## Why

Structured-output schemas are public contracts.

## Versioning

Use semantic principles:
- additive optional field → usually compatible;
- remove/rename required field → breaking;
- enum semantic change → potentially breaking.

## Include Version?

For long-lived integration contracts, consider:
```json
{"schema_version":"2.0", ...}
```
when it materially helps consumers.

## Rule

Schema evolution should be reviewed like API evolution.


---

<!-- Source: 17_SCHEMA_EVOLUTION_PATTERNS.md -->
# Schema Evolution Patterns

## Additive Evolution

Prefer adding optional fields over replacing existing fields abruptly.

## Deprecation

Support both old and new fields during a migration window when consumers cannot upgrade simultaneously.

## Adapter

Use an internal adapter to normalize multiple schema versions into one domain model.

## Rule

External schema stability can coexist with internal model evolution.


---

<!-- Source: 18_SECURITY_AND_DATA_VALIDATION.md -->
# Security and Data Validation

## Structured Is Not Safe

A schema-conformant value may still contain:
- malicious URLs;
- injection strings;
- unauthorized identifiers;
- dangerous commands.

## Controls

- allowlists;
- business validation;
- escaping;
- authorization;
- content filtering;
- secret/PII handling.

## Rule

Treat structured model output as untrusted input.


---

<!-- Source: 19_PROMPT_DESIGN_FOR_STRUCTURED_OUTPUTS.md -->
# Prompt Design for Structured Outputs

## Good Prompting

Even with schema constraints, instructions should explain field semantics.

## Example

Bad:
> Return priority.

Better:
> `priority` means operational urgency, not customer sentiment. Use `high` only when service is blocked or there is financial impact.

## Why

Schema constrains the allowed shape; prompt/instructions clarify the meaning of values.


---

<!-- Source: 20_OPENAI_STRUCTURED_OUTPUTS.md -->
# OpenAI Structured Outputs

## Current Model

OpenAI supports Structured Outputs via JSON Schema for model responses and strict schemas for function/tool definitions.

## Key Distinction

OpenAI documentation distinguishes:
- older JSON mode → valid JSON;
- Structured Outputs → schema-conformant JSON.

## Native SDK Support

Python/Node ecosystems can use typed schemas such as Pydantic/Zod to derive schema and deserialize results.

## Provider Behavior

Provider-side constrained decoding improves adherence to the supplied schema, but semantic mistakes inside valid fields are still possible.

## Interview Point

> OpenAI Structured Outputs solve shape reliability; they do not solve factual or business correctness.


---

<!-- Source: 21_LANGCHAIN_STRUCTURED_OUTPUTS.md -->
# LangChain Structured Outputs

## Current Pattern

LangChain agents support structured responses through `response_format`.

## Strategies

Current LangChain architecture supports:
- provider-native strategy when the provider supports structured output;
- tool-based strategy when it needs to emulate the contract through tool calling.

## Mental Model

```text
response_format = DomainSchema
      ↓
framework selects strategy
      ↓
provider-native or tool-based
      ↓
validated structured response
```

## Interview Point

> LangChain lets the application express the desired schema while the runtime chooses the best supported enforcement strategy.


---

<!-- Source: 22_MICROSOFT_AGENT_FRAMEWORK_STRUCTURED_OUTPUTS.md -->
# Microsoft Agent Framework Structured Outputs

## Current Support

Microsoft Agent Framework supports structured outputs when the underlying agent/provider supports them.

## C#

Current Microsoft guidance includes:
- generic typed `RunAsync<T>` style access;
- `ResponseFormat` for schema-based outputs;
- streaming with final aggregation/deserialization.

## Python

Python agents can use a Pydantic model or JSON-schema mapping through response-format options.

## Go

Go supports structured output with typed structs and framework options that generate schema and unmarshal results.

## Fallback

For agents without native support, an additional LLM transformation step can be used, but Microsoft explicitly notes reliability may be lower.


---

<!-- Source: 23_AGENT_SDK_DESIGN_FOR_STRUCTURED_OUTPUTS.md -->
# Agent SDK Design for Structured Outputs

## Public API

An enterprise Agent SDK should expose:
- response schema/type;
- structured result;
- validation errors;
- refusal/incomplete outcomes.

## Internal Interfaces

Possible abstractions:
```text
ResponseSchema
StructuredOutputStrategy
StructuredResult<T>
OutputValidator
SchemaCapabilities
```

## Capability Discovery

Do not assume all providers support:
- identical JSON Schema subsets;
- strict mode;
- streaming structured output;
- unions/advanced constructs.

## Rule

Normalize the developer experience while preserving provider capability differences.


---

<!-- Source: 24_PRODUCTION_ARCHITECTURE.md -->
# Structured Outputs — Production Architecture

## Reference Architecture

```text
Application Request
      ↓
Agent / LLM Service
      ↓
Schema Registry / Type
      ↓
Provider
      ↓
Structured Response
      ↓
Parser / Type Validator
      ↓
Business Validator
      ↓
Domain Service / Workflow
      ↓
Audit / Metrics
```

## Production Checklist

- schema source of truth;
- provider capability checks;
- type validation;
- business validation;
- refusal/incomplete handling;
- schema versioning;
- contract tests;
- telemetry;
- security checks.


---

<!-- Source: 25_TESTING_AND_CONTRACT_TESTS.md -->
# Testing and Contract Tests

## Schema Tests

Test:
- required fields;
- enums;
- invalid values;
- nested structures;
- backward compatibility.

## Model Contract Tests

Run evaluation examples to verify:
- expected schema;
- correct categories;
- null/optional behavior;
- refusal behavior.

## Regression

Maintain a dataset of real inputs and expected typed outputs.

## Rule

Test both structure and semantics.


---

<!-- Source: 26_PERFORMANCE_LATENCY_AND_COST.md -->
# Performance, Latency and Cost

## Latency

Complex schemas can add generation/constrained-decoding overhead.

## First-Schema Cost

Some providers may preprocess/cache schema representations, making the first use of a new schema slower than subsequent uses.

## Optimization

- reuse stable schemas;
- avoid unnecessary complexity;
- keep response objects small;
- avoid asking for fields you do not consume.

## Rule

Schema complexity has runtime cost; design contracts for application needs, not theoretical completeness.


---

<!-- Source: 27_PYTHON_EXAMPLE.md -->
# Python Example — Typed Structured Output

## Example

```python
from pydantic import BaseModel

class TicketClassification(BaseModel):
    category: str
    priority: str
    confidence: float

def validate_business_rules(x: TicketClassification):
    if not 0.0 <= x.confidence <= 1.0:
        raise ValueError("confidence out of range")
```

## Pattern

Model → typed parse → business validation → downstream logic.


---

<!-- Source: 28_JAVA_EXAMPLE.md -->
# Java Example — Typed Structured Output

## Example

```java
public record TicketClassification(
    String category,
    String priority,
    double confidence
) {}

public void validate(TicketClassification result) {
    if (result.confidence() < 0 || result.confidence() > 1) {
        throw new IllegalArgumentException("Invalid confidence");
    }
}
```

## Rule

Use JSON Schema/serializer tooling to map the provider response into stable Java domain types.


---

<!-- Source: 29_TYPESCRIPT_EXAMPLE.md -->
# TypeScript Example — Typed Structured Output

## Example

import { z } from "zod";

const TicketClassification = z.object({
  category: z.enum(["billing", "technical", "account"]),
  priority: z.enum(["low", "medium", "high"]),
  confidence: z.number().min(0).max(1),
});

type TicketClassification =
  z.infer<typeof TicketClassification>;

## Benefit

One schema can serve runtime validation and compile-time typing.


---

<!-- Source: 30_CSHARP_EXAMPLE.md -->
# C# Example — Typed Structured Output

## Example

public sealed class TicketClassification
{
    public string Category { get; set; } = "";
    public string Priority { get; set; } = "";
    public double Confidence { get; set; }
}

## Pattern

Agent response → typed deserialization → business validation → service layer.


---

<!-- Source: 31_INTERVIEW_QUESTIONS.md -->
# Structured Outputs — Interview Questions & Answers

## 1. What are Structured Outputs?

Model responses constrained to a developer-defined schema or application type.

## 2. JSON mode vs Structured Outputs?

JSON mode guarantees valid JSON syntax; Structured Outputs aim to guarantee schema adherence.

## 3. Does schema adherence guarantee correctness?

No. Values can still be semantically wrong.

## 4. Structured output vs tool calling?

Structured output returns typed data; tool calling requests an external action.

## 5. Why use strict mode?

To reduce missing/extra fields and type/enum deviations where the provider supports strict adherence.

## 6. Why still run business validation?

Schema validation cannot enforce every business rule or authorization condition.

## 7. Provider-native vs tool-based?

Provider-native is direct schema enforcement; tool-based uses a synthetic tool/function contract as fallback.

## 8. What should happen on refusal?

Handle it as an explicit outcome rather than trying to parse it as the expected schema.

## 9. What about incomplete output?

Detect completion status, then retry/recover rather than trusting a partial object.

## 10. How do you version schemas?

Treat them like APIs: additive changes first, deprecation windows, compatibility adapters.

## 11. Why keep schemas small?

Simpler schemas improve reliability, latency, and maintainability.

## 12. How do you secure structured output?

Treat it as untrusted input and apply business validation, auth checks, escaping, and allowlists.

## 13. How does LangChain handle it?

It can use provider-native or tool-based strategies through the agent response format.

## 14. How does Microsoft Agent Framework handle it?

Typed result APIs or response-format schemas when the underlying agent/provider supports structured outputs.

## 15. One-line principle?

> Schema controls shape; application logic controls meaning.


---

<!-- Source: 32_SYSTEM_DESIGN_QUESTIONS.md -->
# Structured Outputs — System Design Questions

## Q1 — Design an Invoice Extraction Service

Use:
- invoice schema;
- provider structured output;
- parse/type validation;
- business validation;
- confidence/exception handling;
- human review threshold;
- schema versioning.

## Q2 — Design a Ticket Classifier

Return:
```text
category
priority
confidence
reason_code
```
Then route deterministically based on validated fields.

## Q3 — Design Multi-Provider Structured Output

Add:
- capability registry;
- provider-native strategy;
- tool-based fallback;
- common domain schema;
- normalized validation errors.

## Q4 — Design Schema Evolution

Version external schema, maintain adapters, support old/new consumers during migration, and keep domain model independent where possible.

## Q5 — Design Streaming Structured Results

Stream progress separately; only trigger business actions after the final validated object is complete.

## Answer Framework

**Schema → provider strategy → parse → validate → refusal/incomplete → business rules → versioning → observability.**


---

<!-- Source: 33_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
# Structured Outputs — One-Page Final Cheat Sheet

## Formula

```text
Structured Output =
Schema
+ constrained generation
+ parsing
+ validation
+ typed result
```

## Key Distinctions

- Free text = no contract
- JSON mode = valid JSON
- Structured Output = schema-conformant JSON
- Tool call = action request
- Structured response = typed result

## Production Rules

1. Keep schemas small and explicit.
2. Use enums/bounds for routing-critical fields.
3. Parse into typed models.
4. Run business validation after schema validation.
5. Handle refusal/incomplete states explicitly.
6. Treat output as untrusted input.
7. Version schemas like APIs.
8. Prefer provider-native enforcement when available.
9. Use tool-based fallback when needed.
10. Never trigger irreversible actions from partial streamed output.

## 30-Second Answer

> Structured Outputs are the contract layer between the model and the application. I define a schema or language type, use provider-native schema enforcement where possible, deserialize into a typed object, handle refusal or incomplete states explicitly, run deterministic business validation, and then pass the validated result into workflows or APIs. Schema adherence solves structure, not semantic correctness.
