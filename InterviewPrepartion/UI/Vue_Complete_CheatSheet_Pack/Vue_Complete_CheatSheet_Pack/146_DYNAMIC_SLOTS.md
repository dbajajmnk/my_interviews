# Dynamic Slots

## What / Why

Slot names can be dynamic.

## Mental Model

```text
v-slot:[name]
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Dynamic Slots
</script>

<template>
  <div>Dynamic Slots</div>
</template>
```

## When to Use

Use for configurable component systems.

## Common Mistake / Interview Trap

Can make APIs hard to understand if overused.

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

> **Dynamic Slots:** Slot names can be dynamic.
