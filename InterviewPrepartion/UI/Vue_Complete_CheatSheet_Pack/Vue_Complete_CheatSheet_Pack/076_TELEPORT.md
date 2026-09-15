# Teleport

## What / Why

Renders DOM into another target while keeping logical component ownership.

## Mental Model

```text
<Teleport to='body'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Teleport
</script>

<template>
  <div>Teleport</div>
</template>
```

## When to Use

Use for modals/popovers/overlays.

## Common Mistake / Interview Trap

Teleport changes DOM location, not Vue ownership.

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

> **Teleport:** Renders DOM into another target while keeping logical component ownership.
