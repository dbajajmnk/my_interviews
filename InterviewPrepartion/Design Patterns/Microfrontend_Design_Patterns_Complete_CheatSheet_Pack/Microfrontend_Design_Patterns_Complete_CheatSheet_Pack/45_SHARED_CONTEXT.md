# Shared Context

## Problem

Large independently delivered frontends need a clear pattern for **share only stable application-wide concepts.**

## Intent

Share only stable application-wide concepts.

## Visual / Memory Trigger

```text
identity / locale / theme / entitlements
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for cross-cutting context.

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
identity / locale / theme / entitlements
```

## Interview Trap

Do not store mutable business-domain state here.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shared Context:** Share only stable application-wide concepts.
