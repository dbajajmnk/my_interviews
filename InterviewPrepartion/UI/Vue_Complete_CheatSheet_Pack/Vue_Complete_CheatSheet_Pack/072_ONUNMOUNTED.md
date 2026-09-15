# onUnmounted

## What / Why

Runs after component is unmounted.

## Mental Model

```text
unmount → cleanup
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onUnmounted
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for timers/listeners/resources.

## Common Mistake / Interview Trap

Watcher/effects created synchronously in setup are generally scoped automatically; external resources still need cleanup.

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

> **onUnmounted:** Runs after component is unmounted.
