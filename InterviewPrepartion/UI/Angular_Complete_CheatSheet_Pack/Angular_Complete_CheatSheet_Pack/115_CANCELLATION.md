# Cancellation

## What / Why

Unsubscribing cancels supported HttpClient request; resources expose cancellation semantics.

## Mental Model

```text
switchMap / resource AbortSignal
```

## Example / Recall

```ts
// Minimal recall example for: Cancellation
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for latest-only workflows.

## Common Mistake / Interview Trap

Mutation cancellation semantics require care.

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

> **Cancellation:** Unsubscribing cancels supported HttpClient request; resources expose cancellation semantics.
