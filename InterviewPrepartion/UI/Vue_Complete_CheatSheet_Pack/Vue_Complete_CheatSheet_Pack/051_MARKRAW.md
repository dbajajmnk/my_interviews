# markRaw

## What / Why

Prevents object from becoming reactive.

## Mental Model

```text
markRaw(instance)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: markRaw
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for third-party class instances/large immutable structures.

## Common Mistake / Interview Trap

Do not mark domain state raw accidentally.

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

> **markRaw:** Prevents object from becoming reactive.
