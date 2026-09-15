# Design Tokens

## Problem

Large independently delivered frontends need a clear pattern for **share cross-framework visual primitives.**

## Intent

Share cross-framework visual primitives.

## Visual / Memory Trigger

```text
color / spacing / typography / radius
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use as the lowest-coupling consistency layer.

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
color / spacing / typography / radius
```

## Interview Trap

Tokens are contracts; change them carefully.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Design Tokens:** Share cross-framework visual primitives.
