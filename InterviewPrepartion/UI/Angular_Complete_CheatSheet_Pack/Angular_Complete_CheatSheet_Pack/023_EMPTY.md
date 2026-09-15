# @empty

## What / Why

Provides empty-list branch for @for.

## Mental Model

```text
@for (...) {...} @empty {...}
```

## Example / Recall

```ts
// Minimal recall example for: @empty
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for empty UX.

## Common Mistake / Interview Trap

Avoid separate duplicated list/empty logic.

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

> **@empty:** Provides empty-list branch for @for.
