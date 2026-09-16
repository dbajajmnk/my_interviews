# Tool Calling & Function Calling — Master Index

## Purpose

This pack covers tool/function calling as the core action layer of enterprise agents.

Interview focus:
- what tool calling is;
- how model-driven tool selection works;
- tool schemas;
- argument validation;
- function dispatch;
- parallel/sequential tool calls;
- structured outputs;
- tool result handling;
- retries/timeouts/idempotency;
- authorization and approvals;
- tool registries;
- MCP and remote tools;
- observability;
- production security;
- Java/Python/TypeScript/C# mental models.

## Master Mental Model

```text
User Goal
   ↓
Model
   ↓
Tool Call Proposal
(name + arguments)
   ↓
Schema Validation
   ↓
Authorization / Policy
   ↓
Optional Human Approval
   ↓
Tool Executor
   ↓
External System
   ↓
Tool Result
   ↓
Model Continues
   ↓
Final Response
```

## Core Principle

> The model proposes an action. Deterministic application code validates, authorizes, executes, audits, and returns the result.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_TOOL_CALLING.md`
3. `03_FUNCTION_CALLING_VS_TOOL_CALLING.md`
4. `04_TOOL_SCHEMA_DESIGN.md`
5. `05_TOOL_DESCRIPTIONS_AND_DISCOVERABILITY.md`
6. `06_TOOL_SELECTION_FLOW.md`
7. `07_ARGUMENT_GENERATION_AND_VALIDATION.md`
8. `08_TOOL_REGISTRY_AND_DISPATCH.md`
9. `09_TOOL_EXECUTION_CONTEXT.md`
10. `10_TOOL_RESULTS_AND_OBSERVATIONS.md`
11. `11_STRUCTURED_OUTPUT_VS_TOOL_CALL.md`
12. `12_SEQUENTIAL_AND_PARALLEL_TOOL_CALLS.md`
13. `13_MULTI_STEP_TOOL_LOOPS.md`
14. `14_TOOL_RETRIES_TIMEOUTS_AND_CIRCUIT_BREAKERS.md`
15. `15_IDEMPOTENCY_AND_SIDE_EFFECT_SAFETY.md`
16. `16_AUTHENTICATION_AND_AUTHORIZATION.md`
17. `17_HUMAN_APPROVAL_AND_RISK_TIERS.md`
18. `18_TOOL_ERROR_MODEL.md`
19. `19_TOOL_VERSIONING_AND_BACKWARD_COMPATIBILITY.md`
20. `20_REMOTE_TOOLS_AND_MCP.md`
21. `21_TOOL_OBSERVABILITY_AND_AUDIT.md`
22. `22_SECURITY_AND_PROMPT_INJECTION.md`
23. `23_TOOL_TESTING_AND_CONTRACT_TESTS.md`
24. `24_PRODUCTION_ARCHITECTURE.md`
25. `25_PYTHON_EXAMPLE.md`
26. `26_JAVA_EXAMPLE.md`
27. `27_TYPESCRIPT_EXAMPLE.md`
28. `28_CSHARP_EXAMPLE.md`
29. `29_INTERVIEW_QUESTIONS.md`
30. `30_SYSTEM_DESIGN_QUESTIONS.md`
31. `31_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Core mechanics:** 01 → 13  
**Enterprise safety:** 14 → 24  
**Language recall:** 25 → 28  
**Interview mode:** 29 → 31
