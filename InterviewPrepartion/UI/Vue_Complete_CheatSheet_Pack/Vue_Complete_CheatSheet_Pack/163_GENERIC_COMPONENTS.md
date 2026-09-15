# Generic Components

## What / Why

SFC script setup supports generic component patterns.

## Mental Model

```text
<script setup lang='ts' generic='T'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Generic Components
</script>

<template>
  <div>Generic Components</div>
</template>
```

## When to Use

Use in reusable design-system components.

## Common Mistake / Interview Trap

Keep inference ergonomic.

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

> **Generic Components:** SFC script setup supports generic component patterns.
