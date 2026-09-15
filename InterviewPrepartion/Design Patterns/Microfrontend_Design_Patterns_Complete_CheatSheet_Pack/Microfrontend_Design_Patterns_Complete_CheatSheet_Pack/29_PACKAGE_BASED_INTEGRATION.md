# Package-Based Integration

## Problem

Large independently delivered frontends need a clear pattern for **publish a frontend module as a versioned package.**

## Intent

Publish a frontend module as a versioned package.

## Visual / Memory Trigger

```text
MFE package → npm registry → host build
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when build-time composition is sufficient.

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
MFE package → npm registry → host build
```

## Interview Trap

Independent runtime release is lost.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Package-Based Integration:** Publish a frontend module as a versioned package.
