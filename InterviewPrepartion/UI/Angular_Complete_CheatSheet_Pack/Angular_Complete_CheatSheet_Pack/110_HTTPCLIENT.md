# HttpClient

## What / Why

Angular's first-party HTTP API.

## Mental Model

```text
http.get<T>(url)
```

## Example / Recall

```ts
// Minimal recall example for: HttpClient
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for imperative reads/mutations and Observable workflows.

## Common Mistake / Interview Trap

HTTP Observables are typically cold; multiple subscriptions can repeat requests.

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

> **HttpClient:** Angular's first-party HTTP API.
