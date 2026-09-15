# Route Composition

## Problem

Large independently delivered frontends need a clear pattern for **only one major mfe owns each top-level route.**

## Intent

Only one major MFE owns each top-level route.

## Visual / Memory Trigger

```text
Route → one primary MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Strong default for autonomy and simple state.

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
Route → one primary MFE
```

## Interview Trap

Avoid hidden cross-route mutable state.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Route Composition:** Only one major MFE owns each top-level route.
