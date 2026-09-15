# Typing Props

## What / Why

Define component prop contracts.

## Mental Model / Visual

```text
type Props={name:string}
```

## Example

```jsx
// Minimal recall example for Typing Props
function Example() {
  return <div>Typing Props</div>;
}
```

## When to Use

Use explicit domain types.

## Common Mistake / Interview Trap

Avoid React.FC by habit when simple function typing suffices.

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

> **Typing Props:** Define component prop contracts.
