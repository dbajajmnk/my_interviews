# triggerRef

## What / Why

Manually triggers effects for a shallowRef.

## Mental Model

```text
triggerRef(shallow)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: triggerRef
</script>

<template>
  <div>triggerRef</div>
</template>
```

## When to Use

Use after deep mutation of shallow ref when necessary.

## Common Mistake / Interview Trap

Usually replacing the value is clearer.

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

> **triggerRef:** Manually triggers effects for a shallowRef.
