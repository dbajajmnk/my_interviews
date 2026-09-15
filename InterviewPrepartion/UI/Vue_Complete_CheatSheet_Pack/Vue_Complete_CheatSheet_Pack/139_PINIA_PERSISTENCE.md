# Pinia Persistence

## What / Why

Persist selected state via plugin/custom storage.

## Mental Model

```text
store ↔ localStorage
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Persistence
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use only non-sensitive appropriate data.

## Common Mistake / Interview Trap

Browser storage is observable and can become stale.

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

> **Pinia Persistence:** Persist selected state via plugin/custom storage.
