# Error Boundaries

## What / Why

Catch render/lifecycle errors in descendant tree.

## Mental Model / Visual

```text
class ErrorBoundary ...
```

## Example

```jsx
// Minimal recall example for Error Boundaries
function Example() {
  return <div>Error Boundaries</div>;
}
```

## When to Use

Use around failure domains/routes/widgets.

## Common Mistake / Interview Trap

Error boundaries do not catch every async/event error automatically.

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

> **Error Boundaries:** Catch render/lifecycle errors in descendant tree.
