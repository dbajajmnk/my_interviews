# combineLatest

## What / Why

Combines latest values after all sources emitted.

## Mental Model

```text
combineLatest([a$,b$])
```

## Example / Recall

```ts
// Minimal recall example for: combineLatest
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for continuously derived async state.

## Common Mistake / Interview Trap

It waits until each source has emitted.

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

> **combineLatest:** Combines latest values after all sources emitted.
