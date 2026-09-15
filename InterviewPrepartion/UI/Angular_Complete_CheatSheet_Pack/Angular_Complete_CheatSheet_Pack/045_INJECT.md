# inject

## What / Why

Reads a dependency in an injection context.

## Mental Model

```text
http = inject(HttpClient)
```

## Example / Recall

```ts
// Minimal recall example for: inject
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use modern field/function injection where appropriate.

## Common Mistake / Interview Trap

inject() only works in supported injection contexts.

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

> **inject:** Reads a dependency in an injection context.
