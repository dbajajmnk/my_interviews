# Plugin & Extension Pattern

## Intent

Allow new capabilities without changing the Agent SDK core.

## Possible Plugins

- model adapter;
- memory backend;
- retriever;
- evaluator;
- telemetry exporter;
- tool pack.

## Extension Contract

A plugin should declare:
- identifier;
- version;
- capabilities;
- SDK compatibility;
- configuration schema.

## Security

Do not give plugins implicit unrestricted credentials or filesystem/network access.
