# Forms Decision

## What / Why

Angular 22 provides Signal Forms, Reactive Forms and Template-Driven Forms.

## Mental Model

```text
Signal vs Reactive vs Template
```

## Example / Recall

```ts
// Minimal recall example for: Forms Decision
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Choose by complexity, legacy constraints and reactive model.

## Common Mistake / Interview Trap

There is no single correct form API for every app.

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

> **Forms Decision:** Angular 22 provides Signal Forms, Reactive Forms and Template-Driven Forms.
