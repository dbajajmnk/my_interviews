# Compat Build

## What / Why

Vue compat build supports staged migration.

## Mental Model

```text
@vue/compat
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Compat Build
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use temporary migration path.

## Common Mistake / Interview Trap

Do not keep compat warnings indefinitely.

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

> **Compat Build:** Vue compat build supports staged migration.
