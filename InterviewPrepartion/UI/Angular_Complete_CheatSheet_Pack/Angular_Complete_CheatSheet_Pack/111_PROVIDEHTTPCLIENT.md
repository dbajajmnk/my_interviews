# provideHttpClient

## What / Why

Registers HttpClient and features.

## Mental Model

```text
provideHttpClient(withInterceptors([...]))
```

## Example / Recall

```ts
// Minimal recall example for: provideHttpClient
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in standalone bootstrap.

## Common Mistake / Interview Trap

Prefer functional features/interceptors in modern Angular.

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

> **provideHttpClient:** Registers HttpClient and features.
