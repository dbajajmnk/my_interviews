# Agent SDK Design Patterns — Master Index

## Purpose

This pack focuses on the software-design patterns that make an enterprise Agent SDK modular, extensible, provider-neutral, testable, and backward-compatible.

It is intentionally architecture-first: the goal is not to memorize GoF names, but to understand **where each pattern fits inside an Agent SDK**.

## Master Mapping

```text
Developer API
   │
   ▼
Facade
   │
   ▼
Agent Runtime
   ├─ Strategy        → model / retry / routing policy
   ├─ Adapter         → provider / vector DB / tool backends
   ├─ Factory         → provider/tool/runtime creation
   ├─ Builder         → fluent Agent configuration
   ├─ Command         → tool invocation as executable action
   ├─ Observer        → events / telemetry / streaming
   ├─ Chain           → guardrails / middleware
   ├─ State           → execution lifecycle behavior
   ├─ Template Method → common run lifecycle
   ├─ Decorator       → tracing / caching / retries
   ├─ Proxy           → remote tool/model access
   └─ Dependency Injection → replaceability/testability
```

## Core Principle

> Use patterns to protect stable contracts and isolate change. Do not add patterns just to make the design look sophisticated.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_PATTERN_SELECTION_MENTAL_MODEL.md`
3. `03_ADAPTER_PATTERN.md`
4. `04_STRATEGY_PATTERN.md`
5. `05_FACTORY_AND_ABSTRACT_FACTORY.md`
6. `06_BUILDER_PATTERN.md`
7. `07_COMMAND_PATTERN_FOR_TOOLS.md`
8. `08_OBSERVER_EVENT_PATTERN.md`
9. `09_FACADE_PATTERN.md`
10. `10_DECORATOR_PATTERN.md`
11. `11_CHAIN_OF_RESPONSIBILITY.md`
12. `12_PROXY_PATTERN.md`
13. `13_STATE_PATTERN.md`
14. `14_TEMPLATE_METHOD_PATTERN.md`
15. `15_REPOSITORY_AND_PROVIDER_PATTERNS.md`
16. `16_DEPENDENCY_INJECTION.md`
17. `17_PLUGIN_AND_EXTENSION_PATTERN.md`
18. `18_ROUTER_AND_POLICY_PATTERNS.md`
19. `19_RESILIENCE_PATTERNS.md`
20. `20_ANTI_PATTERNS.md`
21. `21_REFERENCE_ARCHITECTURE_WITH_PATTERNS.md`
22. `22_JAVA_EXAMPLE.md`
23. `23_PYTHON_EXAMPLE.md`
24. `24_TYPESCRIPT_EXAMPLE.md`
25. `25_CSHARP_EXAMPLE.md`
26. `26_INTERVIEW_QUESTIONS.md`
27. `27_SYSTEM_DESIGN_QUESTIONS.md`
28. `28_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

For today's interview preparation:

- **Core first:** 01 → 10
- **Enterprise extensions:** 11 → 21
- **Language examples:** 22 → 25
- **Interview mode:** 26 → 28
