# ARIA

## What / Why

Use ARIA when native semantics are insufficient.

## Mental Model

```text
aria-expanded
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: ARIA
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use correct state synchronization.

## Common Mistake / Interview Trap

Bad ARIA can make accessibility worse.

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

> **ARIA:** Use ARIA when native semantics are insufficient.
