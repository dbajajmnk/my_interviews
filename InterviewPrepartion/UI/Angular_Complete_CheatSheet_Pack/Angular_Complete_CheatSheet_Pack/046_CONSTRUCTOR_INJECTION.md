# Constructor Injection

## What / Why

Traditional explicit constructor dependency injection.

## Mental Model

```text
constructor(private api:ApiService) {}
```

## Example / Recall

```ts
// Minimal recall example for: Constructor Injection
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Know for legacy and explicit class APIs.

## Common Mistake / Interview Trap

Do not mix styles randomly across a codebase without standards.

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

> **Constructor Injection:** Traditional explicit constructor dependency injection.
