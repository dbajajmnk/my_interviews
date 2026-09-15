# Suspense

## What / Why

Shows fallback while a child suspends.

## Mental Model / Visual

```text
<Suspense fallback={<Spinner/>}>
```

## Example

```jsx
// Minimal recall example for Suspense
function Example() {
  return <div>Suspense</div>;
}
```

## When to Use

Use for code/data resources supported by framework/React.

## Common Mistake / Interview Trap

Suspense is not a generic try/catch for arbitrary async code.

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

> **Suspense:** Shows fallback while a child suspends.
