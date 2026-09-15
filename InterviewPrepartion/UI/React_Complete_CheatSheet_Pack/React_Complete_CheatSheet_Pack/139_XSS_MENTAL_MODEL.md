# XSS Mental Model

## What / Why

React escapes string values by default, but dangerous sinks remain dangerous.

## Mental Model / Visual

```text
{userText} safe-by-default; dangerouslySetInnerHTML special
```

## Example

```jsx
// Minimal recall example for XSS Mental Model
function Example() {
  return <div>XSS Mental Model</div>;
}
```

## When to Use

Use trusted/sanitized content only.

## Common Mistake / Interview Trap

React is not an HTML sanitizer.

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

> **XSS Mental Model:** React escapes string values by default, but dangerous sinks remain dangerous.
