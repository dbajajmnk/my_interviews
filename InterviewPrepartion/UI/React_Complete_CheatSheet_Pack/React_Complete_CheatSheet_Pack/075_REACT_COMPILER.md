# React Compiler

## What / Why

Stable build-time compiler that automatically memoizes/optimizes React code.

## Mental Model / Visual

```text
compiler transforms components/hooks
```

## Example

```jsx
// Minimal recall example for React Compiler
function Example() {
  return <div>React Compiler</div>;
}
```

## When to Use

Use incrementally on codebases following Rules of React.

## Common Mistake / Interview Trap

Compiler reduces manual memoization needs but does not eliminate profiling or good architecture.

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

> **React Compiler:** Stable build-time compiler that automatically memoizes/optimizes React code.
