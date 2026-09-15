# Render Props

## What / Why

Pass a function to customize rendering.

## Mental Model / Visual

```text
<Mouse>{pos=>...}</Mouse>
```

## Example

```jsx
// Minimal recall example for Render Props
function Example() {
  return <div>Render Props</div>;
}
```

## When to Use

Know for legacy/library code.

## Common Mistake / Interview Trap

Hooks often replace many render-prop use cases.

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

> **Render Props:** Pass a function to customize rendering.
