# Computed Caching

## What / Why

Computed reruns only when dependencies change.

## Mental Model

```text
computed
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Computed Caching
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for expensive derived state.

## Common Mistake / Interview Trap

Do not create side effects in computed.

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

> **Computed Caching:** Computed reruns only when dependencies change.
