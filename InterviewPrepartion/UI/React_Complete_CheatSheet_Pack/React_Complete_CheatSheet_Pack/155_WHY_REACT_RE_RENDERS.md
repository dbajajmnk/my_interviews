# Why React Re-renders

## What / Why

State/props/context/external-store changes schedule rendering; parent rendering can also render children.

## Mental Model / Visual

```text
trigger → render subtree
```

## Example

```jsx
// Minimal recall example for Why React Re-renders
function Example() {
  return <div>Why React Re-renders</div>;
}
```

## When to Use

Use Profiler before optimizing.

## Common Mistake / Interview Trap

Re-render does not mean DOM mutation.

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

> **Why React Re-renders:** State/props/context/external-store changes schedule rendering; parent rendering can also render children.
