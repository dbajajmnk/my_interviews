# catchError

## What / Why

Handles stream errors.

## Mental Model

```text
catchError(err=>of(fallback))
```

## Example / Recall

```ts
// Minimal recall example for: catchError
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Handle at appropriate boundary.

## Common Mistake / Interview Trap

Catching too early can hide failures.

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

> **catchError:** Handles stream errors.
