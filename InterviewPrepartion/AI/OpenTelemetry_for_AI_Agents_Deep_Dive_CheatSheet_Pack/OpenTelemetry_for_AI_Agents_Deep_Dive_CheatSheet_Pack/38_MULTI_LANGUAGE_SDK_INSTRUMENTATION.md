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
