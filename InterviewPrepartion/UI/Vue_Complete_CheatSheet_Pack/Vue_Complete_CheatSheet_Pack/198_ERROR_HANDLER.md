# Error Handler

## What / Why

app.config.errorHandler captures uncaught app errors.

## Mental Model

```text
error → global telemetry
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Error Handler
</script>

<template>
  <div>Error Handler</div>
</template>
```

## When to Use

Use for observability.

## Common Mistake / Interview Trap

Still provide local recoverable error UX.

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

> **Error Handler:** app.config.errorHandler captures uncaught app errors.
