# Typing Template Refs

## What / Why

useTemplateRef can infer many template ref types in modern Vue tooling.

## Mental Model

```text
useTemplateRef('el')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Typing Template Refs
</script>

<template>
  <div>Typing Template Refs</div>
</template>
```

## When to Use

Use Volar/vue-tsc ecosystem.

## Common Mistake / Interview Trap

Handle null before mount.

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

> **Typing Template Refs:** useTemplateRef can infer many template ref types in modern Vue tooling.
