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
