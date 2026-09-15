# v-show

## What / Why

Toggles CSS display without unmounting.

## Mental Model

```text
<div v-show='visible'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-show
</script>

<template>
  <div>v-show</div>
</template>
```

## When to Use

Use for frequently toggled expensive subtrees.

## Common Mistake / Interview Trap

Element still exists and initial render cost remains.

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

> **v-show:** Toggles CSS display without unmounting.
