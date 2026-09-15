# Composition vs Options API

## What / Why

Both are supported in Vue 3; Composition API + script setup is preferred for complex reusable TypeScript logic.

## Mental Model

```text
setup/ref/computed vs data/methods/computed
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composition vs Options API
</script>

<template>
  <div>Composition vs Options API</div>
</template>
```

## When to Use

Know both for maintenance/interviews.

## Common Mistake / Interview Trap

Options API is not deprecated.

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

> **Composition vs Options API:** Both are supported in Vue 3; Composition API + script setup is preferred for complex reusable TypeScript logic.
