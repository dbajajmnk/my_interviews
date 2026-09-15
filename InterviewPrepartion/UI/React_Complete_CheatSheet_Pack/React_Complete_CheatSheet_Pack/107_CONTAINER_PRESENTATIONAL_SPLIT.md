# Container / Presentational Split

## What / Why

Separate orchestration/data concerns from pure UI where useful.

## Mental Model / Visual

```text
Feature container → presentational component
```

## Example

```jsx
// Minimal recall example for Container / Presentational Split
function Example() {
  return <div>Container / Presentational Split</div>;
}
```

## When to Use

Use selectively for testability/reuse.

## Common Mistake / Interview Trap

Not every component needs this split.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Container / Presentational Split:** Separate orchestration/data concerns from pure UI where useful.
