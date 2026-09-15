# reactive

## What / Why

Creates a deeply reactive proxy for an object.

## Mental Model

```text
const state = reactive({count:0})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: reactive
</script>

<template>
  <div>reactive</div>
</template>
```

## When to Use

Use for cohesive object state.

## Common Mistake / Interview Trap

Destructuring can lose reactivity unless using helpers.

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

> **reactive:** Creates a deeply reactive proxy for an object.
