# DTO Mapping

## What / Why

Translate wire DTOs to domain/view models.

## Mental Model

```text
API DTO → mapper → model
```

## Example / Recall

```ts
// Minimal recall example for: DTO Mapping
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when backend contracts differ from UI model.

## Common Mistake / Interview Trap

Avoid exposing raw API shape everywhere.

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

> **DTO Mapping:** Translate wire DTOs to domain/view models.
