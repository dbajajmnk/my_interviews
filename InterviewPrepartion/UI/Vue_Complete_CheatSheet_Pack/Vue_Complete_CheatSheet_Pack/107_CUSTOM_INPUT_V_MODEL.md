# Custom Input v-model

## What / Why

Child component uses defineModel or modelValue/update:modelValue contract.

## Mental Model

```text
defineModel()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Custom Input v-model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for reusable controls.

## Common Mistake / Interview Trap

Model default mismatch can desynchronize state.

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

> **Custom Input v-model:** Child component uses defineModel or modelValue/update:modelValue contract.
