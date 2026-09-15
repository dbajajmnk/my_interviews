# Conditional Rendering

## What / Why

Render different UI based on conditions.

## Mental Model / Visual

```text
isAdmin ? <Admin/> : <User/>
```

## Example

```jsx
// Minimal recall example for Conditional Rendering
function Example() {
  return <div>Conditional Rendering</div>;
}
```

## When to Use

Use normal JavaScript branching.

## Common Mistake / Interview Trap

Returning null renders nothing.

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

> **Conditional Rendering:** Render different UI based on conditions.
