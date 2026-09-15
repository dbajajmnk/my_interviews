# WebSocket

## What / Why

Long-lived bidirectional stream.

## Mental Model

```text
socket → reactive store
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: WebSocket
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for real-time updates.

## Common Mistake / Interview Trap

Reconnect, ordering, auth, backpressure need design.

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

> **WebSocket:** Long-lived bidirectional stream.
