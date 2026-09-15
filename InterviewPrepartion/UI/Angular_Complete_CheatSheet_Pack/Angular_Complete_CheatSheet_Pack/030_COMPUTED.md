# computed

## What / Why

Creates derived reactive state.

## Mental Model

```text
fullName = computed(()=>first()+' '+last())
```

## Example / Recall

```ts
// Minimal recall example for: computed
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use instead of duplicated derived state.

## Common Mistake / Interview Trap

Computed functions should be pure.

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

> **computed:** Creates derived reactive state.
