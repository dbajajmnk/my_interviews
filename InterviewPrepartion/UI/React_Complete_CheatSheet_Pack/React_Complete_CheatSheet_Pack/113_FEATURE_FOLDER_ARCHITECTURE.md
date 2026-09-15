# Feature Folder Architecture

## What / Why

Organize by business feature rather than technical file type.

## Mental Model / Visual

```text
features/orders/...
```

## Example

```jsx
// Minimal recall example for Feature Folder Architecture
function Example() {
  return <div>Feature Folder Architecture</div>;
}
```

## When to Use

Use in medium/large apps.

## Common Mistake / Interview Trap

Avoid all components/hooks/services in giant global folders.

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

> **Feature Folder Architecture:** Organize by business feature rather than technical file type.
