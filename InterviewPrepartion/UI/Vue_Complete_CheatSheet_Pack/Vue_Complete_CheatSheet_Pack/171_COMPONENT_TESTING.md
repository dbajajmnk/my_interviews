# Component Testing

## What / Why

Mount component with realistic props/plugins and assert UI behavior.

## Mental Model

```text
mount(Component,{props})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Component Testing
</script>

<template>
  <div>Component Testing</div>
</template>
```

## When to Use

Use for reusable components/features.

## Common Mistake / Interview Trap

Mock only external boundaries.

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

> **Component Testing:** Mount component with realistic props/plugins and assert UI behavior.
