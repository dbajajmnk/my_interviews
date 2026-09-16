# LangChain — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# LangChain Deep Dive — Master Index

## Purpose

This pack is the LangChain layer for enterprise Agent SDK / Developer Enablement interview preparation.

It focuses on current LangChain architecture and APIs:
- `create_agent`
- models
- tools
- middleware
- runtime context
- short-term and long-term memory
- structured output
- streaming
- retrieval/RAG
- MCP
- production architecture
- testing, observability, and interview design questions

It also includes a compact legacy/LCEL refresher because many interviewers still use older LangChain terminology.

## Current Mental Model

```text
Application
   │
   ▼
LangChain Agent API
   │
   ▼
create_agent(...)
   │
   ▼
LangGraph Runtime
   ├─ Model
   ├─ Tools
   ├─ Middleware
   ├─ State / Checkpointer
   ├─ Store
   ├─ Runtime Context
   └─ Streaming
```

## Important Current Positioning

LangChain provides a prebuilt agent architecture and integrations. Its current `create_agent` implementation runs on LangGraph under the hood.

For more customized deterministic + agentic orchestration, use LangGraph directly.

For tracing/debugging/evaluation, LangSmith is the surrounding observability/evaluation product.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_LANGCHAIN.md`
3. `03_LANGCHAIN_VS_LANGGRAPH_VS_DEEP_AGENTS_VS_LANGSMITH.md`
4. `04_CURRENT_LANGCHAIN_ARCHITECTURE.md`
5. `05_CREATE_AGENT.md`
6. `06_MODELS_AND_MODEL_ABSTRACTION.md`
7. `07_TOOLS_AND_TOOL_CALLING.md`
8. `08_AGENT_EXECUTION_LOOP.md`
9. `09_MIDDLEWARE.md`
10. `10_RUNTIME_CONTEXT.md`
11. `11_STATE_AND_SHORT_TERM_MEMORY.md`
12. `12_LONG_TERM_MEMORY.md`
13. `13_CONTEXT_ENGINEERING.md`
14. `14_STRUCTURED_OUTPUT.md`
15. `15_STREAMING.md`
16. `16_RETRIEVAL_AND_RAG.md`
17. `17_MCP_INTEGRATION.md`
18. `18_DYNAMIC_MODEL_AND_TOOL_SELECTION.md`
19. `19_ERROR_HANDLING_AND_RETRIES.md`
20. `20_HUMAN_IN_THE_LOOP.md`
21. `21_SECURITY_AND_GUARDRAILS.md`
22. `22_TESTING_AND_EVALUATION.md`
23. `23_OBSERVABILITY_AND_LANGSMITH.md`
24. `24_PRODUCTION_ARCHITECTURE.md`
25. `25_LEGACY_LCEL_RUNNABLES_CHAINS.md`
26. `26_INTERVIEW_QUESTIONS.md`
27. `27_SYSTEM_DESIGN_QUESTIONS.md`
28. `28_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Plan

**Fast pass:** 01 → 09  
**Core production pass:** 10 → 24  
**Legacy recall:** 25  
**Interview mode:** 26 → 28


---

<!-- Source: 01_30_SECOND_RECALL.md -->
# LangChain — 30-Second Recall

## Recall

```text
LangChain = agent API + model/tool integrations + middleware + runtime abstractions

create_agent(...)
   ↓
LangGraph runtime
   ├─ model
   ├─ tools
   ├─ middleware
   ├─ state/checkpointer
   ├─ store
   └─ streaming
```

## 30-Second Interview Answer

> LangChain is an open-source framework for building LLM and agent applications. In the current architecture, `create_agent` gives a production-oriented agent abstraction built on LangGraph. I use LangChain for model/tool integration and agent composition, middleware for context and lifecycle customization, checkpointers for thread-scoped memory, stores for cross-session memory, and LangGraph directly when I need lower-level orchestration control.

## Do Not Forget

- `create_agent` is graph-based under the hood.
- Tools are callable capabilities with typed inputs/outputs.
- Short-term memory is thread-scoped state persisted via a checkpointer.
- Long-term memory uses a store across threads/sessions.
- Runtime context is static invocation-scoped configuration/dependencies.
- Middleware is the main extension point for context engineering and lifecycle behavior.


---

<!-- Source: 02_WHAT_IS_LANGCHAIN.md -->
# What Is LangChain?

## Definition

LangChain is an open-source framework for building LLM-powered applications and agents using model integrations, tools, agent abstractions, retrieval, memory, structured output, streaming, and middleware.

## Why It Exists

Without a framework, application code often becomes provider-specific glue around:
- prompts;
- model calls;
- tool schemas;
- retries;
- state;
- streaming;
- retrieval;
- memory;
- tracing.

LangChain provides reusable abstractions for these concerns.

## Best Use

Use LangChain when you want:
- quick integration across models/tools;
- standard agent construction;
- runtime extensibility through middleware;
- portable tool abstractions;
- retrieval and memory integration;
- easier migration between providers.

## When Not Necessary

For a very small one-model/one-call application, raw provider SDKs may be simpler.

Use framework abstractions when the application has real orchestration, tool, state, or portability needs.


---

<!-- Source: 03_LANGCHAIN_VS_LANGGRAPH_VS_DEEP_AGENTS_VS_LANGSMITH.md -->
# LangChain vs LangGraph vs Deep Agents vs LangSmith

## Comparison

| Component | Best Mental Model |
|---|---|
| LangChain | High-level agent framework and integrations |
| LangGraph | Low-level orchestration/runtime for stateful graphs |
| Deep Agents | Batteries-included agent layer for advanced agent workflows |
| LangSmith | Tracing, debugging, evaluation, observability |

## Selection Rule

- Need standard agent quickly → **LangChain**
- Need deterministic + agentic graph control → **LangGraph**
- Need higher-level agent features such as subagents/context compression → **Deep Agents**
- Need tracing/evaluation → **LangSmith**

## Interview Answer

> I would not treat LangChain and LangGraph as competitors. LangChain agents are built on LangGraph. LangChain is the higher-level developer API; LangGraph is the lower-level orchestration layer.


---

<!-- Source: 04_CURRENT_LANGCHAIN_ARCHITECTURE.md -->
# Current LangChain Architecture

## Architecture

```text
User / API
   │
   ▼
LangChain create_agent
   │
   ▼
LangGraph Runtime
   ├─ Model Node
   ├─ Tool Node
   ├─ Middleware Hooks
   ├─ Agent State
   ├─ Checkpointer
   ├─ Store
   └─ Streaming
```

## Three Context Sources

A useful current distinction:

1. **Runtime Context** — static per-invocation configuration/dependencies.
2. **State** — mutable thread-scoped short-term memory.
3. **Store** — long-term memory across threads/sessions.

## Why This Matters

Many older LangChain answers focus mostly on Chains and prompt pipelines.

For current agent interviews, emphasize **agents + runtime + middleware + context engineering + state/store**.


---

<!-- Source: 05_CREATE_AGENT.md -->
# create_agent — Core Agent API

## What

`create_agent` builds an agent loop that can invoke a model, call tools, maintain state, and stop when the model returns a final answer or execution reaches a configured limit.

## Minimal Example

```python
from langchain.agents import create_agent
from langchain.tools import tool

@tool
def get_order_status(order_id: str) -> str:
    # Return the order status for the supplied order id.
    return f"{order_id}: shipped"

agent = create_agent(
    model="provider:model-name",
    tools=[get_order_status],
)

result = agent.invoke({
    "messages": [
        {"role": "user", "content": "Check order A100"}
    ]
})
```

## What Happens Internally

```text
Message
  ↓
Model
  ↓
Tool call?
 ├─ No → Final response
 └─ Yes
      ↓
    Tool
      ↓
   Tool result
      ↓
    Model again
```

## Interview Point

> `create_agent` is not a one-shot chain. It provides an iterative agent runtime on top of LangGraph.


---

<!-- Source: 06_MODELS_AND_MODEL_ABSTRACTION.md -->
# Models and Model Abstraction

## Purpose

LangChain provides common interfaces over model providers so application architecture is less coupled to a specific vendor.

## Model Responsibilities

Models may support:
- standard chat generation;
- streaming;
- tool calling;
- structured output;
- multimodal input;
- provider-native features.

## Capability Awareness

Do not assume all models support identical features.

Architect for:
```text
Model selection
 ↓
Capability check
 ↓
Tool/structured-output/streaming behavior
```

## Interview Principle

> Use LangChain's abstraction for portability, but preserve provider-specific capabilities when they materially improve quality or reliability.


---

<!-- Source: 07_TOOLS_AND_TOOL_CALLING.md -->
# Tools and Tool Calling

## Tool Mental Model

A tool is a callable capability exposed to the model with a schema and description.

## Basic Tool

```python
from langchain.tools import tool

@tool
def search_customer(email: str) -> str:
    # Find a customer by email.
    return "customer_123"
```

## What the Model Does

The model chooses:
- whether to call a tool;
- which tool;
- input arguments.

Application/runtime code executes the tool.

## Production Requirements

- schema validation;
- auth/authz;
- allowlisted tools;
- timeout;
- retry policy;
- idempotency;
- audit.

## Strong Interview Phrase

> Tool calling is model-driven action selection, not permission to execute arbitrary application code.


---

<!-- Source: 08_AGENT_EXECUTION_LOOP.md -->
# LangChain Agent Execution Loop

## Loop

```text
State
 ↓
Model
 ↓
Decision
 ├─ Final → END
 └─ Tool Call
      ↓
    Tool(s)
      ↓
    State update
      ↓
    Model again
```

## Capabilities

Current LangChain agents can support:
- sequential tool calls;
- parallel tool calls where appropriate;
- dynamic tool selection;
- retries/error handling;
- state persistence across tool calls.

## Stop Conditions

Typical stop conditions:
- model emits final response;
- step/iteration limit;
- policy/middleware ends execution;
- cancellation/failure.


---

<!-- Source: 09_MIDDLEWARE.md -->
# Middleware

## What

Middleware hooks into the agent lifecycle and is a primary mechanism for customizing behavior without rewriting the runtime.

## Uses

Middleware can:
- change prompts dynamically;
- choose models;
- filter tools;
- trim/summarize context;
- retry model/tool calls;
- enforce policies;
- log before/after model execution.

## Mental Model

```text
Input
 ↓
Before Hooks
 ↓
Model / Tools
 ↓
After Hooks
 ↓
Output
```

## Examples of Built-In Middleware

Current LangChain documentation includes middleware patterns such as:
- summarization;
- model retry;
- tool retry;
- tool selection;
- context editing;
- subagents.

## Interview Point

> Middleware is the clean extension point for cross-cutting agent behavior and context engineering.


---

<!-- Source: 10_RUNTIME_CONTEXT.md -->
# Runtime Context

## Definition

Runtime context carries static invocation-scoped data and dependencies.

## Examples

- user ID;
- tenant ID;
- database connection;
- API client;
- permissions;
- environment configuration.

## Example

```python
from dataclasses import dataclass
from langchain.agents import create_agent

@dataclass
class Context:
    user_id: str

agent = create_agent(
    model="provider:model-name",
    tools=[],
    context_schema=Context,
)
```

## Why It Matters

Runtime context is a dependency-injection mechanism. It avoids hidden globals and makes tools/middleware more reusable and testable.


---

<!-- Source: 11_STATE_AND_SHORT_TERM_MEMORY.md -->
# State and Short-Term Memory

## Definition

Short-term memory is thread-scoped and stored as part of agent state.

## Persistence

A checkpointer persists state so a conversation/thread can resume later.

## Mental Model

```text
thread_id
   ↓
Checkpointer
   ↓
Agent State
   ├─ messages
   ├─ tool results
   └─ custom fields
```

## Production

Use a durable database-backed checkpointer rather than an in-memory one for production workloads.

## Key Distinction

**State/checkpointer = thread-level short-term memory.**


---

<!-- Source: 12_LONG_TERM_MEMORY.md -->
# Long-Term Memory

## Definition

Long-term memory persists information across different threads and sessions.

## Storage Model

LangGraph stores back LangChain long-term memory. Data is saved as documents organized by namespace/key.

## Examples

- user preferences;
- organization context;
- durable facts;
- learned task preferences.

## Difference

| Mechanism | Scope |
|---|---|
| State + checkpointer | One conversation/thread |
| Store | Across conversations/threads |

## Enterprise Reminder

Apply retention, privacy, consent, and deletion policies to long-term memory.


---

<!-- Source: 13_CONTEXT_ENGINEERING.md -->
# Context Engineering

## What

Context engineering controls what information the model receives for each call.

## Model Context

Model context may include:
- system prompt;
- messages;
- available tools;
- selected model;
- response format.

## Data Sources

Context can draw from:
- state;
- store;
- runtime context.

## Transient vs Persistent

- **Transient context:** changed only for a single model call.
- **Persistent context:** written into state/store and survives later steps/turns.

## Best Practice

Do not send everything.

Optimize context for:
- relevance;
- freshness;
- token budget;
- privacy;
- task success.


---

<!-- Source: 14_STRUCTURED_OUTPUT.md -->
# Structured Output

## Purpose

Structured output lets an agent return predictable machine-readable results rather than free-form text.

## Supported Strategies

Current LangChain agent APIs support:
- provider-native structured output where available;
- tool-based structured output otherwise.

## Conceptual Example

```python
from pydantic import BaseModel
from langchain.agents import create_agent

class Ticket(BaseModel):
    category: str
    priority: str

agent = create_agent(
    model="provider:model-name",
    tools=[],
    response_format=Ticket,
)
```

## Why It Matters

Use structured output for:
- downstream APIs;
- workflow decisions;
- UI rendering;
- validation;
- typed SDK contracts.

## Interview Point

> Prefer validated structured output when a downstream system must consume the result.


---

<!-- Source: 15_STREAMING.md -->
# Streaming

## Why

Agent runs may involve multiple model/tool steps. Streaming improves user experience and exposes progress.

## What Can Stream

Depending on mode and runtime:
- messages;
- state updates;
- token chunks;
- custom progress events.

## Concept

```text
agent.stream(...)
   ↓
state/message/tool events
   ↓
UI / API / telemetry
```

## Production Design

Separate:
- user-facing stream;
- telemetry stream;
- audit persistence.

Do not assume the client will remain connected for the full run.


---

<!-- Source: 16_RETRIEVAL_AND_RAG.md -->
# Retrieval and RAG

## Purpose

Retrieval grounds model responses using external knowledge.

## Flow

```text
Question
 ↓
Retriever
 ↓
Relevant Documents
 ↓
Context
 ↓
Model / Agent
```

## Agentic Use

An agent may expose retrieval as a tool so the model decides when search is required.

## Architecture Choice

Two common patterns:
1. always retrieve before generation;
2. let the agent decide whether to retrieve.

Use the first for predictable grounding; the second for more flexible multi-step tasks.

## Do Not Confuse

RAG = retrieve knowledge.  
Memory = retain useful history/state.


---

<!-- Source: 17_MCP_INTEGRATION.md -->
# Model Context Protocol (MCP) Integration

## What

MCP standardizes how applications expose tools and context to LLM applications.

## LangChain Integration

LangChain agents can use tools from MCP servers through MCP adapter libraries.

## Architecture

```text
LangChain Agent
    │
    ▼
MCP Client / Adapter
    │
    ├─ CRM MCP Server
    ├─ Files MCP Server
    └─ Internal Tool MCP Server
```

## Interceptors

MCP interceptors can bridge runtime context into tool execution and support request modification, retries, headers, or short-circuiting.

## Interview Point

> MCP helps standardize tool connectivity; it does not replace application authorization, policy, or audit controls.


---

<!-- Source: 18_DYNAMIC_MODEL_AND_TOOL_SELECTION.md -->
# Dynamic Model and Tool Selection

## Dynamic Model

Middleware can choose a model at runtime based on:
- cost;
- complexity;
- tenant policy;
- latency;
- task type.

## Dynamic Tools

Tool availability can also be scoped dynamically based on:
- user permissions;
- task phase;
- risk level;
- organization.

## Architecture Rule

Routing is not authorization.

Even if a tool is not shown to the model, the execution layer must still enforce access.


---

<!-- Source: 19_ERROR_HANDLING_AND_RETRIES.md -->
# Error Handling and Retries

## Failure Categories

- model/provider failure;
- rate limit;
- tool failure;
- validation failure;
- timeout;
- policy rejection;
- retrieval failure.

## Retry Rule

Retry transient failures with bounded backoff.

Do not retry blindly:
- authorization errors;
- invalid structured output without a correction strategy;
- non-idempotent side effects.

## Middleware

LangChain provides middleware patterns for model/tool retry and context management.

## Interview Phrase

> Retry policy should depend on failure category and idempotency, not on a global 'retry everything' flag.


---

<!-- Source: 20_HUMAN_IN_THE_LOOP.md -->
# Human in the Loop

## Purpose

Use human approval for sensitive or uncertain actions.

## Pattern

```text
Agent proposes
 ↓
Pause/checkpoint
 ↓
Human review
 ├─ approve
 ├─ reject
 └─ edit
 ↓
Resume
```

## Good Use Cases

- payments;
- deletion;
- external communication;
- production change;
- legal/compliance action.

## Interview Point

> HITL should be an explicit runtime state, not an informal manual process outside the workflow.


---

<!-- Source: 21_SECURITY_AND_GUARDRAILS.md -->
# Security and Guardrails

## Security Boundaries

Do not delegate:
- authentication;
- authorization;
- tenancy;
- secret management;
- destructive-action approval
to the model alone.

## Treat Inputs as Untrusted

Untrusted sources include:
- user messages;
- retrieved documents;
- tool responses;
- external MCP content.

## Controls

- tool allowlists;
- runtime-context identity;
- policy middleware;
- schema validation;
- least privilege;
- redaction;
- audit logs;
- approval checkpoints.

## Prompt Injection

Retrieved content can contain instructions. Treat it as data, not policy.


---

<!-- Source: 22_TESTING_AND_EVALUATION.md -->
# Testing and Evaluation

## Unit Testing

Test:
- tools;
- middleware;
- context assembly;
- structured-output schemas;
- routing policies.

## Agent Testing

Test:
- expected tool selection;
- tool arguments;
- stop behavior;
- memory updates;
- failure paths;
- policy behavior.

## Evaluation Metrics

- task completion;
- groundedness;
- tool accuracy;
- retrieval quality;
- latency;
- cost;
- safety;
- escalation rate.

## Testability Rule

Inject model/tool dependencies and use deterministic fakes where possible.


---

<!-- Source: 23_OBSERVABILITY_AND_LANGSMITH.md -->
# Observability and LangSmith

## What to Observe

- agent run;
- model calls;
- tool calls;
- retrieval;
- middleware;
- errors/retries;
- latency;
- token usage;
- outputs.

## LangSmith Role

LangSmith is commonly used around LangChain/LangGraph applications for:
- tracing;
- debugging;
- evaluation;
- monitoring.

## Enterprise Rule

Do not log sensitive prompts/tool payloads indiscriminately. Apply redaction and access controls.


---

<!-- Source: 24_PRODUCTION_ARCHITECTURE.md -->
# LangChain Production Architecture

## Reference Architecture

```text
Client / UI
    │
API Gateway + Auth
    │
Agent Service
    │
LangChain create_agent
    │
    ├─ Model Provider
    ├─ Tool Services
    ├─ Retriever
    ├─ Checkpointer
    ├─ Long-Term Store
    ├─ Policy Middleware
    └─ Tracing/Evaluation
```

## Production Checklist

- identity propagation;
- stateless application replicas;
- durable checkpointing;
- durable long-term store;
- tool timeouts;
- provider retry/circuit breaking;
- secret management;
- rate limits;
- observability;
- eval regression suite;
- cost budgets.

## Scaling

Keep agent-service compute separate from:
- model provider;
- vector/retrieval service;
- state store;
- tool services.

Scale each according to its bottleneck.


---

<!-- Source: 25_LEGACY_LCEL_RUNNABLES_CHAINS.md -->
# Legacy / LCEL / Runnables / Chains — Interview Refresher

## Why This File Exists

Many existing projects and interview questions still use older LangChain vocabulary:
- Chains
- `LLMChain`
- Runnables
- LCEL
- prompt → model → parser pipelines

Know the ideas even if your new implementation uses current agent APIs.

## LCEL Mental Model

```text
Prompt
  |
Model
  |
Parser
```

Conceptually:
```python
chain = prompt | model | parser
```

## Runnable Concepts

Common ideas:
- RunnableSequence;
- RunnableParallel;
- invoke;
- batch;
- stream;
- composition.

## How to Position

> I understand LCEL/Runnable composition for existing codebases, but for current agent development I would start from the current LangChain agent/runtime APIs and use LangGraph directly when orchestration needs become more explicit.


---

<!-- Source: 26_INTERVIEW_QUESTIONS.md -->
# LangChain — Interview Questions & Answers

## 1. What is LangChain?

A framework providing model/tool integrations and high-level abstractions for building LLM and agent applications.

## 2. LangChain vs LangGraph?

LangChain is higher-level. LangGraph is the lower-level graph runtime/orchestration layer. Current LangChain agents run on LangGraph.

## 3. What does create_agent do?

It builds an iterative model/tool agent runtime that maintains state and runs until a final answer or stop condition.

## 4. What is a tool?

A typed callable capability exposed to the model with a description and input schema.

## 5. State vs runtime context?

State is mutable thread-scoped data. Runtime context is static invocation-scoped configuration/dependencies.

## 6. Short-term vs long-term memory?

Short-term is thread-scoped state persisted with a checkpointer. Long-term uses a store across threads.

## 7. Why middleware?

To customize prompts, models, tools, retries, context, safety, and lifecycle behavior without rewriting the runtime.

## 8. What is structured output?

Validated machine-readable output defined by a schema, using provider-native support or a tool-based strategy.

## 9. How does streaming work conceptually?

The agent emits incremental messages/state/custom events while the run progresses.

## 10. What is context engineering?

Deliberately controlling prompts, messages, tools, model choice, response format, state, and memory supplied to each model call.

## 11. What is MCP?

A protocol for standardizing tool/context integration with LLM applications; LangChain can consume MCP-hosted tools through adapters.

## 12. How do you secure tools?

Auth/authz outside the model, least privilege, schema validation, policy checks, audit, and HITL for sensitive actions.

## 13. How do you test LangChain agents?

Unit-test tools/middleware, fake model dependencies, test expected tool calls and state transitions, then run evaluation datasets.

## 14. What is LangSmith?

A tracing/debugging/evaluation platform commonly used with LangChain/LangGraph applications.

## 15. What about LCEL?

It is the runnable-composition model used heavily in older/current non-agent pipelines; I know it for existing systems, while current agent work centers on `create_agent`, middleware, runtime, and LangGraph.


---

<!-- Source: 27_SYSTEM_DESIGN_QUESTIONS.md -->
# LangChain — System Design Questions

## Q1 — Design an Enterprise Support Agent

```text
API/Auth
 ↓
LangChain Agent
 ├─ KB Retriever
 ├─ Order Tool
 ├─ Ticket Tool
 ├─ Policy Middleware
 ├─ Checkpointer
 └─ LangSmith/Telemetry
```

Discuss tool security, PII, thread state, escalation, and evaluation.

## Q2 — Design Multi-Tenant Context

Use runtime context for:
- tenant;
- user identity;
- dependencies;
- permissions.

Use separate state/checkpointer namespaces and store namespaces for isolation.

## Q3 — Design Long-Running Conversation Memory

- thread state via checkpointer;
- message trimming/summarization;
- durable long-term store for selected memories;
- explicit retention/deletion.

## Q4 — Design Dynamic Model Routing

Use middleware/strategy to select models based on task, cost, latency, or policy. Keep capability checks and telemetry.

## Q5 — LangChain or LangGraph?

Use LangChain when prebuilt agent behavior is enough. Use LangGraph directly when workflow state, branching, human checkpoints, or deterministic control must be modeled explicitly.

## Answer Framework

**Requirements → agent boundary → tools → context/state/store → middleware → security → streaming → observability → evaluation → failure handling.**


---

<!-- Source: 28_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
# LangChain — One-Page Final Cheat Sheet

## Formula

```text
LangChain Agent =
create_agent
+ Model
+ Tools
+ Middleware
+ State/Checkpointer
+ Store
+ Runtime Context
+ Structured Output
+ Streaming
```

## Key Distinctions

- LangChain = high-level framework
- LangGraph = low-level orchestration/runtime
- LangSmith = trace/evaluate/monitor
- State = mutable short-term thread data
- Checkpointer = state persistence
- Store = cross-thread long-term memory
- Runtime Context = static invocation dependencies/config
- Tool = callable capability
- Middleware = lifecycle/context extension point

## Production Rules

1. Do not hard-code provider assumptions.
2. Validate tool inputs.
3. Keep auth/authz outside the model.
4. Use durable checkpointers in production.
5. Separate short-term state from long-term memory.
6. Control context size.
7. Prefer structured output for downstream systems.
8. Stream progress for long-running agents.
9. Trace model/tool/retrieval steps.
10. Use LangGraph directly when orchestration complexity requires it.

## 30-Second Answer

> LangChain gives me a high-level agent framework over LangGraph. I use `create_agent` for the execution loop, tools for actions, middleware for lifecycle and context engineering, checkpointers for thread-scoped short-term memory, stores for cross-session memory, structured output for typed results, and LangSmith or equivalent telemetry for tracing and evaluation.
