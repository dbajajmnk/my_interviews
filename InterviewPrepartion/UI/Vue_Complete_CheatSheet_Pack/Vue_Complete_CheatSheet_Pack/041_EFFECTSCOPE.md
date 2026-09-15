# effectScope

## What / Why

Groups reactive effects so they can be stopped together.

## Mental Model

```text
const scope=effectScope()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: effectScope
</script>

<template>
  <div>effectScope</div>
</template>
```

## When to Use

Use in libraries/composables managing effect lifetimes.

## Common Mistake / Interview Trap

Components already manage their own scope automatically.

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

> **effectScope:** Groups reactive effects so they can be stopped together.
