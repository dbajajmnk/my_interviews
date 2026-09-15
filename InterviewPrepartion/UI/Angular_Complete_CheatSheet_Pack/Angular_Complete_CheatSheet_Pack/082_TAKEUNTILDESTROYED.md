# takeUntilDestroyed

## What / Why

Automatically completes subscription when Angular context is destroyed.

## Mental Model

```text
pipe(takeUntilDestroyed())
```

## Example / Recall

```ts
// Minimal recall example for: takeUntilDestroyed
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for imperative subscriptions in Angular.

## Common Mistake / Interview Trap

Prefer AsyncPipe/toSignal where possible.

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

> **takeUntilDestroyed:** Automatically completes subscription when Angular context is destroyed.
