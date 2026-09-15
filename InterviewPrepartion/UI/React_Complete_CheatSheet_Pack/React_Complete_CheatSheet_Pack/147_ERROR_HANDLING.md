# Error Handling

## What / Why

Provide route/widget boundaries and useful recovery UI.

## Mental Model / Visual

```text
ErrorBoundary + retry/navigation
```

## Example

```jsx
// Minimal recall example for Error Handling
function Example() {
  return <div>Error Handling</div>;
}
```

## When to Use

Use around failure domains.

## Common Mistake / Interview Trap

Log enough context without leaking secrets.

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

> **Error Handling:** Provide route/widget boundaries and useful recovery UI.
