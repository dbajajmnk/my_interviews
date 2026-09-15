# Budgets

## What / Why

angular.json build budgets detect bundle growth.

## Mental Model

```text
initial/anyComponentStyle
```

## Example / Recall

```ts
// Minimal recall example for: Budgets
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use CI guardrails.

## Common Mistake / Interview Trap

Budgets should reflect real performance goals.

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

> **Budgets:** angular.json build budgets detect bundle growth.
