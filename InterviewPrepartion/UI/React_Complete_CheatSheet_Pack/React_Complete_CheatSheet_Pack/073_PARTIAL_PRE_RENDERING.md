# Partial Pre-rendering

## What / Why

React 19.2 server APIs can prerender static parts and later resume dynamic rendering.

## Mental Model / Visual

```text
prerender → postponed state → resume
```

## Example

```jsx
// Minimal recall example for Partial Pre-rendering
function Example() {
  return <div>Partial Pre-rendering</div>;
}
```

## When to Use

Use through frameworks unless building infrastructure yourself.

## Common Mistake / Interview Trap

Framework integration is complex; app code should not reimplement casually.

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

> **Partial Pre-rendering:** React 19.2 server APIs can prerender static parts and later resume dynamic rendering.
