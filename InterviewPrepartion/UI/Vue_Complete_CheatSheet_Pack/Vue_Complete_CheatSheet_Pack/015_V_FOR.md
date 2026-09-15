# v-for

## What / Why

Renders lists.

## Mental Model

```text
<li v-for='item in items' :key='item.id'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-for
</script>

<template>
  <div>v-for</div>
</template>
```

## When to Use

Use stable keys.

## Common Mistake / Interview Trap

Avoid array index keys for reordered/stateful items.

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

> **v-for:** Renders lists.
