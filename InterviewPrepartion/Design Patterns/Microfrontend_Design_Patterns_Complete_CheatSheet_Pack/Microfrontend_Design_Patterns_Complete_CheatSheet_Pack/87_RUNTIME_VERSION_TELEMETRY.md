# Runtime Version Telemetry

## Problem

Large independently delivered frontends need a clear pattern for **attach shell and mfe versions to errors/performance events.**

## Intent

Attach shell and MFE versions to errors/performance events.

## Visual / Memory Trigger

```text
shellVersion / mfeName / mfeVersion / remoteURL
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for production debugging.

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
shellVersion / mfeName / mfeVersion / remoteURL
```

## Interview Trap

Without version context runtime incidents are hard to reproduce.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Runtime Version Telemetry:** Attach shell and MFE versions to errors/performance events.
