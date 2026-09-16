# Microsoft Agent Framework — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# Microsoft Agent Framework — Master Index

## Purpose

This pack covers Microsoft Agent Framework as the current Microsoft multi-language SDK for building AI agents and workflows.

Interview focus:
- Agent abstraction
- AgentSession
- tools
- middleware
- context providers
- memory and persistence
- provider abstraction
- workflows
- executors and edges
- checkpoints and HITL
- orchestrations
- agents as tools
- A2A
- Agent Harness
- hosting
- observability
- migration from Semantic Kernel and AutoGen

## Master Mental Model

```text
Application
   │
   ▼
Agent
 ├─ Model / Remote Agent
 ├─ Instructions
 ├─ Tools
 ├─ Middleware
 ├─ Context Providers
 └─ AgentSession
   │
   ▼
Run / Stream
   │
   ├─ Model Provider
   ├─ Function Invocation
   ├─ Memory / Context
   ├─ Telemetry
   └─ Safety Controls

For explicit orchestration:

Workflow
 ├─ Executors
 ├─ Edges
 ├─ State
 ├─ Events
 ├─ Checkpoints
 └─ HITL
```

## Current Positioning

Microsoft Agent Framework is the direct successor to both Semantic Kernel agent work and AutoGen, combining AutoGen-style agent abstractions with Semantic Kernel's enterprise capabilities and adding graph-based workflows, stronger state management, and production-oriented orchestration.

Current official language support is centered on C#, Python, and Go. Keep this in mind for interviews: the Coforge role asks broader multi-language SDK experience, so use Microsoft Agent Framework as the Microsoft ecosystem implementation while discussing Java/TypeScript separately at the enterprise SDK architecture layer.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_MICROSOFT_AGENT_FRAMEWORK.md`
3. `03_AGENT_FRAMEWORK_VS_SEMANTIC_KERNEL_VS_AUTOGEN.md`
4. `04_AGENT_CORE_ABSTRACTION.md`
5. `05_AGENT_TYPES_AND_PROVIDERS.md`
6. `06_RUNNING_AND_STREAMING_AGENTS.md`
7. `07_AGENT_SESSION_AND_CONVERSATION_STATE.md`
8. `08_FUNCTION_TOOLS.md`
9. `09_MIDDLEWARE.md`
10. `10_CONTEXT_PROVIDERS.md`
11. `11_AGENT_PIPELINE_ARCHITECTURE.md`
12. `12_MEMORY_AND_PERSISTENCE.md`
13. `13_STRUCTURED_OUTPUT_AND_RUNTIME_OPTIONS.md`
14. `14_AGENTS_AS_TOOLS.md`
15. `15_A2A_AGENT_TO_AGENT.md`
16. `16_WORKFLOW_FUNDAMENTALS.md`
17. `17_EXECUTORS_EDGES_AND_STATE.md`
18. `18_WORKFLOW_CHECKPOINTS_AND_RESUME.md`
19. `19_HUMAN_IN_THE_LOOP.md`
20. `20_MULTI_AGENT_ORCHESTRATIONS.md`
21. `21_AGENT_HARNESS.md`
22. `22_AGENT_LOOPING_AND_LONG_TASKS.md`
23. `23_HOSTING_AND_SELF_HOSTING.md`
24. `24_OBSERVABILITY_AND_OPENTELEMETRY.md`
25. `25_SECURITY_AND_SAFETY.md`
26. `26_PRODUCTION_ARCHITECTURE.md`
27. `27_TESTING_AND_EVALUATION.md`
28. `28_MIGRATION_FROM_SK_AND_AUTOGEN.md`
29. `29_INTERVIEW_QUESTIONS.md`
30. `30_SYSTEM_DESIGN_QUESTIONS.md`
31. `31_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Core agents:** 01 → 13  
**Composition/orchestration:** 14 → 22  
**Production:** 23 → 28  
**Interview mode:** 29 → 31


---

<!-- Source: 01_30_SECOND_RECALL.md -->
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


---

<!-- Source: 02_WHAT_IS_MICROSOFT_AGENT_FRAMEWORK.md -->
# What Is Microsoft Agent Framework?

## Definition

Microsoft Agent Framework is a multi-language SDK for building AI agents and workflows using LLMs and remote agent runtimes.

## Why It Exists

It unifies ideas from:
- Semantic Kernel enterprise integration;
- AutoGen multi-agent patterns;
- explicit workflow orchestration;
- persistent state and long-running execution.

## When to Use an Agent

Use an agent when:
- the task is open-ended;
- the model must choose tools;
- the interaction is conversational;
- dynamic planning adds value.

## When to Use a Workflow

Use a workflow when:
- execution order matters;
- steps are known;
- multiple agents/functions must coordinate;
- state and recoverability need explicit control.

## Golden Rule

> If a normal function solves the problem cleanly, prefer the function. Use an agent only where model-driven behavior adds value.


---

<!-- Source: 03_AGENT_FRAMEWORK_VS_SEMANTIC_KERNEL_VS_AUTOGEN.md -->
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


---

<!-- Source: 04_AGENT_CORE_ABSTRACTION.md -->
# Agent Core Abstraction

## Agent Composition

An Agent Framework agent combines:
- agent abstraction;
- model or remote-agent connection;
- instructions;
- tools;
- middleware;
- context providers;
- session state.

## Python Mental Model

```python
from agent_framework import Agent

agent = Agent(
    client=client,
    instructions="You are a helpful assistant.",
)
```

## C# Mental Model

```text
IChatClient
   ↓
AsAIAgent(...)
   ↓
AIAgent
```

## Design Principle

Use the common agent interface so application code stays relatively stable across providers and remote-agent implementations.


---

<!-- Source: 05_AGENT_TYPES_AND_PROVIDERS.md -->
# Agent Types and Providers

## Standard Agent

A standard agent wraps a chat/inference client and exposes a common run/session/tool interface.

## Specialized/Remote Agent Types

Current documentation includes agent types such as:
- FoundryAgent;
- A2AAgent;
- GitHubCopilotAgent;
- ClaudeAgent;
- custom agents.

## Provider Boundary

Provider-specific setup belongs at the client/provider boundary.

Application logic should depend on the common agent abstraction where practical.

## Interview Point

> Provider neutrality is useful, but capability differences still matter. I keep a common interface while preserving provider-specific capabilities where they add real value.


---

<!-- Source: 06_RUNNING_AND_STREAMING_AGENTS.md -->
# Running and Streaming Agents

## Run Modes

Agents support:
- normal runs;
- streaming runs;
- run options;
- typed responses/messages.

## Concept

```text
Input
 ↓
Agent.run / RunAsync
 ↓
Agent pipeline
 ↓
Provider/model
 ↓
Agent response

or

Input
 ↓
run(stream=True) / RunStreamingAsync
 ↓
incremental updates
```

## Why Streaming Matters

Streaming improves:
- UI responsiveness;
- tool progress visibility;
- long-task UX;
- operational diagnostics.


---

<!-- Source: 07_AGENT_SESSION_AND_CONVERSATION_STATE.md -->
# AgentSession and Conversation State

## Purpose

`AgentSession` carries conversation state across multiple agent runs.

## Mental Model

```text
Run 1 ─┐
Run 2 ─┼─ AgentSession
Run 3 ─┘
```

## Use Cases

- multi-turn chat;
- tool-calling continuity;
- harness planning/todo state;
- persisted conversation state.

## Production Rule

Do not rely on process-local session storage in a scaled deployment. Use durable session storage when continuity must survive restarts or multiple instances.


---

<!-- Source: 08_FUNCTION_TOOLS.md -->
# Function Tools

## What

Function tools expose application functions/capabilities to an agent.

## Flow

```text
Model selects tool
      ↓
Tool schema / arguments
      ↓
Function invocation
      ↓
Tool result
      ↓
Model continues
```

## Production Controls

- clear descriptions;
- typed schemas;
- validation;
- least privilege;
- approval for risky tools;
- timeouts;
- idempotency;
- auditing.

## Harness Note

Harness Agents can configure automatic function invocation and tool approval behavior for you.


---

<!-- Source: 09_MIDDLEWARE.md -->
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


---

<!-- Source: 10_CONTEXT_PROVIDERS.md -->
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


---

<!-- Source: 11_AGENT_PIPELINE_ARCHITECTURE.md -->
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


---

<!-- Source: 12_MEMORY_AND_PERSISTENCE.md -->
# Memory and Persistence

## Short-Term

Conversation history can be maintained in the agent session/history provider.

## Persistent Context

Context providers can load/store longer-lived information such as preferences, user context, or RAG-derived state.

## Persistence Rule

Separate:
- conversational/session state;
- durable workflow state;
- long-term user/domain memory.

## Production Questions

Ask:
- retention duration?
- deletion policy?
- tenant isolation?
- encryption?
- who can read/write memory?
- how is stale memory handled?


---

<!-- Source: 13_STRUCTURED_OUTPUT_AND_RUNTIME_OPTIONS.md -->
# Structured Output and Runtime Options

## Structured Output

Provider/runtime layers can support structured-output handling so downstream code receives typed data instead of relying on free-form parsing.

## Runtime Options

Agent runs can vary behavior through:
- per-run configuration;
- provider options;
- middleware;
- context;
- model routing.

## Interview Rule

> Prefer typed output contracts when results feed APIs, workflows, or automation.


---

<!-- Source: 14_AGENTS_AS_TOOLS.md -->
# Agents as Tools

## What

One agent can expose another agent as a tool for in-process delegation.

## Mental Model

```text
Manager Agent
   ├─ Research Agent as tool
   ├─ Data Agent as tool
   └─ Writer Agent as tool
```

## When to Use

Use agents-as-tools when:
- all agents are in the same application/runtime;
- the parent should retain control;
- specialization improves tool/instruction focus.

## Why Not One Huge Agent?

As agents accumulate many tools and broad instructions, tool selection and role focus can degrade.


---

<!-- Source: 15_A2A_AGENT_TO_AGENT.md -->
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


---

<!-- Source: 16_WORKFLOW_FUNDAMENTALS.md -->
# Workflow Fundamentals

## Definition

Workflows provide explicit, inspectable execution paths for coordinating code, agents, state, events, and human input.

## Graph Model

```text
Executor A
    │
   edge
    ▼
Executor B
    │
 condition
   /     \
  ▼       ▼
 C         D
```

## APIs

All current SDKs support graph-based workflows.

Python also has an experimental functional workflow API using native Python control flow.

## When to Prefer Workflow

Use workflows when:
- order must be explicit;
- branching must be deterministic;
- multiple components coordinate;
- checkpoints/recovery matter;
- HITL must be modeled.


---

<!-- Source: 17_EXECUTORS_EDGES_AND_STATE.md -->
# Executors, Edges and State

## Executors

Executors receive inputs, perform work, and emit outputs.

## Edges

Edges route values/messages between executors and can include conditions.

## State

Workflow state allows executors to share and modify common run data when direct message passing is not enough.

## Supersteps

Graph workflows execute in supersteps, enabling deterministic coordination, fan-out/fan-in, and checkpoint boundaries.

## Interview Point

> In workflows, agent reasoning is one executor type among many. Deterministic code executors are equally important.


---

<!-- Source: 18_WORKFLOW_CHECKPOINTS_AND_RESUME.md -->
# Workflow Checkpoints and Resume

## Purpose

Checkpointing saves workflow progress so execution can resume after a pause or failure.

## Why

Useful for:
- long-running workflows;
- human approval waits;
- transient failures;
- restart recovery.

## Production Rule

Checkpoint storage should be durable and external to the application process for production.

## Idempotency

Resume/retry paths must protect side effects from duplicate execution.


---

<!-- Source: 19_HUMAN_IN_THE_LOOP.md -->
# Human in the Loop

## Workflow HITL

Executors can request information or approval from outside the workflow and wait for a response.

## Pattern

```text
Agent / Executor
      ↓
Request external input
      ↓
Workflow pauses
      ↓
Human / system response
      ↓
Resume
```

## Use Cases

- payment approval;
- destructive action;
- compliance review;
- content review;
- missing business input.

## Interview Point

> HITL should be a modeled workflow state with persisted recovery, not a manual side channel.


---

<!-- Source: 20_MULTI_AGENT_ORCHESTRATIONS.md -->
# Multi-Agent Orchestrations

## Built-In Patterns

Current Agent Framework includes built-in orchestration patterns:
- Sequential
- Concurrent
- Handoff
- Group Chat
- Magentic

## Sequential

Agents run one after another in a defined order.

## Concurrent

Agents run in parallel when tasks are independent.

## Handoff

Control transfers between agents based on context.

## Group Chat

Agents collaborate in a shared conversation.

## Magentic

A manager dynamically coordinates specialized agents.

## Rule

Start with the simplest orchestration that meets the requirement.


---

<!-- Source: 21_AGENT_HARNESS.md -->
# Agent Harness

## What

Agent Harness is opinionated runtime scaffolding for longer, multi-step agent tasks.

## Batteries Included

The harness can compose capabilities such as:
- planning/execution modes;
- todo tracking;
- context compaction;
- file memory;
- file access;
- tool approval;
- observability;
- optional bounded looping.

## Mental Model

```text
Chat Client
   ↓
Harness
 ├─ planning
 ├─ todo state
 ├─ context compaction
 ├─ memory/files
 ├─ approvals
 ├─ telemetry
 └─ optional loop
   ↓
Agent interface
```

## When to Use

Use a harness when building coding, research, analysis, or other long-running interactive agents where you would otherwise assemble the same scaffolding manually.


---

<!-- Source: 22_AGENT_LOOPING_AND_LONG_TASKS.md -->
# Agent Looping and Long Tasks

## Looping

Agent looping re-invokes an agent until a completion condition is satisfied.

## Use Cases

- iterative refinement;
- todo completion;
- waiting for background work;
- evaluator-driven completion.

## Critical Rule

Always bound autonomous loops.

## Controls

- maximum iterations;
- completion predicate;
- progress injection;
- fresh-context option;
- approval escape.

## Experimental Note

Agent looping is currently marked experimental in the framework documentation.


---

<!-- Source: 23_HOSTING_AND_SELF_HOSTING.md -->
# Hosting and Self-Hosting

## Self-Hosting

Agent Framework can be hosted in application-owned services.

## Session Storage

Default process-local session storage is suitable for development only. Production should use Redis, database, blob storage, or another durable store as appropriate.

## A2A Hosting

Framework hosting packages can expose agents through the A2A protocol.

## Production Requirements

- authentication;
- durable sessions;
- distributed state;
- rate limits;
- health checks;
- deployment scaling;
- trace/metrics;
- protocol versioning.


---

<!-- Source: 24_OBSERVABILITY_AND_OPENTELEMETRY.md -->
# Observability and OpenTelemetry

## Built-In Telemetry Boundary

The agent pipeline includes telemetry layers, and Agent Framework integrates with OpenTelemetry-style instrumentation.

## Observe

- agent runs;
- model calls;
- tool calls;
- workflow executor activity;
- workflow events;
- checkpoint/delivery status;
- errors;
- latency.

## Architecture

```text
Agent / Workflow
   │
   ├─ spans
   ├─ metrics
   └─ events
        ↓
OpenTelemetry
        ↓
Collector / Backend
```

## Enterprise Rule

Do not log sensitive prompts/tool payloads by default. Apply redaction and data-governance policy.


---

<!-- Source: 25_SECURITY_AND_SAFETY.md -->
# Security and Safety

## Deterministic Security

Keep:
- authentication;
- authorization;
- tenant isolation;
- secrets;
- approval policy
outside probabilistic model reasoning.

## Tool Safety

Classify tools by:
- read/write;
- sensitivity;
- reversibility;
- approval requirement.

## Middleware and Guardrails

Use middleware for:
- validation;
- termination;
- moderation;
- redaction;
- exception handling.

## Third-Party Systems

Remote agents, tools, or third-party providers introduce their own security and licensing/trust boundaries. Treat them as external systems.


---

<!-- Source: 26_PRODUCTION_ARCHITECTURE.md -->
# Microsoft Agent Framework — Production Architecture

## Reference Architecture

```text
Client / UI
    │
Gateway / Auth
    │
Agent Service
    │
Microsoft Agent Framework
 ├─ Agent
 │   ├─ Provider
 │   ├─ Tools
 │   ├─ Middleware
 │   ├─ Context Providers
 │   └─ AgentSession
 │
 ├─ Workflow Runtime
 │   ├─ Executors
 │   ├─ Edges
 │   ├─ State
 │   └─ Checkpoints
 │
 ├─ A2A
 ├─ MCP / Enterprise Tools
 ├─ Durable Stores
 └─ OpenTelemetry
```

## Production Checklist

- durable session store;
- durable checkpoint store;
- identity propagation;
- scoped tools;
- bounded loops;
- retries/timeouts;
- HITL for sensitive actions;
- observability;
- model/tool cost controls;
- evaluation;
- multi-tenant isolation.


---

<!-- Source: 27_TESTING_AND_EVALUATION.md -->
# Testing and Evaluation

## Unit Testing

Test:
- function tools;
- middleware;
- context providers;
- executors;
- routing conditions.

## Integration Testing

Test:
- session continuity;
- provider behavior;
- workflow paths;
- A2A failures;
- checkpoint/resume;
- tool approval.

## Evaluation

Measure:
- task success;
- tool correctness;
- orchestration correctness;
- groundedness;
- latency;
- cost;
- safety;
- human escalation rate.

## Rule

Test deterministic workflow logic separately from probabilistic model quality.


---

<!-- Source: 28_MIGRATION_FROM_SK_AND_AUTOGEN.md -->
# Migration from Semantic Kernel and AutoGen

## Why Migration Matters

Many enterprise codebases already use Semantic Kernel or AutoGen.

Do not assume greenfield development.

## Semantic Kernel Migration Themes

Current Microsoft guidance emphasizes:
- simplified agent creation;
- unified interfaces;
- updated namespaces;
- session creation;
- tool registration changes;
- streaming/non-streaming invocation;
- DI changes;
- agent type consolidation.

## AutoGen Migration Themes

Agent Framework carries forward multi-agent concepts while providing a new unified foundation with stronger enterprise runtime/workflow features.

## Interview Answer

> I would migrate incrementally: inventory current agents/tools, map session and tool abstractions, preserve behavioral tests, introduce the new common agent interface, then migrate orchestration and persistence separately rather than doing a big-bang rewrite.


---

<!-- Source: 29_INTERVIEW_QUESTIONS.md -->
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


---

<!-- Source: 30_SYSTEM_DESIGN_QUESTIONS.md -->
# Microsoft Agent Framework — System Design Questions

## Q1 — Design an Enterprise Support Agent

```text
API/Auth
 ↓
Support Agent
 ├─ Context Provider → CRM profile + KB
 ├─ Function Tool → Order service
 ├─ Function Tool → Ticket service
 ├─ Middleware → policy/logging
 └─ AgentSession → conversation state
```

## Q2 — Design a Multi-Agent Case Workflow

```text
Workflow
 ↓
Triage Executor
 ↓
Sequential / Handoff orchestration
 ├─ Billing Agent
 ├─ Technical Agent
 └─ Compliance Agent
 ↓
Human approval if needed
 ↓
Finalizer
```

## Q3 — Design Cross-Company Agent Collaboration

Use A2A:
- discovery/agent cards;
- remote agent call;
- auth;
- timeout/retry;
- distributed tracing;
- versioning;
- remote state ownership.

## Q4 — Design Long-Running Research Agent

Use Agent Harness with:
- session;
- planning/todos;
- context compaction;
- memory;
- bounded looping;
- approvals;
- observability.

## Q5 — Design Durable Human-Approved Workflow

Use:
- explicit workflow;
- checkpoint store;
- request/response HITL;
- idempotent side effects;
- audit;
- resume semantics.

## Answer Framework

**Agent vs workflow → provider → tools → session/context → middleware → orchestration → persistence → HITL → A2A → observability → security.**


---

<!-- Source: 31_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
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
