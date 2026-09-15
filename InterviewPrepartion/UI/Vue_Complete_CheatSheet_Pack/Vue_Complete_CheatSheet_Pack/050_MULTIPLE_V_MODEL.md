# Multiple v-model

## What / Why

A component can expose multiple named models.

## Mental Model

```text
v-model:first-name / defineModel('firstName')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Multiple v-model
</script>

<template>
  <div>Multiple v-model</div>
</template>
```

## When to Use

Use for composite reusable inputs.

## Common Mistake / Interview Trap

Keep public component API understandable.

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

> **Multiple v-model:** A component can expose multiple named models.
