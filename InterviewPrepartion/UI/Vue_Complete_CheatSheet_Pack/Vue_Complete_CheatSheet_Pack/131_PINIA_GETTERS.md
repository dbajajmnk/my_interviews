# Pinia Getters

## What / Why

Computed values over store state.

## Mental Model

```text
getters:{doubleCount:s=>s.count*2}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Getters
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for derived store state.

## Common Mistake / Interview Trap

Avoid side effects.

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

> **Pinia Getters:** Computed values over store state.
