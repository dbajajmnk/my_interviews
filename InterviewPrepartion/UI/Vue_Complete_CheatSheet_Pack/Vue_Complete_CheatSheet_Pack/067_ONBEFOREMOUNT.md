# onBeforeMount

## What / Why

Runs before initial DOM mount.

## Mental Model

```text
setup → beforeMount → mount
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onBeforeMount
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use rarely for pre-DOM lifecycle work.

## Common Mistake / Interview Trap

DOM is not mounted yet.

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

> **onBeforeMount:** Runs before initial DOM mount.
