# Infinite Watch Loop

## What / Why

Watcher mutates its own triggering source repeatedly.

## Mental Model

```text
watch → mutate source → watch
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Infinite Watch Loop
</script>

<template>
  <div>Infinite Watch Loop</div>
</template>
```

## When to Use

Fix ownership/condition.

## Common Mistake / Interview Trap

Do not paper over with flags unless domain rule requires.

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

> **Infinite Watch Loop:** Watcher mutates its own triggering source repeatedly.
