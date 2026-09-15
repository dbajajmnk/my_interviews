# Typing Models

## What / Why

defineModel supports typed model refs.

## Mental Model

```text
defineModel<string>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing Models
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use reusable form controls.

## Common Mistake / Interview Trap

Model can be undefined unless required/defaulted appropriately.

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

> **Typing Models:** defineModel supports typed model refs.
