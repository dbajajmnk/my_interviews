# Error Boundaries Pattern

## What / Why

Use onErrorCaptured/global error handler/route-level UX to isolate failures.

## Mental Model

```text
feature error → fallback
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Error Boundaries Pattern
</script>

<template>
  <div>Error Boundaries Pattern</div>
</template>
```

## When to Use

Use failure domains.

## Common Mistake / Interview Trap

Vue has no React-style ErrorBoundary component built-in by that name; implement via Vue error APIs.

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

> **Error Boundaries Pattern:** Use onErrorCaptured/global error handler/route-level UX to isolate failures.
