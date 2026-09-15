# signal

## What / Why

Creates writable reactive state.

## Mental Model

```text
count = signal(0)
```

## Example / Recall

```ts
// Minimal recall example for: signal
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for local/component/application reactive state.

## Common Mistake / Interview Trap

Read with count(); update with set/update.

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

> **signal:** Creates writable reactive state.
