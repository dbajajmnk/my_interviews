# Core vs Shared

## What / Why

Keep app-singleton infrastructure separate from reusable stateless UI/utilities when this distinction helps.

## Mental Model

```text
core / shared / features
```

## Example / Recall

```ts
// Minimal recall example for: Core vs Shared
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use conceptually, not dogmatically.

## Common Mistake / Interview Trap

Standalone Angular reduces need for old module-era folder dogma.

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

> **Core vs Shared:** Keep app-singleton infrastructure separate from reusable stateless UI/utilities when this distinction helps.
