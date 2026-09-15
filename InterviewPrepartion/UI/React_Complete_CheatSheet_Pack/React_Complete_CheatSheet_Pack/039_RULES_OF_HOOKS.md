# Rules of Hooks

## What / Why

Call Hooks at top level of React components/custom Hooks.

## Mental Model / Visual

```text
same hook order every render
```

## Example

```jsx
// Minimal recall example for Rules of Hooks
function Example() {
  return <div>Rules of Hooks</div>;
}
```

## When to Use

Use eslint-plugin-react-hooks.

## Common Mistake / Interview Trap

Do not call Hooks conditionally or in ordinary functions.

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

> **Rules of Hooks:** Call Hooks at top level of React components/custom Hooks.
