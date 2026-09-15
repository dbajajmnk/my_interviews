# Recursive Components

## What / Why

Components may render themselves recursively.

## Mental Model

```text
TreeNode → TreeNode children
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Recursive Components
</script>

<template>
  <div>Recursive Components</div>
</template>
```

## When to Use

Use for trees/comments/files.

## Common Mistake / Interview Trap

Base case is mandatory.

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

> **Recursive Components:** Components may render themselves recursively.
