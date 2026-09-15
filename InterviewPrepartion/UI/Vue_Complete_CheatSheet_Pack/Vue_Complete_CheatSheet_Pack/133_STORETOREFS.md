# storeToRefs

## What / Why

Extracts reactive refs from a store while keeping methods separate.

## Mental Model

```text
const {count}=storeToRefs(store)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: storeToRefs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for destructuring state/getters.

## Common Mistake / Interview Trap

Direct destructuring store properties breaks reactivity.

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

> **storeToRefs:** Extracts reactive refs from a store while keeping methods separate.
