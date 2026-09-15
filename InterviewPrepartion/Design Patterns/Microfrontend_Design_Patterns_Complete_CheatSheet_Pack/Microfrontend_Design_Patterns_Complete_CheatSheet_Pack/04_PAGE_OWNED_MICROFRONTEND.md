# Page-Owned Microfrontend

## Problem

Large independently delivered frontends need a clear pattern for **one mfe owns one complete page or major screen.**

## Intent

One MFE owns one complete page or major screen.

## Visual / Memory Trigger

```text
/orders → Orders MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Good when a page has cohesive logic, data and ownership.

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
/orders → Orders MFE
```

## Interview Trap

Avoid splitting a page merely to mirror component structure.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Page-Owned Microfrontend:** One MFE owns one complete page or major screen.
