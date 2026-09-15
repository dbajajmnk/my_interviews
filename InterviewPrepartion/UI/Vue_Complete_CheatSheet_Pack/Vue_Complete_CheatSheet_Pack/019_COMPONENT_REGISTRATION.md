# Component Registration

## What / Why

Components can be imported locally; script setup exposes imports automatically.

## Mental Model

```text
import UserCard from './UserCard.vue'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Component Registration
</script>

<template>
  <div>Component Registration</div>
</template>
```

## When to Use

Use local explicit dependencies.

## Common Mistake / Interview Trap

Global registration should be limited to truly global primitives.

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

> **Component Registration:** Components can be imported locally; script setup exposes imports automatically.
