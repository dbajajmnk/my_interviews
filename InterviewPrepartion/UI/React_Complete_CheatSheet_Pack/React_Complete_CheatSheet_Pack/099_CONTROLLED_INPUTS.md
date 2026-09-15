# Controlled Inputs

## What / Why

React state is source of truth.

## Mental Model / Visual

```text
value={name} onChange=...
```

## Example

```jsx
// Minimal recall example for Controlled Inputs
function Example() {
  return <div>Controlled Inputs</div>;
}
```

## When to Use

Use for complex coordination/validation.

## Common Mistake / Interview Trap

High-frequency state can cause broad rerenders if poorly colocated.

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

> **Controlled Inputs:** React state is source of truth.
