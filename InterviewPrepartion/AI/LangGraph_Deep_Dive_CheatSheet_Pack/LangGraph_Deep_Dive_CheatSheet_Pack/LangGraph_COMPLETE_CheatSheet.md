# LangGraph — Complete Deep Dive Cheat Sheet

Combined version of the full pack.


---

<!-- Source: 00_MASTER_INDEX.md -->
# LangGraph Deep Dive — Master Index

## Purpose

This pack covers LangGraph as a low-level orchestration framework for long-running, stateful agents and workflows.

It is designed for enterprise Agent SDK / Developer Enablement interviews where you may need to explain:
- StateGraph
- nodes and edges
- shared state and reducers
- conditional routing
- Command and Send
- persistence/checkpointing
- threads
- interrupts and human-in-the-loop
- streaming
- subgraphs
- durable execution
- retries, caching, timeouts
- functional API
- production architecture

## Master Mental Model

```text
                START
                  │
                  ▼
             ┌────────┐
             │ Node A │
             └────┬───┘
                  │
           shared state
                  │
             conditional
               routing
              /       \
             ▼         ▼
         ┌───────┐  ┌───────┐
         │Node B │  │Node C │
         └───┬───┘  └───┬───┘
             │            │
             └──────┬─────┘
                    ▼
                   END
```

**LangGraph = state + nodes + edges + runtime + persistence.**

## Current Positioning

Use LangGraph when you need lower-level control over agent orchestration, durable execution, explicit state transitions, branching, interrupts, human approval, persistence, streaming, and long-running workflows.

LangChain agents are built on top of LangGraph, but you do not need to use LangChain in order to use LangGraph.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_LANGGRAPH.md`
3. `03_LANGCHAIN_VS_LANGGRAPH.md`
4. `04_STATEGRAPH_BASICS.md`
5. `05_STATE_SCHEMA_AND_REDUCERS.md`
6. `06_NODES_EDGES_START_END.md`
7. `07_CONDITIONAL_EDGES_AND_ROUTING.md`
8. `08_COMMAND_PRIMITIVE.md`
9. `09_SEND_AND_DYNAMIC_FANOUT.md`
10. `10_COMPILE_INVOKE_STREAM_ASYNC.md`
11. `11_PERSISTENCE_AND_CHECKPOINTS.md`
12. `12_THREADS_AND_STATE_HISTORY.md`
13. `13_INTERRUPTS_AND_HUMAN_IN_THE_LOOP.md`
14. `14_DURABLE_EXECUTION.md`
15. `15_STREAMING_MODES.md`
16. `16_SUBGRAPHS.md`
17. `17_MEMORY_AND_STORE.md`
18. `18_FUNCTIONAL_API_ENTRYPOINT_TASK.md`
19. `19_RETRIES_TIMEOUTS_AND_CACHING.md`
20. `20_ERROR_HANDLING_AND_FAULT_TOLERANCE.md`
21. `21_PARALLELISM_AND_MAP_REDUCE.md`
22. `22_TIME_TRAVEL_AND_REPLAY.md`
23. `23_AGENT_ORCHESTRATION_PATTERNS.md`
24. `24_PRODUCTION_ARCHITECTURE.md`
25. `25_TESTING_DEBUGGING_AND_OBSERVABILITY.md`
26. `26_INTERVIEW_QUESTIONS.md`
27. `27_SYSTEM_DESIGN_QUESTIONS.md`
28. `28_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Core:** 01 → 10  
**Stateful production:** 11 → 20  
**Advanced orchestration:** 21 → 25  
**Interview mode:** 26 → 28


---

<!-- Source: 01_30_SECOND_RECALL.md -->
# LangGraph — 30-Second Recall

## Recall

```text
LangGraph =
StateGraph
+ Nodes
+ Edges
+ Shared State
+ Reducers
+ Persistence
+ Interrupts
+ Streaming
+ Durable Execution
```

## 30-Second Interview Answer

> LangGraph is a low-level orchestration framework for building stateful, long-running agents and workflows. I define a StateGraph with typed shared state, nodes that return partial state updates, and edges that determine control flow. I use checkpointers for durable state, interrupts for human-in-the-loop, Command for update-plus-routing, Send for dynamic fan-out, and streaming for runtime visibility.

## Key Distinctions

- `StateGraph` = builder.
- `compile()` = executable graph.
- node = function operating on shared state.
- edge = control-flow transition.
- reducer = merges concurrent state updates.
- checkpointer = durable thread state.
- `Command` = update state + route.
- `Send` = dynamic fan-out with custom state.
- `interrupt()` = pause and resume.


---

<!-- Source: 02_WHAT_IS_LANGGRAPH.md -->
# What Is LangGraph?

## Definition

LangGraph is a low-level orchestration framework for building, managing, and running long-running stateful agents and workflows.

## Core Strengths

- explicit control flow;
- durable execution;
- persistence;
- human-in-the-loop;
- streaming;
- stateful workflows;
- deterministic + agentic composition;
- long-running processes.

## When to Use

Use LangGraph when:
- workflow structure matters;
- state transitions must be explicit;
- the system can pause/resume;
- human approval is required;
- agents need durable execution;
- deterministic and model-driven steps are mixed.

## When Not Needed

If a standard LangChain `create_agent` fits the use case, direct LangGraph may add unnecessary complexity.


---

<!-- Source: 03_LANGCHAIN_VS_LANGGRAPH.md -->
# LangChain vs LangGraph

## Comparison

| Area | LangChain | LangGraph |
|---|---|---|
| Level | Higher-level | Lower-level |
| Primary goal | Build agents quickly | Custom orchestration |
| Agent loop | Prebuilt | Explicitly modeled |
| State | Managed for you | First-class graph state |
| Branching | Higher-level APIs | Explicit edges |
| HITL | Available | Native orchestration primitive |
| Durable execution | Under the hood | Direct control |

## Interview Answer

> I use LangChain when its prebuilt agent architecture is enough. I use LangGraph directly when I need explicit state, branching, durable execution, interrupts, subgraphs, or deterministic orchestration around agentic steps.


---

<!-- Source: 04_STATEGRAPH_BASICS.md -->
# StateGraph Basics

## Definition

`StateGraph` is the main graph builder. Nodes read shared state and return partial state updates.

## Minimal Example

```python
from typing_extensions import TypedDict
from langgraph.graph import StateGraph, START, END

class State(TypedDict):
    text: str

def uppercase(state: State):
    return {"text": state["text"].upper()}

builder = StateGraph(State)
builder.add_node("uppercase", uppercase)
builder.add_edge(START, "uppercase")
builder.add_edge("uppercase", END)

graph = builder.compile()

result = graph.invoke({"text": "hello"})
```

## Important

A `StateGraph` must be compiled before execution.

The compiled graph can be invoked, streamed, batched, or called asynchronously.


---

<!-- Source: 05_STATE_SCHEMA_AND_REDUCERS.md -->
# State Schema and Reducers

## State

State defines the data shared across nodes.

## Partial Updates

Nodes return only the fields they change.

```python
def node(state):
    return {"status": "done"}
```

## Reducers

Reducers define how multiple updates to the same state key are combined.

## Example

```python
import operator
from typing import Annotated
from typing_extensions import TypedDict

class State(TypedDict):
    messages: Annotated[list[str], operator.add]
```

## Why Reducers Matter

Reducers are essential when parallel branches write to the same key.

Without a valid reducer strategy, concurrent writes may conflict.


---

<!-- Source: 06_NODES_EDGES_START_END.md -->
# Nodes, Edges, START and END

## Nodes

A node is a unit of execution.

Examples:
- model call;
- retrieval;
- tool execution;
- validation;
- approval;
- transformation.

## Edges

Edges define what executes next.

## START / END

`START` and `END` are special graph boundaries.

```text
START → classify → process → END
```

## Multiple Upstream Nodes

When multiple start nodes feed the same downstream edge, the runtime can wait for all required upstream nodes before continuing.


---

<!-- Source: 07_CONDITIONAL_EDGES_AND_ROUTING.md -->
# Conditional Edges and Routing

## Purpose

Conditional edges support branching based on current state.

## Example

```python
def route(state):
    if state["approved"]:
        return "execute"
    return "review"

builder.add_conditional_edges(
    "check",
    route,
    {
        "execute": "execute",
        "review": "review",
    }
)
```

## Use Cases

- model-based routing;
- success/failure;
- confidence threshold;
- retry/escalation;
- approval branching.

## Interview Point

> Conditional edges make control flow explicit and inspectable instead of burying branching inside large node functions.


---

<!-- Source: 08_COMMAND_PRIMITIVE.md -->
# Command Primitive

## Purpose

`Command` combines graph state updates with routing/control decisions.

## Mental Model

```text
Node
 ↓
Command(
  update = {...},
  goto = "next-node"
)
```

## Why Useful

Use `Command` when a node needs to:
- update state;
- choose the next node;
- resume an interrupt;
- direct execution dynamically.

## Interview Point

> Command is useful when state mutation and control-flow decision belong to the same node result.


---

<!-- Source: 09_SEND_AND_DYNAMIC_FANOUT.md -->
# Send and Dynamic Fan-Out

## Purpose

`Send` dynamically invokes a target node with custom state.

## Map-Reduce Mental Model

```text
Subjects
   │
   ├─ Send(worker, subject A)
   ├─ Send(worker, subject B)
   └─ Send(worker, subject C)
          ↓
       aggregate
```

## Use Cases

- dynamic parallel work;
- map-reduce;
- one worker per document;
- one subtask per entity;
- fan-out/fan-in.

## Important

The state passed with `Send` can differ from the graph's main state.


---

<!-- Source: 10_COMPILE_INVOKE_STREAM_ASYNC.md -->
# Compile, Invoke, Stream, Async

## Compile

`StateGraph` is a builder. Call `.compile()` to create an executable graph.

## Execution APIs

Common operations:
- `invoke()`
- `ainvoke()`
- `stream()`
- `astream()`

## Mental Model

```text
Builder
 ↓ compile()
Compiled Graph
 ├─ invoke
 ├─ stream
 ├─ ainvoke
 └─ astream
```

## Rule

Use async execution when nodes depend heavily on network-bound work such as model APIs, tools, and retrieval.


---

<!-- Source: 11_PERSISTENCE_AND_CHECKPOINTS.md -->
# Persistence and Checkpoints

## What

A checkpoint is a snapshot of graph state at a point in execution.

## Why

Checkpointing enables:
- resume;
- human-in-the-loop;
- state history;
- fault recovery;
- time travel;
- durable execution.

## Thread

A sequence of checkpoints is associated with a `thread_id`.

## Conceptual Example

```text
thread_id = customer-123

checkpoint 1
checkpoint 2
checkpoint 3
```

## Production Rule

Use durable checkpoint storage for production. In-memory savers are useful for development/tests.


---

<!-- Source: 12_THREADS_AND_STATE_HISTORY.md -->
# Threads and State History

## Thread

A thread identifies a logical sequence of graph state revisions.

## History

You can inspect previous checkpoints to understand how the graph evolved.

## Uses

- debugging;
- audit;
- resume;
- user conversation continuity;
- rollback/time travel.

## Enterprise Design

Keep tenant/user/thread identifiers explicit and avoid accidental cross-tenant state sharing.


---

<!-- Source: 13_INTERRUPTS_AND_HUMAN_IN_THE_LOOP.md -->
# Interrupts and Human-in-the-Loop

## What

`interrupt()` pauses graph execution and surfaces a value to the caller.

## Resume

Resume the graph using `Command` with a resume value.

## Mental Model

```text
Agent proposes action
      ↓
 interrupt()
      ↓
 Human review
      ↓
Command(resume=...)
      ↓
Graph continues
```

## Important Runtime Detail

When resumed, the interrupted node can re-execute from the beginning, so code before the interrupt should be designed carefully for idempotency.

## Requirement

Interrupts rely on persistence/checkpointing.


---

<!-- Source: 14_DURABLE_EXECUTION.md -->
# Durable Execution

## Definition

Durable execution means graph progress is persisted so work can survive interruption, failure, or process restart.

## Why Important

Agents may:
- wait for humans;
- call slow tools;
- run for minutes/hours;
- experience provider failures;
- need later resumption.

## Principle

Persist state at meaningful boundaries and make side effects idempotent.

## Enterprise Recall

> Durable execution converts an agent from an ephemeral request handler into a resumable workflow.


---

<!-- Source: 15_STREAMING_MODES.md -->
# Streaming Modes

## Current Stream Modes

LangGraph supports multiple stream modes including:
- `values`
- `updates`
- `messages`
- `custom`
- `checkpoints`
- `tasks`
- `debug`

## Mental Model

- `values` → whole state after steps
- `updates` → node/task updates
- `messages` → token/message streaming
- `custom` → application-defined stream data
- `checkpoints` → checkpoint events
- `tasks` → task lifecycle
- `debug` → detailed execution information

## Use

Choose stream mode based on consumer:
- UI;
- telemetry;
- debugging;
- operations.


---

<!-- Source: 16_SUBGRAPHS.md -->
# Subgraphs

## What

A subgraph is a graph embedded inside another graph.

## Why

Subgraphs help isolate:
- reusable workflows;
- specialized agents;
- bounded business domains;
- nested orchestration.

## Architecture

```text
Parent Graph
 ├─ validation
 ├─ Support Subgraph
 │    ├─ classify
 │    └─ resolve
 └─ finalization
```

## Design Rule

Use subgraphs when a workflow has a meaningful independent boundary. Do not split every two nodes into a subgraph.


---

<!-- Source: 17_MEMORY_AND_STORE.md -->
# Memory and Store

## State vs Store

Checkpointed graph state handles thread-scoped execution history.

A store supports broader long-term data that may span multiple threads.

## Use Cases

- user preferences;
- persistent knowledge;
- cross-session memory;
- agent profile/state beyond one thread.

## Rule

Treat long-term memory as governed data with explicit retention, privacy, and deletion semantics.


---

<!-- Source: 18_FUNCTIONAL_API_ENTRYPOINT_TASK.md -->
# Functional API — entrypoint and task

## What

LangGraph also provides a functional API using `entrypoint` and `task`.

## Mental Model

```python
from langgraph.func import entrypoint, task

@task
def do_work(x):
    return x + 1

@entrypoint()
def workflow(values):
    futures = [do_work(v) for v in values]
    return [f.result() for f in futures]
```

## When Useful

Use the Functional API when you prefer normal function structure over explicit graph-builder syntax.

## Task Features

Tasks can support:
- retry policy;
- cache policy;
- timeout;
- parallel execution via futures.

## Graph API vs Functional API

Use whichever makes the workflow easier to understand. The execution concepts—durability, tasks, state, retries—remain similar.


---

<!-- Source: 19_RETRIES_TIMEOUTS_AND_CACHING.md -->
# Retries, Timeouts and Caching

## RetryPolicy

Retry policies can be attached to nodes/tasks to handle transient failures.

## Timeouts

Timeouts bound node/task execution.

Use them to avoid:
- hung external APIs;
- runaway tools;
- stalled nodes.

## CachePolicy

Cache policies can reuse node/task results for matching inputs and optional TTL.

## Caution

Do not cache:
- security decisions;
- stale-sensitive transactional reads;
- non-deterministic results without understanding impact.

## Retry Rule

Retry only transient failures and only when side effects are safe/idempotent.


---

<!-- Source: 20_ERROR_HANDLING_AND_FAULT_TOLERANCE.md -->
# Error Handling and Fault Tolerance

## Failure Types

- node failure;
- timeout;
- invalid state update;
- graph recursion limit;
- provider/tool failure;
- cancellation.

## Fault Tolerance

Checkpointing can preserve successful progress and support resumption instead of replaying all prior work.

## Design Techniques

- bounded retries;
- error nodes;
- compensating actions;
- idempotency;
- fallback routes;
- durable checkpoints.

## Interview Point

> In long-running graphs, the goal is not merely to catch exceptions; it is to preserve correct progress and resume safely.


---

<!-- Source: 21_PARALLELISM_AND_MAP_REDUCE.md -->
# Parallelism and Map-Reduce

## Parallel Branches

Multiple nodes can run in parallel when graph dependencies allow it.

## Map-Reduce

Use `Send` for dynamic fan-out and reducers to aggregate results.

## Example

```text
Documents
   │
   ├─ worker(doc1)
   ├─ worker(doc2)
   └─ worker(doc3)
          ↓
        reducer
          ↓
        summary
```

## Production Considerations

Watch:
- concurrency limits;
- provider rate limits;
- result ordering;
- reducer correctness;
- memory/token use.


---

<!-- Source: 22_TIME_TRAVEL_AND_REPLAY.md -->
# Time Travel and Replay

## What

Checkpoint history allows earlier graph states to be inspected and reused.

## Use Cases

- debugging;
- branch from historical state;
- replay;
- experimentation;
- recovery.

## Mental Model

```text
checkpoint 1 → checkpoint 2 → checkpoint 3
                    │
                    └── fork / replay
```

## Caution

Replaying a workflow with side-effecting nodes can duplicate actions unless those actions are idempotent or protected.


---

<!-- Source: 23_AGENT_ORCHESTRATION_PATTERNS.md -->
# Agent Orchestration Patterns

## Sequential

```text
A → B → C
```
Use for known ordered work.

## Router

```text
Input → classify → A / B / C
```
Use for specialization.

## Supervisor

```text
Supervisor
 ├─ Agent A
 ├─ Agent B
 └─ Agent C
```
Use when central coordination is needed.

## Planner-Executor

```text
Planner → plan → Executor → observe → replan
```
Use for dynamic multi-step tasks.

## Parallel

Use for independent work that can run concurrently.

## Human Approval

Use interrupt/resume around sensitive actions.

## Rule

Start with the simplest graph that expresses the workflow.


---

<!-- Source: 24_PRODUCTION_ARCHITECTURE.md -->
# LangGraph Production Architecture

## Reference Architecture

```text
Client / API
    │
Auth / Gateway
    │
LangGraph Service
    │
Compiled Graph
 ├─ Model APIs
 ├─ Tool Services
 ├─ Retrieval
 ├─ Checkpointer
 ├─ Long-Term Store
 ├─ Event Stream
 └─ Observability
```

## Production Requirements

- durable checkpoint store;
- explicit thread IDs;
- idempotent tool actions;
- retries/timeouts;
- cancellation;
- tenant isolation;
- secrets management;
- streaming;
- tracing;
- evaluation;
- state cleanup/retention.

## Scaling

Scale graph workers independently from:
- model providers;
- tool services;
- storage;
- retrieval systems.


---

<!-- Source: 25_TESTING_DEBUGGING_AND_OBSERVABILITY.md -->
# Testing, Debugging and Observability

## Unit Tests

Test nodes independently with known state input/output.

## Graph Tests

Test:
- expected path;
- conditional branches;
- retries;
- parallel reducers;
- interrupts;
- resume behavior;
- failure paths.

## State History

Checkpoint history is useful for debugging state transitions.

## Streaming/Tracing

Use runtime stream modes and tracing to observe:
- node starts/finishes;
- state updates;
- messages;
- errors;
- checkpoints.

## Evaluation

Evaluate final task success plus graph path quality, tool correctness, latency, cost, and policy compliance.


---

<!-- Source: 26_INTERVIEW_QUESTIONS.md -->
# LangGraph — Interview Questions & Answers

## 1. What is LangGraph?

A low-level orchestration framework for long-running, stateful agents and workflows.

## 2. What is StateGraph?

A builder where nodes read shared state and return partial state updates.

## 3. Why compile the graph?

`StateGraph` is only a builder. Compilation creates the executable graph.

## 4. What are reducers?

Functions that define how concurrent updates to a state key are merged.

## 5. Conditional edge vs Command?

Conditional edges route externally based on state. Command lets a node return both state updates and control-flow instructions.

## 6. What is Send?

A primitive for dynamically invoking a node with custom state, useful for map-reduce and fan-out.

## 7. What is a checkpoint?

A persisted snapshot of graph state at a point in execution.

## 8. What is a thread?

A logical sequence of checkpoints identified by `thread_id`.

## 9. How does HITL work?

Use `interrupt()` to pause and `Command(resume=...)` to continue, with checkpointing enabled.

## 10. Why must interrupt-side effects be idempotent?

The interrupted node may restart from the beginning on resume.

## 11. What is durable execution?

Persisting workflow progress so execution can survive waits, failures, or restarts.

## 12. What stream modes matter?

Values, updates, messages, custom, checkpoints, tasks, and debug.

## 13. What are subgraphs?

Reusable/nested graphs used to isolate meaningful workflow boundaries.

## 14. Functional API vs Graph API?

Functional API uses entrypoint/tasks; Graph API models nodes/edges explicitly. Choose based on readability and control needs.

## 15. LangChain vs LangGraph?

LangChain is higher-level; LangGraph is lower-level orchestration and runtime control.

## 16. How do you handle parallel writes?

Use reducers appropriate to the state key and design deterministic aggregation.

## 17. How do retries work safely?

Retry transient failures only and protect side effects with idempotency.

## 18. How do you debug a bad graph run?

Inspect state history, node path, stream events, checkpoint sequence, tool/model traces, and error metadata.

## 19. What is time travel?

Using historical checkpoints to inspect, replay, or branch from earlier graph state.

## 20. One-line principle?

> Make control flow explicit, state durable, and side effects idempotent.


---

<!-- Source: 27_SYSTEM_DESIGN_QUESTIONS.md -->
# LangGraph — System Design Questions

## Q1 — Design a Human-Approved Refund Agent

```text
START
  ↓
load_order
  ↓
check_policy
  ↓
recommend_refund
  ↓
interrupt(approval)
  ↓
approved?
 ├─ yes → execute_refund
 └─ no  → reject
  ↓
END
```

Discuss checkpoints, idempotency, auth, audit, and retries.

## Q2 — Design a Research Workflow

```text
plan
 ↓
Send(researcher, topic1)
Send(researcher, topic2)
Send(researcher, topic3)
 ↓
reducer
 ↓
synthesize
 ↓
END
```

## Q3 — Design a Supervisor Multi-Agent Graph

Use:
- supervisor node;
- specialized subgraphs;
- explicit shared state;
- conditional routing;
- termination conditions;
- per-agent tool boundaries.

## Q4 — Design Long-Running Durable Workflow

Discuss:
- thread ID;
- checkpoints;
- resume;
- timeouts;
- retries;
- human waits;
- idempotent side effects;
- state retention.

## Q5 — When Would You Use Functional API?

When normal function composition gives clearer code and you still want LangGraph task durability/retry/caching behavior.

## Answer Framework

**State → nodes → edges → routing → persistence → HITL → parallelism → failures → streaming → observability.**


---

<!-- Source: 28_ONE_PAGE_FINAL_CHEAT_SHEET.md -->
# LangGraph — One-Page Final Cheat Sheet

## Formula

```text
LangGraph =
State
+ Nodes
+ Edges
+ Reducers
+ Routing
+ Persistence
+ Interrupts
+ Streaming
+ Durable Execution
```

## Core APIs

- `StateGraph`
- `START`
- `END`
- `add_node`
- `add_edge`
- `add_conditional_edges`
- `compile`
- `invoke / ainvoke`
- `stream / astream`
- `Command`
- `Send`
- `interrupt`

## Key Concepts

- StateGraph = builder
- Compiled graph = executable
- Reducer = merge state updates
- Checkpoint = persisted state snapshot
- Thread = checkpoint sequence
- Command = update + routing
- Send = dynamic fan-out
- Interrupt = pause/resume
- Store = broader long-term memory
- Subgraph = nested reusable workflow

## Production Rules

1. Persist state for long-running workflows.
2. Use explicit thread IDs.
3. Make side effects idempotent.
4. Bound retries and timeouts.
5. Use reducers for parallel state writes.
6. Model human approval with interrupts.
7. Stream meaningful execution events.
8. Keep auth/authz outside model reasoning.
9. Test paths, not only nodes.
10. Prefer the simplest graph that makes control flow clear.

## 30-Second Answer

> LangGraph gives me explicit control over a stateful agent workflow. I model shared state with a StateGraph, implement nodes as state transformations, connect them through edges and conditional routes, persist execution with checkpoints and threads, use Command and Send for dynamic control flow, interrupt/resume for human approval, and streaming plus tracing for runtime visibility.
