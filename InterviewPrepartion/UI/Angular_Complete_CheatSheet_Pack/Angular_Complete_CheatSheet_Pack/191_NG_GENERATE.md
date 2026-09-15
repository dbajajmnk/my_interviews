# ng generate

## What / Why

Generates components/services/routes etc.

## Mental Model

```text
ng g c features/orders
```

## Example / Recall

```ts
// Minimal recall example for: ng generate
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use schematics for consistency.

## Common Mistake / Interview Trap

Generated code is a starting point, not architecture.

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

> **ng generate:** Generates components/services/routes etc.
