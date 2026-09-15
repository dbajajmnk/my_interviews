# Bundle Budget

## What / Why

Set max JS/CSS for routes/features.

## Mental Model / Visual

```text
initial JS ≤ budget
```

## Example

```jsx
// Minimal recall example for Bundle Budget
function Example() {
  return <div>Bundle Budget</div>;
}
```

## When to Use

Use in CI.

## Common Mistake / Interview Trap

React performance is often JavaScript-delivery performance.

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

> **Bundle Budget:** Set max JS/CSS for routes/features.
