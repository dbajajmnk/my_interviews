# v-memo

## What / Why

Memoizes a template subtree based on dependency array.

## Mental Model

```text
v-memo='[selected]'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-memo
</script>

<template>
  <div>v-memo</div>
</template>
```

## When to Use

Use for targeted large-list optimization.

## Common Mistake / Interview Trap

Rarely needed; measure first.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-memo:** Memoizes a template subtree based on dependency array.
