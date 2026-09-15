# defineModel

## What / Why

Recommended Vue 3.4+ component v-model contract.

## Mental Model

```text
const model=defineModel()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineModel
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for reusable two-way-bound controls.

## Common Mistake / Interview Trap

Default values can desynchronize parent/child if parent passes no value.

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

> **defineModel:** Recommended Vue 3.4+ component v-model contract.
