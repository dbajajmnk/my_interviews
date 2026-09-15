# Interpolation

## What / Why

Renders text from expressions.

## Mental Model

```text
{{ message }}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Interpolation
</script>

<template>
  <div>Interpolation</div>
</template>
```

## When to Use

Use for text content.

## Common Mistake / Interview Trap

Interpolated text is escaped by default.

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

> **Interpolation:** Renders text from expressions.
