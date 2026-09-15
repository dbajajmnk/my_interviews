# Activity

## What / Why

Keeps hidden UI state while deprioritizing hidden work.

## Mental Model / Visual

```text
<Activity mode='hidden'><Page/></Activity>
```

## Example

```jsx
// Minimal recall example for Activity
function Example() {
  return <div>Activity</div>;
}
```

## When to Use

Use for likely-next navigation or preserving hidden subtree state.

## Common Mistake / Interview Trap

Hidden Activity unmounts effects and defers updates.

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

> **Activity:** Keeps hidden UI state while deprioritizing hidden work.
