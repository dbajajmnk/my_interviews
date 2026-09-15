# Component Testing

## What / Why

Test inputs, outputs, DOM, user behavior and dependencies.

## Mental Model

```text
arrange → interact → assert
```

## Example / Recall

```ts
// Minimal recall example for: Component Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Prefer behavior over implementation details.

## Common Mistake / Interview Trap

Avoid tests tied to private methods.

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

> **Component Testing:** Test inputs, outputs, DOM, user behavior and dependencies.
