# Semantic HTML

## What / Why

Use native elements before ARIA.

## Mental Model

```text
button/nav/label
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Semantic HTML
</script>

<template>
  <div>Semantic HTML</div>
</template>
```

## When to Use

Foundation for accessibility.

## Common Mistake / Interview Trap

Clickable div is usually wrong.

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

> **Semantic HTML:** Use native elements before ARIA.
