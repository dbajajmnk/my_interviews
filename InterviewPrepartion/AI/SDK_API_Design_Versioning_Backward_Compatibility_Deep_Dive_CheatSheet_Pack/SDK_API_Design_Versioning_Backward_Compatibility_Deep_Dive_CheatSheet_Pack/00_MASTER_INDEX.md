# SDK API Design, Versioning & Backward Compatibility — Master Index

## Purpose

This pack covers the public-contract discipline required to build a long-lived enterprise Agent SDK.

Interview focus:
- public API surface design;
- additive vs breaking changes;
- semantic versioning;
- binary/source/behavioral/wire compatibility;
- deprecation;
- capability negotiation;
- schema evolution;
- protocol and event evolution;
- compatibility shims;
- migration strategy;
- multi-language consistency;
- provider abstraction;
- contract testing;
- release governance.

## Master Mental Model

```text
Stable Public SDK Contract
        ↓
Versioned Semantics
 ├─ Agent
 ├─ Tool
 ├─ Run
 ├─ Context
 ├─ Events
 ├─ Errors
 └─ Capabilities
        ↓
Compatibility Policy
 ├─ additive first
 ├─ deprecate before remove
 ├─ negotiate capabilities
 └─ migration path
        ↓
Safe Evolution Over Time
```

## Core Principle

> A public SDK API is a contract with consumers. Every public type, method, event, error code, schema field and behavior becomes part of that contract.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_API_CONTRACT_DESIGN.md`
3. `03_PUBLIC_API_SURFACE_MINIMIZATION.md`
4. `04_STABILITY_ZONES.md`
5. `05_API_DESIGN_PRINCIPLES.md`
6. `06_SEMANTIC_VERSIONING.md`
7. `07_SOURCE_COMPATIBILITY.md`
8. `08_BINARY_COMPATIBILITY.md`
9. `09_BEHAVIORAL_COMPATIBILITY.md`
10. `10_WIRE_COMPATIBILITY.md`
11. `11_ADDITIVE_VS_BREAKING_CHANGES.md`
12. `12_DEPRECATION_LIFECYCLE.md`
13. `13_CAPABILITY_NEGOTIATION.md`
14. `14_FEATURE_DETECTION.md`
15. `15_SCHEMA_EVOLUTION.md`
16. `16_JSON_SCHEMA_EVOLUTION.md`
17. `17_STRUCTURED_OUTPUT_EVOLUTION.md`
18. `18_TOOL_SCHEMA_EVOLUTION.md`
19. `19_EVENT_SCHEMA_EVOLUTION.md`
20. `20_STREAMING_PROTOCOL_EVOLUTION.md`
21. `21_ERROR_MODEL_EVOLUTION.md`
22. `22_ENUM_EVOLUTION.md`
23. `23_NULLABILITY_AND_OPTIONAL_FIELD_EVOLUTION.md`
24. `24_DEFAULT_VALUES_AND_BEHAVIOR_CHANGES.md`
25. `25_PROVIDER_ABSTRACTION_STABILITY.md`
26. `26_COMPATIBILITY_SHIMS_AND_ADAPTERS.md`
27. `27_MIGRATION_LAYERS.md`
28. `28_MAJOR_VERSION_MIGRATIONS.md`
29. `29_MULTI_LANGUAGE_COMPATIBILITY.md`
30. `30_LANGUAGE_SPECIFIC_COMPATIBILITY_RISKS.md`
31. `31_PACKAGE_VERSIONING_STRATEGY.md`
32. `32_PREVIEW_BETA_EXPERIMENTAL_APIS.md`
33. `33_EXTENSION_POINTS_AND_PLUGIN_CONTRACTS.md`
34. `34_PROTOCOL_AND_SERVER_COMPATIBILITY.md`
35. `35_BACKWARD_COMPATIBLE_CLIENT_SERVER_EVOLUTION.md`
36. `36_CONTRACT_TESTING.md`
37. `37_COMPATIBILITY_MATRIX.md`
38. `38_RELEASE_NOTES_AND_MIGRATION_GUIDES.md`
39. `39_API_GOVERNANCE.md`
40. `40_BREAKING_CHANGE_REVIEW.md`
41. `41_REFERENCE_AGENT_SDK_API.md`
42. `42_REFERENCE_VERSIONING_POLICY.md`
43. `43_INTERVIEW_QUESTIONS.md`
44. `44_SYSTEM_DESIGN_QUESTIONS.md`
45. `45_BREAKING_CHANGE_CHECKLIST.md`
46. `46_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**API foundation:** 01 → 10  
**Versioning/evolution:** 11 → 24  
**Compatibility engineering:** 25 → 40  
**Reference/interview:** 41 → 46
