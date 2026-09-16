# What Is an Agent SDK?

## Definition

An Agent SDK is a developer-facing library that makes it easier and safer to build, run, test, and integrate AI agents.

It should hide infrastructure complexity while preserving extension points.

## Developer Experience Goal

Without SDK:
```text
Application
 ├─ raw model API
 ├─ prompt code
 ├─ tool JSON
 ├─ retries
 ├─ state logic
 ├─ telemetry
 └─ provider-specific glue
```

With SDK:
```text
agent = Agent(...)
agent.add_tool(...)
result = agent.run(...)
```

## SDK Responsibilities

A good SDK may provide:
- agent definition;
- tool registration;
- provider abstraction;
- structured outputs;
- context/state model;
- streaming events;
- memory/retrieval hooks;
- retries/timeouts;
- telemetry hooks;
- evaluation hooks;
- testing utilities.

## Not Its Job

Avoid putting business-specific workflows directly into the base SDK.

The SDK should provide primitives and extension points; applications compose them.
