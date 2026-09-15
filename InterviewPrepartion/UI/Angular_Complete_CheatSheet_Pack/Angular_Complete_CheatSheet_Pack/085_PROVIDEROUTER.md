# provideRouter

## What / Why

Configures standalone router providers.

## Mental Model

```text
bootstrapApplication(App,{providers:[provideRouter(routes)]})
```

## Example / Recall

```ts
// Minimal recall example for: provideRouter
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in modern standalone apps.

## Common Mistake / Interview Trap

NgModule RouterModule patterns still matter in legacy.

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

> **provideRouter:** Configures standalone router providers.
