# Type Check

## What / Why

Use vue-tsc or generated script.

## Mental Model

```text
npm run type-check
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Type Check
</script>

<template>
  <div>Type Check</div>
</template>
```

## When to Use

Run in CI.

## Common Mistake / Interview Trap

Do not rely only on editor types.

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

> **Type Check:** Use vue-tsc or generated script.
