# Lazy Hydration Awareness

## What / Why

Vue 3.5 includes SSR lazy hydration strategies for async components.

## Mental Model

```text
hydrateOnIdle/Visible/Interaction/MediaQuery
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Lazy Hydration Awareness
</script>

<template>
  <div>Lazy Hydration Awareness</div>
</template>
```

## When to Use

Use for SSR islands/less-critical interactive regions.

## Common Mistake / Interview Trap

Only meaningful in SSR hydration architecture.

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

> **Lazy Hydration Awareness:** Vue 3.5 includes SSR lazy hydration strategies for async components.
