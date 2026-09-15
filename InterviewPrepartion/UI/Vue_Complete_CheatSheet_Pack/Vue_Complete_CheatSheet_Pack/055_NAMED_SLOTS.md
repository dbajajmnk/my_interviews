# Named Slots

## What / Why

Expose multiple placement regions.

## Mental Model

```text
<slot name='header'/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Named Slots
</script>

<template>
  <div>Named Slots</div>
</template>
```

## When to Use

Use for flexible layouts.

## Common Mistake / Interview Trap

Too many slots can create fragile APIs.

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

> **Named Slots:** Expose multiple placement regions.
