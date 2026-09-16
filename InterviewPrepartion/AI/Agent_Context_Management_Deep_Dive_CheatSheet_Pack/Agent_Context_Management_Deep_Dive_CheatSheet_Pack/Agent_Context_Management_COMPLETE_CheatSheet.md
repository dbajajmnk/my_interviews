# Agent Context Management — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# Agent Context Management — Master Index

## Purpose

This pack covers context management as the information-control layer of enterprise agents.

Interview focus:
- local application context vs model-visible context;
- conversation state;
- session memory;
- long-term memory;
- retrieval context;
- tool context;
- runtime dependencies;
- token budgets;
- trimming and summarization;
- context engineering;
- relevance and freshness;
- multi-agent context isolation;
- handoffs;
- privacy/security;
- production persistence;
- OpenAI Agents SDK;
- LangChain/LangGraph;
- Microsoft Agent Framework;
- Agent SDK architecture.

## Master Mental Model

```text
                    ┌────────────────────┐
                    │  Application Data  │
                    │ identity, tenant,  │
                    │ clients, secrets   │
                    └─────────┬──────────┘
                              │ local only
                              ▼
                         Runtime Context

User Input ───────┐
Conversation ─────┤
Retrieved Docs ───┤
Memory ───────────┤
Tool Results ─────┼──▶ Context Builder ───▶ Model
Instructions ─────┤          │
Policies ─────────┤          │
State ────────────┘          ▼
                        token budget
                        relevance
                        security
```

## Core Principle

> Context management is not “put everything into the prompt.” It is the discipline of deciding what information belongs where, what the model should see now, what should persist, and what must remain outside the model entirely.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_CONTEXT_MANAGEMENT.md`
3. `03_CONTEXT_TYPES_TAXONOMY.md`
4. `04_LOCAL_CONTEXT_VS_MODEL_CONTEXT.md`
5. `05_RUNTIME_CONTEXT_AND_DEPENDENCY_INJECTION.md`
6. `06_CONVERSATION_STATE.md`
7. `07_SESSION_CONTEXT.md`
8. `08_SHORT_TERM_MEMORY.md`
9. `09_LONG_TERM_MEMORY.md`
10. `10_STATE_VS_MEMORY_VS_CONTEXT.md`
11. `11_RETRIEVAL_CONTEXT_AND_RAG.md`
12. `12_TOOL_CONTEXT_AND_TOOL_RESULTS.md`
13. `13_INSTRUCTIONS_AND_POLICY_CONTEXT.md`
14. `14_CONTEXT_ASSEMBLY_PIPELINE.md`
15. `15_TOKEN_BUDGET_AND_CONTEXT_WINDOW.md`
16. `16_TRIMMING_AND_MESSAGE_SELECTION.md`
17. `17_SUMMARIZATION_AND_COMPACTION.md`
18. `18_RELEVANCE_RANKING_AND_FRESHNESS.md`
19. `19_CONTEXT_CACHING.md`
20. `20_DYNAMIC_CONTEXT_AND_PERSONALIZATION.md`
21. `21_MULTI_AGENT_CONTEXT_ISOLATION.md`
22. `22_HANDOFF_CONTEXT.md`
23. `23_CONTEXT_PROVENANCE_AND_CITATIONS.md`
24. `24_CONTEXT_SECURITY_AND_PRIVACY.md`
25. `25_PROMPT_INJECTION_AND_CONTEXT_POISONING.md`
26. `26_MULTI_TENANCY_AND_CONTEXT_BOUNDARIES.md`
27. `27_DURABLE_CONTEXT_AND_RESUME.md`
28. `28_OPENAI_AGENTS_SDK_CONTEXT.md`
29. `29_LANGCHAIN_LANGGRAPH_CONTEXT.md`
30. `30_MICROSOFT_AGENT_FRAMEWORK_CONTEXT.md`
31. `31_AGENT_SDK_CONTEXT_ARCHITECTURE.md`
32. `32_TESTING_AND_EVALUATION.md`
33. `33_PRODUCTION_ARCHITECTURE.md`
34. `34_INTERVIEW_QUESTIONS.md`
35. `35_SYSTEM_DESIGN_QUESTIONS.md`
36. `36_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Foundation:** 01 → 14  
**Optimization:** 15 → 20  
**Enterprise safety:** 21 → 27  
**Framework mapping:** 28 → 31  
**Interview mode:** 32 → 36


---

<!-- Source: 01_30_SECOND_RECALL.md -->
# Agent Context Management — 30-Second Recall

## Recall

```text
Context =
what the model/runtime needs now

State =
what is changing during execution

Session =
conversation continuity

Memory =
what should survive for future use

Retrieval =
external knowledge brought in on demand

Runtime Context =
trusted app data/dependencies not automatically sent to model
```

## 30-Second Interview Answer

> I separate context into layers. Runtime context carries trusted application dependencies and identity; conversation state tracks the current thread; short-term memory preserves working context; long-term memory stores selected durable information; retrieval injects relevant external knowledge; and the context builder decides what the model actually sees for each call. I manage token budget, freshness, provenance, privacy, and tenant isolation before sending anything to the model.

## Do Not Forget

- More context is not always better.
- Runtime context may be local-only.
- State is not automatically memory.
- RAG is not the same as memory.
- Context should be relevant, fresh, authorized, and bounded.
- Secrets should not be placed in model-visible context.


---

<!-- Source: 02_WHAT_IS_CONTEXT_MANAGEMENT.md -->
# What Is Context Management?

## Definition

Context management is the set of mechanisms used to collect, filter, transform, persist, retrieve, and inject information into an agent run.

## Why

Agent quality depends heavily on context quality.

Bad context causes:
- hallucination;
- stale decisions;
- token waste;
- privacy leakage;
- wrong tool selection;
- poor personalization.

## Goal

Deliver the **minimum sufficient context** required for the current decision.


---

<!-- Source: 03_CONTEXT_TYPES_TAXONOMY.md -->
# Context Types — Taxonomy

## Context Categories

| Context Type | Example | Usually Model-Visible? |
|---|---|---:|
| Runtime context | user_id, tenant, API client | No |
| Instructions | role, policies | Yes |
| Conversation | messages | Yes |
| Execution state | current step, tool result | Sometimes |
| Short-term memory | thread summary | Yes |
| Long-term memory | preferences | Selected |
| Retrieval | KB documents | Selected |
| Tool context | call ID, auth identity | Usually No |
| Observability context | trace/span IDs | No |

## Rule

Treat each category differently rather than putting all of them into a single “context dictionary.”


---

<!-- Source: 04_LOCAL_CONTEXT_VS_MODEL_CONTEXT.md -->
# Local Context vs Model Context

## Local Context

Data available to application code, tools, hooks, middleware, and runtime services.

## Examples

- database client;
- authenticated user;
- tenant ID;
- secret manager;
- logger;
- trace context.

## Model Context

Information actually sent to the LLM:
- instructions;
- messages;
- retrieved content;
- selected memories;
- tool outputs.

## Rule

> Just because the runtime knows something does not mean the model should see it.


---

<!-- Source: 05_RUNTIME_CONTEXT_AND_DEPENDENCY_INJECTION.md -->
# Runtime Context and Dependency Injection

## Purpose

Runtime context is an ideal place for trusted dependencies and request-scoped metadata.

## Pattern

```text
Runtime Context
 ├─ user_id
 ├─ tenant_id
 ├─ db_client
 ├─ auth_service
 ├─ logger
 └─ trace_context
```

## Benefit

Avoid:
- hidden globals;
- model-generated identity;
- hard-coded dependencies.

## Rule

Trusted runtime facts should come from authenticated application state, not from prompt text.


---

<!-- Source: 06_CONVERSATION_STATE.md -->
# Conversation State

## What

Conversation state represents current thread interaction history and related working data.

## Examples

- user messages;
- assistant messages;
- tool outputs;
- current intent;
- workflow progress.

## Challenge

Conversation history grows without bound unless trimmed, summarized, or compacted.


---

<!-- Source: 07_SESSION_CONTEXT.md -->
# Session Context

## Definition

A session groups related interactions across multiple agent runs.

## Session Key

Typical identifier:
```text
session_id / conversation_id / thread_id
```

## Production Questions

- who owns the session?
- how long is it retained?
- can it be resumed?
- is it tenant-scoped?
- can it be deleted?

## Rule

Do not use process-local session memory when the system must scale horizontally or survive restarts.


---

<!-- Source: 08_SHORT_TERM_MEMORY.md -->
# Short-Term Memory

## Definition

Short-term memory preserves working information for the current conversation/thread.

## Examples

- conversation messages;
- current task progress;
- summary;
- active entities;
- unresolved questions.

## Scope

Usually thread-scoped rather than global user memory.

## Rule

Short-term memory should support the task without becoming an unbounded transcript dump.


---

<!-- Source: 09_LONG_TERM_MEMORY.md -->
# Long-Term Memory

## Definition

Long-term memory stores selected information that remains useful across conversations or tasks.

## Examples

- user preferences;
- durable facts;
- learned workflow preferences;
- organizational context.

## Governance

Long-term memory requires:
- retention rules;
- deletion;
- privacy;
- provenance;
- freshness;
- access control.

## Rule

Do not remember everything. Store only information with expected future value.


---

<!-- Source: 10_STATE_VS_MEMORY_VS_CONTEXT.md -->
# State vs Memory vs Context

## Comparison

| Concept | Main Question |
|---|---|
| Context | What information is available now? |
| State | Where are we in execution? |
| Memory | What should persist for later? |

## Example

```text
State:
current_step = "approval"

Memory:
user_prefers_email = true

Context:
selected policy + current state + relevant memory
```

## Interview Point

> Context is assembled from state, memory, retrieval, instructions, and current input; it is not synonymous with any one of them.


---

<!-- Source: 11_RETRIEVAL_CONTEXT_AND_RAG.md -->
# Retrieval Context and RAG

## Purpose

Retrieval injects external knowledge relevant to the current task.

## Flow

```text
Question
 ↓
Query
 ↓
Retriever
 ↓
Relevant chunks
 ↓
Authorization/filter
 ↓
Context builder
 ↓
Model
```

## Controls

- relevance;
- freshness;
- access control;
- source metadata;
- chunk size;
- diversity;
- token budget.

## Rule

RAG retrieves knowledge. Memory preserves learned/retained context. They can work together.


---

<!-- Source: 12_TOOL_CONTEXT_AND_TOOL_RESULTS.md -->
# Tool Context and Tool Results

## Tool Context

Tool handlers may need trusted runtime data:
- user identity;
- tenant;
- tool call ID;
- timeout;
- trace ID.

## Tool Results

Tool outputs may become model context for the next decision.

## Risk

Tool responses can be:
- huge;
- stale;
- sensitive;
- maliciously crafted.

## Rule

Normalize, filter, and size-limit tool output before adding it to model context.


---

<!-- Source: 13_INSTRUCTIONS_AND_POLICY_CONTEXT.md -->
# Instructions and Policy Context

## Instructions

Instructions tell the model:
- role;
- objective;
- output expectations;
- behavioral constraints.

## Policy Context

Some policy can be described to the model, but enforceable policy must also exist outside model reasoning.

## Rule

Prompt instructions guide behavior; deterministic policy systems enforce critical boundaries.


---

<!-- Source: 14_CONTEXT_ASSEMBLY_PIPELINE.md -->
# Context Assembly Pipeline

## Pipeline

```text
Current input
  + system instructions
  + selected history
  + state
  + relevant memory
  + retrieved knowledge
  + tool observations
      ↓
Normalize
      ↓
Authorize/filter
      ↓
Rank/reduce
      ↓
Token-budget
      ↓
Model context
```

## Design Principle

Build context as a pipeline with explicit stages rather than ad-hoc prompt concatenation.


---

<!-- Source: 15_TOKEN_BUDGET_AND_CONTEXT_WINDOW.md -->
# Token Budget and Context Window

## Problem

Every model has finite context capacity and practical latency/cost limits.

## Budget Categories

Reserve budget for:
- instructions;
- history;
- retrieval;
- tool results;
- expected output.

## Rule

Do not fill the entire context window with input; preserve output headroom.

## Interview Phrase

> Context window size is a capacity limit, not a target.


---

<!-- Source: 16_TRIMMING_AND_MESSAGE_SELECTION.md -->
# Trimming and Message Selection

## Strategies

- keep latest N turns;
- remove low-value tool traces;
- drop redundant system data;
- keep unresolved requirements;
- preserve safety-critical instructions.

## Risk

Naive truncation can remove:
- user constraints;
- commitments;
- identifiers;
- unresolved decisions.

## Rule

Trim by semantic importance, not just by age.


---

<!-- Source: 17_SUMMARIZATION_AND_COMPACTION.md -->
# Summarization and Compaction

## Why

Long conversations can be compressed into shorter summaries.

## Compaction Pipeline

```text
Old messages
 ↓
Summarizer
 ↓
Compact state
 + recent messages
 ↓
Next model call
```

## Risk

Summaries can:
- lose details;
- introduce mistakes;
- accumulate drift.

## Rule

Preserve source references or critical facts separately when accuracy matters.


---

<!-- Source: 18_RELEVANCE_RANKING_AND_FRESHNESS.md -->
# Relevance Ranking and Freshness

## Relevance

Rank candidate context by how much it helps the current decision.

## Freshness

Recent information may supersede older memory or retrieved documents.

## Conflict Policy

Define what wins:
```text
authoritative current source
> recent verified state
> older memory
```

## Rule

Stale context can be worse than missing context.


---

<!-- Source: 19_CONTEXT_CACHING.md -->
# Context Caching

## What

Cache stable or expensive-to-build context when appropriate.

## Candidates

- static instructions;
- organization policy;
- expensive retrieval result;
- compiled summaries.

## Invalidation

Cache invalidation must consider:
- policy update;
- role change;
- source freshness;
- tenant data.

## Rule

Never cache authorization-sensitive context without identity/tenant-aware keys.


---

<!-- Source: 20_DYNAMIC_CONTEXT_AND_PERSONALIZATION.md -->
# Dynamic Context and Personalization

## Dynamic Context

Adjust context at runtime based on:
- user;
- tenant;
- task;
- location/locale;
- permissions;
- workflow phase.

## Personalization

Useful personalization includes:
- preferred format;
- language;
- product/account context.

## Rule

Personalization should not override security, policy, or truth.


---

<!-- Source: 21_MULTI_AGENT_CONTEXT_ISOLATION.md -->
# Multi-Agent Context Isolation

## Problem

Different agents need different context.

## Example

```text
Supervisor
 ├─ Finance Agent → finance context only
 ├─ HR Agent      → HR context only
 └─ Tech Agent    → technical context only
```

## Benefits

- reduced token cost;
- lower data exposure;
- clearer specialization;
- less instruction conflict.

## Rule

Do not automatically copy the entire parent context into every child agent.


---

<!-- Source: 22_HANDOFF_CONTEXT.md -->
# Handoff Context

## Question

When control moves to another agent, what should follow?

## Possible Handoff Payload

- user goal;
- relevant summary;
- selected entities;
- completed steps;
- unresolved issue;
- authorization context reference.

## Avoid

Passing:
- unrelated private history;
- raw full transcript;
- secrets;
- every tool result.

## Rule

A handoff should transfer the minimum context required for the receiving agent to continue safely.


---

<!-- Source: 23_CONTEXT_PROVENANCE_AND_CITATIONS.md -->
# Context Provenance and Citations

## Why

The agent should know where important facts came from.

## Metadata

Track:
- source ID;
- timestamp;
- document/version;
- retrieval score;
- owner/tenant;
- confidence/trust class.

## Benefit

Provenance helps:
- debugging;
- citations;
- freshness decisions;
- conflict resolution;
- audit.


---

<!-- Source: 24_CONTEXT_SECURITY_AND_PRIVACY.md -->
# Context Security and Privacy

## Risks

- secrets leaked to model;
- cross-tenant memory;
- PII over-collection;
- excessive retention;
- unauthorized retrieval.

## Controls

- data minimization;
- field-level filtering;
- tenant namespaces;
- encryption;
- retention/deletion;
- redaction;
- model/provider policy.

## Rule

Context should follow least-privilege principles just like tool permissions.


---

<!-- Source: 25_PROMPT_INJECTION_AND_CONTEXT_POISONING.md -->
# Prompt Injection and Context Poisoning

## Threat

External documents or tool outputs can contain malicious instructions.

## Context Poisoning

Bad memory or stale/untrusted content can persist and influence future decisions.

## Defense

- source trust classification;
- separate instructions from retrieved data;
- sanitize/label external content;
- approval for high-risk actions;
- validate memory before persistence;
- allow deletion/correction.

## Rule

Retrieved text is data, not authority.


---

<!-- Source: 26_MULTI_TENANCY_AND_CONTEXT_BOUNDARIES.md -->
# Multi-Tenancy and Context Boundaries

## Isolation Keys

Context stores should be partitioned by:
- tenant;
- user;
- thread/session;
- data classification.

## Risk

One bad namespace or cache key can expose another tenant's context.

## Controls

- tenant-aware storage;
- scoped retrieval;
- per-tenant encryption where needed;
- auth checks on every load;
- test cross-tenant denial.


---

<!-- Source: 27_DURABLE_CONTEXT_AND_RESUME.md -->
# Durable Context and Resume

## Why

Long-running agents may:
- wait for humans;
- restart;
- fail mid-run;
- resume hours later.

## Persist

- execution state;
- conversation/thread state;
- approval state;
- references to external context;
- version metadata.

## Avoid

Persisting raw secrets inside serialized agent state.

## Rule

Durable context must be serializable, versioned, secure, and resumable.


---

<!-- Source: 28_OPENAI_AGENTS_SDK_CONTEXT.md -->
# OpenAI Agents SDK — Context Management

## Two Context Classes

Current OpenAI Agents SDK documentation distinguishes:
1. local context available to your code;
2. context available to the LLM.

## Local Context

`RunContextWrapper[T]` carries the app-defined context object to:
- tools;
- hooks;
- callbacks;
- handoffs.

The context object itself is not automatically sent to the LLM.

## Useful Runtime Metadata

`RunContextWrapper` also exposes runtime-managed information such as:
- usage;
- tool input for nested agent-as-tool runs;
- approval state helpers.

`ToolContext` extends this with tool-call metadata.

## Sessions

Sessions preserve conversation history across runs. They solve conversation-memory continuity, while `RunContextWrapper` solves local application context/dependency injection.

## Security Detail

If resumable `RunState` is serialized, avoid placing secrets in app context because runtime state can be persisted or transmitted.


---

<!-- Source: 29_LANGCHAIN_LANGGRAPH_CONTEXT.md -->
# LangChain / LangGraph — Context Management

## Three-Layer Model

A useful LangChain/LangGraph distinction is:
- runtime context;
- thread-scoped graph state;
- cross-thread store.

## Short-Term Memory

Current LangChain agent memory stores thread-level context in graph state and persists it using a checkpointer.

## Long-Term Memory

LangGraph stores persist application-defined information across threads, such as preferences or facts.

## Runtime Context

Nodes/tools can access invocation context such as `user_id` without placing it directly in graph messages.

## Production Rule

Use persistent checkpointers/stores rather than in-memory implementations when state must survive restarts.


---

<!-- Source: 30_MICROSOFT_AGENT_FRAMEWORK_CONTEXT.md -->
# Microsoft Agent Framework — Context Management

## Agent Composition

Current Microsoft Agent Framework describes an agent as combining:
- model/remote agent;
- instructions;
- tools;
- middleware;
- context providers;
- session state.

## Context Providers

Context providers are the natural place for proactive:
- memory;
- personalization;
- RAG;
- enterprise knowledge injection.

## Middleware

Middleware changes how execution behaves.

Context providers primarily control what context is supplied and optionally persisted.

## Session State

AgentSession provides conversation/session continuity across runs.

## Interview Distinction

> Middleware changes execution behavior; context providers change what the agent knows.


---

<!-- Source: 31_AGENT_SDK_CONTEXT_ARCHITECTURE.md -->
# Agent SDK — Context Architecture

## Recommended Interfaces

```text
RunContext
ContextBuilder
ConversationStore
StateStore
MemoryStore
Retriever
ContextPolicy
ContextReducer
ContextRedactor
```

## Pipeline

```text
Sources
 ↓
ContextBuilder
 ↓
Policy/filter
 ↓
Ranking
 ↓
Reduction
 ↓
Redaction
 ↓
ModelContext
```

## Developer Experience

SDK consumers should be able to:
- pass typed runtime context;
- plug custom memory/retrieval;
- inspect what context was selected;
- test context assembly deterministically.

## Rule

Keep local runtime context and model-visible context as separate types/contracts.


---

<!-- Source: 32_TESTING_AND_EVALUATION.md -->
# Testing and Evaluation

## Unit Tests

Test:
- context builder;
- trimming;
- ranking;
- summarization;
- redaction;
- namespace isolation.

## Integration Tests

Test:
- session continuity;
- retrieval permissions;
- long-term memory;
- multi-agent handoff context;
- resume after restart.

## Evaluation Metrics

- answer/task success;
- context precision;
- context recall;
- stale-context rate;
- token usage;
- privacy leakage;
- retrieval quality.

## Rule

Evaluate context quality independently from model quality where possible.


---

<!-- Source: 33_PRODUCTION_ARCHITECTURE.md -->
# Agent Context Management — Production Architecture

## Reference Architecture

```text
Client
  │
Auth / Tenant Resolution
  │
Agent Service
  │
Context Builder
 ├─ Instructions
 ├─ Conversation Store
 ├─ State Store
 ├─ Memory Store
 ├─ Retriever
 ├─ Tool Observations
 └─ Context Policy
      │
      ▼
Rank / Trim / Summarize / Redact
      │
      ▼
Model Context
      │
      ▼
LLM / Agent Runtime
```

## Production Checklist

- tenant isolation;
- durable session state;
- memory retention policy;
- retrieval authorization;
- token budgeting;
- provenance;
- freshness;
- redaction;
- context observability;
- resume/versioning.


---

<!-- Source: 34_INTERVIEW_QUESTIONS.md -->
# Agent Context Management — Interview Q&A

## 1. What is context management?

The process of selecting, filtering, persisting, retrieving, and supplying the information an agent needs for each decision.

## 2. Runtime context vs model context?

Runtime context is local application data/dependencies. Model context is what is actually sent to the LLM.

## 3. State vs memory?

State tracks current execution; memory retains information for future usefulness.

## 4. RAG vs memory?

RAG retrieves external knowledge; memory stores retained historical information.

## 5. Why is more context not always better?

It increases cost, latency, distraction, privacy exposure, and stale/conflicting information.

## 6. How do you manage long conversations?

Trim low-value messages, summarize older history, preserve critical facts separately, and keep recent turns.

## 7. What is context compaction?

Replacing verbose historical context with a smaller representation that preserves task-relevant information.

## 8. How do you avoid stale context?

Track freshness/version/source metadata and prioritize authoritative recent information.

## 9. How do you secure context?

Tenant isolation, authorization, redaction, minimization, encryption, retention, and source trust controls.

## 10. How do you handle multi-agent context?

Give each agent only the context needed for its responsibility; do not blindly share the full parent transcript.

## 11. What should a handoff contain?

Goal, relevant summary, entities, completed work, unresolved items, and references—not the entire raw history.

## 12. OpenAI session vs RunContextWrapper?

Session preserves conversation history across runs; RunContextWrapper carries local app context/dependencies and is not automatically model-visible.

## 13. LangGraph checkpointer vs store?

Checkpointer persists thread-scoped graph state; store persists application data across threads.

## 14. Microsoft middleware vs context provider?

Middleware changes execution behavior; context providers supply/persist agent knowledge.

## 15. One-line principle?

> Send the model the minimum authorized context required for the next decision.


---

<!-- Source: 35_SYSTEM_DESIGN_QUESTIONS.md -->
# Agent Context Management — System Design Questions

## Q1 — Design Context for a Support Agent

Use:
- runtime user/tenant identity;
- session conversation state;
- authorized CRM/customer context;
- KB retrieval;
- selected memory;
- context trimming.

## Q2 — Design Multi-Tenant Memory

Partition by:
```text
tenant → user → memory namespace
```
Enforce authorization on every read/write and test cross-tenant isolation.

## Q3 — Design Long Conversation Handling

Use:
- recent-turn window;
- summary/compaction;
- critical-fact store;
- retrieval of older context when needed.

## Q4 — Design Multi-Agent Handoff Context

Transfer:
- objective;
- selected facts;
- current status;
- unresolved work;
- provenance.

Do not transfer unrelated confidential history.

## Q5 — Design Durable Context for HITL

Persist:
- run/thread state;
- approval request;
- relevant context references;
- schema/version;
- safe resumable metadata.

## Answer Framework

**Context types → source → authorization → selection → token budget → persistence → freshness → security → observability.**


---

<!-- Source: 36_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
# Agent Context Management — One-Page Final Cheat Sheet

## Formula

```text
Model Context =
Instructions
+ Current Input
+ Selected History
+ State
+ Relevant Memory
+ Retrieval
+ Tool Observations
- Irrelevant / Unauthorized / Stale Data
```

## Key Distinctions

- Runtime context = local trusted app data/dependencies
- Model context = information sent to LLM
- State = current execution
- Session = conversation continuity
- Short-term memory = thread working memory
- Long-term memory = durable cross-session information
- RAG = external knowledge retrieval
- Tool context = execution metadata

## Production Rules

1. More context is not automatically better.
2. Keep secrets outside model-visible context.
3. Separate state, session, and long-term memory.
4. Authorize retrieval and memory reads.
5. Track source and freshness.
6. Trim/summarize long histories.
7. Preserve output token headroom.
8. Isolate multi-agent and multi-tenant context.
9. Treat retrieved/tool content as untrusted.
10. Persist only context worth resuming or remembering.

## 30-Second Answer

> I treat context management as an explicit pipeline. Trusted runtime context carries identity and dependencies locally; conversation state and short-term memory preserve the current thread; long-term memory stores selected durable information; retrieval brings in authorized external knowledge; and a context builder ranks, trims, summarizes, redacts, and token-budgets these sources before each model call. The goal is the minimum relevant, fresh, authorized context needed for the next decision.
