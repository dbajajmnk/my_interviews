# Templates

## What / Why

Angular templates combine HTML with bindings, directives, control flow, pipes, and components.

## Mental Model

```text
template → bindings → DOM
```

## Example / Recall

```ts
// Minimal recall example for: Templates
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use templates declaratively; keep complex business logic in TypeScript/domain services.

## Common Mistake / Interview Trap

Avoid heavy computation/function calls in hot template paths.

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

> **Templates:** Angular templates combine HTML with bindings, directives, control flow, pipes, and components.
