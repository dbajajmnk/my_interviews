# Modular Frontend First

## Problem

Large independently delivered frontends need a clear pattern for **use a modular monolith frontend until runtime distribution is justified.**

## Intent

Use a modular monolith frontend until runtime distribution is justified.

## Visual / Memory Trigger

```text
Modules inside one app → proven autonomy need → MFEs
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Best for smaller teams or unclear domain boundaries.

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
Modules inside one app → proven autonomy need → MFEs
```

## Interview Trap

Microfrontends are not the default for every frontend.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Modular Frontend First:** Use a modular monolith frontend until runtime distribution is justified.
