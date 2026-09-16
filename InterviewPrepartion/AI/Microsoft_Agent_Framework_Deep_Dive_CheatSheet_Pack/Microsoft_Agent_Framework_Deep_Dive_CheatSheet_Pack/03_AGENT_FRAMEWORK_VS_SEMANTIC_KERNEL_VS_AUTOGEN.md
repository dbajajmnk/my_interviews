# Agent Framework vs Semantic Kernel vs AutoGen

## Current Direction

Microsoft Agent Framework is the direct successor to both Semantic Kernel agent capabilities and AutoGen.

## What It Inherits

From AutoGen:
- simple agent abstractions;
- multi-agent coordination concepts.

From Semantic Kernel:
- session-based state;
- type safety;
- middleware/filters;
- telemetry;
- broad model/embedding integration.

## What It Adds

- explicit graph-based workflows;
- stronger workflow state management;
- long-running/HITL scenarios;
- unified agent interface across providers;
- hosting and A2A integration.

## Interview Positioning

> I would treat Semantic Kernel and AutoGen as important predecessor ecosystems. For new Microsoft agent-platform work, I would evaluate Microsoft Agent Framework first, while planning migrations for existing codebases rather than rewriting blindly.
