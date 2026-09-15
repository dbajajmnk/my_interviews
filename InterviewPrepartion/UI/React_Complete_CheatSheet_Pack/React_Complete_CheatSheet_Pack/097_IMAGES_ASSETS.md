# Images & Assets

## What / Why

Optimize images/fonts/static assets outside React reconciliation.

## Mental Model / Visual

```text
responsive images/CDN/preload
```

## Example

```jsx
// Minimal recall example for Images & Assets
function Example() {
  return <div>Images & Assets</div>;
}
```

## When to Use

Use platform/framework capabilities.

## Common Mistake / Interview Trap

React cannot compensate for oversized assets.

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

> **Images & Assets:** Optimize images/fonts/static assets outside React reconciliation.
