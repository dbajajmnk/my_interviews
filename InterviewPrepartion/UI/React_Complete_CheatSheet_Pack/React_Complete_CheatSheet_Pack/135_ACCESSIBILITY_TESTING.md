# Accessibility Testing

## What / Why

Use semantic queries plus automated/manual accessibility checks.

## Mental Model / Visual

```text
role/name/focus
```

## Example

```jsx
// Minimal recall example for Accessibility Testing
function Example() {
  return <div>Accessibility Testing</div>;
}
```

## When to Use

Use in CI and real keyboard/screen-reader review.

## Common Mistake / Interview Trap

Automated tools do not catch everything.

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

> **Accessibility Testing:** Use semantic queries plus automated/manual accessibility checks.
