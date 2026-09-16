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
