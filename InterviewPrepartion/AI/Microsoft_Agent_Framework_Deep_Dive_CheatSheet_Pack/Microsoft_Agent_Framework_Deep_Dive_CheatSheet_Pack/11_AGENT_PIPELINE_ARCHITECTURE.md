# Agent Pipeline Architecture

## High-Level Pipeline

```text
Agent Middleware + Telemetry
          ↓
Raw Agent
          ↓
History Provider
          ↓
Context Providers
          ↓
Chat Client Middleware
          ↓
Function Invocation / Tool Loop
          ↓
Provider-specific Chat Client
          ↓
LLM
```

## Why It Matters

The layered pipeline helps place cross-cutting behavior at the right boundary:
- whole agent run;
- individual model call;
- individual tool invocation.

## Enterprise Benefit

This architecture lets you add:
- observability;
- safety;
- retries;
- policy;
- context injection;
without hard-coding them into business logic.
