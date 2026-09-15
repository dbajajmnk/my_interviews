# watchPostEffect

## What / Why

Runs watcher after component DOM updates.

## Mental Model

```text
watchPostEffect
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: watchPostEffect
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for DOM-dependent post-render work.

## Common Mistake / Interview Trap

Prefer normal watch/watchEffect unless timing matters.

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

> **watchPostEffect:** Runs watcher after component DOM updates.
