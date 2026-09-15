# Pinia Testing

## What / Why

Use testing Pinia/utilities or real store with reset state.

## Mental Model

```text
createTestingPinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Testing
</script>

<template>
  <div>Pinia Testing</div>
</template>
```

## When to Use

Use for feature/store tests.

## Common Mistake / Interview Trap

Overmocking actions can hide integration bugs.

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

> **Pinia Testing:** Use testing Pinia/utilities or real store with reset state.
