# HttpContext

## What / Why

Carries request-local metadata to interceptors without network headers.

## Mental Model

```text
new HttpContext().set(SKIP_AUTH,true)
```

## Example / Recall

```ts
// Minimal recall example for: HttpContext
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for interceptor policy switches.

## Common Mistake / Interview Trap

Context is client-side request metadata.

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

> **HttpContext:** Carries request-local metadata to interceptors without network headers.
