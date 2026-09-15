# Async Composable

## What / Why

Wrap request state in a composable.

## Mental Model

```text
{data,error,pending,refresh}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Async Composable
</script>

<template>
  <div>Async Composable</div>
</template>
```

## When to Use

Use for repeated client data patterns.

## Common Mistake / Interview Trap

Avoid duplicated fetching side effects across components.

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

> **Async Composable:** Wrap request state in a composable.
