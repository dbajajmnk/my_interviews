# State Synchronization Anti-Pattern

## Problem

Large independently delivered frontends need a clear pattern for **multiple mfes continuously mirror mutable state.**

## Intent

Multiple MFEs continuously mirror mutable state.

## Visual / Memory Trigger

```text
Store A ↔ Store B ↔ Store C
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Avoid.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Store A ↔ Store B ↔ Store C
```

## Interview Trap

Usually fix by merging boundary or moving truth to URL/backend.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **State Synchronization Anti-Pattern:** Multiple MFEs continuously mirror mutable state.
