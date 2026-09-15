# RouterLink

## What / Why

Declarative navigation.

## Mental Model

```text
<RouterLink :to='...'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: RouterLink
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for accessible SPA navigation.

## Common Mistake / Interview Trap

Prefer over click+router.push for ordinary links.

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

> **RouterLink:** Declarative navigation.
