# Pipes

## What / Why

Transform values declaratively in templates.

## Mental Model

```text
{{ total | currency }}
```

## Example / Recall

```ts
// Minimal recall example for: Pipes
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use pure presentation transformations.

## Common Mistake / Interview Trap

Do not place side-effecting business logic in pipes.

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

> **Pipes:** Transform values declaratively in templates.
