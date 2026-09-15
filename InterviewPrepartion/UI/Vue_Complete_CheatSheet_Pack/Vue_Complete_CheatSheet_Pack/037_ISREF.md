# isRef

## What / Why

Checks whether value is a ref.

## Mental Model

```text
isRef(x)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: isRef
</script>

<template>
  <div>isRef</div>
</template>
```

## When to Use

Use in generic composables/libraries.

## Common Mistake / Interview Trap

Application code rarely needs frequent type probing.

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

> **isRef:** Checks whether value is a ref.
