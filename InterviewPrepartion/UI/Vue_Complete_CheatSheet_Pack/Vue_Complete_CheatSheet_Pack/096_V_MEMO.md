# v-memo

## What / Why

Conditionally skips subtree updates until dependency array changes.

## Mental Model

```text
v-memo='[valueA,valueB]'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-memo
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use only for measured performance cases.

## Common Mistake / Interview Trap

Compiler/runtime already optimizes many templates.

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

> **v-memo:** Conditionally skips subtree updates until dependency array changes.
