# $reset

## What / Why

Resets Options Store to initial state.

## Mental Model

```text
store.$reset()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: $reset
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for logout/feature reset.

## Common Mistake / Interview Trap

Setup stores need custom reset logic.

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

> **$reset:** Resets Options Store to initial state.
