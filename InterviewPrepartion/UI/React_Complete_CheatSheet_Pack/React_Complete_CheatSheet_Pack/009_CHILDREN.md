# Children

## What / Why

children lets a component compose nested content.

## Mental Model / Visual

```text
<Card><Profile /></Card>
```

## Example

```jsx
// Minimal recall example for Children
function Example() {
  return <div>Children</div>;
}
```

## When to Use

Use for generic wrappers/layouts.

## Common Mistake / Interview Trap

Avoid inspecting children when explicit props/composition are clearer.

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

> **Children:** children lets a component compose nested content.
