# Preview

## What / Why

Serves built output locally for verification.

## Mental Model

```text
npm run preview
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Preview
</script>

<template>
  <div>Preview</div>
</template>
```

## When to Use

Use smoke checks.

## Common Mistake / Interview Trap

Not production hosting.

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

> **Preview:** Serves built output locally for verification.
