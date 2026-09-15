# Providers

## What / Why

Configure how tokens resolve to values/classes/factories.

## Mental Model

```text
providers:[ApiService]
```

## Example / Recall

```ts
// Minimal recall example for: Providers
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use closest correct scope.

## Common Mistake / Interview Trap

Over-providing creates duplicate service instances.

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

> **Providers:** Configure how tokens resolve to values/classes/factories.
