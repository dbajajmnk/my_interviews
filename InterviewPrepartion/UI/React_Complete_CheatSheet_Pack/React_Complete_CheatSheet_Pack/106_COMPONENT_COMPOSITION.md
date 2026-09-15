# Component Composition

## What / Why

Build complex UI by nesting focused components.

## Mental Model / Visual

```text
Page → Section → Widget
```

## Example

```jsx
// Minimal recall example for Component Composition
function Example() {
  return <div>Component Composition</div>;
}
```

## When to Use

Prefer composition over prop-driven mega-components.

## Common Mistake / Interview Trap

Avoid deep wrapper abstractions with no ownership.

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

> **Component Composition:** Build complex UI by nesting focused components.
