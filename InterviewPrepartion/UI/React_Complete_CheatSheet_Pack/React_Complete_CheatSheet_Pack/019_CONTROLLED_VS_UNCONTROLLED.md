# Controlled vs Uncontrolled

## What / Why

Controlled values come from React state; uncontrolled values live in DOM/external system.

## Mental Model / Visual

```text
value/onChange vs defaultValue/ref
```

## Example

```jsx
// Minimal recall example for Controlled vs Uncontrolled
function Example() {
  return <div>Controlled vs Uncontrolled</div>;
}
```

## When to Use

Use controlled for validation/coordination; uncontrolled for simpler isolated inputs.

## Common Mistake / Interview Trap

Switching between controlled and uncontrolled modes causes warnings/problems.

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

> **Controlled vs Uncontrolled:** Controlled values come from React state; uncontrolled values live in DOM/external system.
