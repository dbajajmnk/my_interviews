# Context Provider Shorthand

## What / Why

React 19 lets Context itself act as provider.

## Mental Model / Visual

```text
<ThemeContext value={theme}>
```

## Example

```jsx
// Minimal recall example for Context Provider Shorthand
function Example() {
  return <div>Context Provider Shorthand</div>;
}
```

## When to Use

Use modern provider syntax.

## Common Mistake / Interview Trap

Know legacy <Context.Provider> when maintaining older code.

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

> **Context Provider Shorthand:** React 19 lets Context itself act as provider.
