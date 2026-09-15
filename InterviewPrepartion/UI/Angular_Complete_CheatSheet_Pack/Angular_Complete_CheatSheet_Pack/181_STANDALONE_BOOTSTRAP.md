# Standalone Bootstrap

## What / Why

bootstrapApplication configures modern app root/providers.

## Mental Model

```text
bootstrapApplication(App, appConfig)
```

## Example / Recall

```ts
// Minimal recall example for: Standalone Bootstrap
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use modern app bootstrap.

## Common Mistake / Interview Trap

Know AppModule for legacy maintenance.

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

> **Standalone Bootstrap:** bootstrapApplication configures modern app root/providers.
