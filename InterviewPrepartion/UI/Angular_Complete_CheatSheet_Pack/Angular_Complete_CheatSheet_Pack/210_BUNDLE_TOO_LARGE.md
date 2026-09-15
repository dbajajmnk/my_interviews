# Bundle Too Large

## What / Why

Large eager features/dependencies/images.

## Mental Model

```text
analyze → lazy/@defer/replace dependency
```

## Example / Recall

```ts
// Minimal recall example for: Bundle Too Large
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use budgets.

## Common Mistake / Interview Trap

Tree shaking cannot fix side-effect-heavy packages automatically.

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

> **Bundle Too Large:** Large eager features/dependencies/images.
