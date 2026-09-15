# Loading Error Empty States

## What / Why

Every async view needs explicit state.

## Mental Model

```text
pending/error/empty/success
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Loading Error Empty States
</script>

<template>
  <div>Loading Error Empty States</div>
</template>
```

## When to Use

Use in all production async UI.

## Common Mistake / Interview Trap

Spinner-only UX is incomplete.

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

> **Loading Error Empty States:** Every async view needs explicit state.
