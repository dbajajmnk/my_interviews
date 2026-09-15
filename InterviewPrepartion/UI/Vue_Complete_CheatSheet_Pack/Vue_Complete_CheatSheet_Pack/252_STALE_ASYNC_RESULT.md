# Stale Async Result

## What / Why

Older request finishes after newer request.

## Mental Model

```text
abort/token/latest-id
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Stale Async Result
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use watcher cleanup or query library.

## Common Mistake / Interview Trap

Race bugs often appear only on slow networks.

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

> **Stale Async Result:** Older request finishes after newer request.
