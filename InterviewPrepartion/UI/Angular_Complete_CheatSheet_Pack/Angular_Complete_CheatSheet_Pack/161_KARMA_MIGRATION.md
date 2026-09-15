# Karma Migration

## What / Why

Existing Karma suites can migrate to Vitest; migration tooling may have version-specific status.

## Mental Model

```text
Karma → Vitest
```

## Example / Recall

```ts
// Minimal recall example for: Karma Migration
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Plan migration separately from feature work.

## Common Mistake / Interview Trap

Do not assume every Jasmine/Karma helper maps directly.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Karma Migration:** Existing Karma suites can migrate to Vitest; migration tooling may have version-specific status.
