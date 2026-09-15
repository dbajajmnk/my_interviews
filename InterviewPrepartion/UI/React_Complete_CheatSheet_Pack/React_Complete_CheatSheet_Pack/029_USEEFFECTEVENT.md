# useEffectEvent

## What / Why

Defines non-reactive event logic called from an Effect while reading latest props/state.

## Mental Model / Visual

```text
const onConnected=useEffectEvent(()=>notify(theme))
```

## Example

```jsx
// Minimal recall example for useEffectEvent
function Example() {
  return <div>useEffectEvent</div>;
}
```

## When to Use

Use to separate effect-triggered event logic from reactive dependencies.

## Common Mistake / Interview Trap

Do not use merely to silence dependency linting.

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

> **useEffectEvent:** Defines non-reactive event logic called from an Effect while reading latest props/state.
