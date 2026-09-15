# Design System

## Problem

Large independently delivered frontends need a clear pattern for **share visual and interaction standards across mfes.**

## Intent

Share visual and interaction standards across MFEs.

## Visual / Memory Trigger

```text
Tokens → Components → MFEs
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for coherent UX across independent teams.

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
Tokens → Components → MFEs
```

## Interview Trap

Do not embed domain business logic.

## Related Patterns

Design Tokens, Shared Dumb Components, Accessibility Contract

## 20-Second Recall

> **Design System:** Share visual and interaction standards across MFEs.
