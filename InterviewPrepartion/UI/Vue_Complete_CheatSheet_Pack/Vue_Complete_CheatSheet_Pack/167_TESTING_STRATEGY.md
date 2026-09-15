# Testing Strategy

## What / Why

Test behavior and public contracts rather than internal implementation.

## Mental Model

```text
mount → interact → assert
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Testing Strategy
</script>

<template>
  <div>Testing Strategy</div>
</template>
```

## When to Use

Use layered unit/component/E2E tests.

## Common Mistake / Interview Trap

Avoid testing private refs directly.

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

> **Testing Strategy:** Test behavior and public contracts rather than internal implementation.
