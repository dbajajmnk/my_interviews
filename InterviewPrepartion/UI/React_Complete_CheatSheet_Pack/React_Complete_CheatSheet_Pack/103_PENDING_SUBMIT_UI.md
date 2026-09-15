# Pending Submit UI

## What / Why

Disable/indicate submit status using Action/form status.

## Mental Model / Visual

```text
useFormStatus
```

## Example

```jsx
// Minimal recall example for Pending Submit UI
function Example() {
  return <div>Pending Submit UI</div>;
}
```

## When to Use

Use to prevent duplicate UX actions.

## Common Mistake / Interview Trap

Server still needs idempotency.

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

> **Pending Submit UI:** Disable/indicate submit status using Action/form status.
