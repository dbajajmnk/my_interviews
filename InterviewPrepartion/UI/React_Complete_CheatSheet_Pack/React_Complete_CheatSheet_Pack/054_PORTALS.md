# Portals

## What / Why

Render children into a different DOM node while preserving React tree relationships.

## Mental Model / Visual

```text
createPortal(children,document.body)
```

## Example

```jsx
// Minimal recall example for Portals
function Example() {
  return <div>Portals</div>;
}
```

## When to Use

Use for modals/tooltips.

## Common Mistake / Interview Trap

Events bubble through React tree, not DOM placement alone.

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

> **Portals:** Render children into a different DOM node while preserving React tree relationships.
