# Runtime Manifest / Remote Registry

## Problem

Large independently delivered frontends need a clear pattern for **externalize remote version/url mapping.**

## Intent

Externalize remote version/URL mapping.

## Visual / Memory Trigger

```text
manifest.json → catalog:v42, cart:v17
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for canary, rollback and environment promotion without shell rebuild.

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
manifest.json → catalog:v42, cart:v17
```

## Interview Trap

Manifest availability/integrity becomes critical.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Runtime Manifest / Remote Registry:** Externalize remote version/URL mapping.
