# isRef

## What / Why

Checks whether value is a ref.

## Mental Model

```text
isRef(x)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: isRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in generic library code.

## Common Mistake / Interview Trap

Normal app code rarely needs it.

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

> **isRef:** Checks whether value is a ref.
