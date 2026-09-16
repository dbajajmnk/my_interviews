# Context Providers

## Purpose

Context providers proactively inject relevant information before agent execution and may extract/store state afterward.

## Use Cases

- conversation memory;
- user preferences;
- personalization;
- RAG;
- enterprise knowledge;
- per-session context.

## Context Provider vs Tool

- Tool = reactive; model decides to call it.
- Context provider = proactive; relevant information is injected without relying on the model to ask.

## Lifecycle

```text
Before run
  ↓
load memory / knowledge
  ↓
inject context
  ↓
agent/model executes
  ↓
after run
  ↓
persist selected state
```
