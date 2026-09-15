# toValue

## What / Why

Normalizes ref/getter/plain value to a value.

## Mental Model

```text
toValue(maybeRefOrGetter)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: toValue
</script>

<template>
  <div>toValue</div>
</template>
```

## When to Use

Use in composables accepting flexible reactive inputs.

## Common Mistake / Interview Trap

Understand when the getter is evaluated.

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

> **toValue:** Normalizes ref/getter/plain value to a value.
