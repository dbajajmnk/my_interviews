# Dynamic Components

## What / Why

Selects component at runtime.

## Mental Model

```text
<component :is='current'/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Dynamic Components
</script>

<template>
  <div>Dynamic Components</div>
</template>
```

## When to Use

Use for tabs/plugins/editors.

## Common Mistake / Interview Trap

Pair with KeepAlive only when state preservation is desired.

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

> **Dynamic Components:** Selects component at runtime.
