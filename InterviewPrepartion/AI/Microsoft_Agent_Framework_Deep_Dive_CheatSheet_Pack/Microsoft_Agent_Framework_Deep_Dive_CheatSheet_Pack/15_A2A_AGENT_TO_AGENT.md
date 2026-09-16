# Agent-to-Agent (A2A)

## Purpose

A2A is for communication between agents across service, framework, language, or organizational boundaries.

## Architecture

```text
Local Agent
   │
   ▼
A2AAgent
   │ HTTP / A2A
   ▼
Remote Agent
```

## Key Benefit

Interoperability: a Microsoft Agent Framework agent can communicate with remote A2A-compliant agents implemented in other frameworks.

## Trade-Offs

A2A adds:
- network latency;
- distributed failure modes;
- timeouts/retries;
- remote state ownership;
- versioning;
- discovery concerns.

## Rule

Use in-process agents-as-tools first when no real service boundary exists. Use A2A when the boundary is meaningful.
