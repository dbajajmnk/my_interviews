# useFormStatus

## What / Why

Reads status of a parent form submission.

## Mental Model / Visual

```text
const {pending}=useFormStatus()
```

## Example

```jsx
// Minimal recall example for useFormStatus
function Example() {
  return <div>useFormStatus</div>;
}
```

## When to Use

Use inside form descendants.

## Common Mistake / Interview Trap

It reports the nearest form status, not arbitrary global request state.

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

> **useFormStatus:** Reads status of a parent form submission.
