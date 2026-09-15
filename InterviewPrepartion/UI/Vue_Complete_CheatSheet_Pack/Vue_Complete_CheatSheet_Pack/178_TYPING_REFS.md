# Typing Refs

## What / Why

Use ref<Type>() and account for undefined/null.

## Mental Model

```text
ref<User|null>(null)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing Refs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use precise union types.

## Common Mistake / Interview Trap

Avoid unsafe casts.

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

> **Typing Refs:** Use ref<Type>() and account for undefined/null.
