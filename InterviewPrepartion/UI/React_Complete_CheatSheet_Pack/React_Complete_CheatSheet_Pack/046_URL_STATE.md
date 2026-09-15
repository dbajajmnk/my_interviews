# URL State

## What / Why

Store shareable navigation/search/filter state in URL.

## Mental Model / Visual

```text
?q=react&page=2
```

## Example

```jsx
// Minimal recall example for URL State
function Example() {
  return <div>URL State</div>;
}
```

## When to Use

Use for bookmarkable state.

## Common Mistake / Interview Trap

Do not put sensitive data in URL.

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

> **URL State:** Store shareable navigation/search/filter state in URL.
