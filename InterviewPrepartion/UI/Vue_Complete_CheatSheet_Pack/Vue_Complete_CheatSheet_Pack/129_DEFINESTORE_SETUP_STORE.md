# defineStore Setup Store

## What / Why

Defines store using Composition API refs/computed/functions.

## Mental Model

```text
defineStore('id',()=>{...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineStore Setup Store
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for composable-style store logic.

## Common Mistake / Interview Trap

All state should be exposed appropriately for SSR/devtools.

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

> **defineStore Setup Store:** Defines store using Composition API refs/computed/functions.
