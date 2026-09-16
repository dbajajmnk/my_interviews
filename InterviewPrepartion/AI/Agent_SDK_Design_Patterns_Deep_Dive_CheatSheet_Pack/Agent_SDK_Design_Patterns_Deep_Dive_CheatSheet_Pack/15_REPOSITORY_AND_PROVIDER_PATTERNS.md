# Repository & Provider Patterns

## Repository

Use Repository when you want a clean domain-facing abstraction for persisted data.

Examples:
```text
RunRepository
CheckpointRepository
MemoryRepository
```

## Provider

Use Provider interfaces for infrastructure capabilities:
```text
ModelProvider
EmbeddingProvider
MemoryProvider
TelemetryProvider
```

## Why

Separates domain/runtime logic from storage and infrastructure details.
