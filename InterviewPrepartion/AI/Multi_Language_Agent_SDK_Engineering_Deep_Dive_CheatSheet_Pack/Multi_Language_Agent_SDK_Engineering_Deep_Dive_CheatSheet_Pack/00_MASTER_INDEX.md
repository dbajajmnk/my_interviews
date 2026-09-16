# Multi-Language Agent SDK Engineering — Master Index

## Purpose

This pack covers how to design, implement, test, package, version, document, and operate one Agent SDK across **Python, Java, C#, and TypeScript** without losing semantic consistency or language idioms.

Interview focus:
- canonical cross-language contract;
- idiomatic APIs;
- async and streaming differences;
- cancellation;
- builders and configuration;
- tools and structured outputs;
- serialization;
- exceptions/errors;
- context and dependency injection;
- package publishing;
- code generation vs handwritten SDKs;
- parity testing;
- backward compatibility;
- observability;
- documentation and examples;
- release automation.

## Master Mental Model

```text
                  Canonical Agent SDK Spec
                           │
        ┌──────────────────┼──────────────────┐
        ▼                  ▼                  ▼
      Python              Java              C#            TypeScript
  idiomatic API      idiomatic API      idiomatic API     idiomatic API
        │                  │                  │                │
        └────────────── Shared Semantics / Fixtures ──────────┘
                           │
                    Compatibility Matrix
                           │
                     Release Automation
```

## Core Principle

> Cross-language SDKs should share semantics, not syntax. The contract must be consistent while each language still feels native to its ecosystem.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_MULTI_LANGUAGE_SDK_ENGINEERING.md`
3. `03_CANONICAL_CROSS_LANGUAGE_CONTRACT.md`
4. `04_SEMANTIC_PARITY_VS_API_SHAPE.md`
5. `05_PUBLIC_API_SURFACE.md`
6. `06_AGENT_PRIMITIVE.md`
7. `07_TOOL_PRIMITIVE.md`
8. `08_RUN_AND_RESULT_PRIMITIVES.md`
9. `09_CONTEXT_AND_RUNTIME_DEPENDENCIES.md`
10. `10_STRUCTURED_OUTPUT_TYPES.md`
11. `11_STREAMING_EVENT_MODEL.md`
12. `12_ERROR_MODEL.md`
13. `13_CANCELLATION_AND_TIMEOUTS.md`
14. `14_RETRY_AND_RESILIENCE_CONTRACTS.md`
15. `15_CONFIGURATION_AND_BUILDERS.md`
16. `16_DEPENDENCY_INJECTION_STRATEGIES.md`
17. `17_SERIALIZATION_AND_WIRE_FORMATS.md`
18. `18_SCHEMA_AND_TYPE_GENERATION.md`
19. `19_PROVIDER_ADAPTERS.md`
20. `20_TOOL_REGISTRY_AND_DISPATCH.md`
21. `21_MEMORY_AND_RETRIEVAL_INTERFACES.md`
22. `22_OBSERVABILITY_INTERFACES.md`
23. `23_PYTHON_IDIOMATIC_DESIGN.md`
24. `24_JAVA_IDIOMATIC_DESIGN.md`
25. `25_CSHARP_IDIOMATIC_DESIGN.md`
26. `26_TYPESCRIPT_IDIOMATIC_DESIGN.md`
27. `27_ASYNC_MODEL_COMPARISON.md`
28. `28_STREAMING_MODEL_COMPARISON.md`
29. `29_COLLECTIONS_NULLABILITY_AND_OPTIONALS.md`
30. `30_GENERIC_TYPES_AND_TYPE_SAFETY.md`
31. `31_EXCEPTION_AND_ERROR_MAPPING.md`
32. `32_PACKAGE_STRUCTURE_PER_LANGUAGE.md`
33. `33_PACKAGE_PUBLISHING_PYPI_MAVEN_NUGET_NPM.md`
34. `34_VERSIONING_AND_RELEASE_PARITY.md`
35. `35_BACKWARD_COMPATIBILITY.md`
36. `36_DEPRECATION_STRATEGY.md`
37. `37_CODE_GENERATION_VS_HANDWRITTEN_SDKS.md`
38. `38_SHARED_TEST_FIXTURES.md`
39. `39_CROSS_LANGUAGE_CONTRACT_TESTS.md`
40. `40_PARITY_TESTING.md`
41. `41_PERFORMANCE_AND_MEMORY_PROFILE.md`
42. `42_SECURITY_AND_SECRET_HANDLING.md`
43. `43_DOCUMENTATION_AND_DEVELOPER_EXPERIENCE.md`
44. `44_REFERENCE_REPOSITORY_STRUCTURE.md`
45. `45_CI_CD_MATRIX_BUILD.md`
46. `46_INTERVIEW_QUESTIONS.md`
47. `47_SYSTEM_DESIGN_QUESTIONS.md`
48. `48_PARITY_CHECKLIST.md`
49. `49_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Contract foundation:** 01 → 22  
**Language-specific design:** 23 → 31  
**Packaging/release:** 32 → 37  
**Testing/quality:** 38 → 45  
**Interview/revision:** 46 → 49
