# Pinia Destructuring

## What / Why

Direct store destructuring can lose reactivity; use storeToRefs for state/getters.

## Mental Model

```text
storeToRefs
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Destructuring
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use actions directly from store.

## Common Mistake / Interview Trap

Common Pinia interview bug.

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

> **Pinia Destructuring:** Direct store destructuring can lose reactivity; use storeToRefs for state/getters.
