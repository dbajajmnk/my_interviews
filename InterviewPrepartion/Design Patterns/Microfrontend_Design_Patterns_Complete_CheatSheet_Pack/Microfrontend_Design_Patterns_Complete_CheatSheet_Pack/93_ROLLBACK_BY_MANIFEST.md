# Rollback by Manifest

## Problem

Large independently delivered frontends need a clear pattern for **rollback by repointing runtime version mapping.**

## Intent

Rollback by repointing runtime version mapping.

## Visual / Memory Trigger

```text
catalog:v43 → catalog:v42
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for fast recovery.

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
catalog:v43 → catalog:v42
```

## Interview Trap

Only works well with immutable retained artifacts.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Rollback by Manifest:** Rollback by repointing runtime version mapping.
