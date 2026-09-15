# Accessibility Contract

## Problem

Large independently delivered frontends need a clear pattern for **share rules for focus, headings, keyboard and aria.**

## Intent

Share rules for focus, headings, keyboard and ARIA.

## Visual / Memory Trigger

```text
route transition → focus management
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use because user experience spans all MFEs.

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
route transition → focus management
```

## Interview Trap

Independent delivery does not mean independent accessibility.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Accessibility Contract:** Share rules for focus, headings, keyboard and ARIA.
