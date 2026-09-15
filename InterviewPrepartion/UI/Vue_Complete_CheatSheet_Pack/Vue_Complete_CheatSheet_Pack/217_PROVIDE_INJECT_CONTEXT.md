# provide/inject Context

## What / Why

Use tree-scoped dependencies instead of globals.

## Mental Model

```text
provider subtree → inject
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: provide/inject Context
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for libraries/layout context.

## Common Mistake / Interview Trap

Not a replacement for app-wide state in every case.

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

> **provide/inject Context:** Use tree-scoped dependencies instead of globals.
