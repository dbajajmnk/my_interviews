# useSyncExternalStore

## What / Why

Subscribes safely to an external store.

## Mental Model / Visual

```text
useSyncExternalStore(subscribe,getSnapshot)
```

## Example

```jsx
// Minimal recall example for useSyncExternalStore
function Example() {
  return <div>useSyncExternalStore</div>;
}
```

## When to Use

Use in store/library integrations.

## Common Mistake / Interview Trap

Prefer this over ad-hoc effect subscriptions for external stores.

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

> **useSyncExternalStore:** Subscribes safely to an external store.
