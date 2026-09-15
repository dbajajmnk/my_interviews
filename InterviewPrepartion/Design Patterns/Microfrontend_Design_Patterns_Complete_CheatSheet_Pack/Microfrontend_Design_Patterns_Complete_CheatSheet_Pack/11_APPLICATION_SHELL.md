# Application Shell

## Problem

Large independently delivered frontends need a clear pattern for **provide global composition, top-level routing, auth bootstrap, layout and mfe loading.**

## Intent

Provide global composition, top-level routing, auth bootstrap, layout and MFE loading.

## Visual / Memory Trigger

```text
Shell → Catalog / Cart / Account
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use as the stable platform frame around independently delivered MFEs.

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
Shell → Catalog / Cart / Account
```

## Interview Trap

Do not put domain business logic into the shell.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Application Shell:** Provide global composition, top-level routing, auth bootstrap, layout and MFE loading.
