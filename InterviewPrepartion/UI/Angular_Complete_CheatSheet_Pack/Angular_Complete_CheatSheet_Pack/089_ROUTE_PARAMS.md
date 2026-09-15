# Route Params

## What / Why

Dynamic path values.

## Mental Model

```text
/users/:id
```

## Example / Recall

```ts
// Minimal recall example for: Route Params
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for resource identity.

## Common Mistake / Interview Trap

Read via ActivatedRoute signals/observable APIs as appropriate.

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

> **Route Params:** Dynamic path values.
