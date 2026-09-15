# Form Double Submit

## What / Why

Pending UX may not guarantee server idempotency.

## Mental Model / Visual

```text
disable pending + idempotency key/server guard
```

## Example

```jsx
// Minimal recall example for Form Double Submit
function Example() {
  return <div>Form Double Submit</div>;
}
```

## When to Use

Use both UI and backend protections.

## Common Mistake / Interview Trap

Never rely solely on disabled button.

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

> **Form Double Submit:** Pending UX may not guarantee server idempotency.
