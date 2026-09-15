# Vue 3.5 — High-Value Feature Recall

## Reactive Props Destructure

```vue
<script setup lang="ts">
const { msg = 'hello' } = defineProps<{ msg?: string }>()
</script>
```

In Vue 3.5, destructured props in `<script setup>` are compiler-transformed so references remain reactive.

## useTemplateRef

```vue
<script setup lang="ts">
import { useTemplateRef, onMounted } from 'vue'

const input = useTemplateRef<HTMLInputElement>('input')

onMounted(() => input.value?.focus())
</script>

<template>
  <input ref="input" />
</template>
```

## Lazy Hydration for Async Components

```ts
defineAsyncComponent({
  loader: () => import('./Heavy.vue'),
  hydrate: hydrateOnVisible()
})
```

Built-in strategies include:
```text
hydrateOnIdle
hydrateOnVisible
hydrateOnMediaQuery
hydrateOnInteraction
```

## Hydration Mismatch Control

`data-allow-mismatch` can selectively suppress known unavoidable SSR mismatch warnings.

## Why It Matters

Vue 3.5 is not merely “Vue 3 with bug fixes”; it improves SFC ergonomics, SSR/hydration control, type inference, and runtime behavior.
