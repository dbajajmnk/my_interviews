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
