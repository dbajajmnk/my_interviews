# triggerRef

## What / Why

Manually triggers effects for shallowRef after deep mutation.

## Mental Model

```text
triggerRef(shallow)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: triggerRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use with shallow integration patterns.

## Common Mistake / Interview Trap

Frequent manual triggering can indicate wrong state model.

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

> **triggerRef:** Manually triggers effects for shallowRef after deep mutation.
