# Enterprise Agent SDK Architecture — Master Index

## Purpose

This pack focuses on the architecture of an enterprise-grade Agent SDK: how to expose stable developer APIs while hiding model-provider, tool-runtime, memory, retrieval, telemetry, policy, and orchestration complexity.

It is designed for senior engineering interviews where the candidate is expected to think beyond prompt engineering and explain reusable SDK/platform design.

## Master Architecture

```text
Developer Application
        │
        ▼
┌──────────────────────────────┐
│ Public Agent SDK API         │
│ Agent / Tool / Run / Context │
└──────────────┬───────────────┘
               ▼
┌──────────────────────────────┐
│ Agent Runtime / Orchestrator │
└───────┬───────────┬──────────┘
        │           │
        ▼           ▼
 Model Gateway   Tool Runtime
        │           │
        ▼           ▼
 Providers      Enterprise APIs

        ┌───────────┼───────────┐
        ▼           ▼           ▼
     Memory      Retrieval    Policy
        │           │           │
        └───────────┼───────────┘
                    ▼
             Observability
```

## Core Architecture Principle

> Keep the public SDK contract small, stable, provider-neutral, and easy to use. Put complexity behind internal adapters and extension points.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_AN_AGENT_SDK.md`
3. `03_PUBLIC_API_VS_INTERNAL_RUNTIME.md`
4. `04_CORE_SDK_ABSTRACTIONS.md`
5. `05_AGENT_RUNTIME_ARCHITECTURE.md`
6. `06_MODEL_PROVIDER_ABSTRACTION.md`
7. `07_TOOL_REGISTRY_AND_TOOL_RUNTIME.md`
8. `08_CONTEXT_STATE_MEMORY_CONTRACTS.md`
9. `09_RETRIEVAL_INTEGRATION.md`
10. `10_STREAMING_AND_EVENTS.md`
11. `11_SYNC_ASYNC_AND_CANCELLATION.md`
12. `12_ERROR_MODEL_RETRY_TIMEOUTS.md`
13. `13_SECURITY_AND_POLICY_BOUNDARIES.md`
14. `14_OBSERVABILITY_AND_TRACING_HOOKS.md`
15. `15_EVALUATION_AND_TESTABILITY.md`
16. `16_MULTI_LANGUAGE_SDK_ARCHITECTURE.md`
17. `17_EXTENSIBILITY_AND_PLUGIN_MODEL.md`
18. `18_BACKWARD_COMPATIBILITY_ARCHITECTURE.md`
19. `19_REFERENCE_IMPLEMENTATION_BLUEPRINT.md`
20. `20_INTERVIEW_QUESTIONS.md`
21. `21_SYSTEM_DESIGN_QUESTIONS.md`
22. `22_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

For interview preparation today:

**First pass:** 01 → 05  
**Second pass:** 06 → 15  
**Third pass:** 16 → 19  
**Interview rehearsal:** 20 → 22
