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
