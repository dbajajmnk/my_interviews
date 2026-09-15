# @defer Performance

## What / Why

Defers non-critical components/resources.

## Mental Model

```text
@defer
```

## Example / Recall

```ts
// Minimal recall example for: @defer Performance
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for charts/editors/secondary panels.

## Common Mistake / Interview Trap

Design placeholder dimensions to avoid CLS.

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

> **@defer Performance:** Defers non-critical components/resources.
