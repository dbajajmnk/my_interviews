# Context-Specific Deserialization Filters

## Why

Java native serialization can be dangerous when untrusted object graphs are accepted.

## Goal

Allow filtering decisions for deserialization contexts.

## Security Principle

```text
Untrusted serialized bytes
        ↓
Filter / allowlist decision
        ↓
Only expected classes / limits
        ↓
Deserialize
```

## Best Practice

For external service APIs, prefer safer explicit formats such as JSON/Protobuf with strict schemas rather than native Java serialization.

## Trap

Deserialization filtering reduces risk; it does not make arbitrary native Java deserialization inherently safe.
