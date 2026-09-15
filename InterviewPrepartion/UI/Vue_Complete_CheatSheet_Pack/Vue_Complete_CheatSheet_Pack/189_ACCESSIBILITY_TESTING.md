# Accessibility Testing

## What / Why

Automated scans + keyboard + screen-reader checks.

## Mental Model

```text
axe + manual
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Accessibility Testing
</script>

<template>
  <div>Accessibility Testing</div>
</template>
```

## When to Use

Use in CI/release.

## Common Mistake / Interview Trap

Passing scanner is not complete compliance.

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

> **Accessibility Testing:** Automated scans + keyboard + screen-reader checks.
