# defineEmits

## What / Why

Declares typed component events.

## Mental Model

```text
const emit=defineEmits<{save:[id:string]}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineEmits
</script>

<template>
  <div>defineEmits</div>
</template>
```

## When to Use

Use for explicit child-to-parent events.

## Common Mistake / Interview Trap

Events should express intent, not mutate parent state indirectly.

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

> **defineEmits:** Declares typed component events.
