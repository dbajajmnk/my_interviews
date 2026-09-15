# Typing Props

## What / Why

Use type-based defineProps.

## Mental Model

```text
defineProps<{user:User}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing Props
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use domain types.

## Common Mistake / Interview Trap

Runtime validation and compile-time types are different concerns.

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

> **Typing Props:** Use type-based defineProps.
