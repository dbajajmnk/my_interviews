# Composable Architecture

## What / Why

Use composables as feature logic boundaries.

## Mental Model

```text
useOrders/useAuth
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable Architecture
</script>

<template>
  <div>Composable Architecture</div>
</template>
```

## When to Use

Use for reusable UI-domain coordination.

## Common Mistake / Interview Trap

Avoid huge god composables.

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

> **Composable Architecture:** Use composables as feature logic boundaries.
