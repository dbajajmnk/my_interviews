# Lifecycle

## What / Why

Angular invokes lifecycle hooks around creation, checks, rendering and destruction.

## Mental Model

```text
construct → inputs → render → after render → destroy
```

## Example / Recall

```ts
// Minimal recall example for: Lifecycle
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use lifecycle hooks only for real lifecycle responsibilities.

## Common Mistake / Interview Trap

Do not put general initialization logic into every hook by habit.

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

> **Lifecycle:** Angular invokes lifecycle hooks around creation, checks, rendering and destruction.
