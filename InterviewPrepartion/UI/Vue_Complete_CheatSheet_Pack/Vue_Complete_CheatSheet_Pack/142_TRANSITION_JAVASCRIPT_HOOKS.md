# Transition JavaScript Hooks

## What / Why

Custom hooks control animation lifecycle.

## Mental Model

```text
@enter/@leave
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Transition JavaScript Hooks
</script>

<template>
  <div>Transition JavaScript Hooks</div>
</template>
```

## When to Use

Use for animation libraries.

## Common Mistake / Interview Trap

Call done callback when required.

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

> **Transition JavaScript Hooks:** Custom hooks control animation lifecycle.
