# Nested Routes

## What / Why

Route records can nest layouts/children.

## Mental Model

```text
parent → child routes
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Nested Routes
</script>

<template>
  <div>Nested Routes</div>
</template>
```

## When to Use

Use for feature/layout hierarchy.

## Common Mistake / Interview Trap

Avoid overly deep nesting.

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

> **Nested Routes:** Route records can nest layouts/children.
