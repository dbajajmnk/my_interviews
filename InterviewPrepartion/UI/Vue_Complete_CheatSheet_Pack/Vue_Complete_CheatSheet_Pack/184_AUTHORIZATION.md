# Authorization

## What / Why

Conditionally show UI, while backend enforces permission.

## Mental Model

```text
canEdit
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Authorization
</script>

<template>
  <div>Authorization</div>
</template>
```

## When to Use

Use for UX.

## Common Mistake / Interview Trap

Never rely on hidden buttons as security.

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

> **Authorization:** Conditionally show UI, while backend enforces permission.
