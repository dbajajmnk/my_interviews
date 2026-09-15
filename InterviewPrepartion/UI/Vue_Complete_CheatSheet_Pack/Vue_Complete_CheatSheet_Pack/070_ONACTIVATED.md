# onActivated

## What / Why

Runs when KeepAlive-cached component becomes active.

## Mental Model

```text
onActivated(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onActivated
</script>

<template>
  <div>onActivated</div>
</template>
```

## When to Use

Use with KeepAlive pages/widgets.

## Common Mistake / Interview Trap

Different from mount.

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

> **onActivated:** Runs when KeepAlive-cached component becomes active.
