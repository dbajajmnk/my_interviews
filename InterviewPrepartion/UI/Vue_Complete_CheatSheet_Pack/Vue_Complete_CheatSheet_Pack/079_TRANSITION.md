# Transition

## What / Why

Applies enter/leave transitions to a single element/component.

## Mental Model

```text
<Transition>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Transition
</script>

<template>
  <div>Transition</div>
</template>
```

## When to Use

Use for UI animations.

## Common Mistake / Interview Trap

Transitions do not solve route/data loading.

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

> **Transition:** Applies enter/leave transitions to a single element/component.
