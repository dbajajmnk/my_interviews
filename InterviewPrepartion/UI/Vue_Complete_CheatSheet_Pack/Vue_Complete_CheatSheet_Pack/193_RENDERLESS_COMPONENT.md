# Renderless Component

## What / Why

Component exposes data/behavior through scoped slots without own UI.

## Mental Model

```text
<Mouse v-slot='...'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Renderless Component
</script>

<template>
  <div>Renderless Component</div>
</template>
```

## When to Use

Know legacy/library pattern.

## Common Mistake / Interview Trap

Composables often replace renderless components in modern Vue.

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

> **Renderless Component:** Component exposes data/behavior through scoped slots without own UI.
