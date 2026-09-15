# defineStore Options Store

## What / Why

Defines state/getters/actions object style.

## Mental Model

```text
defineStore('id',{state,getters,actions})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineStore Options Store
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when team prefers explicit store sections.

## Common Mistake / Interview Trap

Actions using this should use normal functions.

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

> **defineStore Options Store:** Defines state/getters/actions object style.
