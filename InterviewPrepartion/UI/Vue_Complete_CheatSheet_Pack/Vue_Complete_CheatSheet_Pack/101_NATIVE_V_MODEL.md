# Native v-model

## What / Why

Binds inputs/selects/textarea to reactive state.

## Mental Model

```text
<input v-model='name'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Native v-model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for simple form fields.

## Common Mistake / Interview Trap

Checkbox/select semantics differ by element type.

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

> **Native v-model:** Binds inputs/selects/textarea to reactive state.
