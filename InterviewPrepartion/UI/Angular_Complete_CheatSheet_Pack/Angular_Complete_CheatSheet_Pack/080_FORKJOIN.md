# forkJoin

## What / Why

Waits for all sources to complete and emits final values.

## Mental Model

```text
forkJoin({a:a$,b:b$})
```

## Example / Recall

```ts
// Minimal recall example for: forkJoin
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for parallel one-shot requests.

## Common Mistake / Interview Trap

Never emits if a source never completes.

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

> **forkJoin:** Waits for all sources to complete and emits final values.
