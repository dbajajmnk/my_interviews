# storeToRefs

## What / Why

Extracts reactive state/getters from Pinia store.

## Mental Model

```text
const {count}=storeToRefs(store)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: storeToRefs
</script>

<template>
  <div>storeToRefs</div>
</template>
```

## When to Use

Use when destructuring store state.

## Common Mistake / Interview Trap

Actions can be destructured directly.

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

> **storeToRefs:** Extracts reactive state/getters from Pinia store.
