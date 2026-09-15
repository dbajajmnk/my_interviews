# Transition CSS Classes

## What / Why

Vue manages enter/leave class phases.

## Mental Model

```text
v-enter-from → v-enter-active → v-enter-to
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Transition CSS Classes
</script>

<template>
  <div>Transition CSS Classes</div>
</template>
```

## When to Use

Use for CSS transitions.

## Common Mistake / Interview Trap

Know class lifecycle when debugging animations.

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

> **Transition CSS Classes:** Vue manages enter/leave class phases.
