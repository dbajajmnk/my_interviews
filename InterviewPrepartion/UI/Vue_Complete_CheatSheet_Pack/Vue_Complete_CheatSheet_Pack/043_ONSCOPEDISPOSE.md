# onScopeDispose

## What / Why

Registers cleanup in current effect scope.

## Mental Model

```text
onScopeDispose(cleanup)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onScopeDispose
</script>

<template>
  <div>onScopeDispose</div>
</template>
```

## When to Use

Use for reusable composables independent of component lifecycle.

## Common Mistake / Interview Trap

Ensure composable runs inside an active scope.

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

> **onScopeDispose:** Registers cleanup in current effect scope.
