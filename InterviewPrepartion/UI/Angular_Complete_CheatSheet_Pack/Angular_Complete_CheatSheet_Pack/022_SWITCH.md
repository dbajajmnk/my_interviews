# @switch

## What / Why

Built-in switch control flow.

## Mental Model

```text
@switch (status()) { @case ('ok') {...} }
```

## Example / Recall

```ts
// Minimal recall example for: @switch
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for mutually exclusive template states.

## Common Mistake / Interview Trap

Avoid nested switch-heavy templates when state modeling can be improved.

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

> **@switch:** Built-in switch control flow.
