# Performance Mental Model

## What / Why

Optimize network, bundle, reactive invalidation, component rendering and DOM together.

## Mental Model

```text
Network → JS → reactive updates → patch → paint
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Performance Mental Model
</script>

<template>
  <div>Performance Mental Model</div>
</template>
```

## When to Use

Profile before optimizing.

## Common Mistake / Interview Trap

Vue's compiler already removes much manual rendering work.

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

> **Performance Mental Model:** Optimize network, bundle, reactive invalidation, component rendering and DOM together.
