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
