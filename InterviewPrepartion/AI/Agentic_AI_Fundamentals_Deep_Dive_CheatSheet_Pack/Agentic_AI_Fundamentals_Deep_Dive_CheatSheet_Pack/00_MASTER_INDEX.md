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
