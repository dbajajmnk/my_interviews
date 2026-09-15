# Incremental Hydration

## What / Why

Hydrates deferred regions according to triggers.

## Mental Model

```text
SSR page → hydrate blocks on interaction/viewport
```

## Example / Recall

```ts
// Minimal recall example for: Incremental Hydration
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to reduce startup JS/work.

## Common Mistake / Interview Trap

Interactive dependencies must respect hydration boundaries.

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

> **Incremental Hydration:** Hydrates deferred regions according to triggers.
