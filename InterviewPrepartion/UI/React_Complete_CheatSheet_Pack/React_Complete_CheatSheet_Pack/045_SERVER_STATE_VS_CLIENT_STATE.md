# Server State vs Client State

## What / Why

Server state is remote cached data; client state is local interaction/UI state.

## Mental Model / Visual

```text
query cache vs component state
```

## Example

```jsx
// Minimal recall example for Server State vs Client State
function Example() {
  return <div>Server State vs Client State</div>;
}
```

## When to Use

Use separate tools/mental models.

## Common Mistake / Interview Trap

Do not mirror server state blindly into local state.

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

> **Server State vs Client State:** Server state is remote cached data; client state is local interaction/UI state.
