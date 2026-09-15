# Zoneless Interview

## What / Why

Modern Angular is zoneless by default.

## Mental Model

```text
explicit notifications → change detection
```

## Example / Recall

```ts
// Minimal recall example for: Zoneless Interview
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Explain signals/events/inputs/AsyncPipe notifications.

## Common Mistake / Interview Trap

Do not describe ZoneJS as mandatory.

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

> **Zoneless Interview:** Modern Angular is zoneless by default.
