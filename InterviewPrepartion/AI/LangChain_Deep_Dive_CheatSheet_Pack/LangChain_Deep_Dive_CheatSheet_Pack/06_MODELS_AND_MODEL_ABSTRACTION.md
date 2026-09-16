# Models and Model Abstraction

## Purpose

LangChain provides common interfaces over model providers so application architecture is less coupled to a specific vendor.

## Model Responsibilities

Models may support:
- standard chat generation;
- streaming;
- tool calling;
- structured output;
- multimodal input;
- provider-native features.

## Capability Awareness

Do not assume all models support identical features.

Architect for:
```text
Model selection
 ↓
Capability check
 ↓
Tool/structured-output/streaming behavior
```

## Interview Principle

> Use LangChain's abstraction for portability, but preserve provider-specific capabilities when they materially improve quality or reliability.
