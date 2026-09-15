# Frontend Platform Team

## Problem

Large independently delivered frontends need a clear pattern for **provide shell, templates, design system, telemetry, security baseline and tooling.**

## Intent

Provide shell, templates, design system, telemetry, security baseline and tooling.

## Visual / Memory Trigger

```text
Platform → paved road for product teams
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use at organizational scale.

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
Platform → paved road for product teams
```

## Interview Trap

Platform team should not own every feature.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Frontend Platform Team:** Provide shell, templates, design system, telemetry, security baseline and tooling.
