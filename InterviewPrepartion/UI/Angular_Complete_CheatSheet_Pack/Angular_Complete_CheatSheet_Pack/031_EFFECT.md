# effect

## What / Why

Runs side-effecting logic when signal dependencies change.

## Mental Model

```text
effect(()=>console.log(count()))
```

## Example / Recall

```ts
// Minimal recall example for: effect
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for external synchronization, logging, imperative integrations.

## Common Mistake / Interview Trap

Do not use effects for ordinary derived state.

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

> **effect:** Runs side-effecting logic when signal dependencies change.
