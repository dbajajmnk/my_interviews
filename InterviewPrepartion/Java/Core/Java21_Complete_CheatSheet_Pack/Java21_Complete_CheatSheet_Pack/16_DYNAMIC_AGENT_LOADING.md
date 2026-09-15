# Dynamic Agent Loading — Java 21 Warning Direction

## What Changed

Java 21 prepares for a future where dynamically loading agents into a running JVM is disallowed by default.

## Why

Dynamic agent loading changes running JVM behavior and has security/integrity implications.

## Impact Areas

- profiling tools
- monitoring agents
- bytecode instrumentation
- some mocking/testing tools
- observability agents

## Production Rule

Prefer explicit startup-time agent configuration where possible.

## Migration

If a tool emits warnings:

1. identify the agent
2. upgrade the tool
3. follow vendor guidance
4. avoid depending on silent runtime attachment long term
