# shallowRef

## What / Why

Tracks `.value` replacement but not deep nested mutation.

## Mental Model

```text
shallowRef(externalObject)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: shallowRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for large immutable/external objects and integration.

## Common Mistake / Interview Trap

Nested changes are not tracked.

## Production Questions

```text
Who owns this state?
Is this local state, server state, URL state, or store state?
Is cleanup required?
What happens during SSR/hydration?
Can this be lazy-loaded?
How is this typed and tested?
What happens on slow network/error?
```

## 20-Second Recall

> **shallowRef:** Tracks `.value` replacement but not deep nested mutation.
