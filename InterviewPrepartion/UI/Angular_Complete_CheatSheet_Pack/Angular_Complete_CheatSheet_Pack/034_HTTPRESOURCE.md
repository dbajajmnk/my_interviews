# httpResource

## What / Why

Reactive signal-based wrapper over HttpClient for GET/read workflows.

## Mental Model

```text
httpResource(()=>`/api/users/${id()}`)
```

## Example / Recall

```ts
// Minimal recall example for: httpResource
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for reactive HTTP reads while retaining HttpClient features.

## Common Mistake / Interview Trap

For mutations use HttpClient/action/service methods, not httpResource read semantics.

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

> **httpResource:** Reactive signal-based wrapper over HttpClient for GET/read workflows.
