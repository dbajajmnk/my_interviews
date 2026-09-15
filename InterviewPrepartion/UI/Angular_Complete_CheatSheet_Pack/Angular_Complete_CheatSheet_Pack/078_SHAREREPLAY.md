# shareReplay

## What / Why

Shares/replays source execution.

## Mental Model

```text
shareReplay({bufferSize:1,refCount:true})
```

## Example / Recall

```ts
// Minimal recall example for: shareReplay
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for expensive shared streams with understood lifecycle.

## Common Mistake / Interview Trap

Misuse can cause stale cache or retained subscriptions.

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

> **shareReplay:** Shares/replays source execution.
