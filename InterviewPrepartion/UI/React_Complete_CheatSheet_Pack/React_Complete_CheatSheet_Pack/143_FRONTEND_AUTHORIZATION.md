# Frontend Authorization

## What / Why

Hide/disable UI based on permissions for UX only.

## Mental Model / Visual

```text
canEdit ? <Edit/> : null
```

## Example

```jsx
// Minimal recall example for Frontend Authorization
function Example() {
  return <div>Frontend Authorization</div>;
}
```

## When to Use

Use for UI behavior.

## Common Mistake / Interview Trap

Backend must enforce authorization.

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

> **Frontend Authorization:** Hide/disable UI based on permissions for UX only.
