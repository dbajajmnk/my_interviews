# Remote Adapter / Facade

## Problem

Large independently delivered frontends need a clear pattern for **hide runtime integration details behind a local stable interface.**

## Intent

Hide runtime integration details behind a local stable interface.

## Visual / Memory Trigger

```text
Shell → CatalogAdapter → Remote MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to isolate host from federation/import-map specifics.

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
Shell → CatalogAdapter → Remote MFE
```

## Interview Trap

Do not let adapter accumulate business logic.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Remote Adapter / Facade:** Hide runtime integration details behind a local stable interface.
