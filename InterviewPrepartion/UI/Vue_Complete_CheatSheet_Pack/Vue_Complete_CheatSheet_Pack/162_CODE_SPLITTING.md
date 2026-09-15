# Code Splitting

## What / Why

Dynamic imports split bundles.

## Mental Model

```text
import() / route lazy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Code Splitting
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use route/feature boundaries.

## Common Mistake / Interview Trap

Too many tiny chunks create network overhead.

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

> **Code Splitting:** Dynamic imports split bundles.
