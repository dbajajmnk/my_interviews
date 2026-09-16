# Agentic AI Fundamentals — Complete Deep Dive Cheat Sheet

This combined file contains the full content of the individual pack in sequence.


---


<!-- Source: 00_MASTER_INDEX.md -->

# Agentic AI Fundamentals — Master Index

## Purpose

This pack is the foundation layer for enterprise Agentic AI interviews and architecture discussions.

**Primary target:** Senior Software Engineer / Agent SDK / Developer Enablement roles.

Use it before deeper packs on Agent SDK architecture, LangGraph, RAG, memory, evaluation, OpenTelemetry, Azure AI Foundry, CI/CD, and SDK engineering.

## Master Mental Model

```text
Goal
 ↓
Agent
 ├─ Model
 ├─ Instructions
 ├─ Context
 ├─ State
 ├─ Memory
 ├─ Tools
 ├─ Guardrails
 └─ Observability
 ↓
Decide → Act → Observe → Update → Continue/Stop
```

**One-line definition**

> An AI agent is a software system in which a model can decide what action to take, use tools or external systems, observe results, maintain relevant state, and continue until a goal or termination condition is reached.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_AGENTIC_AI.md`
3. `03_LLM_VS_CHATBOT_VS_WORKFLOW_VS_AGENT.md`
4. `04_AGENT_ANATOMY.md`
5. `05_AGENT_EXECUTION_LOOP.md`
6. `06_MODEL_INSTRUCTIONS_TOOLS_CONTEXT.md`
7. `07_STATE_AND_MEMORY.md`
8. `08_PLANNING_REASONING_ACTION.md`
9. `09_DETERMINISTIC_WORKFLOW_VS_AGENT.md`
10. `10_SINGLE_AGENT_VS_MULTI_AGENT.md`
11. `11_HUMAN_IN_THE_LOOP.md`
12. `12_AGENT_LIFECYCLE.md`
13. `13_ENTERPRISE_AGENT_ARCHITECTURE.md`
14. `14_FAILURE_MODES_AND_GUARDRAILS.md`
15. `15_REAL_LIFE_ANALOGIES.md`
16. `16_INTERVIEW_QUESTIONS.md`
17. `17_ARCHITECTURE_QUESTIONS.md`
18. `18_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## How to Study Today

- **Pass 1 — 20 minutes:** 01, 02, 03, 04, 05.
- **Pass 2 — 35 minutes:** 06 through 14.
- **Pass 3 — 30 minutes:** 16 and 17 aloud.
- **Final 10 minutes:** file 18 only.
- Do not memorize wording. Memorize **mental models, boundaries, and trade-offs**.

## Interview Outcome

By the end of this pack you should be able to:
- distinguish LLM, chatbot, workflow, and agent;
- explain the agent loop without buzzwords;
- design a basic enterprise agent architecture;
- explain tools, context, state, memory, planning, and human approval;
- explain when **not** to use an agent;
- discuss production risks and controls;
- answer architecture questions in 30 seconds, 1 minute, or 5 minutes.


---


<!-- Source: 01_30_SECOND_RECALL.md -->

# Agentic AI — 30-Second Recall

## Recall

```text
AGENT = Model + Instructions + Context + State + Tools
        + Memory(optional) + Guardrails + Observability

Loop:
Goal → Decide → Act → Observe → Update State → Repeat/Stop
```

**Key difference:** a normal LLM generates. An agent can **choose and execute actions** through controlled tools.

**Enterprise rule:** autonomy must be bounded by authentication, authorization, validation, observability, budgets, retries, and human approval where risk is high.

## 30-Second Interview Answer

> Agentic AI extends an LLM from pure response generation into a controlled execution loop. The agent receives a goal and context, decides what action is needed, invokes approved tools or services, observes the result, updates state, and continues until a termination condition is reached. In enterprise systems I would keep that loop bounded with security, schema validation, retries, cost limits, tracing, evaluation, and human approval for sensitive actions.

## Do Not Forget

- RAG is **knowledge grounding**, not memory.
- Memory is **continuity/state across interactions**.
- A workflow is not automatically an agent.
- Multi-agent is not automatically better.
- Tool execution should happen in application code, not inside the model itself.
- Prefer deterministic workflows when the process is known.


---


<!-- Source: 02_WHAT_IS_AGENTIC_AI.md -->

# What Is Agentic AI?

## What

Agentic AI describes systems where an AI model participates in **decision-making and action selection**, not just text generation.

The model may:
- interpret a goal;
- choose a tool;
- supply structured arguments;
- observe results;
- decide a next action;
- maintain task state;
- stop when a goal or constraint is satisfied.

## Why

Traditional LLM applications are often one-shot:

```text
Prompt → Model → Response
```

Agentic systems are iterative:

```text
Goal → Decide → Act → Observe → Update → Decide Again → Finish
```

This matters when a task cannot be solved in a single generation and requires interaction with external systems.

## What Agentic AI Is Not

It is not:
- unrestricted autonomy;
- a synonym for chatbot;
- automatically multi-agent;
- simply a long prompt;
- merely RAG;
- permission to let an LLM call arbitrary production systems.

## When It Fits

Use agentic behavior when:
- the next step depends on intermediate results;
- tool selection is dynamic;
- the task crosses multiple systems;
- the reasoning path cannot be fully hard-coded;
- human approval may be inserted at decision points.

## When It Does Not Fit

Prefer normal deterministic software when:
- rules are known and stable;
- compliance requires exact predictable steps;
- the task is simple CRUD;
- latency/cost sensitivity is extreme;
- every action can be represented as a fixed workflow.

## 20-Second Recall

> Agentic AI is useful when software must dynamically choose actions based on goals and observations. It should complement—not replace—deterministic software.


---


<!-- Source: 03_LLM_VS_CHATBOT_VS_WORKFLOW_VS_AGENT.md -->

# LLM vs Chatbot vs Workflow vs Agent

## Comparison

| Type | Main Capability | Chooses Actions? | Uses Tools? | Iterative State? |
|---|---|---:|---:|---:|
| LLM call | Generate response | No/limited | No | No |
| Chatbot | Conversational UX | Usually no | Sometimes | Session context |
| Workflow | Execute defined steps | Rules decide | Yes | Yes |
| Agent | Dynamically decide next action | Yes | Yes | Yes |

## Mental Model

```text
LLM:
Input → Generate

Chatbot:
User ↔ Conversation Layer ↔ LLM

Workflow:
Step A → Step B → Step C

Agent:
Goal
 ↓
Decide next step
 ↓
Act
 ↓
Observe
 ↓
Repeat
```

## Important Nuance

A production system can combine all four.

Example:
- chatbot = user interface;
- workflow = fixed KYC steps;
- agent = dynamic document analysis;
- LLM = generation/reasoning primitive.

Do not force the whole system into one category.

## Interview Trap

**Trap:** “Every application using function calling is an agent.”

Better answer: function calling is a building block. A true agent generally has a loop where observations influence subsequent decisions.

## 20-Second Recall

> Workflow means the path is primarily pre-defined. Agent means the model can participate in selecting the next step at runtime.


---


<!-- Source: 04_AGENT_ANATOMY.md -->

# Agent Anatomy

## Core Components

1. **Goal / Task** — what must be achieved.
2. **Model** — reasoning/generation engine.
3. **Instructions** — policy, role, boundaries.
4. **Context** — information available now.
5. **State** — current execution status.
6. **Tools** — approved external capabilities.
7. **Memory** — retained information when needed.
8. **Guardrails** — safety and policy controls.
9. **Observability** — logs, metrics, traces, cost.
10. **Termination logic** — when to stop.

## Architecture

```text
                 ┌─────────────┐
User / System ──▶│    Agent    │
                 └──────┬──────┘
        ┌───────────────┼────────────────┐
        ▼               ▼                ▼
     Model          Instructions       Context
        │                                │
        ├───────────────┬────────────────┤
        ▼               ▼                ▼
      Tools           State            Memory
        │               │                │
        └───────────────┴────────────────┘
                        ▼
                     Result
                        │
                Guardrails + Trace
```

## Design Principle

Keep the agent core small. Put external capabilities behind interfaces.

Example abstractions:
```text
ModelProvider
ToolRegistry
StateStore
MemoryStore
Retriever
PolicyEngine
Telemetry
```

## 20-Second Recall

> The agent is not just the model. The model is one component inside a controlled runtime that includes tools, state, policies, and telemetry.


---


<!-- Source: 05_AGENT_EXECUTION_LOOP.md -->

# Agent Execution Loop

## Loop

```text
1. Receive goal
2. Build context
3. Ask model for next decision
4. Validate decision
5. Execute approved action/tool
6. Observe result
7. Update state
8. Check termination condition
9. Repeat or finish
```

## Pseudo Code

```python
state = initial_state(task)

while not should_stop(state):
    context = build_context(state)
    decision = model.decide(context)

    validate(decision)

    if decision.type == "tool":
        result = execute_tool(decision.tool, decision.args)
        state = update_state(state, result)
    elif decision.type == "final":
        return decision.output
```

## Production Requirements

A real loop also needs:
- max-steps;
- timeout;
- token/cost budget;
- tool allowlist;
- retries with limits;
- idempotency;
- audit logs;
- cancellation;
- human escalation.

## Failure Example

Without a step limit, an agent can enter a loop:

```text
Search → no result → search again → same result → repeat
```

Control it with max iterations, novelty checks, and explicit failure states.

## 20-Second Recall

> An agent is an event loop with intelligence in the decision step. Everything around that decision must still be engineered like production software.


---


<!-- Source: 06_MODEL_INSTRUCTIONS_TOOLS_CONTEXT.md -->

# Model, Instructions, Tools & Context

## Model

The model transforms current context into:
- text;
- structured output;
- tool selection;
- plan/next action.

It should not be treated as the system of record.

## Instructions

Instructions define behavior:
- objective;
- role;
- constraints;
- allowed/forbidden actions;
- output schema;
- escalation rules.

Keep policy-critical rules in code/policy services too. Do not rely only on prompts.

## Tools

Tools expose controlled capabilities:
```text
search_customer
create_ticket
get_invoice
send_email
run_query
```

A tool should have:
- name;
- description;
- input schema;
- authentication;
- authorization;
- timeout;
- validation;
- auditability.

## Context

Context is everything the model sees at a decision point.

Possible sources:
- system instructions;
- conversation;
- task state;
- retrieved documents;
- tool results;
- user profile;
- policies.

More context is not always better. Context should be relevant, current, and bounded.

## Core Interview Point

> Tool calling should be treated as privileged application execution. The model proposes an action; the application validates and executes it.


---


<!-- Source: 07_STATE_AND_MEMORY.md -->

# State and Memory

## State

**State = current execution data.**

Examples:
- current step;
- selected customer;
- tool outputs;
- retry count;
- approval status;
- temporary variables.

## Memory

**Memory = information intentionally retained for future usefulness.**

Examples:
- user preference;
- long-running task history;
- useful prior decisions;
- conversation summary.

## Do Not Mix State and Memory

State is usually task-scoped and short-lived.

Memory may survive:
- turns;
- sessions;
- workflows;
- days/months.

Treat them with different retention, privacy, and lifecycle policies.

## RAG vs Memory

| Concept | Purpose |
|---|---|
| RAG | Retrieve external knowledge |
| State | Track current execution |
| Memory | Retain useful historical context |

## 20-Second Recall

> State tells the agent where it is now. Memory tells it what is worth remembering later.


---


<!-- Source: 08_PLANNING_REASONING_ACTION.md -->

# Planning, Reasoning & Action

## Planning

Planning means decomposing a goal into one or more steps.

Example:
```text
Goal: Resolve customer refund issue

Plan:
1. Find customer
2. Find order
3. Check refund policy
4. Determine eligibility
5. Request approval if needed
6. Execute refund
7. Notify customer
```

## Dynamic vs Fixed Planning

- **Fixed plan:** application defines steps.
- **Dynamic plan:** model chooses/decomposes steps at runtime.
- **Hybrid:** application defines boundaries; model chooses within them.

Hybrid is usually strongest for enterprise systems.

## Reasoning

In interviews, focus on **observable decision logic and system behavior**, not hidden chain-of-thought.

Useful artifacts:
- selected action;
- rationale summary;
- tool call;
- confidence;
- policy result;
- trace.

## Action

Never execute a high-impact action directly from model text.

Use:
```text
Model Decision
 ↓
Schema Validation
 ↓
Policy/Authorization
 ↓
Optional Human Approval
 ↓
Tool Execution
```

## 20-Second Recall

> Keep planning flexible where it adds value, but put execution behind deterministic validation and policy boundaries.


---


<!-- Source: 09_DETERMINISTIC_WORKFLOW_VS_AGENT.md -->

# Deterministic Workflow vs Agent

## Decision Table

| Situation | Prefer |
|---|---|
| Known sequence | Workflow |
| Regulatory exactness | Workflow |
| Dynamic tool selection | Agent |
| Unknown path | Agent |
| High-risk action | Workflow/HITL |
| Mixed task | Hybrid |

## Enterprise Pattern

```text
Deterministic shell
    │
    ├─ Authentication
    ├─ Policy
    ├─ Approval
    ├─ Audit
    │
    └── Agentic decision zone
          ├─ classify
          ├─ retrieve
          ├─ recommend
          └─ choose safe tool
```

## Strong Interview Answer

> I would not make the whole business process agentic. I would keep deterministic controls around the agent and use model-driven decisions only where ambiguity or dynamic reasoning genuinely adds value.

## Common Mistake

Using an LLM for things normal code already does better:
- date arithmetic;
- deterministic validation;
- authorization decisions;
- exact accounting logic;
- database constraints.


---


<!-- Source: 10_SINGLE_AGENT_VS_MULTI_AGENT.md -->

# Single Agent vs Multi-Agent

## Single Agent

One agent owns the task and uses multiple tools.

Advantages:
- simpler;
- easier to debug;
- lower cost;
- fewer handoffs;
- easier governance.

## Multi-Agent

Multiple specialized agents collaborate.

Possible roles:
```text
Supervisor
 ├─ Research Agent
 ├─ Data Agent
 ├─ Coding Agent
 └─ Reviewer Agent
```

## When Multi-Agent Helps

Use it when there are genuinely separate:
- domains;
- permissions;
- contexts;
- models;
- independent parallel tasks;
- review responsibilities.

## When It Hurts

Avoid it when it only creates:
- duplicated context;
- extra latency;
- more token cost;
- complex debugging;
- unclear ownership.

## 20-Second Recall

> Start with one agent. Split into multiple agents only when specialization, isolation, or parallelism justifies the operational complexity.


---


<!-- Source: 11_HUMAN_IN_THE_LOOP.md -->

# Human in the Loop (HITL)

## Why

Human approval is valuable when actions are:
- financially sensitive;
- legally significant;
- destructive;
- externally visible;
- low-confidence;
- policy-sensitive.

## Pattern

```text
Agent proposes action
       ↓
Risk/Policy check
       ↓
Low risk ──────────────▶ Execute
       │
High risk
       ↓
Human Approval
   ├─ Approve → Execute
   └─ Reject  → Revise/Stop
```

## Good Approval Payload

Show the reviewer:
- proposed action;
- parameters;
- evidence;
- reason summary;
- impact;
- alternatives;
- audit identifier.

## Interview Point

> Human-in-the-loop is not a failure of automation. It is an explicit control boundary for decisions whose risk exceeds the system's autonomous authority.


---


<!-- Source: 12_AGENT_LIFECYCLE.md -->

# Agent Lifecycle

## Lifecycle

```text
Design
 ↓
Build
 ↓
Test
 ↓
Evaluate
 ↓
Deploy
 ↓
Observe
 ↓
Improve
 ↓
Version / Retire
```

## Design

Define:
- goal;
- tool boundaries;
- data access;
- failure states;
- approval points;
- success metrics.

## Test & Evaluate

Test:
- tool schemas;
- invalid inputs;
- policy failures;
- loops;
- timeouts;
- model changes;
- retrieval changes;
- cost/latency;
- regression cases.

## Operate

Observe:
- task success;
- tool success;
- retries;
- latency;
- tokens;
- cost;
- escalation rate;
- safety events.

## Version

Version not only code but also:
- prompts/instructions;
- tool schemas;
- models;
- retrieval configuration;
- policies;
- evaluation datasets.


---


<!-- Source: 13_ENTERPRISE_AGENT_ARCHITECTURE.md -->

# Enterprise Agent Architecture

## Reference Architecture

```text
Users / Apps
    │
API Gateway / Auth
    │
Agent Runtime / Orchestrator
    │
    ├── Model Gateway
    │     ├─ Azure/OpenAI
    │     └─ Other Providers
    │
    ├── Tool Registry
    │     ├─ Internal APIs
    │     ├─ Databases
    │     └─ Business Services
    │
    ├── Retrieval / Knowledge
    ├── State Store
    ├── Memory Store
    ├── Policy / Guardrails
    └── Telemetry
          ├─ Logs
          ├─ Metrics
          └─ Traces
```

## Enterprise Boundaries

Add:
- identity propagation;
- least privilege;
- secrets management;
- tenant isolation;
- data classification;
- rate limits;
- cost budgets;
- audit trails;
- model/provider abstraction.

## Key Design Principle

> Separate the **agent decision layer** from the **execution and governance layers**.

The model can propose. The platform decides what is permitted to execute.

## Production Readiness Questions

Ask:
- What can the agent do?
- On whose identity?
- With what data?
- Who can approve?
- How do we replay/debug?
- How do we measure success?
- How do we roll back a model/prompt/tool change?


---


<!-- Source: 14_FAILURE_MODES_AND_GUARDRAILS.md -->

# Failure Modes and Guardrails

## Common Failure Modes

- hallucinated facts;
- wrong tool selection;
- incorrect tool arguments;
- repeated loops;
- prompt injection;
- excessive permissions;
- stale context;
- accidental destructive action;
- data leakage;
- high token cost;
- latency spikes;
- provider failure.

## Guardrail Layers

```text
Input Guardrails
 ↓
Context/Data Controls
 ↓
Model/Instruction Controls
 ↓
Tool Schema Validation
 ↓
Authorization / Policy
 ↓
Human Approval
 ↓
Output Validation
 ↓
Audit / Monitoring
```

## Practical Controls

- allowlist tools;
- schema validation;
- max iterations;
- max tokens;
- timeout;
- content/policy checks;
- least privilege;
- read-only default;
- confirmation for writes;
- idempotency keys;
- circuit breakers;
- fallbacks.

## Interview Trap

Do not say “the prompt tells the agent not to do it.”

Prompts are one layer only. Critical controls belong in enforceable application/policy layers.


---


<!-- Source: 15_REAL_LIFE_ANALOGIES.md -->

# Real-Life Analogies

## Analogy 1 — Senior Engineer

A chatbot is like a colleague who answers questions.

An agent is like a senior engineer who:
- understands the ticket;
- checks logs;
- queries systems;
- compares evidence;
- decides a next step;
- asks approval before risky changes;
- documents the result.

## Analogy 2 — Travel Coordinator

Goal: arrange a business trip.

The agent may:
1. read constraints;
2. search flights;
3. search hotels;
4. compare options;
5. ask approval;
6. book through approved tools;
7. send itinerary.

The model does not “become” the airline system. It uses tools.

## Analogy 3 — Tech Support

```text
Issue received
 ↓
Classify
 ↓
Collect diagnostics
 ↓
Search KB
 ↓
Try safe remediation
 ↓
Verify
 ↓
Escalate if unresolved
```

This maps naturally to a bounded agentic workflow.

## Recall

**Agent = capable employee.**
**Tools = enterprise systems.**
**Policy = company rules.**
**HITL = manager approval.**
**Telemetry = audit trail.**


---


<!-- Source: 16_INTERVIEW_QUESTIONS.md -->

# Agentic AI — Interview Questions & Answers

## 1. What is Agentic AI?

Agentic AI refers to systems where a model participates in deciding and executing multi-step actions. The system maintains context/state, uses approved tools, observes results, and continues until a goal or stop condition is reached.

## 2. What makes an agent different from a chatbot?

A chatbot focuses on conversation. An agent has an action loop and can dynamically choose tools or next steps based on observations.

## 3. Workflow vs Agent?

A workflow has a primarily predefined path. An agent can choose the next action dynamically. In enterprise systems, a hybrid is often best.

## 4. What are the core components of an agent?

Model, instructions, context, state, tools, optional memory, guardrails, telemetry, and termination logic.

## 5. What is tool calling?

The model produces a structured request to invoke a capability. Application code validates authorization/schema and executes the tool.

## 6. What is agent state?

Execution-scoped information such as current step, previous tool outputs, retries, and approval status.

## 7. What is agent memory?

Information intentionally retained for future interactions, such as useful user preferences, summaries, or long-lived task context.

## 8. RAG vs memory?

RAG retrieves external knowledge. Memory preserves useful historical context.

## 9. When should we not use agents?

When business logic is deterministic, highly regulated, low-latency, or easily expressed as normal code/workflows.

## 10. How do you prevent infinite loops?

Use max steps, timeouts, cost budgets, repeated-action detection, explicit failure states, and observability.

## 11. How do you secure tools?

Allowlist them, enforce authentication/authorization outside the model, validate schemas, use least privilege, audit every call, and require approval for sensitive writes.

## 12. Why not rely only on prompt guardrails?

Prompts are not enforceable security boundaries. Critical rules must exist in application and policy layers.

## 13. Single vs multi-agent?

Start with a single agent. Use multiple agents when specialization, isolation, independent permissions, or parallel work justifies the complexity.

## 14. What is HITL?

A control point where the agent proposes an action but a human must approve, reject, or modify it before execution.

## 15. How do you measure an agent?

Task success, tool correctness, policy compliance, latency, cost, retrieval quality, escalation rate, and safety failures.

## 16. How would you make an agent provider-neutral?

Put model access behind an interface or gateway and keep business logic dependent on internal contracts rather than one vendor SDK.

## 17. What should be traced?

Agent run, model calls, retrieval, tool calls, retries, guardrail events, latency, tokens, errors, and final outcome.

## 18. What is the safest default for tools?

Read-only, least privilege, bounded parameters, explicit schemas, and no sensitive write without approval.

## 19. What changes when moving from PoC to production?

Identity, authorization, privacy, observability, evaluation, versioning, cost control, SLAs, failure handling, audit, and operational ownership become mandatory.

## 20. Best one-line design principle?

> Use agentic reasoning only where ambiguity exists; keep execution, policy, security, and audit deterministic.


---


<!-- Source: 17_ARCHITECTURE_QUESTIONS.md -->

# Agentic AI — Architecture Questions

## Q1 — Design a Customer Support Agent

**Requirements**
- answer using KB;
- check order status;
- create ticket;
- escalate when needed.

**Design**
```text
Chat UI
 ↓
API/Auth
 ↓
Support Agent
 ├─ Retriever → KB
 ├─ Tool → Order API
 ├─ Tool → Ticket API
 ├─ State Store
 ├─ Policy/Guardrails
 └─ Telemetry
```

**Key points**
- read-only order tool;
- ticket creation with validation;
- PII controls;
- escalation after confidence/policy threshold;
- task success metrics.

## Q2 — Design a Safe Finance Agent

Use deterministic boundaries:
```text
Agent recommends
 ↓
Policy Engine
 ↓
Human Approval
 ↓
Transaction Service
```

Never let the model directly perform unbounded fund movement.

## Q3 — Design for Multiple Model Providers

Create:
```text
ModelClient
 ├─ AzureOpenAIAdapter
 ├─ OpenAIAdapter
 └─ OtherProviderAdapter
```

Normalize:
- request;
- response;
- tool call format;
- errors;
- telemetry;
- retry policy.

## Q4 — How Would You Scale?

Scale separately:
- stateless agent runtime;
- state/memory services;
- tool services;
- retrieval;
- model gateway.

Use queues for long-running operations, correlation IDs for tracing, and limits per tenant/user.

## Q5 — How Would You Debug a Bad Run?

Inspect:
1. input;
2. context assembled;
3. model decision;
4. tool selection/arguments;
5. tool result;
6. state update;
7. retries;
8. policy events;
9. final answer.

This is why end-to-end tracing matters.

## Architecture Answer Framework

For any design question answer in this order:

1. **Goal**
2. **Actors**
3. **Agent boundary**
4. **Tools/data**
5. **State/memory**
6. **Security**
7. **Guardrails/HITL**
8. **Observability**
9. **Evaluation**
10. **Scale/failure**


---


<!-- Source: 18_ONE_PAGE_FINAL_CHEAT_SHEET.md -->

# Agentic AI — One-Page Final Cheat Sheet

## Definition

**Agentic AI = model-driven decision + controlled action loop.**

## Formula

```text
Agent =
Model
+ Instructions
+ Context
+ State
+ Tools
+ Memory(optional)
+ Guardrails
+ Telemetry
```

## Loop

```text
Goal → Decide → Validate → Act → Observe → Update → Repeat/Stop
```

## Key Distinctions

- **LLM:** generates.
- **Chatbot:** converses.
- **Workflow:** follows predefined path.
- **Agent:** dynamically chooses next action.
- **RAG:** external knowledge.
- **State:** current execution.
- **Memory:** retained historical context.

## Enterprise Rules

1. Model proposes; application executes.
2. Auth/authz never belongs only in prompt text.
3. Tool schemas must be validated.
4. Default to least privilege/read-only.
5. Use max steps/timeouts/cost limits.
6. Add HITL for high-risk actions.
7. Trace the full run.
8. Evaluate task success, not just wording.
9. Start single-agent.
10. Keep deterministic code where rules are known.

## 30-Second Answer

> An enterprise AI agent is a controlled runtime where a model can decide the next step, invoke approved tools, observe results, maintain state, and continue until a goal or stop condition is reached. I would keep security, authorization, validation, human approval, cost controls, and observability outside the model so that the system remains governable and production-safe.

## Final Interview Reminder

Do not sell “autonomy.”

Sell **controlled decision-making + enterprise engineering**.
