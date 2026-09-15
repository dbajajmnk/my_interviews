# Profiler

## What / Why

Measures rendering performance programmatically/DevTools.

## Mental Model / Visual

```text
<Profiler onRender={...}>
```

## Example

```jsx
// Minimal recall example for Profiler
function Example() {
  return <div>Profiler</div>;
}
```

## When to Use

Use to find slow trees.

## Common Mistake / Interview Trap

Development timings differ from production.

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

> **Profiler:** Measures rendering performance programmatically/DevTools.
