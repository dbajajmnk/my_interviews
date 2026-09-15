# @defer

## What / Why

Defers loading/rendering a block until triggers are met.

## Mental Model

```text
@defer (on viewport) { <Chart/> }
```

## Example / Recall

```ts
// Minimal recall example for: @defer
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for non-critical heavy UI and bundle splitting.

## Common Mistake / Interview Trap

Always design placeholder/loading/error states.

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

> **@defer:** Defers loading/rendering a block until triggers are met.
