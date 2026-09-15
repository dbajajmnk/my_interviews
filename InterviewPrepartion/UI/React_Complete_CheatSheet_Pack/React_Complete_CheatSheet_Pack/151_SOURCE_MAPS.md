# Source Maps

## What / Why

Upload/source-control maps securely for debugging.

## Mental Model / Visual

```text
release → source map service
```

## Example

```jsx
// Minimal recall example for Source Maps
function Example() {
  return <div>Source Maps</div>;
}
```

## When to Use

Use for production stack traces.

## Common Mistake / Interview Trap

Avoid unintentionally exposing source maps publicly if policy forbids.

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

> **Source Maps:** Upload/source-control maps securely for debugging.
