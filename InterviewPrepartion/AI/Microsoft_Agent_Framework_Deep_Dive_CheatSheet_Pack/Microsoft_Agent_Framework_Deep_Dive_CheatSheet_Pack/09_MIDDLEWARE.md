# Middleware

## Purpose

Middleware handles cross-cutting concerns without changing core agent logic.

## Middleware Layers

Agent Framework supports middleware at multiple layers, including:
- agent run;
- function calling;
- chat client/model calls.

## Common Uses

- guardrails;
- logging;
- retries;
- exception handling;
- result overrides;
- runtime context;
- termination;
- shared state.

## Order Matters

Middleware forms a chain. Registration order changes what each middleware sees and can transform.

## Interview Point

> Middleware changes how the agent runs; context providers primarily change what the agent knows.
