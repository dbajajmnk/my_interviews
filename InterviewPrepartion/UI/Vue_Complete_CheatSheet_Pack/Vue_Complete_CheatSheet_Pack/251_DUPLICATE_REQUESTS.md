# Duplicate Requests

## What / Why

Repeated watchers/subscriptions/lifecycle calls trigger fetches.

## Mental Model

```text
inspect ownership/cancellation
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Duplicate Requests
// Use the concrete API described above in real code.
</script>
```

## When to Use

Deduplicate/cache/cancel.

## Common Mistake / Interview Trap

Do not assume framework automatically caches.

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

> **Duplicate Requests:** Repeated watchers/subscriptions/lifecycle calls trigger fetches.
