# Universal Code

## What / Why

Code may execute on server and client.

## Mental Model

```text
isomorphic module
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Universal Code
</script>

<template>
  <div>Universal Code</div>
</template>
```

## When to Use

Use environment-neutral APIs where possible.

## Common Mistake / Interview Trap

Hidden global mutable state is dangerous in SSR.

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

> **Universal Code:** Code may execute on server and client.
