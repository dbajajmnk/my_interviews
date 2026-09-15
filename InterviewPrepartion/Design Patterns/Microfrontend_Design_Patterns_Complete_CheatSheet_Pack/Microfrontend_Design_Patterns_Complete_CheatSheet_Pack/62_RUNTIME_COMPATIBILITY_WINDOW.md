# Runtime Compatibility Window

## Problem

Large independently delivered frontends need a clear pattern for **design old shell/new remote and new shell/old remote overlap.**

## Intent

Design old shell/new remote and new shell/old remote overlap.

## Visual / Memory Trigger

```text
N and N-1 compatibility
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use in runtime composition.

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
N and N-1 compatibility
```

## Interview Trap

Zero-overlap versions force coordinated deploys.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Runtime Compatibility Window:** Design old shell/new remote and new shell/old remote overlap.
