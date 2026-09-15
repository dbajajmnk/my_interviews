# createContext

## What / Why

Creates a context object/provider boundary.

## Mental Model / Visual

```text
const ThemeContext=createContext('light')
```

## Example

```jsx
// Minimal recall example for createContext
function Example() {
  return <div>createContext</div>;
}
```

## When to Use

Use for dependency-style data such as theme/auth/locale.

## Common Mistake / Interview Trap

Context is not automatically a state-management architecture.

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

> **createContext:** Creates a context object/provider boundary.
