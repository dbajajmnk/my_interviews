# defineSlots

## What / Why

Provides type hints for slots in script setup.

## Mental Model

```text
defineSlots<Slots>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineSlots
</script>

<template>
  <div>defineSlots</div>
</template>
```

## When to Use

Use in typed component libraries.

## Common Mistake / Interview Trap

Primarily compile-time/type support.

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

> **defineSlots:** Provides type hints for slots in script setup.
