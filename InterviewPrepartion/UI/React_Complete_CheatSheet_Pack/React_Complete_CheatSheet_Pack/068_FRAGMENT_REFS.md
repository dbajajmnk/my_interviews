# Fragment Refs

## What / Why

Stable in React 19.3; ref a Fragment and operate on first-level DOM children as a group.

## Mental Model / Visual

```text
<Fragment ref={ref}>...</Fragment>
```

## Example

```jsx
// Minimal recall example for Fragment Refs
function Example() {
  return <div>Fragment Refs</div>;
}
```

## When to Use

Use when you need DOM-group operations without wrapper markup.

## Common Mistake / Interview Trap

It exposes a FragmentInstance, not a normal single DOM element.

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

> **Fragment Refs:** Stable in React 19.3; ref a Fragment and operate on first-level DOM children as a group.
