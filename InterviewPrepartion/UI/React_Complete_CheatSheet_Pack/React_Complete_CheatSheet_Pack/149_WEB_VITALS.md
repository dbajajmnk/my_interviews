# Web Vitals

## What / Why

Track LCP, INP, CLS for user-perceived performance.

## Mental Model / Visual

```text
field metrics
```

## Example

```jsx
// Minimal recall example for Web Vitals
function Example() {
  return <div>Web Vitals</div>;
}
```

## When to Use

Use per route/release.

## Common Mistake / Interview Trap

Synthetic lab metrics are not enough.

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

> **Web Vitals:** Track LCP, INP, CLS for user-perceived performance.
