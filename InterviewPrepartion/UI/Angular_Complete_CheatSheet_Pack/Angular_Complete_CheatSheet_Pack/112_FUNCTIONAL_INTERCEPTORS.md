# Functional Interceptors

## What / Why

Functions intercept HTTP requests/responses.

## Mental Model

```text
HttpInterceptorFn
```

## Example / Recall

```ts
// Minimal recall example for: Functional Interceptors
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for auth headers, tracing, retry policy, errors.

## Common Mistake / Interview Trap

Do not hide domain logic inside interceptors.

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

> **Functional Interceptors:** Functions intercept HTTP requests/responses.
