# v-model

## What / Why

Creates two-way binding conventions for form/component values.

## Mental Model

```text
<input v-model='name'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-model
</script>

<template>
  <div>v-model</div>
</template>
```

## When to Use

Use for form/control value contracts.

## Common Mistake / Interview Trap

Understand modelValue/update:modelValue and defineModel in reusable components.

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

> **v-model:** Creates two-way binding conventions for form/component values.
