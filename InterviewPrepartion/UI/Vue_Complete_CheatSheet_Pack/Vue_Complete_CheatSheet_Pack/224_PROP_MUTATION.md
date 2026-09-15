# Prop Mutation

## What / Why

Props are readonly from child perspective.

## Mental Model

```text
parent source → prop
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Prop Mutation
</script>

<template>
  <div>Prop Mutation</div>
</template>
```

## When to Use

Emit intent/model update instead.

## Common Mistake / Interview Trap

Mutating nested prop objects can still mutate parent-owned data and is usually a design smell.

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

> **Prop Mutation:** Props are readonly from child perspective.
