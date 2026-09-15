# React Performance Tracks

## What / Why

React 19.2 adds scheduler/components tracks to Chrome performance profiling.

## Mental Model / Visual

```text
Chrome DevTools → React tracks
```

## Example

```jsx
// Minimal recall example for React Performance Tracks
function Example() {
  return <div>React Performance Tracks</div>;
}
```

## When to Use

Use for scheduling/render diagnosis.

## Common Mistake / Interview Trap

Profile production-like workloads.

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

> **React Performance Tracks:** React 19.2 adds scheduler/components tracks to Chrome performance profiling.
