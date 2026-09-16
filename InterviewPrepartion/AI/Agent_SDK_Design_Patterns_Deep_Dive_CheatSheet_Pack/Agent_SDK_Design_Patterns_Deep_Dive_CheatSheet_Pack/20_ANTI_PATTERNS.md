# Agent SDK Anti-Patterns

## 1. Provider Leakage

Public API exposes vendor-specific request/response classes.

## 2. God Runtime

One giant class handles model calls, tools, memory, tracing, retries, and policies.

## 3. Pattern Explosion

Every class gets wrapped in multiple abstractions without real change pressure.

## 4. Prompt-as-Security

Critical authorization rules exist only in natural-language instructions.

## 5. Global Mutable Registry

Hidden global providers/tools make testing and multi-tenant behavior unsafe.

## 6. Boolean State Explosion

`isRunning`, `isWaiting`, `isPaused`, `isFailed` combinations become inconsistent.

## 7. Retry Everything

Dangerous for write operations and policy failures.

## 8. Multi-Agent by Default

Unnecessary agents increase cost, latency, and debugging complexity.
