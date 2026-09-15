# ESLint Hooks Rules

## What / Why

Use eslint-plugin-react-hooks rules.

## Mental Model / Visual

```text
rules-of-hooks + exhaustive-deps + compiler rules
```

## Example

```jsx
// Minimal recall example for ESLint Hooks Rules
function Example() {
  return <div>ESLint Hooks Rules</div>;
}
```

## When to Use

Keep current with React toolchain.

## Common Mistake / Interview Trap

Disabling rules broadly hides correctness problems.

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

> **ESLint Hooks Rules:** Use eslint-plugin-react-hooks rules.
