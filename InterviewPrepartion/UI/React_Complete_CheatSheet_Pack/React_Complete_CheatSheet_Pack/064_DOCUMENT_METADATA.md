# Document Metadata

## What / Why

React can hoist title/meta/link elements appropriately.

## Mental Model / Visual

```text
<title>Orders</title>
```

## Example

```jsx
// Minimal recall example for Document Metadata
function Example() {
  return <div>Document Metadata</div>;
}
```

## When to Use

Use in framework/SSR-aware environments.

## Common Mistake / Interview Trap

Metadata ownership still matters in nested apps.

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

> **Document Metadata:** React can hoist title/meta/link elements appropriately.
