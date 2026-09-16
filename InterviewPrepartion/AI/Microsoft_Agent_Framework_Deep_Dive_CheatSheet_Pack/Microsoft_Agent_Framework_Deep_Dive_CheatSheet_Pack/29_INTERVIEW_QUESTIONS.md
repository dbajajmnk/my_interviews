# Microsoft Agent Framework — Interview Questions & Answers

## 1. What is Microsoft Agent Framework?

Microsoft's current multi-language SDK for building AI agents and explicit workflows.

## 2. How does it relate to Semantic Kernel and AutoGen?

It is their direct successor for agent development, combining AutoGen-style agent abstractions with Semantic Kernel enterprise capabilities and adding explicit workflows/state.

## 3. What is AgentSession?

The conversation/session state object used to maintain continuity across agent runs.

## 4. Middleware vs context provider?

Middleware changes how execution behaves; context providers proactively inject and optionally persist what the agent knows.

## 5. Tool vs context provider?

A tool is model-invoked/reactive; a context provider injects context proactively.

## 6. What is the agent pipeline?

Agent middleware → history/context providers → chat-client middleware/tool loop → provider/model, with telemetry at the appropriate boundaries.

## 7. Agents as tools vs A2A?

Agents-as-tools is in-process composition. A2A is for remote, cross-service/framework communication.

## 8. When use a workflow?

When execution order, branching, state, recovery, or multi-step coordination must be explicit.

## 9. What are the built-in orchestration patterns?

Sequential, concurrent, handoff, group chat, and Magentic.

## 10. How does HITL work?

A workflow or approval-required tool requests external input and pauses until the response is supplied.

## 11. What is Agent Harness?

A batteries-included wrapper for long multi-step tasks, adding planning, todos, memory/compaction, approvals, and operational scaffolding.

## 12. Why bound loops?

Completion predicates can fail and models can stall; unlimited loops create cost and reliability risk.

## 13. What role does OpenTelemetry play?

End-to-end tracing/metrics/events for agent runs, model/tool activity, and workflow execution.

## 14. How do you make sessions production-ready?

Use durable external storage, tenant-scoped keys, retention policy, and distributed consistency appropriate to the application.

## 15. One-line design principle?

> Use agents for ambiguity, workflows for control, and deterministic code for invariants.
