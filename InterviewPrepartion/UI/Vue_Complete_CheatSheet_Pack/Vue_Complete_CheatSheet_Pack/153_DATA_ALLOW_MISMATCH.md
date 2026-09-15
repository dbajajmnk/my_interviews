# data-allow-mismatch

## What / Why

Vue 3.5+ can selectively suppress inevitable hydration warnings.

## Mental Model

```text
data-allow-mismatch='text'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: data-allow-mismatch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for unavoidable known differences.

## Common Mistake / Interview Trap

Do not hide genuine bugs.

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

> **data-allow-mismatch:** Vue 3.5+ can selectively suppress inevitable hydration warnings.
