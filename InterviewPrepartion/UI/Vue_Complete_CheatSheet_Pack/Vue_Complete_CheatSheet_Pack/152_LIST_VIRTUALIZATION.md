# List Virtualization

## What / Why

Render only visible rows for huge lists.

## Mental Model

```text
virtual list
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: List Virtualization
</script>

<template>
  <div>List Virtualization</div>
</template>
```

## When to Use

Use for thousands of elements.

## Common Mistake / Interview Trap

Keying and item-size strategy still matter.

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

> **List Virtualization:** Render only visible rows for huge lists.
