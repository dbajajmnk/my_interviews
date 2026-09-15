# v-model Migration

## What / Why

Vue 3 standardizes modelValue/update:modelValue and modern defineModel.

## Mental Model

```text
Vue2 value/input → Vue3 model contract
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-model Migration
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know legacy custom input migration.

## Common Mistake / Interview Trap

Do not mix old custom model event conventions blindly.

## Production Questions

```text
Who owns this state?
Is this local state, server state, URL state, or store state?
Is cleanup required?
What happens during SSR/hydration?
Can this be lazy-loaded?
How is this typed and tested?
What happens on slow network/error?
```

## 20-Second Recall

> **v-model Migration:** Vue 3 standardizes modelValue/update:modelValue and modern defineModel.
