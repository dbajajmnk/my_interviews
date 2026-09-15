# ReplaySubject

## What / Why

Replays configured previous values.

## Mental Model

```text
new ReplaySubject(1)
```

## Example / Recall

```ts
// Minimal recall example for: ReplaySubject
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when late subscribers need history.

## Common Mistake / Interview Trap

Can retain memory unexpectedly.

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

> **ReplaySubject:** Replays configured previous values.
