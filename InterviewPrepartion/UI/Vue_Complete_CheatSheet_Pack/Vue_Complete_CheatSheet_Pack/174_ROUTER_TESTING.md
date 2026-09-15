# Router Testing

## What / Why

Use memory history/router instance for deterministic route tests.

## Mental Model

```text
createMemoryHistory
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Router Testing
</script>

<template>
  <div>Router Testing</div>
</template>
```

## When to Use

Use for guards/navigation/components.

## Common Mistake / Interview Trap

Await router readiness/navigation.

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

> **Router Testing:** Use memory history/router instance for deterministic route tests.
