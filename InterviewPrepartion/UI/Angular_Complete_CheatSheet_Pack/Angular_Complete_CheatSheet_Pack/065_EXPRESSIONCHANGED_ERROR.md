# ExpressionChanged Error

## What / Why

Dev-mode check catches values changing after a view was checked.

## Mental Model

```text
render → value changes too late
```

## Example / Recall

```ts
// Minimal recall example for: ExpressionChanged Error
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Fix lifecycle/data-flow timing instead of hiding the error.

## Common Mistake / Interview Trap

setTimeout hacks often hide the root cause.

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

> **ExpressionChanged Error:** Dev-mode check catches values changing after a view was checked.
