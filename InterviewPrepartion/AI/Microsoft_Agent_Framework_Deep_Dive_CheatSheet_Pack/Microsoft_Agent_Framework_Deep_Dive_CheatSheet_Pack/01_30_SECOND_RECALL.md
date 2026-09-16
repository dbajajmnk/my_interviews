# Microsoft Agent Framework — 30-Second Recall

## Recall

```text
Agent =
model/provider
+ instructions
+ tools
+ middleware
+ context providers
+ AgentSession

Workflow =
executors
+ edges
+ state
+ events
+ checkpoints
+ HITL
```

## 30-Second Interview Answer

> Microsoft Agent Framework is Microsoft's current SDK for building agents and explicit multi-step workflows. An agent combines a model or remote-agent connection with instructions, tools, middleware, context providers, and session state behind a common run interface. When I need explicit orchestration, I use workflows with executors, edges, state, checkpoints, human-in-the-loop, and built-in multi-agent orchestration patterns.

## Must Remember

- direct successor to Semantic Kernel agent work and AutoGen;
- agents for open-ended tool use;
- workflows for explicit execution paths;
- sessions maintain conversation state;
- middleware handles cross-cutting behavior;
- context providers handle memory/personalization/RAG;
- A2A handles remote cross-boundary agent communication;
- Agent Harness adds batteries-included long-task scaffolding.
