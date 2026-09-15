# ng new

## What / Why

Creates workspace/application.

## Mental Model

```text
ng new my-app
```

## Example / Recall

```ts
// Minimal recall example for: ng new
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use modern defaults.

## Common Mistake / Interview Trap

Review SSR/routing/style/testing choices.

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

> **ng new:** Creates workspace/application.
