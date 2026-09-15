# Runtime Composition

## Problem

Large independently delivered frontends need a clear pattern for **resolve and load independently deployed mfes at runtime.**

## Intent

Resolve and load independently deployed MFEs at runtime.

## Visual / Memory Trigger

```text
Shell → runtime map → remote bundle → mount
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when independent runtime release is essential.

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
Shell → runtime map → remote bundle → mount
```

## Interview Trap

Adds runtime compatibility and failure modes.

## Related Patterns

Module Federation, Import Map, Runtime Manifest / Remote Registry

## 20-Second Recall

> **Runtime Composition:** Resolve and load independently deployed MFEs at runtime.
