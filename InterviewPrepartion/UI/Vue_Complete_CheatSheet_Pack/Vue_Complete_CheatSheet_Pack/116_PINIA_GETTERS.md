# Pinia Getters

## What / Why

Derived store state.

## Mental Model

```text
doubleCount
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Getters
</script>

<template>
  <div>Pinia Getters</div>
</template>
```

## When to Use

Use for reusable derivations.

## Common Mistake / Interview Trap

Simple one-off derivation can remain computed locally.

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

> **Pinia Getters:** Derived store state.
