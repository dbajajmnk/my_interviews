# Code Splitting

## What / Why

Split bundles by routes/features.

## Mental Model / Visual

```text
lazy/import()
```

## Example

```jsx
// Minimal recall example for Code Splitting
function Example() {
  return <div>Code Splitting</div>;
}
```

## When to Use

Use to reduce initial JS.

## Common Mistake / Interview Trap

Avoid loading waterfalls.

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

> **Code Splitting:** Split bundles by routes/features.
