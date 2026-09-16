# Microsoft Agent Framework — One-Page Final Cheat Sheet

## Formula

```text
Agent =
Provider
+ Instructions
+ Tools
+ Middleware
+ Context Providers
+ AgentSession

Workflow =
Executors
+ Edges
+ State
+ Events
+ Checkpoints
+ HITL
```

## Key Distinctions

- Agent = open-ended/conversational execution
- Workflow = explicit multi-step control
- Middleware = cross-cutting execution behavior
- Context Provider = proactive context/memory/RAG
- AgentSession = conversational state
- Agent-as-tool = in-process delegation
- A2A = remote agent interoperability
- Harness = batteries-included long-task runtime

## Built-In Orchestration

Sequential • Concurrent • Handoff • Group Chat • Magentic

## Production Rules

1. Prefer normal code when deterministic logic is enough.
2. Use durable stores for sessions/checkpoints.
3. Keep auth/authz deterministic.
4. Bound autonomous loops.
5. Approve risky tools.
6. Use context providers deliberately; do not flood context.
7. Use A2A only across real boundaries.
8. Make side effects idempotent.
9. Trace agent/tool/workflow activity.
10. Separate model quality testing from workflow correctness.

## 30-Second Answer

> Microsoft Agent Framework is the successor to Microsoft's Semantic Kernel agent work and AutoGen. I use its common Agent abstraction with providers, tools, middleware, context providers, and AgentSession for conversational agents; graph-based workflows for explicit orchestration, checkpoints, and HITL; agents-as-tools for in-process specialization; A2A for cross-service interoperability; and Agent Harness for long multi-step tasks with planning and operational scaffolding.
