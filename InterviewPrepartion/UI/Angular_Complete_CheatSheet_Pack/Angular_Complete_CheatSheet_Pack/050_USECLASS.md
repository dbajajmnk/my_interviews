# useClass

## What / Why

Maps token to implementation class.

## Mental Model

```text
{provide:Repo,useClass:HttpRepo}
```

## Example / Recall

```ts
// Minimal recall example for: useClass
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for abstraction substitution.

## Common Mistake / Interview Trap

Avoid unnecessary abstraction for every trivial service.

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

> **useClass:** Maps token to implementation class.
