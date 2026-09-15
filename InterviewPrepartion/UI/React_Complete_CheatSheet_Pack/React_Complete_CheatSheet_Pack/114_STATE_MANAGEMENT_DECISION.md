# State Management Decision

## What / Why

Choose local state → context → external store only as needs grow.

## Mental Model / Visual

```text
useState → reducer/context → store
```

## Example

```jsx
// Minimal recall example for State Management Decision
function Example() {
  return <div>State Management Decision</div>;
}
```

## When to Use

Use simplest sufficient tool.

## Common Mistake / Interview Trap

Library choice cannot fix poor state ownership.

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

> **State Management Decision:** Choose local state → context → external store only as needs grow.
