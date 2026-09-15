# RouterView

## What / Why

Renders matched route component.

## Mental Model

```text
<RouterView/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: RouterView
</script>

<template>
  <div>RouterView</div>
</template>
```

## When to Use

Use in app/layout shells.

## Common Mistake / Interview Trap

Nested views correspond to nested route records.

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

> **RouterView:** Renders matched route component.
