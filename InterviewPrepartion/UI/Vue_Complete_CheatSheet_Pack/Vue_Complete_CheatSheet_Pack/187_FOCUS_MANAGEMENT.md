# Focus Management

## What / Why

Manage modal/popover/route focus deliberately.

## Mental Model

```text
template ref → focus
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Focus Management
</script>

<template>
  <div>Focus Management</div>
</template>
```

## When to Use

Use accessible primitives/headless libs as needed.

## Common Mistake / Interview Trap

Do not steal focus unexpectedly.

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

> **Focus Management:** Manage modal/popover/route focus deliberately.
