# OpenAI Agents SDK — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# OpenAI Agents SDK Deep Dive — Master Index

## Purpose

This pack covers the OpenAI Agents SDK as an enterprise agent-runtime option for building tool-using, multi-agent, guarded, observable applications.

Primary interview focus:
- Agent
- Runner
- tools
- handoffs
- agents-as-tools
- guardrails
- sessions
- context management
- structured outputs
- results
- streaming
- human approval
- tracing
- MCP
- realtime agents
- orchestration and production design

## Master Mental Model

```text
Application
   │
   ▼
Agent
 ├─ instructions
 ├─ model
 ├─ tools
 ├─ handoffs
 ├─ guardrails
 └─ output type
   │
   ▼
Runner
   │
   ├─ manages turns
   ├─ executes tools
   ├─ performs handoffs
   ├─ maintains run context
   ├─ emits results/events
   └─ traces execution
```

## Current Positioning

The Agents SDK is a higher-level runtime over model APIs. For OpenAI models it uses the Responses API by default, while the SDK manages orchestration concerns such as turns, tools, guardrails, handoffs, sessions, approvals, and tracing.

Use the Responses API directly when you want to own the loop yourself. Use the Agents SDK when you want those runtime behaviors managed for you.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_OPENAI_AGENTS_SDK.md`
3. `03_AGENTS_SDK_VS_RESPONSES_API.md`
4. `04_AGENT_CORE_ABSTRACTION.md`
5. `05_RUNNER_AND_AGENT_LOOP.md`
6. `06_MODELS_AND_PROVIDER_BOUNDARY.md`
7. `07_FUNCTION_TOOLS.md`
8. `08_HOSTED_AND_RUNTIME_TOOLS.md`
9. `09_AGENTS_AS_TOOLS.md`
10. `10_HANDOFFS.md`
11. `11_ORCHESTRATION_PATTERNS.md`
12. `12_GUARDRAILS.md`
13. `13_CONTEXT_MANAGEMENT.md`
14. `14_SESSIONS_AND_MEMORY.md`
15. `15_RESULTS_AND_RUN_ITEMS.md`
16. `16_STRUCTURED_OUTPUTS.md`
17. `17_STREAMING.md`
18. `18_HUMAN_IN_THE_LOOP.md`
19. `19_TRACING_AND_OBSERVABILITY.md`
20. `20_USAGE_AND_COST_TRACKING.md`
21. `21_MCP_INTEGRATION.md`
22. `22_REALTIME_AGENTS.md`
23. `23_SECURITY_AND_ENTERPRISE_CONTROLS.md`
24. `24_ERROR_HANDLING_RETRIES_AND_IDEMPOTENCY.md`
25. `25_PRODUCTION_ARCHITECTURE.md`
26. `26_TESTING_AND_EVALUATION.md`
27. `27_INTERVIEW_QUESTIONS.md`
28. `28_SYSTEM_DESIGN_QUESTIONS.md`
29. `29_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Core:** 01 → 12  
**Runtime/state:** 13 → 20  
**Enterprise integration:** 21 → 26  
**Interview mode:** 27 → 29


---

<!-- Source: 01_30_SECOND_RECALL.md -->
# OpenAI Agents SDK — 30-Second Recall

## Recall

```text
Agent = model + instructions + tools + handoffs + guardrails
Runner = execution loop
Session = conversation memory
Context = local app dependencies/state
Handoff = transfer control to another agent
Agent-as-tool = delegate without transferring ownership
Tracing = built in
HITL = pause on tool approval
```

## 30-Second Interview Answer

> The OpenAI Agents SDK is a lightweight agent runtime built around a small set of primitives: agents, tools, handoffs, guardrails, sessions, and tracing. I define an Agent with instructions and capabilities, then Runner manages the loop, tool execution, handoffs, and final result. I use sessions for working conversation memory, RunContextWrapper for local application context, human approval for sensitive tools, and built-in tracing to observe the full workflow.

## Do Not Forget

- OpenAI models use the Responses API by default underneath the SDK.
- The SDK manages the loop; Responses API alone leaves more orchestration to you.
- Handoff transfers control; agent-as-tool does not.
- Session memory and local run context solve different problems.
- Guardrails are validation mechanisms, not a replacement for auth/authz.


---

<!-- Source: 02_WHAT_IS_OPENAI_AGENTS_SDK.md -->
# What Is the OpenAI Agents SDK?

## Definition

The OpenAI Agents SDK is a lightweight framework for building agentic applications with a deliberately small set of runtime primitives.

## Core Primitives

- Agents
- Function and hosted tools
- Agents as tools
- Handoffs
- Guardrails
- Sessions
- Human-in-the-loop
- Tracing

## Design Philosophy

Its design emphasizes:
1. few abstractions;
2. strong defaults;
3. customizability when needed;
4. Python-native orchestration.

## When It Fits

Use it when you want:
- a managed agent loop;
- tool execution;
- multi-agent delegation;
- sessions;
- approvals;
- tracing;
- OpenAI-native integration with minimal framework overhead.


---

<!-- Source: 03_AGENTS_SDK_VS_RESPONSES_API.md -->
# Agents SDK vs Responses API

## Responses API

Use the Responses API directly when you want to own:
- the execution loop;
- tool dispatch;
- state handling;
- orchestration.

## Agents SDK

Use the Agents SDK when you want the runtime to manage:
- multiple turns;
- tools;
- handoffs;
- guardrails;
- sessions;
- run results;
- approvals;
- tracing.

## Mental Model

```text
Responses API
Application owns orchestration
        │
        ▼
     Model API

Agents SDK
Application
   │
   ▼
Agent + Runner
   │
   ▼
Responses API / Model
```

## Interview Answer

> The Responses API is the lower-level model/tool interface. The Agents SDK adds an opinionated but lightweight runtime around it. I choose based on how much orchestration I want the application to own.


---

<!-- Source: 04_AGENT_CORE_ABSTRACTION.md -->
# Agent Core Abstraction

## Agent

An Agent is an LLM configured with:
- name;
- instructions;
- model/model settings;
- tools;
- handoffs;
- guardrails;
- optional structured output behavior.

## Conceptual Example

```python
from agents import Agent

agent = Agent(
    name="Support Agent",
    instructions="Resolve customer support requests safely and concisely.",
    tools=[...],
    handoffs=[...],
)
```

## Dynamic Behavior

Instructions and other behavior can be made dynamic when runtime context requires per-user, per-tenant, or per-task customization.

## Interview Point

> Agent is configuration plus capabilities; Runner is execution.


---

<!-- Source: 05_RUNNER_AND_AGENT_LOOP.md -->
# Runner and the Agent Loop

## Runner

`Runner` executes an agent workflow.

## Common Modes

- `Runner.run(...)`
- `Runner.run_sync(...)`
- `Runner.run_streamed(...)`

## Loop

```text
Input
 ↓
Agent model call
 ↓
Final?
 ├─ Yes → RunResult
 └─ No
      ├─ Tool call → execute → model again
      └─ Handoff → new agent → continue
```

## Runtime Responsibilities

The Runner coordinates:
- model turns;
- tool execution;
- handoffs;
- guardrails;
- context/usage accumulation;
- interruptions;
- final result generation.


---

<!-- Source: 06_MODELS_AND_PROVIDER_BOUNDARY.md -->
# Models and Provider Boundary

## Default

For OpenAI models, the Agents SDK uses the Responses API by default.

## Architecture Principle

Keep business logic dependent on Agent SDK/runtime abstractions rather than scattering raw provider calls throughout the application.

## Non-OpenAI / Alternative Model Paths

The SDK supports model/provider customization. Treat provider capability differences explicitly rather than assuming identical support.

## Interview Point

> Even when using an OpenAI-first SDK, I keep business logic separate from model-specific concerns so provider choice remains an architectural boundary.


---

<!-- Source: 07_FUNCTION_TOOLS.md -->
# Function Tools

## Purpose

Function tools convert Python functions into typed agent capabilities.

## Example

```python
from agents import function_tool

@function_tool
def get_order_status(order_id: str) -> str:
    """Return the status of an order."""
    return f"{order_id}: shipped"
```

## Why Useful

The SDK can derive schema from Python type information and use validation around tool inputs.

## Production Rules

- keep tool intent narrow;
- validate inputs;
- use least-privilege credentials;
- time-bound execution;
- make writes idempotent;
- audit tool calls.

## Key Interview Phrase

> A function tool is a controlled capability exposed to the model, not arbitrary code execution.


---

<!-- Source: 08_HOSTED_AND_RUNTIME_TOOLS.md -->
# Hosted and Runtime Tools

## Tool Categories

Current SDK documentation distinguishes multiple tool categories, including:
- hosted OpenAI tools;
- local/runtime execution tools;
- function tools;
- agents as tools;
- experimental workspace/Codex-style tooling.

## Examples of Hosted Tools

Examples documented for OpenAI Responses models include:
- web search;
- file search;
- code interpreter;
- hosted MCP;
- image generation;
- tool search;
- programmatic tool calling.

## Runtime Design

Decide where execution happens:
- OpenAI-managed;
- local process;
- remote enterprise service;
- isolated sandbox.

## Security Rule

Execution location changes the threat model. Local shell/computer tools require much stricter controls than read-only retrieval tools.


---

<!-- Source: 09_AGENTS_AS_TOOLS.md -->
# Agents as Tools

## Concept

An agent can be exposed as a tool to another agent.

## Mental Model

```text
Manager Agent
   │
   ├─ call Research Agent as tool
   ├─ call Coding Agent as tool
   └─ synthesize final answer
```

## Why

Use this when the top-level manager should retain ownership of the conversation and simply delegate specialist work.

## Difference from Handoff

- **Agent as tool:** manager keeps control.
- **Handoff:** control transfers to specialist agent.

## Interview Rule

Choose based on conversation ownership, not merely on the number of agents.


---

<!-- Source: 10_HANDOFFS.md -->
# Handoffs

## Concept

A handoff lets one agent transfer responsibility to another agent.

## Example Flow

```text
Triage Agent
   ├─ Billing → Billing Agent
   ├─ Technical → Tech Agent
   └─ Sales → Sales Agent
```

## Use When

Use handoffs when:
- a specialist should own the next part of the task;
- instructions/tools differ significantly;
- the receiving agent should become the active agent.

## Design Considerations

Define:
- clear handoff descriptions;
- limited destinations;
- transfer criteria;
- input filtering where appropriate;
- trace/audit visibility.


---

<!-- Source: 11_ORCHESTRATION_PATTERNS.md -->
# Agent Orchestration Patterns

## Two Main Styles

The SDK documentation describes two broad orchestration approaches:
1. LLM-driven orchestration;
2. code-driven orchestration.

They can be mixed.

## LLM-Driven

The model decides:
- which tool to use;
- whether to delegate;
- which specialist to invoke;
- what step comes next.

## Code-Driven

Application code controls:
- sequence;
- branching;
- parallelism;
- retries;
- approval gates.

## Enterprise Pattern

Prefer a hybrid:
```text
Deterministic shell
  ├─ security
  ├─ approval
  ├─ audit
  └─ agentic decision zone
```


---

<!-- Source: 12_GUARDRAILS.md -->
# Guardrails

## Types

The SDK supports:
- input guardrails;
- output guardrails;
- tool guardrails for guarded function-tool execution.

## Tripwire

A guardrail can trigger a tripwire and halt/interrupt the normal run path.

## Parallel vs Blocking Input Guardrails

Input guardrails can run:
- in parallel for lower latency;
- in blocking mode when you must prevent the agent/model/tool work from starting before validation passes.

## Boundary Detail

Agent-level input guardrails apply to the first agent in a chain, while final-output guardrails apply to the agent producing the final output. Tool guardrails are better when checks must run around every guarded function-tool invocation.

## Security Reminder

Guardrails complement application security. They do not replace authentication, authorization, tenant isolation, or policy enforcement.


---

<!-- Source: 13_CONTEXT_MANAGEMENT.md -->
# Context Management

## Two Meanings of Context

The SDK distinguishes:
1. local context available to application code;
2. context visible to the model.

## Local Context

Local context is passed through `RunContextWrapper[T]`.

It can provide tools/hooks access to:
- app dependencies;
- user/tenant data;
- usage metadata;
- approval state.

## Conceptual Example

```python
from dataclasses import dataclass

@dataclass
class AppContext:
    user_id: str
    tenant_id: str
```

## Model Context

The model sees the conversation/input/instructions/tool outputs you include—not arbitrary application objects unless you deliberately surface them.

## Enterprise Rule

Do not place secrets into context that may later be serialized or transmitted with resumable run state.


---

<!-- Source: 14_SESSIONS_AND_MEMORY.md -->
# Sessions and Memory

## Session Purpose

Sessions provide persistent conversation memory across multiple Agent SDK runs.

## Behavior

With a session:
1. prior history is loaded before a run;
2. new items from the run are stored afterward;
3. later runs with the same session continue the conversation.

## Mental Model

```text
Run 1 ─┐
       ├─ Session("conversation_123")
Run 2 ─┤
Run 3 ─┘
```

## Important Distinction

Session memory is different from local `RunContextWrapper` context.

- Session → conversation history.
- Run context → application dependencies/state for runtime code.

## Continuation Choice

Do not blindly stack multiple continuation mechanisms. Choose session-managed history or appropriate server-managed continuation based on your architecture.


---

<!-- Source: 15_RESULTS_AND_RUN_ITEMS.md -->
# Results and Run Items

## Result Types

Runner methods return:
- `RunResult`
- `RunResultStreaming`

## Useful Surfaces

Important result properties/helpers include:
- `final_output`
- `new_items`
- `last_agent`
- `raw_responses`
- `to_input_list()`
- `to_state()`

## Streaming Result

Streaming results add:
- event streaming;
- current-agent visibility;
- completion state;
- cancellation controls.

## Interview Point

> The result contains much more than the final text; it is also the audit/debug surface for what happened during the run.


---

<!-- Source: 16_STRUCTURED_OUTPUTS.md -->
# Structured Outputs

## Purpose

Structured outputs let an Agent return typed results rather than unstructured prose.

## Why

Use typed output for:
- APIs;
- workflow routing;
- downstream automation;
- validation;
- SDK contracts.

## Concept

```text
Agent
 ↓
Typed output schema
 ↓
Validated object
 ↓
Application logic
```

## Rule

Do not parse business-critical decisions from free-form text when a structured contract is available.


---

<!-- Source: 17_STREAMING.md -->
# Streaming

## Purpose

`Runner.run_streamed(...)` supports incremental agent execution visibility.

## Use Cases

Stream:
- text/model events;
- tool activity;
- agent transitions;
- progress to user interfaces.

## Result Surface

`RunResultStreaming` supports event iteration plus controls such as current-agent and cancellation behavior.

## Production Rule

Treat UI streaming and durable run state separately. A client disconnect should not automatically imply business workflow cancellation.


---

<!-- Source: 18_HUMAN_IN_THE_LOOP.md -->
# Human in the Loop

## Purpose

Sensitive tool calls can pause until a human approves or rejects them.

## Flow

```text
Model requests tool
       ↓
Approval required?
       ↓ yes
RunResult.interruptions
       ↓
result.to_state()
       ↓
state.approve(...) / state.reject(...)
       ↓
Runner.run(original_agent, state)
```

## Important Behavior

Approvals can surface from:
- the current agent;
- an agent after handoff;
- a nested agent-as-tool execution.

The interruption can be handled at the outer/original run.

## Enterprise Use Cases

- deleting data;
- sending external communication;
- financial changes;
- production operations;
- privileged tools.


---

<!-- Source: 19_TRACING_AND_OBSERVABILITY.md -->
# Tracing and Observability

## Built-In Tracing

The SDK includes built-in tracing of agent workflows.

## Typical Trace Content

- model generations;
- tool calls;
- handoffs;
- guardrails;
- custom events.

## Trace Model

A trace represents an end-to-end workflow and is composed of spans.

## Production Benefit

Tracing supports:
- debugging;
- visualization;
- monitoring;
- evaluation.

## Privacy

Do not assume all sensitive data should be traced. Apply redaction/data-governance controls. Also account for organizational retention requirements.


---

<!-- Source: 20_USAGE_AND_COST_TRACKING.md -->
# Usage and Cost Tracking

## Tracked Usage

The SDK aggregates per-run usage such as:
- request count;
- input tokens;
- output tokens;
- total tokens;
- cached/reasoning token details where available.

## Access

Usage is available through the run context/result context wrapper.

## Why

Use it for:
- budget enforcement;
- analytics;
- per-tenant reporting;
- optimization;
- model-routing decisions.

## Session Note

Sessions preserve conversation history, but each Runner execution reports usage for that run.


---

<!-- Source: 21_MCP_INTEGRATION.md -->
# MCP Integration

## What

MCP integration lets agents use tools exposed by MCP servers.

## Patterns

The SDK supports hosted and local MCP-style integration paths.

## Architecture

```text
Agent
  │
  ▼
MCP Tool Integration
  │
  ├─ CRM server
  ├─ Knowledge server
  └─ Internal automation server
```

## Approval

MCP tool calls can be placed behind approval requirements depending on the integration mode.

## Security Rule

MCP standardizes connectivity, not trust. Still enforce identity, allowlists, scopes, policy, and auditing.


---

<!-- Source: 22_REALTIME_AGENTS.md -->
# Realtime Agents

## What

Realtime agents maintain a long-lived connection for low-latency text/audio interaction, tool calls, interruptions, and session events.

## Core Components

- `RealtimeAgent`
- `RealtimeRunner`
- `RealtimeSession`
- `RealtimeModel`

## Lifecycle

```text
Create RealtimeAgent
      ↓
Create RealtimeRunner
      ↓
runner.run()
      ↓
RealtimeSession
      ↓
send_message / send_audio
      ↓
iterate session events
```

## Use Cases

- voice assistant;
- customer support;
- telephony;
- live copilot.

## Important

Realtime sessions differ from one-shot text runs: the session stays live and continuously handles events, tools, and interruptions.


---

<!-- Source: 23_SECURITY_AND_ENTERPRISE_CONTROLS.md -->
# Security and Enterprise Controls

## Identity

Propagate real user/workload identity to enterprise tools where possible.

## Tool Security

For each tool define:
- read/write risk;
- permission scope;
- approval requirement;
- timeout;
- audit policy.

## Model Output

Treat model output and tool arguments as untrusted input until validated.

## Guardrail vs Authorization

Guardrail = AI/application validation layer.  
Authorization = enforceable permission boundary.

Do not confuse them.

## Sensitive Data

Apply:
- redaction;
- least privilege;
- tenant isolation;
- secret management;
- retention controls.


---

<!-- Source: 24_ERROR_HANDLING_RETRIES_AND_IDEMPOTENCY.md -->
# Error Handling, Retries and Idempotency

## Failure Types

- model/provider failure;
- rate limit;
- validation failure;
- tool exception;
- approval rejection;
- guardrail trip;
- streaming disconnect.

## Retry Policy

Retry transient failures only and cap attempts.

## Write Safety

Before retrying a write tool, require idempotency or deduplication.

## Agent-Level Recovery

Recovery strategies may include:
- tool-level retry;
- alternate tool/provider;
- handoff;
- human escalation;
- final controlled failure.


---

<!-- Source: 25_PRODUCTION_ARCHITECTURE.md -->
# OpenAI Agents SDK — Production Architecture

## Reference Architecture

```text
Client / UI
    │
API Gateway + Auth
    │
Agent Service
    │
Agent + Runner
 ├─ OpenAI model / Responses API
 ├─ Function tools
 ├─ Enterprise APIs
 ├─ MCP tools
 ├─ Session store
 ├─ Approval service
 ├─ Guardrails / policy
 └─ Trace / metrics / audit
```

## Production Checklist

- stable tool schemas;
- identity propagation;
- least privilege;
- session persistence;
- timeouts/retries;
- HITL for risky writes;
- trace redaction;
- usage budgets;
- rate limiting;
- evaluation suite;
- cancellation behavior;
- failure runbooks.

## Durable Long-Running Work

For truly long-running/durable workflows that must survive long waits, retries, or process restarts, integrate the agent runtime with durable workflow orchestration rather than assuming a single in-memory request lifecycle is enough.


---

<!-- Source: 26_TESTING_AND_EVALUATION.md -->
# Testing and Evaluation

## Unit Tests

Test:
- function tools;
- guardrails;
- instructions builders;
- local context behavior;
- approval rules.

## Agent Tests

Test:
- expected tool selection;
- handoff destination;
- final output schema;
- interruption behavior;
- session continuity;
- failure paths.

## Evaluation

Measure:
- task success;
- tool correctness;
- handoff correctness;
- guardrail behavior;
- latency;
- token/cost;
- user satisfaction;
- safety.

## Tracing

Use traces as evidence for debugging failures and building regression datasets.


---

<!-- Source: 27_INTERVIEW_QUESTIONS.md -->
# OpenAI Agents SDK — Interview Questions & Answers

## 1. What is the OpenAI Agents SDK?

A lightweight runtime for building agentic applications using agents, tools, handoffs, guardrails, sessions, HITL, and tracing.

## 2. Agent vs Runner?

Agent defines configuration/capabilities; Runner executes the workflow loop.

## 3. Agents SDK vs Responses API?

Responses API is lower-level. Agents SDK adds orchestration and runtime management around model calls.

## 4. What is a function tool?

A typed Python capability exposed to the model and executed by application/runtime code.

## 5. Handoff vs agent-as-tool?

Handoff transfers control to the specialist. Agent-as-tool delegates a subtask while the parent keeps control.

## 6. Why guardrails?

To validate inputs, outputs, and guarded tool invocations, with tripwire behavior when checks fail.

## 7. Session vs context?

Session stores conversation history across runs. Run context carries local app data/dependencies to tools/hooks during execution.

## 8. What does RunResult contain?

Final output plus run items, last agent, raw responses, state/input conversion helpers, and interruption information.

## 9. How does HITL work?

Sensitive tool calls surface interruptions; convert the result to RunState, approve/reject, then resume the original agent run.

## 10. What does tracing capture?

Model generations, tool calls, handoffs, guardrails, and custom workflow spans/events.

## 11. How is token usage tracked?

Usage is aggregated across model calls in the run context/result context wrapper.

## 12. How does MCP fit?

It exposes remote tool capabilities through a standard integration path, while app security and approvals still apply.

## 13. What are realtime agents?

Long-lived low-latency sessions for text/audio with tool use, interruptions, and continuous events.

## 14. How do you secure tool execution?

Least privilege, typed schemas, auth/authz outside the model, approval for risky actions, audit, and idempotency.

## 15. When would you not use the SDK?

When the workflow is simple and I explicitly want to own the loop/state/tool dispatch directly via the Responses API.

## 16. Can orchestration be deterministic?

Yes. The SDK can be combined with code-driven orchestration; not every step should be delegated to model reasoning.

## 17. One-line architecture principle?

> Let the SDK manage agent mechanics, but keep enterprise security and business invariants deterministic.


---

<!-- Source: 28_SYSTEM_DESIGN_QUESTIONS.md -->
# OpenAI Agents SDK — System Design Questions

## Q1 — Design a Triage + Specialist System

```text
User
 ↓
Triage Agent
 ├─ handoff → Billing Agent
 ├─ handoff → Technical Agent
 └─ handoff → Sales Agent
```

Discuss handoff descriptions, session continuity, guardrails, tracing, and specialist tool permissions.

## Q2 — Manager with Specialist Agents

```text
Manager Agent
 ├─ Research Agent as tool
 ├─ Data Agent as tool
 └─ Writer Agent as tool
        ↓
Manager synthesizes
```

Use agent-as-tool because manager retains ownership.

## Q3 — Human-Approved Operations Agent

```text
Agent
 ↓
DeleteResourceTool
 ↓ approval required
Run interruption
 ↓
Human approve/reject
 ↓
Resume
```

Discuss durable storage for paused work, idempotency, and audit.

## Q4 — Multi-Tenant Enterprise Agent

Discuss:
- per-tenant context;
- identity propagation;
- separate sessions;
- tool scoping;
- rate limits;
- cost attribution;
- trace redaction;
- policy enforcement.

## Q5 — Realtime Support Agent

Discuss:
- RealtimeAgent/Runner/Session;
- audio/text events;
- function tools;
- approvals;
- session lifecycle;
- disconnect handling;
- observability.

## Answer Framework

**Agent → Runner → tools → delegation → guardrails → context/session → approvals → results/streaming → tracing → security → evaluation.**


---

<!-- Source: 29_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
# OpenAI Agents SDK — One-Page Final Cheat Sheet

## Formula

```text
OpenAI Agents SDK =
Agent
+ Runner
+ Tools
+ Handoffs
+ Guardrails
+ Sessions
+ Context
+ HITL
+ Tracing
```

## Key Distinctions

- Agent = configuration/capabilities
- Runner = loop/execution
- Handoff = transfer control
- Agent-as-tool = delegate while retaining control
- Session = conversation memory
- Run context = local runtime dependencies/state
- Guardrail = validation/tripwire
- RunResult = output + run evidence/state
- Tracing = workflow observability

## Production Rules

1. Keep auth/authz outside model reasoning.
2. Use least-privilege tools.
3. Require approval for high-risk writes.
4. Make write tools idempotent.
5. Separate session memory from local app context.
6. Treat model output as untrusted.
7. Use tracing with redaction/governance.
8. Track tokens and cost.
9. Test handoffs and approvals, not only final text.
10. Use durable workflow infrastructure for genuinely long-running work.

## 30-Second Answer

> The OpenAI Agents SDK gives me a small set of agent-runtime primitives. I configure Agents with instructions, tools, handoffs, and guardrails; Runner manages the execution loop; sessions preserve conversation memory; RunContextWrapper carries application context; interruptions and RunState support human approval; and built-in tracing provides end-to-end observability. I still keep identity, authorization, idempotency, and business invariants in deterministic application layers.
