# FormData

## What / Why

Read native form submission values.

## Mental Model / Visual

```text
new FormData(form)
```

## Example

```jsx
// Minimal recall example for FormData
function Example() {
  return <div>FormData</div>;
}
```

## When to Use

Use with Actions/server endpoints.

## Common Mistake / Interview Trap

Checkbox/multi-value fields need correct handling.

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

> **FormData:** Read native form submission values.
