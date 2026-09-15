# defineModel

## What / Why

Declares component v-model contract.

## Mental Model

```text
const model=defineModel<string>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineModel
</script>

<template>
  <div>defineModel</div>
</template>
```

## When to Use

Use for reusable two-way value components.

## Common Mistake / Interview Trap

Do not use v-model everywhere if one-way props/events are clearer.

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

> **defineModel:** Declares component v-model contract.
