# Accessibility Semantics

## What / Why

Prefer native semantic elements.

## Mental Model / Visual

```text
button not clickable div
```

## Example

```jsx
// Minimal recall example for Accessibility Semantics
function Example() {
  return <div>Accessibility Semantics</div>;
}
```

## When to Use

Use labels, headings, landmarks.

## Common Mistake / Interview Trap

ARIA should not replace correct HTML.

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

> **Accessibility Semantics:** Prefer native semantic elements.
