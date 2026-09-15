# Multiple v-model

## What / Why

A component can expose multiple named models.

## Mental Model

```text
defineModel('firstName')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Multiple v-model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when component legitimately owns multiple editable values.

## Common Mistake / Interview Trap

Too many models can make API hard to reason about.

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

> **Multiple v-model:** A component can expose multiple named models.
