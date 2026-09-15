# Route-Based Decomposition

## Problem

Large independently delivered frontends need a clear pattern for **map top-level route areas to independently owned mfes.**

## Intent

Map top-level route areas to independently owned MFEs.

## Visual / Memory Trigger

```text
/catalog/* → Catalog MFE; /cart/* → Cart MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use as the safest default when routes reflect clear business capabilities.

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
/catalog/* → Catalog MFE; /cart/* → Cart MFE
```

## Interview Trap

Route paths become contracts; change them compatibly.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Route-Based Decomposition:** Map top-level route areas to independently owned MFEs.
