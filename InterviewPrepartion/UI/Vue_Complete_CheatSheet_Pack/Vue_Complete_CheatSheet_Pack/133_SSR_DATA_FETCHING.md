# SSR Data Fetching

## What / Why

Resolve data on server and serialize safely for hydration.

## Mental Model

```text
server fetch → state → HTML/client
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: SSR Data Fetching
</script>

<template>
  <div>SSR Data Fetching</div>
</template>
```

## When to Use

Use framework conventions.

## Common Mistake / Interview Trap

Never serialize secrets or unsafe executable content.

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

> **SSR Data Fetching:** Resolve data on server and serialize safely for hydration.
