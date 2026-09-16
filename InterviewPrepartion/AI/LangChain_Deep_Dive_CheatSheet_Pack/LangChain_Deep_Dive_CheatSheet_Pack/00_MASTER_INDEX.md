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
