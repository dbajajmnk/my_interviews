# Tool Versioning and Backward Compatibility

## Why

Tool schemas are public contracts to the model/runtime and often to SDK clients.

## Safe Changes

Prefer:
- additive optional fields;
- stable names;
- deprecation windows;
- compatibility shims.

## Breaking Changes

Examples:
- renaming required arguments;
- changing enum meaning;
- changing tool semantics;
- changing output shape unexpectedly.

## Rule

Treat tool contracts with the same seriousness as public API contracts.
