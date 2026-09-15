# Too Many Re-renders

## What / Why

State too high/global, unstable props, expensive children.

## Mental Model / Visual

```text
profile → colocate/memoize where needed
```

## Example

```jsx
// Minimal recall example for Too Many Re-renders
function Example() {
  return <div>Too Many Re-renders</div>;
}
```

## When to Use

Use DevTools/Compiler/Profiler.

## Common Mistake / Interview Trap

Optimization starts with measurement.

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

> **Too Many Re-renders:** State too high/global, unstable props, expensive children.
