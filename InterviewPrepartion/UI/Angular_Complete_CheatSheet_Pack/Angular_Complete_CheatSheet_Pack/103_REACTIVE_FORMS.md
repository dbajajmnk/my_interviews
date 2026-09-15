# Reactive Forms

## What / Why

Explicit FormControl/FormGroup tree with Observable state.

## Mental Model

```text
new FormGroup({...})
```

## Example / Recall

```ts
// Minimal recall example for: Reactive Forms
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for established complex forms and existing apps.

## Common Mistake / Interview Trap

Avoid mixing template-driven patterns into reactive forms casually.

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

> **Reactive Forms:** Explicit FormControl/FormGroup tree with Observable state.
