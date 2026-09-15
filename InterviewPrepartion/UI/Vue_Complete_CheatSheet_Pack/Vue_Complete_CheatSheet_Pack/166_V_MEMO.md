# v-memo

## What / Why

Memoizes template subtree based on dependency list.

## Mental Model

```text
v-memo='[selected]'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-memo
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for proven hot-list cases.

## Common Mistake / Interview Trap

Usually unnecessary for normal components.

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

> **v-memo:** Memoizes template subtree based on dependency list.
