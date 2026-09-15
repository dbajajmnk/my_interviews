# Memoization Strategy

## What / Why

Memoize only when identity/cost matters.

## Mental Model / Visual

```text
memo + useMemo + useCallback
```

## Example

```jsx
// Minimal recall example for Memoization Strategy
function Example() {
  return <div>Memoization Strategy</div>;
}
```

## When to Use

Use measured evidence and Compiler guidance.

## Common Mistake / Interview Trap

Premature memoization adds complexity.

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

> **Memoization Strategy:** Memoize only when identity/cost matters.
