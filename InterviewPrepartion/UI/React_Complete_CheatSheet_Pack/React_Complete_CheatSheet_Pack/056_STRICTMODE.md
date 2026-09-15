# StrictMode

## What / Why

Development-only checks intentionally stress certain patterns.

## Mental Model / Visual

```text
<StrictMode>
```

## Example

```jsx
// Minimal recall example for StrictMode
function Example() {
  return <div>StrictMode</div>;
}
```

## When to Use

Use to surface unsafe effects/deprecations.

## Common Mistake / Interview Trap

Development double-invocation behavior is not production behavior.

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

> **StrictMode:** Development-only checks intentionally stress certain patterns.
