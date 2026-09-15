# onWatcherCleanup

## What / Why

Registers cleanup for watcher invalidation.

## Mental Model

```text
onWatcherCleanup(cancel)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onWatcherCleanup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to abort stale requests/resources.

## Common Mistake / Interview Trap

Call it in supported synchronous watcher callback timing.

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

> **onWatcherCleanup:** Registers cleanup for watcher invalidation.
