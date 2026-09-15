# Composition API vs Options API

| Composition API | Options API |
|---|---|
| `setup` / `<script setup>` | `data`, `methods`, `computed`, `watch` |
| logic grouped by feature | logic grouped by option type |
| excellent TS inference | approachable object-based structure |
| composables | mixins / reusable patterns |
| modern default for complex apps | fully supported |

## Composition API Example

```vue
<script setup lang="ts">
import { ref, computed } from 'vue'

const count = ref(0)
const doubled = computed(() => count.value * 2)
</script>

<template>
  <button @click="count++">{{ doubled }}</button>
</template>
```

## Options API Example

```vue
<script>
export default {
  data: () => ({ count: 0 }),
  computed: {
    doubled() { return this.count * 2 }
  }
}
</script>
```

## Interview Rule

Options API is **not deprecated**.

For modern large TypeScript-heavy applications, Composition API with `<script setup>` is generally the preferred architecture.
