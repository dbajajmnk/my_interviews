# shallowReadonly

## What / Why

Readonly only at root level.

## Mental Model

```text
shallowReadonly(obj)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: shallowReadonly
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for controlled API boundaries.

## Common Mistake / Interview Trap

Nested objects remain mutable.

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

> **shallowReadonly:** Readonly only at root level.
