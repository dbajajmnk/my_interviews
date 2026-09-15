# Signal Testing

## What / Why

Read/set signals and assert computed/effects behavior.

## Mental Model

```text
state.set → expect(computed())
```

## Example / Recall

```ts
// Minimal recall example for: Signal Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use deterministic signal tests.

## Common Mistake / Interview Trap

Effects may require stabilization/injection context.

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

> **Signal Testing:** Read/set signals and assert computed/effects behavior.
