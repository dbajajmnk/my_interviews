# debounceTime

## What / Why

Waits for quiet period before emission.

## Mental Model

```text
input$ → debounceTime(300)
```

## Example / Recall

```ts
// Minimal recall example for: debounceTime
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for search/typeahead.

## Common Mistake / Interview Trap

Different from throttling.

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

> **debounceTime:** Waits for quiet period before emission.
