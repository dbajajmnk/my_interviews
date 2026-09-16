# Extensibility and Plugin Model

## Extension Points

Support safe extension through interfaces:
- model providers;
- memory backends;
- retrievers;
- telemetry exporters;
- evaluators;
- tools.

## Registration

Prefer explicit registration:
```text
builder.withModelProvider(...)
builder.withMemory(...)
builder.addTool(...)
```

This is easier to reason about than hidden global discovery.

## Compatibility

Extensions should declare:
- SDK version compatibility;
- capabilities;
- required configuration.

## Security

Third-party extensions must not automatically inherit unrestricted credentials or tool permissions.
