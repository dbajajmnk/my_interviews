# computed

## What / Why

Creates cached derived reactive state.

## Mental Model

```text
const total = computed(()=>price.value*qty.value)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: computed
</script>

<template>
  <div>computed</div>
</template>
```

## When to Use

Use for pure derivations.

## Common Mistake / Interview Trap

Do not perform side effects inside computed getters.

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

> **computed:** Creates cached derived reactive state.
