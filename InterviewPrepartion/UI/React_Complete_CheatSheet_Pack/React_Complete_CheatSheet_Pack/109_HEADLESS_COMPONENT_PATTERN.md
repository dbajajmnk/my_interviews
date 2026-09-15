# Headless Component Pattern

## What / Why

Encapsulate behavior/accessibility without forcing styles.

## Mental Model / Visual

```text
hook/render prop/headless primitive
```

## Example

```jsx
// Minimal recall example for Headless Component Pattern
function Example() {
  return <div>Headless Component Pattern</div>;
}
```

## When to Use

Use design systems.

## Common Mistake / Interview Trap

Requires strong API discipline.

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

> **Headless Component Pattern:** Encapsulate behavior/accessibility without forcing styles.
