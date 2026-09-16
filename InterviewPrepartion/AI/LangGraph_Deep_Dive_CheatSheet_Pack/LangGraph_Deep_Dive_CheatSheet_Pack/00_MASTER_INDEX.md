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
