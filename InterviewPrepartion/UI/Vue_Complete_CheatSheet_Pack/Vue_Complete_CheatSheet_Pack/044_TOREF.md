# toRef

## What / Why

Creates/refers to a ref for a reactive property or getter.

## Mental Model

```text
toRef(state,'count')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: toRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to preserve reactivity across APIs.

## Common Mistake / Interview Trap

Changing underlying state updates the ref.

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

> **toRef:** Creates/refers to a ref for a reactive property or getter.
