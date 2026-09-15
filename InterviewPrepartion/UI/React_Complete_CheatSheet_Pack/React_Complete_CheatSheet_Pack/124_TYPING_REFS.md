# Typing Refs

## What / Why

Type DOM/component refs.

## Mental Model / Visual

```text
useRef<HTMLInputElement>(null)
```

## Example

```jsx
// Minimal recall example for Typing Refs
function Example() {
  return <div>Typing Refs</div>;
}
```

## When to Use

Use precise handle types.

## Common Mistake / Interview Trap

Account for null before mount.

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

> **Typing Refs:** Type DOM/component refs.
