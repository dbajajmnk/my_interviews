# readonly

## What / Why

Creates a readonly proxy view.

## Mental Model

```text
readonly(state)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: readonly
</script>

<template>
  <div>readonly</div>
</template>
```

## When to Use

Use to expose state without mutation permission.

## Common Mistake / Interview Trap

Readonly is runtime reactive protection, not a security boundary.

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

> **readonly:** Creates a readonly proxy view.
