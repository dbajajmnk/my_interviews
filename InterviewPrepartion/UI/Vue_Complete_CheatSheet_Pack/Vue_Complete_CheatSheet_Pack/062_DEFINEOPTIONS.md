# defineOptions

## What / Why

Declares component options in script setup.

## Mental Model

```text
defineOptions({inheritAttrs:false})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineOptions
</script>

<template>
  <div>defineOptions</div>
</template>
```

## When to Use

Use for options without a separate script block.

## Common Mistake / Interview Trap

Compile-time macro only.

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

> **defineOptions:** Declares component options in script setup.
