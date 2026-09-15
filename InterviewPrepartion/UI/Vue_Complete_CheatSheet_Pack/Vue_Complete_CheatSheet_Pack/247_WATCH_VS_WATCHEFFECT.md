# watch vs watchEffect

## What / Why

watch uses explicit source and old/new; watchEffect auto-tracks dependencies.

## Mental Model

```text
explicit vs auto
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: watch vs watchEffect
// Use the concrete API described above in real code.
</script>
```

## When to Use

Choose based on control/clarity.

## Common Mistake / Interview Trap

Async watchEffect dependency tracking can surprise after await.

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

> **watch vs watchEffect:** watch uses explicit source and old/new; watchEffect auto-tracks dependencies.
