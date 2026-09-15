# Navigation Guards

## What / Why

beforeEach/beforeEnter/in-component guards control navigation.

## Mental Model

```text
guard → allow/redirect/cancel
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Navigation Guards
</script>

<template>
  <div>Navigation Guards</div>
</template>
```

## When to Use

Use for navigation policy/data safety.

## Common Mistake / Interview Trap

Guards are not backend authorization.

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

> **Navigation Guards:** beforeEach/beforeEnter/in-component guards control navigation.
