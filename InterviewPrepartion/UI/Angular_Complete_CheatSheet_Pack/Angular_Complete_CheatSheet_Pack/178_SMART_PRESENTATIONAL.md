# Smart / Presentational

## What / Why

Separate feature orchestration from reusable UI where valuable.

## Mental Model

```text
container → UI component
```

## Example / Recall

```ts
// Minimal recall example for: Smart / Presentational
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use selectively.

## Common Mistake / Interview Trap

Signals/services can make rigid split unnecessary.

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

> **Smart / Presentational:** Separate feature orchestration from reusable UI where valuable.
