# v-bind

## What / Why

Binds attributes/properties/component props.

## Mental Model

```text
<img :src='url'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-bind
</script>

<template>
  <div>v-bind</div>
</template>
```

## When to Use

Use `:` shorthand in templates.

## Common Mistake / Interview Trap

Binding does not mean two-way synchronization.

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

> **v-bind:** Binds attributes/properties/component props.
