# Event Replay

## What / Why

Captures user events before hydration and replays them after app becomes interactive.

## Mental Model

```text
early click → queue → hydrate → replay
```

## Example / Recall

```ts
// Minimal recall example for: Event Replay
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for SSR responsiveness.

## Common Mistake / Interview Trap

Do not rely on replay as a substitute for good hydration performance.

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

> **Event Replay:** Captures user events before hydration and replays them after app becomes interactive.
