# inject

## What / Why

Reads nearest provided value.

## Mental Model

```text
inject(key)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: inject
</script>

<template>
  <div>inject</div>
</template>
```

## When to Use

Use for deeply nested contextual dependencies.

## Common Mistake / Interview Trap

Always handle missing/default cases when provider is optional.

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

> **inject:** Reads nearest provided value.
