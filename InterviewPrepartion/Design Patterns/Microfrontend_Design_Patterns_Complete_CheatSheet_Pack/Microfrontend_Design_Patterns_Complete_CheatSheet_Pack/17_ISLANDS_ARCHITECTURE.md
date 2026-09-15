# Islands Architecture

## Problem

Large independently delivered frontends need a clear pattern for **hydrate only independently interactive islands on mostly server-rendered pages.**

## Intent

Hydrate only independently interactive islands on mostly server-rendered pages.

## Visual / Memory Trigger

```text
Static HTML + Search Island + Cart Island
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for content-heavy apps with selective interactivity.

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
Static HTML + Search Island + Cart Island
```

## Interview Trap

An island is not automatically an independently deployable MFE.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Islands Architecture:** Hydrate only independently interactive islands on mostly server-rendered pages.
