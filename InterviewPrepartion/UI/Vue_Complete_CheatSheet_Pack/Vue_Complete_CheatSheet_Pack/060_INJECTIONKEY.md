# InjectionKey

## What / Why

Provides typed Symbol keys for provide/inject.

## Mental Model

```text
const key:InjectionKey<Service>=Symbol()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: InjectionKey
</script>

<template>
  <div>InjectionKey</div>
</template>
```

## When to Use

Use for robust library/app contexts.

## Common Mistake / Interview Trap

String keys can collide in large ecosystems.

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

> **InjectionKey:** Provides typed Symbol keys for provide/inject.
