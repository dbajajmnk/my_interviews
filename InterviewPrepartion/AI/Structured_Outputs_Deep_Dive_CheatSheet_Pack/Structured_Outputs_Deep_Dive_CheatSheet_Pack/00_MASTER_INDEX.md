# Structured Outputs — Master Index

## Purpose

This pack covers Structured Outputs as the typed contract layer between LLMs/agents and enterprise applications.

Interview focus:
- structured output vs free text vs JSON mode;
- JSON Schema;
- strict schema adherence;
- provider-native structured output;
- tool-based structured output;
- function calling;
- schema design;
- typed deserialization;
- validation;
- refusals and incomplete generations;
- streaming;
- versioning;
- backward compatibility;
- framework support in OpenAI, LangChain, and Microsoft Agent Framework;
- enterprise production patterns.

## Master Mental Model

```text
Unstructured Input
      ↓
     Model
      ↓
Schema-Constrained Generation
      ↓
Structured Result
      ↓
Validation / Parse
      ↓
Typed Domain Object
      ↓
API / Workflow / Database / UI
```

## Core Principle

> Structured Outputs turn model responses into contracts. They improve shape reliability, but they do not guarantee semantic correctness of the values inside that shape.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_ARE_STRUCTURED_OUTPUTS.md`
3. `03_FREE_TEXT_VS_JSON_MODE_VS_STRUCTURED_OUTPUT.md`
4. `04_JSON_SCHEMA_FUNDAMENTALS.md`
5. `05_STRICT_SCHEMA_ADHERENCE.md`
6. `06_SCHEMA_DESIGN_PRINCIPLES.md`
7. `07_REQUIRED_OPTIONAL_ENUMS_AND_BOUNDS.md`
8. `08_NESTED_OBJECTS_ARRAYS_AND_UNIONS.md`
9. `09_STRUCTURED_OUTPUT_VS_FUNCTION_CALLING.md`
10. `10_PROVIDER_NATIVE_VS_TOOL_BASED_STRATEGIES.md`
11. `11_TYPED_MODELS_PYDANTIC_ZOD_POJO_RECORDS.md`
12. `12_VALIDATION_AND_DESERIALIZATION.md`
13. `13_REFUSALS_AND_INCOMPLETE_OUTPUTS.md`
14. `14_ERROR_HANDLING_AND_RETRY.md`
15. `15_STREAMING_STRUCTURED_OUTPUTS.md`
16. `16_SCHEMA_VERSIONING_AND_COMPATIBILITY.md`
17. `17_SCHEMA_EVOLUTION_PATTERNS.md`
18. `18_SECURITY_AND_DATA_VALIDATION.md`
19. `19_PROMPT_DESIGN_FOR_STRUCTURED_OUTPUTS.md`
20. `20_OPENAI_STRUCTURED_OUTPUTS.md`
21. `21_LANGCHAIN_STRUCTURED_OUTPUTS.md`
22. `22_MICROSOFT_AGENT_FRAMEWORK_STRUCTURED_OUTPUTS.md`
23. `23_AGENT_SDK_DESIGN_FOR_STRUCTURED_OUTPUTS.md`
24. `24_PRODUCTION_ARCHITECTURE.md`
25. `25_TESTING_AND_CONTRACT_TESTS.md`
26. `26_PERFORMANCE_LATENCY_AND_COST.md`
27. `27_PYTHON_EXAMPLE.md`
28. `28_JAVA_EXAMPLE.md`
29. `29_TYPESCRIPT_EXAMPLE.md`
30. `30_CSHARP_EXAMPLE.md`
31. `31_INTERVIEW_QUESTIONS.md`
32. `32_SYSTEM_DESIGN_QUESTIONS.md`
33. `33_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Core:** 01 → 12  
**Reliability/production:** 13 → 26  
**Language examples:** 27 → 30  
**Interview mode:** 31 → 33
