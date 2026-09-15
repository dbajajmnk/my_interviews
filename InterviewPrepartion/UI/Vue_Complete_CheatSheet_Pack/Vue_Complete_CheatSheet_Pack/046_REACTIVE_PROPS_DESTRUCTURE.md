# Reactive Props Destructure

## What / Why

Vue 3.5 supports reactive destructuring of defineProps variables in script setup.

## Mental Model

```text
const {foo='x'}=defineProps<Props>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Reactive Props Destructure
</script>

<template>
  <div>Reactive Props Destructure</div>
</template>
```

## When to Use

Use for concise defaults/reactive props in 3.5+.

## Common Mistake / Interview Trap

Know older Vue versions did not preserve reactivity on plain destructure.

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

> **Reactive Props Destructure:** Vue 3.5 supports reactive destructuring of defineProps variables in script setup.
