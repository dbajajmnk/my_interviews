# Context Performance

## What / Why

Large context value changes re-render all consumers.

## Mental Model / Visual

```text
split context / stable value / external store
```

## Example

```jsx
// Minimal recall example for Context Performance
function Example() {
  return <div>Context Performance</div>;
}
```

## When to Use

Use narrow providers.

## Common Mistake / Interview Trap

One giant app context scales poorly.

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

> **Context Performance:** Large context value changes re-render all consumers.
