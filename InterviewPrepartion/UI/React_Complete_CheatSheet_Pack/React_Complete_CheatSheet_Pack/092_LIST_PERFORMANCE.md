# List Performance

## What / Why

Keep keys stable, avoid excessive item work, virtualize huge lists.

## Mental Model / Visual

```text
windowed list
```

## Example

```jsx
// Minimal recall example for List Performance
function Example() {
  return <div>List Performance</div>;
}
```

## When to Use

Use virtualization for very large collections.

## Common Mistake / Interview Trap

memo alone does not fix rendering 100k DOM nodes.

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

> **List Performance:** Keep keys stable, avoid excessive item work, virtualize huge lists.
