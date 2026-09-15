# Angular Mental Model

## What / Why

Angular is a full web framework built around components, dependency injection, templates, reactivity, routing, forms, HTTP, SSR, testing, and tooling.

## Mental Model

```text
Input/Signal/Event → Change Detection → Template → DOM
```

## Example / Recall

```ts
// Minimal recall example for: Angular Mental Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use this as the top-level model for architecture and interviews.

## Common Mistake / Interview Trap

Angular is not only a component library; it includes first-party application infrastructure.

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

> **Angular Mental Model:** Angular is a full web framework built around components, dependency injection, templates, reactivity, routing, forms, HTTP, SSR, testing, and tooling.
