# Minimal Global CSS

## Problem

Large independently delivered frontends need a clear pattern for **keep global stylesheet tiny and platform-owned.**

## Intent

Keep global stylesheet tiny and platform-owned.

## Visual / Memory Trigger

```text
reset + tokens only
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to reduce cross-team breakage.

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
reset + tokens only
```

## Interview Trap

Do not allow arbitrary global selectors from MFEs.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Minimal Global CSS:** Keep global stylesheet tiny and platform-owned.
