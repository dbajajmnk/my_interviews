# v-model

## What / Why

Two-way binding for form elements/components.

## Mental Model

```text
v-model='name'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for form-like state.

## Common Mistake / Interview Trap

Understand modifiers and component contract.

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

> **v-model:** Two-way binding for form elements/components.
