# Transition Scheduling

## What / Why

Mark non-urgent UI work as transitions.

## Mental Model / Visual

```text
startTransition
```

## Example

```jsx
// Minimal recall example for Transition Scheduling
function Example() {
  return <div>Transition Scheduling</div>;
}
```

## When to Use

Use for expensive navigation/filter results.

## Common Mistake / Interview Trap

Urgent input updates should remain urgent.

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

> **Transition Scheduling:** Mark non-urgent UI work as transitions.
