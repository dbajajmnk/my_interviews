# Agents SDK vs Responses API

## Responses API

Use the Responses API directly when you want to own:
- the execution loop;
- tool dispatch;
- state handling;
- orchestration.

## Agents SDK

Use the Agents SDK when you want the runtime to manage:
- multiple turns;
- tools;
- handoffs;
- guardrails;
- sessions;
- run results;
- approvals;
- tracing.

## Mental Model

```text
Responses API
Application owns orchestration
        │
        ▼
     Model API

Agents SDK
Application
   │
   ▼
Agent + Runner
   │
   ▼
Responses API / Model
```

## Interview Answer

> The Responses API is the lower-level model/tool interface. The Agents SDK adds an opinionated but lightweight runtime around it. I choose based on how much orchestration I want the application to own.
