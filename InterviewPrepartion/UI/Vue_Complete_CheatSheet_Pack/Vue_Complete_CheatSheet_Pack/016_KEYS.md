# Keys

## What / Why

Provide identity for sibling nodes/components.

## Mental Model

```text
:key='item.id'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Keys
</script>

<template>
  <div>Keys</div>
</template>
```

## When to Use

Use stable domain identity.

## Common Mistake / Interview Trap

Wrong keys cause state reuse/reset bugs.

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

> **Keys:** Provide identity for sibling nodes/components.
