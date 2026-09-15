# Two-Way Binding

## What / Why

Combines input and output binding semantics.

## Mental Model

```text
[(ngModel)] or model() patterns
```

## Example / Recall

```ts
// Minimal recall example for: Two-Way Binding
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use where bidirectional UI binding improves clarity.

## Common Mistake / Interview Trap

Do not use two-way binding to hide complicated state ownership.

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

> **Two-Way Binding:** Combines input and output binding semantics.
