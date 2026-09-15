# XSRF

## What / Why

HttpClient supports XSRF protection patterns for cookie-based backends.

## Mental Model

```text
cookie token → request header
```

## Example / Recall

```ts
// Minimal recall example for: XSRF
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use with correctly configured same-origin backend.

## Common Mistake / Interview Trap

JWT bearer-token architectures have different CSRF considerations.

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

> **XSRF:** HttpClient supports XSRF protection patterns for cookie-based backends.
