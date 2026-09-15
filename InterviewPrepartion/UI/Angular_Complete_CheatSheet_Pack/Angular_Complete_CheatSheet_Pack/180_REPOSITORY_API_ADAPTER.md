# Repository / API Adapter

## What / Why

Translate backend protocol into domain-facing interface.

## Mental Model

```text
component/domain → repository → HttpClient
```

## Example / Recall

```ts
// Minimal recall example for: Repository / API Adapter
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use where API/domain models differ.

## Common Mistake / Interview Trap

Do not add layers without real substitution/mapping need.

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

> **Repository / API Adapter:** Translate backend protocol into domain-facing interface.
