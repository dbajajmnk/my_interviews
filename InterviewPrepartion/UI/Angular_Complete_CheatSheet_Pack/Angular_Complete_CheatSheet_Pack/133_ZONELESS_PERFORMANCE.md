# Zoneless Performance

## What / Why

No global ZoneJS patching; Angular updates from explicit notifications.

## Mental Model

```text
signal/input/event/markForCheck
```

## Example / Recall

```ts
// Minimal recall example for: Zoneless Performance
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use modern APIs and compatible libraries.

## Common Mistake / Interview Trap

Legacy libraries relying on NgZone events may need updates.

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

> **Zoneless Performance:** No global ZoneJS patching; Angular updates from explicit notifications.
